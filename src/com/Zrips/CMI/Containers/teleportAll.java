package com.Zrips.CMI.Containers;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class teleportAll {
    private String targetFolder;
    private String targetWorld;
    private Location destination;
    private CompletableFuture<Void> id;
    private int teleported;
    private List<String> names;
    private Player player;

    public teleportAll() {
    }

    public void setTargetFolder(String targetFolder) {
    }

    public String getTargetFolder() {
        return null;
    }

    public void setTargetWorld(String targetWorld) {
    }

    public String getTargetWorld() {
        return null;
    }

    public void setDestination(Location destination) {
    }

    public Location getDestination() {
        return null;
    }

    public void setTask(CompletableFuture<Void> task) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }

    public CompletableFuture<Void> getTask() {
        return null;
    }

    public void addName(String name) {
    }

    public List<String> getNames() {
        return null;
    }

    public int getTeleportedCount() {
        return 0;
    }

    public void addTeleported() {
    }
}
