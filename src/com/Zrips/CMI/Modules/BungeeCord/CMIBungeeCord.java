package com.Zrips.CMI.Modules.BungeeCord;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class CMIBungeeCord {
    private static WeakHashMap<Plugin, CMIBungeeCord> registeredInstances;
    private final PluginMessageListener messageListener = null;
    private final Plugin plugin = null;
    private final Map<String, Queue<CompletableFuture<?>>> callbackMap = null;
    private Map<String, ForwardConsumer> forwardListeners;
    private ForwardConsumer globalForwardListener;

    public synchronized static CMIBungeeCord of(Plugin plugin) {
        return null;
    }

    public CMIBungeeCord(Plugin plugin) {
    }

    public void registerForwardListener(ForwardConsumer globalListener) {
    }

    public void registerForwardListener(String channelName, ForwardConsumer listener) {
    }

    public CompletableFuture<Integer> getPlayerCount(String serverName) {
        return null;
    }

    public CompletableFuture<String> getServerPlayerCount(String serverName) {
        return null;
    }

    public CompletableFuture<List<String>> getServersPlayerCount() {
        return null;
    }

    public CompletableFuture<List<String>> getPlayerList(String serverName) {
        return null;
    }

    public CompletableFuture<List<String>> getServers() {
        return null;
    }

    public void connect(Player player, String serverName) {
    }

    public void connectOther(String playerName, String server) {
    }

    public CompletableFuture<InetSocketAddress> getIp(Player player) {
        return null;
    }

    public void sendMessage(String playerName, String message) {
    }

    public CompletableFuture<String> getServer() {
        return null;
    }

    public CompletableFuture<String> getUUID(Player player) {
        return null;
    }

    public CompletableFuture<String> getUUID(String playerName) {
        return null;
    }

    public CompletableFuture<InetSocketAddress> getServerIp(String serverName) {
        return null;
    }

    public void kickPlayer(String playerName, String kickMessage) {
    }

    public void forward(String server, String channelName, byte[] data) {
    }

    public void forwardToPlayer(String playerName, String channelName, byte[] data) {
    }

    @SuppressWarnings("unchecked")
    private void onPluginMessageReceived(String channel, Player player, byte[] message) {
    }

    public void unregister() {
    }

    private BiFunction<String, Queue<CompletableFuture<?>>, Queue<CompletableFuture<?>>> computeQueueValue(CompletableFuture<?> queueValue) {
        return null;
    }

    private Player getFirstPlayer() {
        return null;
    }

    private Player getFirstPlayer(Collection<? extends Player> playerCollection) {
        return null;
    }

    public interface ForwardConsumer {
        void accept(String channel, Player player, byte[] data);
    }
}
