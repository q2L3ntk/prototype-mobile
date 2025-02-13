package com.example.mobileapp.ui.login;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.R;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnSignUp;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        etUsername.setError("Username field cannot be empty");
    }

    @Override
    public void setPasswordError() {
        etPassword.setError("Password field cannot be empty");
    }

    @Override
    public void navigateToSignUp() {

    }

    @Override
    public void navigateToHome() {

    }

    @Override
    public void showAuthError() {
        Toast.makeText(this, "Invalid username and password combination", Toast.LENGTH_LONG).show();
    }

    @Override
    public void bindViews() {
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnSignUp = findViewById(R.id.btn_sign_up);
        progressBar = findViewById(R.id.progress_bar);
        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public Context getContext() {
        return this;
    }
}