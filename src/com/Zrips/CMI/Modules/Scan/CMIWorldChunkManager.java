package com.Zrips.CMI.Modules.Scan;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import org.bukkit.World;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldChunkManager {
    private CMI plugin;
    private static final Pattern regionPattern = null;
    private boolean disableWorldChunkCheckInfo;
    private double scanSoftCap;
    private int scanDefaultSpeed;
    private int defaultRange;
    private boolean purge;
    private boolean logIntoFile;

    public CMIWorldChunkManager(CMI plugin) {
    }

    public boolean isDisableWorldChunkCheckInfo() {
        return false;
    }

    public double getScanSoftCap() {
        return 0.0;
    }

    public int getScanDefaultSpeed() {
        return 0;
    }

    public int getDefaultRange() {
        return 0;
    }

    public boolean isPurge() {
        return false;
    }

    public boolean isLogIntoFile() {
        return false;
    }

    public void loadConfig() {
    }

    private CompletableFuture<CMIWorldChunks> loadWorldChunksInfo(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRange(World world, CMIVectorInt2D center) {
        return null;
    }

    public CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRangeAsync(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public CompletableFuture<CMIWorldChunks> loadWorldChunksInRangeAsync(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public static HashMap<Long, CMIVectorInt2D> getRegionFiles(CMIVectorInt2D center, int range) {
        return null;
    }
}
