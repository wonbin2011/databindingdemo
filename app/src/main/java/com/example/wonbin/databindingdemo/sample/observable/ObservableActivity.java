package com.example.wonbin.databindingdemo.sample.observable;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.databinding.ActivityObservableBinding;
import com.example.wonbin.databindingdemo.model.ObservableUser;
import com.example.wonbin.databindingdemo.model.PlainUser;


/**
 * Created by wonbin on 5/18/16.
 */
public class ObservableActivity extends BaseActivity {

    private ObservableUser observableUser = new ObservableUser();
    private PlainUser  plainUser = new PlainUser();
    private ObservableArrayMap mapUser = new ObservableArrayMap();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_observable);

        setMyName(null);
        binding.setUser(observableUser);
        binding.setPlainUser(plainUser);
        binding.setMapUser(mapUser);
    }


    public void setOtherName(View view) {
        observableUser.setLastName("qi");
        observableUser.setFirstName("xiaolin");

        plainUser.firstName.set("richard");
        plainUser.lastName.set("hendricks");
        plainUser.age.set(27);

        mapUser.put("firstName","Google");
        mapUser.put("lastName","Inc");
        mapUser.put("age",27);
    }

    public void setMyName(View view) {
        observableUser.setFirstName("wonbin");
        observableUser.setLastName("wen");

        plainUser.firstName.set("yuanbin");
        plainUser.lastName.set("wen");
        plainUser.age.set(26);

        mapUser.put("firstName","zhu");
        mapUser.put("lastName","chen");
        mapUser.put("age",17);


    }
}
