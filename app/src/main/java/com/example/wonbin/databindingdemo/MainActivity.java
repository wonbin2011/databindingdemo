package com.example.wonbin.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.wonbin.databindingdemo.sample.attributesetter.AttributeSetterActivity;
import com.example.wonbin.databindingdemo.sample.basic.BasicActivity;

import com.example.wonbin.databindingdemo.databinding.ActivityMainBinding;
import com.example.wonbin.databindingdemo.sample.collection.CollectionActivity;
import com.example.wonbin.databindingdemo.sample.converts.ConversionsActivity;
import com.example.wonbin.databindingdemo.sample.custombinding.CustomActivity;
import com.example.wonbin.databindingdemo.sample.dynamic.DynamicActivity;
import com.example.wonbin.databindingdemo.sample.observable.ObservableActivity;
import com.example.wonbin.databindingdemo.sample.resource.ResourceActivity;
import com.example.wonbin.databindingdemo.sample.viewid.ViewWithIDsActivity;
import com.example.wonbin.databindingdemo.sample.viewstub.ViewStubActivity;

/**
 * Created by wonbin on 4/21/16.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void openBasic(View view) {
        startActivity(new Intent(this,BasicActivity.class));

    }

    public void openObservable(View v)        {
        startActivity(new Intent(this, ObservableActivity.class));

    }

    public void openResources(View v) {
        startActivity(new Intent(this, ResourceActivity.class));
    }

    public void openViewWithIDs(View view) { startActivity(new Intent(this, ViewWithIDsActivity.class));}

    public void openViewStub(View view) { startActivity(new Intent(this, ViewStubActivity.class));}

    public void openDynamicVariables(View view) { startActivity(new Intent(this, DynamicActivity.class));}
    public void openAttributeSetters(View view) { startActivity(new Intent(this, AttributeSetterActivity.class));}
    public void openConverters(View view) { startActivity(new Intent(this, ConversionsActivity.class));}
    public void openCollections(View view) { startActivity(new Intent(this, CollectionActivity.class));}

    public  void openCustomBinding(View view) { startActivity(new Intent(this, CustomActivity.class));}
    public void openIncludes(View view) { startActivity(new Intent(this,CustomActivity.class));}
}
