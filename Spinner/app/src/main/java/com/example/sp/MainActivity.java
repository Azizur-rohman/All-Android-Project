package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    TextView tx;
    Button bn;
    Button bn1;
    Button bn2;
    Button bn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.edt1);
        ed2=(EditText)findViewById(R.id.edt2);
        tx=(TextView)findViewById(R.id.view);
        bn=(Button)findViewById(R.id.bt1);
        bn1=(Button)findViewById(R.id.bt2);
        bn2=(Button)findViewById(R.id.bt3);
        bn3=(Button)findViewById(R.id.bt4);
    }

    public void plus(View view) {
        double value = new Double(ed1.getText().toString());
        double value1 = new Double(ed2.getText().toString());
        value = Formula.plus(value,value1);
        tx.setText(new Double(value).toString());
    }

    public void minus(View view) {
        double value = new Double(ed1.getText().toString());
        double value1 = new Double(ed2.getText().toString());
        value = Formula.minus(value,value1);
        tx.setText(new Double(value).toString());

    }

    public void mul(View view) {
        double value = new Double(ed1.getText().toString());
        double value1 = new Double(ed2.getText().toString());
        value = Formula.multiplication(value,value1);
        tx.setText(new Double(value).toString());
    }

    public void div(View view) {
        double value = new Double(ed1.getText().toString());
        double value1 = new Double(ed2.getText().toString());
        value = Formula.division(value,value1);
        tx.setText(new Double(value).toString());
    }
}
