package com.Zrips.CMI.Modules.LightFix;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Region.WorldInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class LightFixInfo {

    private CMITask task = null;
    private long showedInfo = 0L;
    private boolean showInfo = false;
    private boolean autoSpeed = true;
    private boolean messages = true;
    private Player player;
    private String Playername;
    private long startTime = 0L;
    private int speed = CMI.getInstance().getConfigManager().lfixDefaultSpeed;
    private boolean running = false;
    private WorldInfo RI;

    public LightFixInfo() {
    }

    public void setScheduleTask(CMITask task) {
	this.task = task;
    }

    public CMITask getScheduleTask() {
	return this.task;
    }

    public void setShowInfo(long time) {
	this.showedInfo = time;
    }

    public long getShowInfo() {
	return this.showedInfo;
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

    public void setShowInfo(boolean state) {
	this.showInfo = state;
    }

    public boolean isShowInfo() {
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

    public String getPlayerName() {
	return this.Playername;
    }

    public Player getPlayer() {
	return this.player;
    }

    public void setPlayer(Player Player) {
	this.Playername = Player.getName();
	this.player = Player;
    }

    public WorldInfo getRI() {
	return RI;
    }

    public void setRI(WorldInfo rI) {
	RI = rI;
    }
}
