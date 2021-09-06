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

import com.google.common.collect.Iterables;

public class CMIBungeeCord {

    private static WeakHashMap<Plugin, CMIBungeeCord> registeredInstances = new WeakHashMap<>();

    private final PluginMessageListener messageListener;
    private final Plugin plugin;
    private final Map<String, Queue<CompletableFuture<?>>> callbackMap;

    private Map<String, ForwardConsumer> forwardListeners;
    private ForwardConsumer globalForwardListener;

    public synchronized static CMIBungeeCord of(Plugin plugin) {
	return registeredInstances.compute(plugin, (k, v) -> {
	    if (v == null)
		v = new CMIBungeeCord(plugin);
	    return v;
	});
    }

    public CMIBungeeCord(Plugin plugin) {
	this.messageListener = null;
	this.plugin = null;
	this.callbackMap = null;	
    }

    public void registerForwardListener(ForwardConsumer globalListener) {
	this.globalForwardListener = globalListener;
    }

    public void registerForwardListener(String channelName, ForwardConsumer listener) {
	
    }

    public CompletableFuture<Integer> getPlayerCount(String serverName) {
	
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

    @SuppressWarnings("unused")
    private Player getFirstPlayer0(Player[] playerArray) {
	return playerArray.length > 0 ? playerArray[0] : null;
    }

    private Player getFirstPlayer0(Collection<? extends Player> playerCollection) {
	return Iterables.getFirst(playerCollection, null);
    }

    @FunctionalInterface
    public interface ForwardConsumer {
	void accept(String channel, Player player, byte[] data);
    }
}