package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;

public class UCInfo {

    private int scheduleId = -1;

    private int currentId = 1;

    private List<Chunk> chunks = new ArrayList<Chunk>();
    private int chunksChecked = 0;
    private int chunksCkeckedLast = 0;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean autoSpeed = true;
    private boolean messages = true;

    private CommandSender sender;
    private String sendername;
    private int checked = 0;

    private int found = 0;

    private long startTime = 0L;

    private int speed = 100;

    private boolean running = false;

    public UCInfo() {
    }

    public void setChunks(List<Chunk> chunks) {
	this.chunks = chunks;
    }

    public List<Chunk> getChunks() {
	return this.chunks;
    }

    public int getCurrentId() {
	return this.currentId;
    }

    public void setCurrentId(int id) {
	this.currentId = id;
    }

    public void setChunksCkeckedLast(int chunksCkeckedLast) {
	this.chunksCkeckedLast = chunksCkeckedLast;
    }

    public int getChunksCkeckedLast() {
	return this.chunksCkeckedLast;
    }

    public void setscheduleId(int id) {
	this.scheduleId = id;
    }

    public int getScheduleId() {
	return this.scheduleId;
    }

    public void setShowInfo(long time) {
	this.showedInfo = time;
    }

    public long getShowInfo() {
	return this.showedInfo;
    }

    public void addChunkCkecked() {
	this.chunksChecked++;
    }

    public int getChunkChecked() {
	return this.chunksChecked;
    }

    public void setAutoSpeed(boolean autoSpeed) {
	this.autoSpeed = autoSpeed;
    }

    public boolean isAutoSpeed() {
	return this.autoSpeed;
    }

    public void setMessages(boolean messages) {
	this.messages = messages;
    }

    public boolean isMessages() {
	return this.messages;
    }

    public void setShowRegionInfo(boolean state) {
	this.showInfo = state;
    }

    public boolean isShowRegionInfo() {
	return this.showInfo;
    }

    public void addFound() {
	this.found++;
    }

    public int getFound() {
	return this.found;
    }

    public void setSpeed(int speed) {
	this.speed = speed;
    }

    public int getSpeed() {
	return this.speed;
    }

    public void setRunning(boolean state) {
	this.running = state;
    }

    public boolean isRunning() {
	return this.running;
    }

    public void setStartTime() {
	this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
	return this.startTime;
    }

    public void addRegionChecked() {
	this.checked++;
    }

    public int getRegionChecked() {
	return this.checked;
    }

    public String getPlayerName() {
	return this.sendername;
    }

    public CommandSender getSender() {
	return this.sender;
    }

    public void setSender(CommandSender sender) {
	this.sendername = sender.getName();
	this.sender = sender;
    }
}
