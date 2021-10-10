package com.example.chatapp_ume.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapp_ume.MainActivity;
import com.example.chatapp_ume.R;


public class ForgotPasswordActivity extends AppCompatActivity {

    private Button btnNext;
    private EditText editTxtForgotPass;
    private ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        // Initialize
//        mAuth = FirebaseAuth.getInstance();
        btnNext = findViewById(R.id.btnNext);
        editTxtForgotPass = findViewById(R.id.editTextEmail);
        imgBack = findViewById(R.id.imgBack);

        // Set Event
        imgBack.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        btnNext.setOnClickListener(view -> {
            String forgotPassword = editTxtForgotPass.getText().toString();
            if (forgotPassword.isEmpty()) {
                editTxtForgotPass.setError("Field cannot be empty!");
            } else {
                startActivity(new Intent(this, VerifyCodeActivity.class));
            }
        });
    }


}





















