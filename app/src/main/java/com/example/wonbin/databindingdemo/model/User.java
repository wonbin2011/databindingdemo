package com.example.wonbin.databindingdemo.model;

/**
 * Created by wonbin on 4/15/16.
 */
public class User {
    public final String firstName;
    public final String lastName;
    public String displayname;
    public int age;

    public User(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName,String lastName,int age) {
        this(firstName,lastName);
        this.age = age;
    }
//    public String firstName() {
//        return firstName + "from firstname method haha";
//    }
    public boolean isAdult() {
        return age >= 18;
    }
}
