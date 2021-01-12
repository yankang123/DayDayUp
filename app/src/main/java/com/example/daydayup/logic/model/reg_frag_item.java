package com.example.daydayup.logic.model;

public class reg_frag_item {
private String text1;
private  String text2;
private int imageId;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public reg_frag_item(String text1, String text2, int imageId) {
        this.text1 = text1;
        this.text2 = text2;
        this.imageId = imageId;
    }
}
