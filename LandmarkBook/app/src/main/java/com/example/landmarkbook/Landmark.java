package com.example.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String countryName;
    int image;

    public Landmark(String name, String countryName, int image) {
        this.name = name;
        this.countryName = countryName;
        this.image = image;
    }
}
