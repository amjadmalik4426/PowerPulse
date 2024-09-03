package com.example.workout.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Workout implements Serializable {
    private String tittle;
    private String description;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getDurationAll() {
        return durationAll;
    }

    public void setDurationAll(String durationAll) {
        this.durationAll = durationAll;
    }

    public ArrayList<Lession> getLessions() {
        return lessions;
    }

    public void setLessions(ArrayList<Lession> lessions) {
        this.lessions = lessions;
    }

    private String picPath;
    private int kcal;

    public Workout(String tittle, String description, String picPath, int kcal, String durationAll, ArrayList<Lession> lessions) {
        this.tittle = tittle;
        this.description = description;
        this.picPath = picPath;
        this.kcal = kcal;
        this.durationAll = durationAll;
        this.lessions = lessions;
    }

    private String durationAll;
    private ArrayList<Lession>lessions;

}
