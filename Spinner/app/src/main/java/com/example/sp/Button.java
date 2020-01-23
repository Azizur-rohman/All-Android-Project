package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void CF(View view) {
        Intent intent = new Intent(Button.this, SecondActivity.class);

        startActivity(intent);
    }

    public void Cu(View view) {
        Intent intent = new Intent(Button.this, cuActivity.class);

        startActivity(intent);
    }
}
