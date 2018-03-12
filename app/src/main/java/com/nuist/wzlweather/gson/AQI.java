package com.nuist.wzlweather.gson;

/**
 * Created by wzl on 2018/4/27.
 * 空气质量类
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
