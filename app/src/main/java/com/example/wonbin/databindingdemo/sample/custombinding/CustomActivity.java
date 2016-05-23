package com.example.wonbin.databindingdemo.sample.custombinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.ContactItem2;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.model.Contact;


/**
 * Created by wonbin on 5/23/16.
 */
public class CustomActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContactItem2 binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_activity);
        Contact contact = new Contact("15652197442","wonbin");
        binding.setContact(contact);
    }
}
