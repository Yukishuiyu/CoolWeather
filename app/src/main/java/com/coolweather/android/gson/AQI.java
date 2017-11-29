package com.coolweather.android.gson;

/**
 * Created by 11325 on 2017/11/28.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
