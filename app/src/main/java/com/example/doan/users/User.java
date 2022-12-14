package com.example.doan.users;

import java.io.Serializable;

public class User implements Serializable {
    String id;
    String name;
    String author;
    String avatar;
    String content;
    public User(String id,String avatar)
    {
        this.avatar= avatar;
    }
    public  User(String id, String content, String avatar)
    {
        this.id = id;
        this.content=content;
        this.avatar = avatar;
    }
    public User(String id, String name, String author, String avatar) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.avatar = avatar;
    }

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getId() { return id; }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
