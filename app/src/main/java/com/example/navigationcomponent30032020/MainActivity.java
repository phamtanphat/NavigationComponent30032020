package com.example.navigationcomponent30032020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment mHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHost = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavHostFragment
                .findNavController(mHost)
                .navigate(R.id.action_loginFragment_to_homeFragment);
    }
}