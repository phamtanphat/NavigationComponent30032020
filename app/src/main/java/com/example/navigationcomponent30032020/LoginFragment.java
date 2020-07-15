package com.example.navigationcomponent30032020;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation
                        .findNavController(mView)
                        .navigate(R.id.action_loginFragment_to_homeFragment);
            }
        });
        super.onActivityCreated(savedInstanceState);

    }
}