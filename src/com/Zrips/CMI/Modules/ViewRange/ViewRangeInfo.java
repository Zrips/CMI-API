package com.Zrips.CMI.Modules.ViewRange;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.ChunkInfo;
import com.Zrips.CMI.Containers.Direction;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ViewRangeInfo {
    private CMITask scheduleTask;
    private int currentId;
    private boolean teleporting;
    private long tptime;
    private File regionFiles;
    private ArrayList<ChunkInfo> chunks;
    private List<ChunkInfo> LoadedChunks;
    private List<ChunkInfo> unloadChunks;
    private int chunksChecked;
    private int chunksCkeckedLast;
    private long showedInfo;
    private boolean showInfo;
    private boolean autoSpeed;
    private boolean messages;
    private Player player;
    private String Playername;
    private int checked;
    private World world;
    private int mcaX;
    private int mcaZ;
    private int cX;
    private int cZ;
    private int loaded;
    private int found;
    private long startTime;
    private int speed;
    private int range;
    private boolean running;
    private Chunk chunk;
    private Direction moveDirection;

    public ViewRangeInfo() {
    }

    public void setTeleporting(boolean teleporting) {
    }

    public boolean isTeleporting() {
        return false;
    }

    public void setTeleportingTime(long tptime) {
    }

    public long getTeleportingTime() {
        return 0;
    }

    public void setChunk(Chunk chunk) {
    }

    public Chunk getChunk() {
        return null;
    }

    public void setMoveDirection(Direction dir) {
    }

    public Direction getMoveDirection() {
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

    public void resetChunkCkecked() {
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

    public void addUnloadChunks(List<ChunkInfo> tempUnloadList) {
    }

    public List<ChunkInfo> getUnloadChunks() {
        return null;
    }

    public void addLoadedChunks(List<ChunkInfo> chunks) {
    }

    public synchronized void removeLoadedChunks(List<ChunkInfo> chunks) {
    }

    public void addLoadedChunk(ChunkInfo chunk) {
    }

    public List<ChunkInfo> getLoadedChunks() {
        return null;
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

    public void setCX(int cX) {
    }

    public void addCX() {
    }

    public int getCX() {
        return 0;
    }

    public void setCZ(int cZ) {
    }

    public void addCZ() {
    }

    public int getCZ() {
        return 0;
    }

    public void addRegionChecked() {
    }

    public int getRegionChecked() {
        return 0;
    }

    public void setWorld(World world) {
    }

    public World getWorld() {
        return null;
    }

    public void setRegionFiles(File[] regionFiles) {
    }

    public File[] getRegionFiles() {
        return null;
    }

    public String getPlayerName() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }
}
