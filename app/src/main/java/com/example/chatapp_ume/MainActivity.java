package com.example.chatapp_ume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chatapp_ume.ui.activity.ForgotPasswordActivity;
import com.example.chatapp_ume.ui.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtForgotPassword;
    private Button btnSignin, btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtForgotPassword = findViewById(R.id.txtForgotPass);

        ///////// LOGIN ////////
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main.class);
                startActivity(intent);
            }
        });
        /// SIGN IN////
        btnSignin = findViewById(R.id.btnRegister);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        //// FORGOT PASSWORD ///////
        txtForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}