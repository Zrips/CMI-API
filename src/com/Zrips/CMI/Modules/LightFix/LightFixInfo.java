package com.Zrips.CMI.Modules.LightFix;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Region.WorldInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class LightFixInfo {
    private CMITask task;
    private long showedInfo;
    private boolean showInfo;
    private boolean autoSpeed;
    private boolean messages;
    private Player player;
    private String Playername;
    private long startTime;
    private int speed;
    private boolean running;
    private WorldInfo RI;

    public LightFixInfo() {
    }

    public void setScheduleTask(CMITask task) {
    }

    public CMITask getScheduleTask() {
        return null;
    }

    public void setShowInfo(long time) {
    }

    public long getShowInfo() {
        return 0;
    }

    public void setAutoSpeed(boolean autoSpeed) {
    }

    public boolean isAutoSpeed() {
        return false;
    }

    public void setMessages(boolean messages) {
    }

    public boolean isMessages() {
        return false;
    }

    public void setShowInfo(boolean state) {
    }

    public boolean isShowInfo() {
        return false;
    }

    public void setSpeed(int speed) {
    }

    public int getSpeed() {
        return 0;
    }

    public void setRunning(boolean state) {
    }

    public boolean isRunning() {
        return false;
    }

    public void setStartTime() {
    }

    public long getStartTime() {
        return 0;
    }

    public String getPlayerName() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }

    public WorldInfo getRI() {
        return null;
    }

    public void setRI(WorldInfo rI) {
    }
}
