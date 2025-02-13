package com.example.mobileapp.ui.login;

import com.example.mobileapp.ui.auth.AuthView;
import com.example.mobileapp.ui.base.BaseView;

public interface LoginView extends BaseView, AuthView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void navigateToSignUp();
    void navigateToHome();
}
