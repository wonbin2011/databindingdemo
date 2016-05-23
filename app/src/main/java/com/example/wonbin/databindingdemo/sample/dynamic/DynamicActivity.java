package com.example.wonbin.databindingdemo.sample.dynamic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ActivityDynamicBinding;

/**
 * Created by wonbin on 5/21/16.
 */
public class DynamicActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDynamicBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_dynamic);

        binding.recyclerView.setHasFixedSize(true);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new UserAdapter());

    }
}
