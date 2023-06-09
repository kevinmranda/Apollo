package com.example.apollo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText username;
    public EditText password;
    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login    = (Button) findViewById(R.id.button);

        login.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
        login();
        }
    }

    public void login() {

        String usernameInput = username.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();

        if (username.equals("username") && password.equals("password")) {

            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this,Home.class);
            startActivity(i);
        }


    }
}