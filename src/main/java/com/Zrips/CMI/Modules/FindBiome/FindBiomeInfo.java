package com.Zrips.CMI.Modules.FindBiome;

import org.bukkit.block.Biome;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Region.WorldInfo;

public class FindBiomeInfo {

    private int scheduleId = -1;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean messages = true;

    private Player player;

    private long startTime = 0L;

    private int speed = 30000;

    private boolean running = true;

    private WorldInfo RI;

    private int currentId = -1;

    private Biome biome;
    private int skipped = 0;

    public FindBiomeInfo(Player player, Biome biome) {
	this.player = player;
	this.biome = biome;
    }

    public int getCurrentId() {
	return this.currentId;
    }

    public void setCurrentId(int id) {
	this.currentId = id;
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

    public Player getPlayer() {
	return this.player;
    }

    public void setPlayer(Player Player) {
	this.player = Player;
    }

    public WorldInfo getRI() {
	return RI;
    }

    public void setRI(WorldInfo RI) {
	this.RI = RI;
    }

    public Biome getBiome() {
	return biome;
    }

    public void setBiome(Biome biome) {
	this.biome = biome;
    }

    public int getSkipped() {
	return skipped;
    }

    public void addSkipped() {
	this.skipped++;
    }

    public void setSkipped(int skipped) {
	this.skipped = skipped;
    }
}
