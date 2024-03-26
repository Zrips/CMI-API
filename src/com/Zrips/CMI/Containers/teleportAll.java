package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class teleportAll {

    private String targetFolder = null;
    private String targetWorld = null;
    private Location destination = null;
    private CompletableFuture<Void> id = null;
    private int teleported = 0;
    private List<String> names = new ArrayList<String>();
    private Player player;

    public teleportAll() {
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public String getTargetFolder() {
        if (this.targetFolder == null)
            return Bukkit.getWorlds().get(0).getName();
        return this.targetFolder;
    }

    public void setTargetWorld(String targetWorld) {
        this.targetWorld = targetWorld;
    }

    public String getTargetWorld() {
        return this.targetWorld;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getDestination() {
        return this.destination;
    }

    public void setTask(CompletableFuture<Void> task) {
        this.id = task;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player Player) {
        this.player = Player;
    }

    public CompletableFuture<Void> getTask() {
        return this.id;
    }

    public void addName(String name) {
        this.names.add(name);
    }

    public List<String> getNames() {
        return this.names;
    }

    public int getTeleportedCount() {
        return teleported;
    }

    public void addTeleported() {
        this.teleported++;
    }
}
