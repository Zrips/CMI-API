package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Region.WorldInfo;

public class BRInfo {

    private int scheduleId = -1;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean autoSpeed = true;
    private boolean messages = true;

    private Player player;
    private String Playername;

    private long startTime = 0L;

    private int speed = 1;

    private boolean running = false;

    private int y = -1;

    private long replaced = 0L;

    List<itemInfo> itemIds = new ArrayList<itemInfo>();
    List<itemInfo> replaceIds = new ArrayList<itemInfo>();

    private double d;
    private WorldInfo RI;

    public BRInfo() {
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        if (this.y == -1)
            this.y = this.RI.getWorld().getMaxHeight();
        return this.y;
    }

    public void addReplaced() {
        this.replaced++;
    }

    public long getReplaced() {
        return this.replaced;
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
        Player p = Bukkit.getPlayer(this.player.getUniqueId());
        if (p != null)
            this.player = p;
        return this.player;
    }

    public void setPlayer(Player Player) {
        this.Playername = Player.getName();
        this.player = Player;
    }

    public void addItemInfo(itemInfo info) {
        this.itemIds.add(info);
    }

    public List<itemInfo> getItemInfo() {
        return itemIds;
    }

    public void addReplaceInfo(itemInfo info) {
        this.replaceIds.add(info);
    }

    public List<itemInfo> getReplaceInfo() {
        return replaceIds;
    }

    public void setTotal(double d) {
        this.d = d;
    }

    public double getTotal() {
        return d;
    }

    public WorldInfo getRI() {
        return RI;
    }

    public void setRI(WorldInfo rI) {
        RI = rI;
    }

}
