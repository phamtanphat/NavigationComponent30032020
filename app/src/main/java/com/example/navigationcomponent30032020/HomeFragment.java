package com.example.navigationcomponent30032020;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment {


    View mView;
    TextView mTvName;
    Button mLogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, container, false);
        mTvName = mView.findViewById(R.id.textviewName);
        mLogout = mView.findViewById(R.id.buttonLogout);
        HomeFragmentArgs bundle = HomeFragmentArgs.fromBundle(getArguments());
        Log.d("BBB",bundle.getMatkhau());
        Log.d("BBB",bundle.getTaikhoan());
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation
                        .findNavController(mView)
                        .navigate(R.id.action_homeFragment_to_loginFragment);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}