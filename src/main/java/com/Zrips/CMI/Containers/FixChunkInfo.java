package com.Zrips.CMI.Containers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

public class FixChunkInfo {

    private int scheduleId = -1;

    private int currentId = 1;

    private List<File> regionFiles = new ArrayList<File>();
    private RegionFiles currentRegion = null;

    private Vector center;
    private ArrayList<ChunkInfo> chunks = new ArrayList<ChunkInfo>();
    private boolean onlyChunks = false;
    private double chunksChecked = 0;

    private double chunksCkeckedLast = 0;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean autoSpeed = true;
    private boolean messages = true;

    private UUID sender;
    private double checked = 0;
    private World world;

    private int mcaX;
    private int mcaZ;

    private int loaded = 0;
    private double total = 0;

    private int found = 0;

    private long startTime = 0L;

    private int speed = 1;
    private int range = -1;

    private boolean running = false;

    private ArrayList<ChunkInfo> chunksResult = new ArrayList<ChunkInfo>();

    public FixChunkInfo() {
    }

    public List<ChunkInfo> getChunksResult() {
	return this.chunksResult;
    }

    public void addChunkResult(ChunkInfo c) {
	chunksResult.add(c);
    }

    public int getCurrentId() {
	return this.currentId;
    }

    public void setCurrentId(int id) {
	this.currentId = id;
    }

    public void setChunksCkeckedLast(double checked2) {
	this.chunksCkeckedLast = checked2;
    }

    public double getChunksCkeckedLast() {
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

    public double getChunkChecked() {
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

    public void setOnlyChunks(boolean state) {
	this.onlyChunks = state;
    }

    public boolean isOnlyChunks() {
	return this.onlyChunks;
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

    public void addRegionChecked() {
	this.checked++;
    }

    public double getRegionChecked() {
	return this.checked;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public World getWorld() {
	return this.world;
    }

    public void setRegionFiles(List<File> regionFiles2) {
	this.regionFiles = regionFiles2;
    }

    public List<File> getRegionFiles() {
	return this.regionFiles;
    }

    public CommandSender getSender() {
	if (this.sender.equals(CMI.getInstance().getServerUUID()))
	    return Bukkit.getConsoleSender();
	return Bukkit.getPlayer(this.sender);
    }

    public void setSender(UUID sender) {
	this.sender = sender;
    }

    public double getTotal() {
	return total;
    }

    public void setTotal(double total) {
	this.total = total;
    }

    public Vector getCenter() {
	return center;
    }

    public void setCenter(Vector center) {
	this.center = center;
    }

    public RegionFiles getCurrentRegion() {
	return currentRegion;
    }

    public void setCurrentRegion(RegionFiles currentRegion) {
	this.currentRegion = currentRegion;
    }
}
