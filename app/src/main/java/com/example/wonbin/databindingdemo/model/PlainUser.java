package com.example.wonbin.databindingdemo.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by wonbin on 5/19/16.
 */
public class PlainUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
