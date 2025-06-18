package com.Zrips.CMI.Modules.BungeeCord;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class BungeeCordManager {
    public static final String ServerIP = null;
    public static final String GetServer = null;
    public static final String GetServers = null;
    public static final String MessageChannel = null;
    public static final String ServersPlayerCountsChannel = null;
    public static final String ServerPlayerCountsChannel = null;
    public static final String BroadcastChannel = null;
    public static final String PublicChatChannel = null;
    public static final String StaffChatChannel = null;
    public static final String PortalSetChannel = null;
    public static final String PortalConfirmedSetChannel = null;
    public static final String TeleportChannel = null;
    public static final String TalksWithChannel = null;
    public static final String TalksWithRecordChannel = null;
    public static final String SendToServer = null;
    public static final String PlayerListRequest = null;
    public static final String PlayerListFeedback = null;
    public static final String NetworkInformation = null;
    public static final String ServerInformation = null;
    public static final String PlayerFeedback = null;
    public static final String ServerListRequest = null;
    public static UUID localRangedMessage;
    public static long localRangedMessageTime;
    HashMap<String, BungeeCordServer> servers;
    private CMI plugin;
    private boolean isBungee;
    private boolean CMIBPresent;
    public static boolean gotServerList;
    private BungeeCordServer thisServer;
    private String thisServerName;
    private boolean enabledSupport;
    private boolean backToPreviousServer;
    private boolean namesInTabComplete;
    private List<String> tabNamesServers;
    private CMIBungeeCord bcord;
    private CMIBungeeType type;
    Long time;
    private static final String spacer = null;

    public BungeeCordManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void initialize() {
    }

    public boolean isCMIBPresent() {
        return false;
    }

    public void setCMIBPresent(boolean cMIBPresent) {
    }

    @Deprecated
    public boolean isBungee() {
        return false;
    }

    public void setBungeeCord(boolean state) {
    }

    public boolean isBungeeCord() {
        return false;
    }

    public void addServer(BungeeCordServer server) {
    }

    public BungeeCordServer getServer(String server) {
        return null;
    }

    public HashMap<String, BungeeCordServer> getServers() {
        return null;
    }

    public void sendNetworkInfoUpdate() {
    }

    public void sendServerInformationToBungee() {
    }

    public void sendServerListRequest() {
    }

    public void sendPlayerListRequest() {
    }

    public void sendPlayerInfoRequest(String serverName) {
    }

    static Player getFirstPlayer() {
        return null;
    }

    public BungeeCordServer getThisServer() {
        return null;
    }

    public void setThisServer(BungeeCordServer thisServer) {
    }

    public String getThisServerName() {
        return null;
    }

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
    }

    public int getPlayersInServer(String serverName) {
        return 0;
    }

    public void sendPublicMessage(String server, String sender, String message) {
    }

    public void sendStaffMessage(String sender, String message) {
    }

    public void sendStaffMessage(String server, String sender, String message) {
    }

    @Deprecated
    public void sendMessage(String sender, String target, String message) {
    }

    public void sendPrivateMessage(String sender, String target, String message) {
    }

    public void sendBroadcastMessage(String sender, BungeeCordServer server, String message) {
    }

    public void sendPortalSetLocationToBungee(String setter, String targetServer, String portalName, Location loc) {
    }

    public void sendPortalSetSuccessResponse(String setter, String targetServer, String portalName, String loc) {
    }

    public void recordBackLocation(String targetServer, UUID uuid, Location from) {
    }

    public void teleporToLocation(String targetServer, UUID uuid, String loc, Location from) {
    }

    public void teleporToLocation(String targetServer, UUID uuid, String loc, Location from, String cmds) {
    }

    public void withWhomHeTalks(String playerName) {
    }

    public void talksWith(String who, String with) {
    }

    public void forward(String server, String channelName, byte[] data) {
    }

    public boolean isPlayerOnAnotherServer(String player) {
        return false;
    }

    public boolean isAnyoneElseOnlineOnNetwork(String excludedPlayer) {
        return false;
    }

    public void sendNewPlayerInfoToNetwork(Player player) {
    }

    public void sendNewPlayerInfoToNetwork(Player player, String server) {
    }

    public boolean isEnabledSupport() {
        return false;
    }

    public CMIBungeeCord getBungeeCord() {
        return null;
    }

    public CMIBungeeType getNetworkType() {
        return null;
    }

    public void setNetworkType(CMIBungeeType type) {
    }

    public boolean isNamesInTabComplete() {
        return false;
    }

    public boolean isBackToPreviousServer() {
        return false;
    }

    public Set<String> getPlayerNamesFromServers() {
        return null;
    }

    public Set<String> getPlayerNamesFromServers(boolean includeVanished, boolean checkWhiteListServers) {
        return null;
    }
}
