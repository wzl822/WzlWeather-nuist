package com.nuist.wzlweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wzl on 2018/4/27.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
