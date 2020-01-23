package com.example.smarthealthprediction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Admin_page extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;
    TextView textView;
    Button button1;
    Button button;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() == null)
        {
            finish();
            startActivity(new Intent(this,Login_form.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();
        textView = (TextView)findViewById(R.id.tv);
        editText1=(EditText)findViewById(R.id.edtxt1);
        editText2=(EditText)findViewById(R.id.edtxt2);
        button1 =(Button)findViewById(R.id.bnn1);
        textView.setText("Welcome"  +user.getEmail());
        button = (Button)findViewById(R.id.bnn);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == button)
        {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this,Login_form.class));
        }

    }
}

