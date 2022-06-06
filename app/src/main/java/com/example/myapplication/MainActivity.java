package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    String Name, Email, Password;

    EditText NameInput;
    EditText EmailInput;
    EditText PasswordInput;

    Button LOGIN;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameInput = (EditText) findViewById(R.id.editTextTextPersonName);
        EmailInput = (EditText) findViewById(R.id.editTextTextPersonName2);
        PasswordInput = (EditText) findViewById(R.id.editTextTextPassword);

        LOGIN = (Button) findViewById(R.id.LOGIN);

        LOGIN.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Name = NameInput.getText().toString();
                Email = EmailInput.getText().toString();
                Password = PasswordInput.getText().toString();

                MessageBox("You can log into The System!");
                MessageBox("Your Name is = " + Name + "\n" + "Your E-mail is = " + Email + "\n" + "Your Password is = " + Password);
/*              MessageBox(Email);
                MessageBox(Password);*/
            }
        });
    }

    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }



}