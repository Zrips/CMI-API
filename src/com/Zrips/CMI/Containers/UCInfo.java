package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class UCInfo {
    private CMITask scheduleId;
    private int currentId;
    private List<Chunk> chunks;
    private int chunksChecked;
    private int chunksCkeckedLast;
    private long showedInfo;
    private boolean showInfo;
    private boolean autoSpeed;
    private boolean messages;
    private CommandSender sender;
    private String sendername;
    private int checked;
    private int found;
    private long startTime;
    private int speed;
    private boolean running;

    public UCInfo() {
    }

    public void setChunks(List<Chunk> chunks) {
    }

    public List<Chunk> getChunks() {
        return null;
    }

    public int getCurrentId() {
        return 0;
    }

    public void setCurrentId(int id) {
    }

    public void setChunksCkeckedLast(int chunksCkeckedLast) {
    }

    public int getChunksCkeckedLast() {
        return 0;
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

    public void addChunkCkecked() {
    }

    public int getChunkChecked() {
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

    public void setShowRegionInfo(boolean state) {
    }

    public boolean isShowRegionInfo() {
        return false;
    }

    public void addFound() {
    }

    public int getFound() {
        return 0;
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

    public void addRegionChecked() {
    }

    public int getRegionChecked() {
        return 0;
    }

    public String getPlayerName() {
        return null;
    }

    public CommandSender getSender() {
        return null;
    }

    public void setSender(CommandSender sender) {
    }
}
