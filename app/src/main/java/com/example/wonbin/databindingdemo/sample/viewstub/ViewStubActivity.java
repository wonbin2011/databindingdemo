package com.example.wonbin.databindingdemo.sample.viewstub;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import android.view.View;
import android.view.ViewStub;

import com.example.wonbin.databindingdemo.databinding.ViewStubBinding;
import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ActivityViewStubBinding;
import com.example.wonbin.databindingdemo.model.User;

/**
 * Created by wonbin on 5/21/16.
 */
public class ViewStubActivity extends BaseActivity {

    ActivityViewStubBinding mBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);

        mBinding.viewStub.setOnInflateListener( new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                //if the layout was inflated using a different
                // mechanism , it may be bound separately
                ViewStubBinding binding = DataBindingUtil.bind(inflated);
                User user = new User("xiaolin","qi");

                binding.setUser(user);
            }
        });

    }


    /**
     * Don't panic for red error reporting. Just ignore it and run the app. Surprise never ends.
     *
     * here is strange?
     */
    public void inflateViewStub(View view) {
        if( !mBinding.viewStub.isInflated()) {
            mBinding.viewStub.getViewStub().inflate();
        }

    }



}
