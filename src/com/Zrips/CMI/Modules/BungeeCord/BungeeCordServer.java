package com.Zrips.CMI.Modules.BungeeCord;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class BungeeCordServer {
    private String name;
    private String ip;
    private Integer port;
    private String motd;
    private int maxPlayers;
    private int currentPlayers;
    private Long nextCheck;
    private boolean online;
    private ConcurrentHashMap<String, BungeePlayer> playersMapUUID;
    private ConcurrentHashMap<String, BungeePlayer> playersMapName;

    public BungeeCordServer(String name, String ip, Integer port) {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public String getIp() {
        return null;
    }

    public void setIp(String ip) {
    }

    public int getPort() {
        return 0;
    }

    public void setPort(int port) {
    }

    public String getMotd() {
        return null;
    }

    public void setMotd(String motd) {
    }

    public int getMaxPlayers() {
        return 0;
    }

    public void setMaxPlayers(int maxPlayers) {
    }

    public int getCurrentPlayers() {
        return 0;
    }

    public Long getNextCheck() {
        return null;
    }

    public void setNextCheck(Long nextCheck) {
    }

    public void update() {
    }

    public boolean isOnline() {
        return false;
    }

    public void setOnline(boolean online) {
    }

    public ConcurrentHashMap<String, BungeePlayer> getPlayersMapUUID() {
        return null;
    }

    public BungeePlayer getPlayer(UUID uuid) {
        return null;
    }

    public BungeePlayer getPlayer(String name) {
        return null;
    }

    public void addPlayer(BungeePlayer player) {
    }

    public void removePlayer(UUID uuid, String name) {
    }

    public void clearPlayers() {
    }

    public ConcurrentHashMap<String, BungeePlayer> getPlayersMapName() {
        return null;
    }
}
