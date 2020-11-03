package com.Zrips.CMI.Modules.BungeeCord;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.google.common.collect.Iterables;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class BungeeCordManager {

    public static final String ServerIP = "ServerIP";
    public static final String GetServer = "GetServer";
    public static final String GetServers = "GetServers";
    public static final String MessageChannel = "CMIMessageSubChannel";
    public static final String BroadcastChannel = "CMIBroadcastSubChannel";
    public static final String PublicChatChannel = "CMIChatSubChannel";
    public static final String StaffChatChannel = "CMIStaffSubChannel";
    public static final String PortalSetChannel = "CMIPortalSetSubChannel";
    public static final String PortalConfirmedSetChannel = "CMIPortalCSetSubChannel";
    public static final String PortalLocChannel = "CMIPortalLocSubChannel";
//    public static final String PlayerInfoChannel = "CMIPlayerInfoSubChannel";
//    public static final String PlayerInfoRequestChannel = "CMIPlayerInfoReqChannel";
    public static final String PlayerListRequest = "CMIPlayerListRequest";
    public static final String PlayerListFeedback = "CMIPlayerListFeedback";
//    public static final String PlayerRequest = "CMIPlayerRequest";
    public static final String PlayerFeedback = "CMIPlayerFeedback";
    public static final String ServerListRequest = "CMIServerListRequest";
//    public static final String PlayerCountChangeChannel = "CMIPlayerChangeChannel";
    public static UUID localRangedMessage;
    public static long localRangedMessageTime;

    HashMap<String, BungeeCordServer> servers = new HashMap<String, BungeeCordServer>();
    private CMI plugin;
    private boolean isBungee = false;
    private Boolean CMIBPresent = false;
    private boolean gotServerList = false;
    private BungeeCordServer thisServer;
    private String thisServerName;
    private boolean enabledSupport = true;
    public static boolean NamesInTabComplete = true;

    public BungeeCordManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadConfig() {
    }

    public void initialize() {
    }

    public Boolean getCMIPresent() {
	return CMIBPresent;
    }

    public Boolean isCMIBPresent() {
	return CMIBPresent;
    }

    public void setCMIBPresent(boolean cMIBPresent) {
	if (cMIBPresent) {
	    plugin.consoleMessage("CMIB proxy plugin detected");
	}
	CMIBPresent = cMIBPresent;
    }

    @Deprecated
    public boolean isBungee() {
	return isBungeeCord();
    }

    public void setBungeeCord(boolean state) {
	isBungee = state;
    }

    public boolean isBungeeCord() {
	return isBungee && enabledSupport;
    }

    public void addServer(BungeeCordServer server) {
    }

    int updated = 0;

    public BungeeCordServer getServer(String server) {
	return null;
    }

    public HashMap<String, BungeeCordServer> getServers() {
	return null;
    }

    public void sendServerListRequest() {
    }

    public void sendPlayerInfoRequest(String serverName) {
    }

    private static Player getFirstPlayer() {
	return null;
    }

    public BungeeCordServer getThisServer() {
	return null;
    }

    public void setThisServer(BungeeCordServer thisServer) {
	this.thisServer = thisServer;
    }

    public String getThisServerName() {
	return null;
    }

    private static final String spacer = "_20_";

    public String getThisServerNameOneWord() {
	return null;
    }

    public void setThisServerName(String thisServerName) {
    }

    public BungeePlayer getBungeePlayer(String player) {
	return null;
    }

    public BungeePlayer getBungeePlayer(UUID uuid) {
	return null;
    }

    public BungeeCordServer getPlayerServer(UUID uuid) {
	return null;
    }

    public BungeeCordServer getPlayerServer(String player) {
	return null;
    }

    public boolean anyPlayersOnServer(String serverName) {
	return false;
    }

    public void updateServersInfo() {
    }

    public void updateServersIp() {
    }

    public void updateServers() {
    }

    public void connectToServer(Player player, String serverName) {
    }

    public void connectOther(String playerName, String server) {
    }

    public void connectToServer(String player, String server) {
	connectToServer(Bukkit.getPlayer(player), server);
    }

    public int getPlayersInServer(String serverName) {
	if (!enabledSupport)
	    return 0;
	BungeeCordServer server = this.getServer(serverName);
	if (server == null) {
	    return 0;
	}
	server.update();
	return server.getCurrentPlayers();
    }

    public void sendPublicMessage(String server, String sender, String message) {
    }

    public void sendStaffMessage(String sender, String message) {
    }

    public void sendStaffMessage(String server, String sender, String message) {
    }

    @Deprecated
    public void sendMessage(String sender, String target, String message) {
	sendPrivateMessage(sender, target, message);
    }

    public void sendPrivateMessage(String sender, String target, String message) {

    }

    public void sendBroadcastMessage(String sender, BungeeCordServer server, String message) {

    }

    public void sendPortalSetLocation(String setter, String targetServer, String portalName, Location loc) {
	
    }

    public void sendPortalSetSuccessResponse(String setter, String targetServer, String portalName, String loc) {
	
    }

    public void sendPortalLoginLocation(String targetServer, UUID uuid, String loc, String cmds) {
	
    }

    public void forward(String server, String channelName, byte[] data) {
	
    }

    public boolean isPlayerOnAnotherServer(String player) {
	
	return false;
    }

    public void sendNewPlayerInfoToNetwork(Player player) {
    }

    public void sendNewPlayerInfoToNetwork(Player player, String server) {
	
    }

    public boolean isEnabledSupport() {
	return enabledSupport;
    }

}
