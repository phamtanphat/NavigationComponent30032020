package com.example.navigationcomponent30032020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpFragment extends Fragment {


    View mView;
    TextInputEditText mEdtTk,mEdtMk;
    Button mSignup,mGoback;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_sign_up, container, false);
        mEdtMk = mView.findViewById(R.id.textInputMkSignUp);
        mEdtTk = mView.findViewById(R.id.textInputTkSignUp);
        mSignup = mView.findViewById(R.id.buttonSignUp);
        mGoback = mView.findViewById(R.id.buttonBack);
        return mView;
    }
}