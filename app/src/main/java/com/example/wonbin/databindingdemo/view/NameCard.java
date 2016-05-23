package com.example.wonbin.databindingdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wonbin.databindingdemo.R;

/**
 * Created by wonbin on 5/21/16.
 */
public class NameCard  extends LinearLayout {

    private int mAge;
    private TextView mFirstName;
    private TextView mLastName;

    public NameCard(Context context) {
        this(context,null);
    }

    public NameCard(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public NameCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.NameCard);

        try {
            mAge = array.getInteger(R.styleable.NameCard_age,0);
        } finally {
            array.recycle();
        }

        init();
    }

    private void init() {
        inflate(getContext(),R.layout.name_card,this);
        mFirstName = (TextView) findViewById(R.id.fn_tv);
        mLastName = (TextView) findViewById(R.id.ln_tv);

    }

    public void setFirstName(@NonNull final String firstName) {mFirstName.setText(firstName);}
    public void setLastName(@NonNull final String lastName) {mLastName.setText(lastName);}
    public void setAge(@IntRange(from=1) final int age )  {mAge = age;}



}
