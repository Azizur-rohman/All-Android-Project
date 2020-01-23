package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;



public class SecondActivity extends AppCompatActivity {

    EditText temp;
    RadioButton toC;
    RadioButton toF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        temp = (EditText)findViewById(R.id.editText);
        toC =(RadioButton)findViewById(R.id.radioButtonc);
        toF = (RadioButton)findViewById(R.id.radioButtonf);

    }

    public void convert(View view) {
        double value = new Double(temp.getText().toString());
        if(toC.isChecked())
            value = covertformula.farenheit2celsius(value);
        else
            value= covertformula.celsius2farenheit(value);
        temp.setText(new Double(value).toString());
    }

}
