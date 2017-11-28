package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 11325 on 2017/11/28.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int provinceId;
    private int cityCode;

    public int getId(){
        return id;
    }

    public String getCityName(){
        return cityName;
    }

    public int provinceId(){
        return provinceId;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
