package com.example.doan.users;

public class UsersChart {
 public    int id;
    public  String name;
    public  String avatar;
    public   String title;
    public UsersChart(int id, String name, String avatar, String title) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
