package com.example.doan.users;

public class PodCast {
    String id;
    String Avatar;
    String title;
    String content;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public PodCast(String id,String avatar, String title, String content) {
        this.Avatar = avatar;
        this.title = title;
        this.content = content;
        this.id = id;

    }
    public String getAvatar() {
        return Avatar;
    }
    public void setAvatar(String avatar) {
        Avatar = avatar;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
