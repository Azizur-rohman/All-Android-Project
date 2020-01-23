package com.example.smarthealthprediction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Singup_form extends AppCompatActivity implements View.OnClickListener {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    RadioButton radioButton1;
    RadioButton radioButton2;
    Button button;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;
    String gender="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_form);
        getSupportActionBar().setTitle("Signup Form");

        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() !=null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),Admin_page.class));
        }

        databaseReference = FirebaseDatabase.getInstance().getReference("Userinformation");
        editText1 =(EditText)findViewById(R.id.edtxt1);
        editText2 =(EditText)findViewById(R.id.edtxt2);
        editText3 =(EditText)findViewById(R.id.edtxt3);
        editText4 =(EditText)findViewById(R.id.edtxt4);
        editText5 =(EditText)findViewById(R.id.edtxt5);
        radioButton1 =(RadioButton)findViewById(R.id.rbtn1);
        radioButton2 =(RadioButton)findViewById(R.id.rbtn2);
        button=(Button)findViewById(R.id.regisbtn);
        button.setOnClickListener(this);


    }

    private void registerUser() {
        final String fullname = editText1.getText().toString();
        final String username = editText2.getText().toString();
        final String email = editText3.getText().toString();
        String password = editText4.getText().toString();
        String confirmpassword = editText5.getText().toString();
        if(radioButton1.isChecked())
        {
            gender="Mail";
        }
        if(radioButton2.isChecked())
        {
            gender="Femail";
        }

        if(TextUtils.isEmpty(fullname))
        {
            Toast.makeText(this,"Please Enter Full Name",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(username))
        {
            Toast.makeText(this,"Please Enter User Name",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Please Enter Email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.length() <8 )
        {
            Toast.makeText(this,"Password must be >=8 characters",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(confirmpassword))
        {
            Toast.makeText(this,"Please Enter Confirm Password",Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Userinformation userinformation = new Userinformation(
                                    fullname,username, email,gender
                            );

                            FirebaseDatabase.getInstance().getReference("Userinformation")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(userinformation).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    Toast.makeText(getApplicationContext(),"Registretion Complete",Toast.LENGTH_SHORT).show();
                                    finish();
                                    startActivity(new Intent(getApplicationContext(),Admin_page.class));
                                }
                            });

                        }else
                        {
                            Toast.makeText(Singup_form.this,"Could not register.Please try again",Toast.LENGTH_SHORT).show();
                        }
                        progressDialog.dismiss();
                    }
                });
    }
    @Override
    public void onClick(View v) {

        if(v == button)
        {
            registerUser();

        }

    }


}
