package com.example.wonbin.databindingdemo.utils;

import java.util.Random;

/**
 * Created by wonbin on 5/21/16.
 */
public class Randoms {

    private static final Random sRandom = new Random();

    private static final String[] IMG_URLS = new String[]{
            "http://ww2.sinaimg.cn/large/7a8aed7bjw1ex8h4lnq3oj20hs0qoadj.jpg",
            "http://pic.meizitu.com/wp-content/uploads/2015a/10/24/01.jpg",
            "http://pic.meizitu.com/wp-content/uploads/2015a/10/23/01.jpg",
            "http://pic.meizitu.com/wp-content/uploads/2015a/10/18/01.jpg"
    };

    public static String nextImgUrl() {
        return IMG_URLS[sRandom.nextInt(IMG_URLS.length)];
    }
    /*****************************/
    public static final String[] FIRST_NAMES = {"Zhao", "Qian", "Sun", "Li", "Zhou", "Wu"};
    public static final String[] LAST_NAMES = {"Tiedan", "Ritian", "LiangChen","erzhu","nima"};

    private static final Random sRandomGenerator = new Random();

    public static String nextFirstName() {
        return FIRST_NAMES[sRandomGenerator.nextInt(FIRST_NAMES.length)];
    }

    public static String nextLastName() {
        return LAST_NAMES[sRandomGenerator.nextInt(LAST_NAMES.length)];
    }
}
