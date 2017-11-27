package com.Zrips.CMI.Modules.BossBar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BossBar;

import com.Zrips.CMI.Containers.CMIUser;

public class BossBarInfo {
    CMIUser user;
    private double percentage;
    private Integer keepFor = 3;
    private BossBar bar;
    private BarColor startingColor = null;
    int id = -1;
    private String nameOfBar;
    private String titleOfBar = "Title";

    public BossBarInfo(CMIUser user, String nameOfBar) {
	this.user = user;
	this.nameOfBar = nameOfBar;
    }

    public BossBarInfo(CMIUser user, String nameOfBar, BossBar bar) {
	this.user = user;
	this.nameOfBar = nameOfBar;
	this.bar = bar;
    }

    public void setId(int id) {
	cancelHideScheduler();
	this.id = id;
    }

    public void cancelHideScheduler() {
	if (id != -1)
	    Bukkit.getScheduler().cancelTask(this.id);
    }

    public void remove() {
	cancelHideScheduler();
	if (bar != null)	    
	    bar.setVisible(false);
	user.removeBossBar(this);
    }

    public CMIUser getUser() {
	return this.user;
    }

    public BossBar getBar() {
	return this.bar;
    }

    public double getPercentage() {
	return percentage;
    }
    
    public void setPercentage(Double max, Double current) {	
	current = current * 100 / max / 100D;
	setPercentage(current);
    }
    
    public void setPercentage(double percentage) {
	if (percentage < 0)
	    percentage = 0D;
	if (percentage > 1)
	    percentage = 1D;
	this.percentage = percentage;
    }

    public String getNameOfBar() {
	return nameOfBar;
    }

    public void setNameOfBar(String nameOfBar) {
	this.nameOfBar = nameOfBar;
    }

    public Integer getKeepFor() {
	return keepFor;
    }

    public void setKeepForTicks(Integer keepFor) {
	this.keepFor = keepFor;
    }

    public String getTitleOfBar() {
	return titleOfBar;
    }

    public void setTitleOfBar(String titleOfBar) {
	this.titleOfBar = ChatColor.translateAlternateColorCodes('&', titleOfBar);
    }

    public void setBar(BossBar bar) {
	this.bar = bar;
    }

    public BarColor getStartingColor() {
	return startingColor;
    }

    public void setStartingColor(BarColor startingColor) {
	this.startingColor = startingColor;
    }
}
