package com.Zrips.CMI.Modules.BungeeCord;

import java.util.UUID;

public class BungeePlayer {

    private String playerName;
    private String playerDisplayName;
    private String nickName;
    private BungeeCordServer bungeeServer;
    private UUID uuid;
    private boolean vanished = false;

    public boolean getVanished() {
	return vanished;
    }

    public BungeePlayer setVanished(boolean vanished) {
	this.vanished = vanished;
	return this;
    }

    public String getName() {
	return playerName;
    }

    public BungeePlayer setName(String playerName) {
	this.playerName = playerName;
	return this;
    }

    public UUID getUniqueId() {
	return uuid;
    }

    public BungeePlayer setUniqueId(UUID uuid) {
	this.uuid = uuid;
	return this;
    }

    public String getPlayerDisplayName() {
	return playerDisplayName == null ? this.getName() : playerDisplayName;
    }

    public BungeePlayer setPlayerDisplayName(String playerDisplayName) {
	this.playerDisplayName = playerDisplayName;
	return this;
    }

    public BungeeCordServer getBungeeServer() {
	return bungeeServer;
    }

    public void setBungeeServer(BungeeCordServer bungeeServer) {
	this.bungeeServer = bungeeServer;
    }

    public String getServerName() {
	return this.getBungeeServer() == null ? "" : this.getBungeeServer().getName();
    }

    public String getNickName() {
	return nickName;
    }

    public void setNickName(String nickName) {
	this.nickName = nickName;
    }

}
