package com.example.wonbin.databindingdemo.sample.viewid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import android.view.View;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.databinding.ActivityViewidBinding;

/**
 * Created by wonbin on 5/21/16.
 */
public class ViewWithIDsActivity extends BaseActivity {

    ActivityViewidBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_viewid);
    }

    public void showMyName(View view) {

        binding.fnTv.setText("xiaolin");
        binding.lnTv.setText("qi");
    }
}
