package com.example.chatapp_ume.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.chaos.view.PinView;
import com.example.chatapp_ume.R;

public class VerifyCodeActivity extends AppCompatActivity {

    private PinView mPinView;
    private Button btnVerifyCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        mPinView = findViewById(R.id.pinVerifyCode);
        btnVerifyCode = findViewById(R.id.btnVerifyCode);

        btnVerifyCode.setOnClickListener(view -> {
            startActivity(new Intent(this, NewPasswordActivity.class));
        });

    }
}