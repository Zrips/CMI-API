package com.Zrips.CMI.Modules.BungeeCord;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.google.common.collect.Iterables;

import net.Zrips.CMILib.CMILib;

public class BungeeCordManager {

    public static final String ServerIP = "ServerIP";
    public static final String GetServer = "GetServer";
    public static final String GetServers = "GetServers";
    public static final String MessageChannel = "CMIMessageSubChannel";
    public static final String ServersPlayerCountsChannel = "CMIServersPlayerCounts";
    public static final String ServerPlayerCountsChannel = "CMIServerPlayerCounts";
    public static final String BroadcastChannel = "CMIBroadcastSubChannel";
    public static final String PublicChatChannel = "CMIChatSubChannel";
    public static final String StaffChatChannel = "CMIStaffSubChannel";
    public static final String PortalSetChannel = "CMIPortalSetSubChannel";
    public static final String PortalConfirmedSetChannel = "CMIPortalCSetSubChannel";
    public static final String TeleportChannel = "CMITeleportChannel";
    public static final String TalksWithChannel = "CMITalksWith";
    public static final String TalksWithRecordChannel = "CMITalksWithRecord";

    public static final String PlayerListRequest = "CMIPlayerListRequest";
    public static final String PlayerListFeedback = "CMIPlayerListFeedback";

    public static final String NetworkInformation = "CMINetworkInfo";
    public static final String ServerInformation = "CMIServerInfo";

    public static final String PlayerFeedback = "CMIPlayerFeedback";
    public static final String ServerListRequest = "CMIServerListRequest";

    public static UUID localRangedMessage;
    public static long localRangedMessageTime;

    HashMap<String, BungeeCordServer> servers = new HashMap<String, BungeeCordServer>();
    private CMI plugin;
    private boolean isBungee = false;
    private boolean CMIBPresent = false;
    private boolean gotServerList = false;
    private BungeeCordServer thisServer;
    private String thisServerName;
    private boolean enabledSupport = true;
    private boolean backToPreviousServer = true;
    private boolean namesInTabComplete = true;
    private CMIBungeeCord bcord = null;

    private CMIBungeeType type = CMIBungeeType.Unknown;

    public BungeeCordManager(CMI plugin) {
        this.plugin = plugin;
        bcord = CMIBungeeCord.of(plugin);
    }

    public void loadConfig() {

    }

    public void initialize() {

    }

    public boolean isCMIBPresent() {
        return CMIBPresent;
    }

    public void setCMIBPresent(boolean cMIBPresent) {
        if (cMIBPresent) {
            plugin.consoleMessage("CMI proxy plugin detected");
            sendNetworkInfoUpdate();
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
        gotServerList = true;
        servers.put(server.getName().toLowerCase(), server);
        server.update();
    }

    Long time = 0L;

    public BungeeCordServer getServer(String server) {
        if (System.currentTimeMillis() > time + 600L) {
            updateServers();
        }
        return servers.get(server.toLowerCase());
    }

    public HashMap<String, BungeeCordServer> getServers() {
        if (System.currentTimeMillis() > time + 600L) {
            sendNetworkInfoUpdate();
            updateServers();
            time = System.currentTimeMillis();
        }
        return servers;
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

    private static Player getFirstPlayer() {
        Player firstPlayer = Iterables.getFirst(Bukkit.getOnlinePlayers(), null);
        return firstPlayer;
    }

    public BungeeCordServer getThisServer() {
        if (thisServer == null) {
            if (getThisServerName() != null) {
                thisServer = this.getServer(getThisServerName());
            }
        }
        return thisServer;
    }

    public void setThisServer(BungeeCordServer thisServer) {
        this.thisServer = thisServer;
    }

    public String getThisServerName() {
        return null;
    }

    private static final String spacer = "_20_";

    public String getThisServerNameOneWord() {
        if (thisServerName == null && thisServer != null)
            thisServerName = thisServer.getName();
        return thisServerName == null ? CMILib.getInstance().getReflectionManager().getServerName().replace(" ", spacer) : thisServerName.replace(" ", spacer);
    }

    public void setThisServerName(String thisServerName) {
        this.thisServerName = thisServerName;
        if (getThisServerName() != null) {
            thisServer = this.getServer(getThisServerName());
        }
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
        if (!enabledSupport)
            return false;
        BungeeCordServer server = this.getServer(serverName);
        if (server == null)
            return false;
        return server.getCurrentPlayers() > 0;
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
        connectToServer(CMIUser.getOnlinePlayer(player), server);
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
        sendPrivateMessage(sender, target, message);
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
        teleporToLocation(targetServer, uuid, "", from, "");
    }

    public void teleporToLocation(String targetServer, UUID uuid, String loc, Location from) {
        teleporToLocation(targetServer, uuid, loc, from, "");
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

    public void sendNewPlayerInfoToNetwork(Player player) {

    }

    public void sendNewPlayerInfoToNetwork(Player player, String server) {

    }

    public boolean isEnabledSupport() {
        return enabledSupport;
    }

    public CMIBungeeCord getBungeeCord() {
        return bcord;
    }

    public CMIBungeeType getNetworkType() {
        return type;
    }

    public void setNetworkType(CMIBungeeType type) {
        this.type = type;
    }

    public boolean isNamesInTabComplete() {
        return namesInTabComplete;
    }

    public boolean isBackToPreviousServer() {
        return backToPreviousServer;
    }
}
