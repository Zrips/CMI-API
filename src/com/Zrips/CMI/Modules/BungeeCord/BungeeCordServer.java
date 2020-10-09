package com.Zrips.CMI.Modules.BungeeCord;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.BungeeCord.ServerListPing.Player;
import com.Zrips.CMI.Modules.BungeeCord.ServerListPing.StatusResponse;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Containers.CMIChatColor;

public class BungeeCordServer {

    private String name;
    private String ip;
    private Integer port;
    private String motd = "";
    private int maxPlayers = 0;
    private int currentPlayers = 0;
    private Long nextCheck = 0L;
    private boolean online = false;

    private HashMap<String, BungeePlayer> playersMapUUID = new HashMap<String, BungeePlayer>();
    private HashMap<String, BungeePlayer> playersMapName = new HashMap<String, BungeePlayer>();

    public BungeeCordServer(String name, String ip, Integer port) {
	this.name = name;
	this.ip = ip;
	this.port = port;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getIp() {
	return ip;
    }

    public void setIp(String ip) {
	this.ip = ip;
    }

    public int getPort() {
	return port;
    }

    public void setPort(int port) {
	this.port = port;
    }

    public String getMotd() {
	return motd;
    }

    public void setMotd(String motd) {
	this.motd = motd;
    }

    public int getMaxPlayers() {
	return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
	this.maxPlayers = maxPlayers;
    }

    public int getCurrentPlayers() {
	int total = 0;
	return total;
    }

//    public void setCurrentPlayers(int currentPlayers) {
//	this.currentPlayers = currentPlayers;
//    }

    public Long getNextCheck() {
	return nextCheck;
    }

    public void setNextCheck(Long nextCheck) {
	this.nextCheck = nextCheck;
    }

    public void update() {
	
    }

    public boolean isOnline() {
	return online;
    }

    public void setOnline(boolean online) {
	this.online = online;
    }

    public HashMap<String, BungeePlayer> getPlayersMapUUID() {
	return playersMapUUID;
    }

    public BungeePlayer getPlayer(UUID uuid) {
	return playersMapUUID.get(uuid.toString());
    }

    public BungeePlayer getPlayer(String name) {
	
	return null;
    }

    public void addPlayer(BungeePlayer player) {
    }

    public void removePlayer(UUID uuid, String name) {
    }
}
