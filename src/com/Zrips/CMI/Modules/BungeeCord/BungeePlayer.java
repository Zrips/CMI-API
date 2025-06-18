package com.Zrips.CMI.Modules.BungeeCord;

import java.util.UUID;

public class BungeePlayer {
    private String playerName;
    private String playerDisplayName;
    private String nickName;
    private BungeeCordServer bungeeServer;
    private UUID uuid;
    private boolean vanished;
    private String previousServer;
    private Long serverSwitchTime;

    public boolean getVanished() {
        return false;
    }

    public BungeePlayer setVanished(boolean vanished) {
        return null;
    }

    public String getName() {
        return null;
    }

    public BungeePlayer setName(String playerName) {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }

    public BungeePlayer setUniqueId(UUID uuid) {
        return null;
    }

    public String getPlayerDisplayName() {
        return null;
    }

    public BungeePlayer setPlayerDisplayName(String playerDisplayName) {
        return null;
    }

    public BungeeCordServer getBungeeServer() {
        return null;
    }

    public void setBungeeServer(BungeeCordServer bungeeServer) {
    }

    public String getServerName() {
        return null;
    }

    public String getNickName() {
        return null;
    }

    public void setNickName(String nickName) {
    }

    public Long getServerSwitchTime() {
        return null;
    }

    public void setServerSwitchTime(Long serverSwitchTime) {
    }

    public String getPreviousServer() {
        return null;
    }

    public void setPreviousServer(String previousServer) {
    }
}
