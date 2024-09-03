package com.example.workout.Domain;

import java.io.Serializable;

public class Lession implements Serializable {
    public Lession(String tittle, String duration, String link, String picPath) {
        this.tittle = tittle;
        this.duration = duration;
        this.link = link;
        this.picPath = picPath;
    }

    private String tittle;
    private String duration;
    private String link;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    private String picPath;
}