package com.example.wonbin.databindingdemo.sample.collection;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ActivityConversionBinding;
import com.example.wonbin.databindingdemo.databinding.CollectionsBinding;

/**
 * Created by wonbin on 5/23/16.
 */
public class CollectionActivity extends BaseActivity {

    private CollectionsBinding mBinding;
    private List<String> mList;
    private SparseArray<String> mSparse;
    private Map<String,String> mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_collection);

        mList = new ArrayList<>();
        mSparse = new SparseArray<>(2);

        String key = "firstName";
        mMap = new HashMap<>();
        mMap.put(key,"xiaolin");
        mMap.put("lastName","qi");

        int index = 1;
        String[]  names = new String[]{"xiaolin","qi"};

        for(int i = 0; i < names.length; i++ ) {
            mList.add(names[i]);
            mSparse.put(i,names[i]);
        }

        mBinding.setList(mList);
        mBinding.setIndex(index);
        mBinding.setSparse(mSparse);
        mBinding.setMap(mMap);
        mBinding.setKey(key);

    }
}
