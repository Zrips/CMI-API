package com.Zrips.CMI.Modules.Scan;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Modules.Search.CMIDataResultBase;
import com.Zrips.CMI.Modules.Search.CMIDataResultLocationBase;
import com.Zrips.CMI.Modules.Search.CMIDataSearch;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldDataSearch extends CMIDataSearch {
    protected static CMIWorldDataSearch activeSearch;
    World world;
    CMIVectorInt2D center;
    int range;
    int maxY;
    int minY;
    long skippedChunks;
    private boolean startScan;
    boolean paused;
    CompletableFuture<CMIWorldChunksRanged> complete;
    private ConcurrentHashMap<UUID, CMIDataResultLocationBase> foundIn;
    private CMIWorldChunksRanged worldInformation;
    int chunksLoading;

    public CMIWorldDataSearch(CommandSender sender, Location center, int range) {
        super(sender);
    }

    public CMIWorldDataSearch(CommandSender sender) {
        super(sender);
    }

    public void onDataLoadStart() {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public void setCenter(Chunk chunk) {
    }

    public long getSkippedChunks() {
        return 0;
    }

    public void setCenter(int x, int z) {
    }

    public CMIVectorInt2D getCenter() {
        return null;
    }

    public void setRange(int range) {
    }

    private void recheckWorldInfo() {
    }

    public static CMIWorldDataSearch getActiveSearch() {
        return null;
    }

    protected static void setActiveSearch(CMIWorldDataSearch newSearch) {
    }

    @Override
    public void search() {
    }

    @Override
    protected void initSearch() {
    }

    public void setPaused(boolean paused) {
    }

    public boolean isPaused() {
        return false;
    }

    public void onPauseChange() {
    }

    private void scanNextChunk() {
    }

    private void scanChunkBlocks(Chunk chunk) {
    }

    private void scanChunkEntities(Chunk chunk) {
    }

    public static UUID locationToUUID(Vector vector) {
        return null;
    }

    private void checkContents(Block block, ItemStack[] contents) {
    }

    public ConcurrentHashMap<UUID, CMIDataResultLocationBase> getSearchResults() {
        return null;
    }

    private void checkContents(Entity entity, ItemStack[] contents) {
    }

    private void add(Set<CMIDataResultBase> results) {
    }
}
