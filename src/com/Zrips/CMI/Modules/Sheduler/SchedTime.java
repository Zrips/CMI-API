package com.Zrips.CMI.Modules.Sheduler;

import java.text.SimpleDateFormat;

import com.Zrips.CMI.CMI;

public class SchedTime {

    private Integer year = null;
    private Integer month = null;
    private Integer day = null;
    private Integer hour = null;
    private Integer minute = null;
    private Integer second = null;
    private boolean done = false;

    public SchedTime() {
    }

    public Integer getYear() {
	return year;
    }

    public void setYear(Integer year) {
	if (year < 100)
	    year += 2000;
	this.year = year;
    }

    public Integer getMonth() {
	return month;
    }

    public void setMonth(Integer month) {
	this.month = month;
    }

    public Integer getDay() {
	return day;
    }

    public void setDay(Integer day) {
	this.day = day;
    }

    public Integer getHour() {
	return hour;
    }

    public void setHour(Integer hour) {
	this.hour = hour;
    }

    public Integer getMinute() {
	return minute;
    }

    public void setMinute(Integer minute) {
	this.minute = minute;
    }

    public Integer getSecond() {
	return second;
    }

    public void setSecond(Integer second) {
	this.second = second;
    }

    public boolean isNow() {
	return true;
    }

    public boolean isDone() {
	return done;
    }

    public void setDone(boolean done) {
	this.done = done;
    }

}
