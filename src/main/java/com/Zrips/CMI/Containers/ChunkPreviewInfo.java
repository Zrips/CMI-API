package com.Zrips.CMI.Containers;

import java.io.File;
import java.util.ArrayList;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class ChunkPreviewInfo {

    private int scheduleId = -1;
    private int currentId = 1;

    private File[] regionFiles;

    private ArrayList<ChunkInfo> chunks = new ArrayList<ChunkInfo>();
    private int chunksChecked = 0;

    private int chunksCkeckedLast = 0;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean autoSpeed = true;
    private boolean messages = true;

    private Player player;
    private String Playername;
    private int checked = 0;
    private World world;

    private int mcaX;
    private int mcaZ;

    private int cX = 0;
    private int cZ = 0;

    private int loaded = 0;

    private int found = 0;

    private long startTime = 0L;

    private int speed = CMI.getInstance().getConfigManager().lfixDefaultSpeed;
    private int range = -1;

    private boolean running = false;

    public ChunkPreviewInfo() {
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

    public void setRange(int range) {
	this.range = range;
    }

    public int getRange() {
	return this.range;
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

    public void addChunks(ArrayList<ChunkInfo> chunks) {
	this.chunks = chunks;
    }

    public void addChunk(ChunkInfo chunk) {
	this.chunks.add(chunk);
    }

    public ArrayList<ChunkInfo> getChunks() {
	return this.chunks;
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

    public void addLoaded() {
	this.loaded++;
    }

    public int getloaded() {
	return this.loaded;
    }

    public void setX(int mcaX) {
	this.mcaX = mcaX;
    }

    public int getX() {
	return this.mcaX;
    }

    public void setZ(int mcaZ) {
	this.mcaZ = mcaZ;
    }

    public int getZ() {
	return this.mcaZ;
    }

    public void setCX(int cX) {
	this.cX = cX;
    }

    public void addCX() {
	this.cX++;
    }

    public int getCX() {
	return this.cX;
    }

    public void setCZ(int cZ) {
	this.cZ = cZ;
    }

    public void addCZ() {
	this.cZ++;
    }

    public int getCZ() {
	return this.cZ;
    }

    public void addRegionChecked() {
	this.checked++;
    }

    public int getRegionChecked() {
	return this.checked;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public World getWorld() {
	return this.world;
    }

    public void setRegionFiles(File[] regionFiles) {
	this.regionFiles = regionFiles;
    }

    public File[] getRegionFiles() {
	return this.regionFiles;
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
}
