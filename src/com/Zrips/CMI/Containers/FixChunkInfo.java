package com.Zrips.CMI.Containers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class FixChunkInfo {
    private CMITask scheduleTask;
    private int currentId;
    private List<File> regionFiles;
    private RegionFiles currentRegion;
    private Vector center;
    private ArrayList<ChunkInfo> chunks;
    private boolean onlyChunks;
    private double chunksChecked;
    private double chunksCkeckedLast;
    private long showedInfo;
    private boolean showInfo;
    private boolean autoSpeed;
    private boolean messages;
    private UUID sender;
    private double checked;
    private World world;
    private int mcaX;
    private int mcaZ;
    private int loaded;
    private double total;
    private int found;
    private long startTime;
    private int speed;
    private int range;
    private boolean running;
    private ArrayList<ChunkInfo> chunksResult;

    public FixChunkInfo() {
    }

    public List<ChunkInfo> getChunksResult() {
        return null;
    }

    public void addChunkResult(ChunkInfo c) {
    }

    public int getCurrentId() {
        return 0;
    }

    public void setCurrentId(int id) {
    }

    public void setChunksCkeckedLast(double checked2) {
    }

    public double getChunksCkeckedLast() {
        return 0.0;
    }

    public void setRange(int range) {
    }

    public int getRange() {
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

    public double getChunkChecked() {
        return 0.0;
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

    public void setOnlyChunks(boolean state) {
    }

    public boolean isOnlyChunks() {
        return false;
    }

    public void addChunks(ArrayList<ChunkInfo> chunks) {
    }

    public void addChunk(ChunkInfo chunk) {
    }

    public ArrayList<ChunkInfo> getChunks() {
        return null;
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

    public void addLoaded() {
    }

    public int getloaded() {
        return 0;
    }

    public void setX(int mcaX) {
    }

    public int getX() {
        return 0;
    }

    public void setZ(int mcaZ) {
    }

    public int getZ() {
        return 0;
    }

    public void addRegionChecked() {
    }

    public double getRegionChecked() {
        return 0.0;
    }

    public void setWorld(World world) {
    }

    public World getWorld() {
        return null;
    }

    public void setRegionFiles(List<File> regionFiles2) {
    }

    public List<File> getRegionFiles() {
        return null;
    }

    public CommandSender getSender() {
        return null;
    }

    public void setSender(UUID sender) {
    }

    public double getTotal() {
        return 0.0;
    }

    public void setTotal(double total) {
    }

    public Vector getCenter() {
        return null;
    }

    public void setCenter(Vector center) {
    }

    public RegionFiles getCurrentRegion() {
        return null;
    }

    public void setCurrentRegion(RegionFiles currentRegion) {
    }
}
