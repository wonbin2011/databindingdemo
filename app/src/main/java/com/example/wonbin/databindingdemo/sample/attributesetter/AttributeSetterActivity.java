package com.example.wonbin.databindingdemo.sample.attributesetter;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wonbin.databindingdemo.BaseActivity;
import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.ActivityAttributeSetterBinding;
import com.example.wonbin.databindingdemo.utils.Randoms;
import com.squareup.picasso.Picasso;

/**
 * Created by wonbin on 5/21/16.
 */
public class AttributeSetterActivity extends BaseActivity {

    ActivityAttributeSetterBinding mbinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mbinding = DataBindingUtil.setContentView(this, R.layout.activity_attribute_setter);
        mbinding.setActivity(this);
        mbinding.setImageUrl(Randoms.nextImgUrl());

    }

    public View.OnClickListener avatarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(AttributeSetterActivity.this,"come on",Toast.LENGTH_SHORT).show();
            mbinding.setImageUrl(Randoms.nextImgUrl());
        }
    };

    /*
    * custom bindings: A static binding adapter method with
    *  the BindingAdapter annotation allows the developers to
    *  customize how a setter for an attribute is called!
    * */
    @BindingAdapter({"bind:imageUrl","bind:error"})
    public static void loadImage(ImageView imageView, String url, Drawable error) {
        Log.d("wonbin","load image");
        Picasso.with(imageView.getContext()).load(url).error(error).into(imageView);

    }
}
