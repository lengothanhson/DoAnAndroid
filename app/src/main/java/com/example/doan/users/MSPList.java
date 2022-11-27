package com.example.doan.users;

public class MSPList {
    private String id;
    private String text1;
    private String text2;
    private String avatar;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public String getAvatar() {return avatar;}
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public MSPList(String id, String text1, String text2, String avatar) {
        this.id = id;
        this.text1 = text1;
        this.text2 = text2;
        this.avatar = avatar;
    }

}
