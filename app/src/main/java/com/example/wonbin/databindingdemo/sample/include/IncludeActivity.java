package com.example.wonbin.databindingdemo.sample.include;

import android.databinding.DataBindingUtil;
import android.os.Bundle;


import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.databinding.ActivityIncludeBinding;
import com.example.wonbin.databindingdemo.model.User;
import com.example.wonbin.databindingdemo.model.Contact;
import com.example.wonbin.databindingdemo.R;

/**
 * Created by wonbin on 5/23/16.
 */
public class IncludeActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludeBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_include);

        User user = new User("xiaolin","qi");
        Contact contact = new Contact("10086","china");

    }
}
