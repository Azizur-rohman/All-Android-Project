package com.example.saif_evaluation;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button)findViewById(R.id.bt1);
        button2 =(Button)findViewById(R.id.bt2);

    }

    public void Sn(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(intent);

    }



    public void Ts(View view) {
        Toast.makeText(MainActivity.this,"I am Saif.\nDon't disturb me!",Toast.LENGTH_SHORT).show();
    }
}
