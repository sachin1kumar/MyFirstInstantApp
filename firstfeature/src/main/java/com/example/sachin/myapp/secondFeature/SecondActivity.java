package com.example.sachin.myapp.secondFeature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sachin.myapp.R;


/**
 * Created by sachin on 14/8/17.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        setTitle(R.string.app_name2);
    }
}
