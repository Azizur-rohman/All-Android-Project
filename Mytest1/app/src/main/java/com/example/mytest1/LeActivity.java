package com.example.mytest1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LeActivity extends AppCompatActivity {
    EditText temp1;
    RadioButton rr1;
    RadioButton rr2;
    EditText temp2;
    RadioButton rr3;
    RadioButton rr4;
    EditText temp3;
    RadioButton rr5;
    RadioButton rr6;
    TextView t1;
    TextView t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le);

        temp1 = (EditText) findViewById(R.id.edt1);
        rr1 = (RadioButton)findViewById(R.id.r1);
        rr2 = (RadioButton)findViewById(R.id.r2);
        t1 =(TextView)findViewById(R.id.view1);
        temp2 = (EditText) findViewById(R.id.edt2);
        rr3 = (RadioButton)findViewById(R.id.r3);
        rr4 = (RadioButton)findViewById(R.id.r4);
        t2 =(TextView)findViewById(R.id.view2);
        temp3 = (EditText) findViewById(R.id.edt3);
        rr5 = (RadioButton)findViewById(R.id.r5);
        rr6 = (RadioButton)findViewById(R.id.r6);
        t3 =(TextView)findViewById(R.id.view3);

    }

    public void CM(View view) {
        double value = new Double(temp1.getText().toString());
        if(rr1.isChecked())
            value = covertformula.lengthc(value);
        else
            value= covertformula.lengthc1(value);
        t1.setText(new Double(value).toString());

    }

    public void MK(View view) {
        double value = new Double(temp2.getText().toString());
        if(rr3.isChecked())
            value = covertformula.lengthm(value);
        else
            value= covertformula.lengthm1(value);
        t2.setText(new Double(value).toString());
    }

    public void KMi(View view) {
        double value = new Double(temp3.getText().toString());
        if(rr5.isChecked())
            value = covertformula.lengthk(value);
        else
            value= covertformula.lengthk1(value);
        t3.setText(new Double(value).toString());
    }
}
