package com.example.wonbin.databindingdemo.sample.resource;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.content.res.Resources;
import android.util.Log;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ResourceBinding;

public class ResourceActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ResourceBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_resource);

        binding.setFirstName("xiaolin");
        binding.setLastName("qi");
        binding.setLarge(true);
        binding.setBananaCount(2);
        binding.setOrangeCount(3);

        Resources res = getResources();

        String s1 = res.getQuantityString(R.plurals.banana,0);
        String s2 = res.getQuantityString(R.plurals.banana,0,2);
        String s3 = res.getQuantityString(R.plurals.banana,1);
        String s4 = res.getQuantityString(R.plurals.banana,1,5);
        String s5 = res.getQuantityString(R.plurals.banana,2,6);

        Log.d("wonbin", "s1 = " + s1 + '\n'
         + "s2 = " + s2 + '\n'
         + "s3 = " + s3 + '\n'
         + "s4 = " + s4 + '\n'
        + "s5 = " + s5);

    }


}
