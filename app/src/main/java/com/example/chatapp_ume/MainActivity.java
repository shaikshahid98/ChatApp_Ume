package com.example.chatapp_ume;

import static com.example.chatapp_ume.Retrofit.RetrofitClient.getRetrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chatapp_ume.API.ApiMethod;
import com.example.chatapp_ume.Request.UserAccount;

import com.example.chatapp_ume.Model.UserModel;

import com.example.chatapp_ume.Retrofit.RetrofitClient;
import com.example.chatapp_ume.ui.activity.ForgotPasswordActivity;
import com.example.chatapp_ume.ui.activity.RegisterActivity;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txtForgotPassword;
    private Button btnSignin, btnLogin;
    private TextInputLayout txtInputEmailPhone, txtInputPassword;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtForgotPassword = findViewById(R.id.txtForgotPass);
        txtInputEmailPhone = findViewById(R.id.txtUserAccount);
        txtInputPassword = findViewById(R.id.txtPassword);
        /// GET User API
//        getUser();

        ///////// LOGIN ////////
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtInputEmailPhone.getEditText().getText())) {
                    txtInputEmailPhone.setError("Field cannot be empty!");
                } else if (TextUtils.isEmpty(txtInputPassword.getEditText().getText())) {
                    txtInputPassword.setError("What is your password!");
                } else {
                    // Proceed to login
                    getUser();
//                    Intent intent = new Intent(MainActivity.this, Main.class);
//                    startActivity(intent);
                }


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
    private void getUser() {
        ApiMethod method = getRetrofit().create(ApiMethod.class);
        Call<UserModel> call = method.getUser(txtInputEmailPhone.getEditText().toString(), txtInputPassword.getEditText().toString());
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                if (response.message().equals("success")){
                    UserModel.Account data = response.body().getAccount();
                    Intent intent = new Intent(MainActivity.this, Main.class);
                    intent.putExtra("data", data);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Log.v("log:", t.getMessage());
            }
        });
    }
}