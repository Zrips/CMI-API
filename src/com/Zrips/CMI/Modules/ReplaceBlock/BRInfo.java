package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Region.WorldInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class BRInfo {
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
    private int y;
    private long replaced;
    List<itemInfo> itemIds;
    List<itemInfo> replaceIds;
    private double d;
    private WorldInfo RI;

    public BRInfo() {
    }

    public void setY(int y) {
    }

    public int getY() {
        return 0;
    }

    public void addReplaced() {
    }

    public long getReplaced() {
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

    public void addItemInfo(itemInfo info) {
    }

    public List<itemInfo> getItemInfo() {
        return null;
    }

    public void addReplaceInfo(itemInfo info) {
    }

    public List<itemInfo> getReplaceInfo() {
        return null;
    }

    public void setTotal(double d) {
    }

    public double getTotal() {
        return 0.0;
    }

    public WorldInfo getRI() {
        return null;
    }

    public void setRI(WorldInfo rI) {
    }
}
