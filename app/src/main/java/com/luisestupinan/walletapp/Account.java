package com.luisestupinan.walletapp;

import androidx.annotation.NonNull;

public class Account {

    private String name;
    private String type;

    private Double currentValue;

    private String imageUrl;



    public Account(String name, String type, Double currentValue, String imageUrl) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
