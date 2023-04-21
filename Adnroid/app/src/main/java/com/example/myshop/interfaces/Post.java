package com.example.myshop.interfaces;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;

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

    public String getImage() { return image; }
    public void setImage(String body) {
        this.image = image;
    }
}
