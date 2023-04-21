package com.example.myshop.gurleensethi.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String body;

    public int getId() {
        return id;
    }

   // public void setId(int id) {
   //     this.id = id;
   // }

    public String getName() {
        return title;
    }

   // public void setName(String title) {
   //     this.title = title;
   // }

    public String getImage() {
        return body;
    }

    //public void setImage(String body) {
    //    this.body = body;
    //}
}
