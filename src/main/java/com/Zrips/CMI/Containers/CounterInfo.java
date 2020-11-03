package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class CounterInfo {

    private String message;
    private List<Player> list;
    private int t;
    private CMI plugin;

    public CounterInfo(String message, List<Player> list, int t, CMI plugin) {
	this.message = message;
	this.list = list;
	this.t = t;
	this.plugin = plugin;

    }

    public String getMessage() {
	return message;
    }

    public List<Player> getList() {
	return list;
    }

    public int getLeftTime() {
	return t;
    }

    public void lowerTime() {
	t--;
    }

    public CMI getPlugin() {
	return plugin;
    }
}
