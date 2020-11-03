package com.Zrips.CMI.Modules.Warnings;

public class CMIWarningCategory {
    private String name;
    private Long lifeTime = 1000L;
    private int points = 1;
    private String defaultReason = "&7Violated server rules";

    public CMIWarningCategory(String name) {
	this.name = name;

    }

    public Long getLifeTime() {
	return lifeTime;
    }

    public void setLifeTime(Long lifeTime) {
	this.lifeTime = lifeTime;
    }

    public int getPoints() {
	return points;
    }

    public void setPoints(int points) {
	this.points = points;
    }

    public String getDefaultReason() {
	return defaultReason;
    }

    public void setDefaultReason(String defaultReason) {
	this.defaultReason = defaultReason;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}
