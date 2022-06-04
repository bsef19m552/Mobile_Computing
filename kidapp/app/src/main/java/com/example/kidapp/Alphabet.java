package com.example.kidapp;

public class Alphabet {
    protected String name;
    protected  int imgId;


    public Alphabet(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
