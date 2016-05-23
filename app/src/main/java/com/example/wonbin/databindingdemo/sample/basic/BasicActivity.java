package com.example.wonbin.databindingdemo.sample.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ContactItem;
import com.example.wonbin.databindingdemo.model.User;

public class BasicActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactItem binding = DataBindingUtil.setContentView(this,R.layout.activity_basic);
        User user =  new User("wonbin","wen",17);
        binding.setUser(user);

    }

}
