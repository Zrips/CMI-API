package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

public class LastOnline {

    CommandSender Sender;
    OfflinePlayer[] off;
    int last = 0;
    int id = -1;
    Long range = -1L;

    HashMap<String, Long> list = new HashMap<String, Long>();

    public LastOnline() {
    }

    public void setRange(Long range) {
	this.range = range;
    }

    public Long getRange() {
	return this.range;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getId() {
	return this.id;
    }

    public void setSender(CommandSender Sender) {
	this.Sender = Sender;
    }

    public CommandSender getSender() {
	return this.Sender;
    }

    public void setLastChecked(int last) {
	this.last = last;
    }

    public int getlastChecked() {
	return this.last;
    }

    public void setOfflinePlayers(OfflinePlayer[] off) {
	this.off = off;
    }

    public OfflinePlayer[] getOfflinePlayers() {
	return this.off;
    }

    public void addPlayerToList(String name, Long time) {
	this.list.put(name, time);
    }

    public HashMap<String, Long> getPlayerToList() {
	return this.list;
    }

    public void setPlayerToList(HashMap<String, Long> list) {
	this.list = list;
    }
}
