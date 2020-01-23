package com.example.primenumberchecker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText input;
    Button Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText)findViewById(R.id.edt);
        Check=(Button)findViewById(R.id.btn);

        Check.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                double n = Double.parseDouble(input.getText().toString());
                int f = 0;



                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                        f = 1;
                }

                if (f == 0)
                {
                    Toast.makeText(getApplicationContext(), "Given Number is Prime Number",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "Given Number is Not a Prime Number",
                            Toast.LENGTH_SHORT).show();

                }
            }});
    }



}
