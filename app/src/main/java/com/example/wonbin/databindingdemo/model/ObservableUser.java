package com.example.wonbin.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.wonbin.databindingdemo.BR;

/**
 * Created by wonbin on 5/18/16.
 */
public class ObservableUser extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
}
