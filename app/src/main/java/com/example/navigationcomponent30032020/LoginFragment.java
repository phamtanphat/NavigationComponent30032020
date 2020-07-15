package com.example.navigationcomponent30032020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginFragment extends Fragment {

    View mView;
    TextInputEditText mEdtTk,mEdtMk;
    Button mSignup,mSignIn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_login, container, false);
        mEdtMk = mView.findViewById(R.id.textInputMkSignIn);
        mEdtTk = mView.findViewById(R.id.textInputTkSignIn);
        mSignup = mView.findViewById(R.id.buttonGoSignUp);
        mSignIn = mView.findViewById(R.id.buttonSignIn);
        return mView;
    }
}