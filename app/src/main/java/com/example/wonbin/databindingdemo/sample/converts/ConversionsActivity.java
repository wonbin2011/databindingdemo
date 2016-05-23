package com.example.wonbin.databindingdemo.sample.converts;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;


import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ActivityConversionBinding;
import com.example.wonbin.databindingdemo.utils.ScreenUtil;

/**
 * Created by wonbin on 5/23/16.
 */
public class ConversionsActivity extends BaseActivity {

    private ObservableBoolean mIsError = new ObservableBoolean();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityConversionBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_conversion);

        mIsError.set(true);
        binding.setIsError(mIsError);
        binding.setHeight(ScreenUtil.dp2px(this,200));
    }

    public void toggleIsError(View view) {
        mIsError.set(!mIsError.get());
    }

    @BindingConversion
    public static Drawable convertColorToDrawable(int color) {
        return new ColorDrawable(color);
    }

    @BindingAdapter("bind:layout_height")
    public static void setLayoutInflate(View view,float height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) height;
        view.setLayoutParams(params);
    }

}
