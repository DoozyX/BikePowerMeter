package com.doozy.bikepowermeter;

/**
 * Created by Kristina on 29.11.2017
 */

public class Item {
    protected String date;
    protected String power;
    protected String speed;
    protected String duration;

    public Item(String date, String power, String speed, String duration) {
        this.date = date;
        this.power = power;
        this.speed = speed;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("Avg. Power  Avg. Speed   Duration \n\t %10s %12s %13s",power,speed,duration);
    }
}
