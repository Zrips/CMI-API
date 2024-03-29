package com.Zrips.CMI.Modules.BungeeCord;

import java.net.InetSocketAddress;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.google.common.collect.Iterables;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class CMIBungeeCord {

    private static WeakHashMap<Plugin, CMIBungeeCord> registeredInstances = new WeakHashMap<>();

    private final PluginMessageListener messageListener;
    private final Plugin plugin;
    private final Map<String, Queue<CompletableFuture<?>>> callbackMap;

    private Map<String, ForwardConsumer> forwardListeners;
    private ForwardConsumer globalForwardListener;

    /**
     * Get or create new BungeeChannelApi instance
     *
     * @param plugin the plugin instance.
     * @return the BungeeChannelApi instance for the {@code plugin}
     * @throws NullPointerException if the {@code plugin} is {@code null}
     */
    public synchronized static CMIBungeeCord of(Plugin plugin) {
        return registeredInstances.compute(plugin, (k, v) -> {
            if (v == null)
                v = new CMIBungeeCord(plugin);
            return v;
        });
    }

    public CMIBungeeCord(Plugin plugin) {
        this.plugin = Objects.requireNonNull(plugin, "plugin cannot be null");
        this.callbackMap = new HashMap<>();

        // Prevent dev's from registering multiple channel listeners,
        // by unregistering the old instance.
        synchronized (registeredInstances) {
            registeredInstances.compute(plugin, (k, oldInstance) -> {
                if (oldInstance != null)
                    oldInstance.unregister();
                return this;
            });
        }

        this.messageListener = this::onPluginMessageReceived;

    }

    /**
     * Set a global listener for all 'forwarded' messages.
     *
     * @param globalListener the listener
     * @see <a href="https://www.spigotmc.org/wiki/bukkit-bungee-plugin-messaging-channel/#forward">https://www.spigotmc.org/wiki/bukkit-bungee-plugin-messaging-channel/#forward</a>
     */
    public void registerForwardListener(ForwardConsumer globalListener) {
        this.globalForwardListener = globalListener;
    }

    /**
     * Set a listener for all 'forwarded' messages in a specific subchannel.
     *
     * @param channelName the subchannel name
     * @param listener the listener
     * @see <a href="https://www.spigotmc.org/wiki/bukkit-bungee-plugin-messaging-channel/#forward">https://www.spigotmc.org/wiki/bukkit-bungee-plugin-messaging-channel/#forward</a>
     */
    public void registerForwardListener(String channelName, ForwardConsumer listener) {
        if (forwardListeners == null) {
            forwardListeners = new HashMap<>();
        }
        synchronized (forwardListeners) {
            forwardListeners.put(channelName, listener);
        }
    }

    /**
     * Get the amount of players on a certain server, or on ALL the servers.
     *
     * @param serverName the server name of the server to get the player count of, or ALL to get the global player count
     * @return A {@link CompletableFuture} that, when completed, will return
     *         the amount of players on a certain server, or on ALL the servers.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<Integer> getPlayerCount(String serverName) {
        return null;
    }

    public CompletableFuture<String> getServerPlayerCount(String serverName) {
        return null;
    }

    public CompletableFuture<List<String>> getServersPlayerCount() {
        return null;
    }

    /**
     * Get a list of players connected on a certain server, or on ALL the servers.
     *
     * @param serverName the name of the server to get the list of connected players, or ALL for global online player list
     * @return A {@link CompletableFuture} that, when completed, will return a
     *         list of players connected on a certain server, or on ALL the servers.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<List<String>> getPlayerList(String serverName) {
        return null;
    }

    /**
     * Get a list of server name strings, as defined in BungeeCord's config.yml.
     *
     * @return A {@link CompletableFuture} that, when completed, will return a
     *         list of server name strings, as defined in BungeeCord's config.yml.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<List<String>> getServers() {
        return null;
    }

    /**
     * Connects a player to said subserver.
     *
     * @param player the player you want to teleport.
     * @param serverName the name of server to connect to, as defined in BungeeCord config.yml.
     */
    public void connect(Player player, String serverName) {
        ByteArrayDataOutput output = ByteStreams.newDataOutput();
        output.writeUTF("Connect");
        output.writeUTF(serverName);
        player.sendPluginMessage(this.plugin, "BungeeCord", output.toByteArray());
    }

    /**
     * Connect a named player to said subserver.
     *
     * @param playerName name of the player to teleport.
     * @param server name of server to connect to, as defined in BungeeCord config.yml.
     * @throws IllegalArgumentException if there is no players online.
     */
    public void connectOther(String playerName, String server) {
    }

    /**
     * Get the (real) IP of a player.
     *
     * @param player The player you wish to get the IP of.
     * @return A {@link CompletableFuture} that, when completed, will return the (real) IP of {@code player}.
     */
    public CompletableFuture<InetSocketAddress> getIp(Player player) {
        return null;
    }

    /**
     * Send a message (as in, a chat message) to the specified player.
     *
     * @param playerName the name of the player to send the chat message.
     * @param message the message to send to the player.
     * @throws IllegalArgumentException if there is no players online.
     */
    public void sendMessage(String playerName, String message) {
    }

    /**
     * Get this server's name, as defined in BungeeCord's config.yml
     *
     * @return A {@link CompletableFuture} that, when completed, will return
     *         the {@code server's} name, as defined in BungeeCord's config.yml.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<String> getServer() {
        return null;
    }

    /**
     * Request the UUID of this player.
     *
     * @param player The player whose UUID you requested.
     * @return A {@link CompletableFuture} that, when completed, will return the UUID of {@code player}.
     */
    public CompletableFuture<String> getUUID(Player player) {
        return null;
    }

    /**
     * Request the UUID of any player connected to the BungeeCord proxy.
     *
     * @param playerName the name of the player whose UUID you would like.
     * @return A {@link CompletableFuture} that, when completed, will return the UUID of {@code playerName}.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<String> getUUID(String playerName) {
        return null;
    }

    /**
     * Request the IP of any server on this proxy.
     *
     * @param serverName the name of the server.
     * @return A {@link CompletableFuture} that, when completed, will return the requested ip.
     * @throws IllegalArgumentException if there is no players online.
     */
    public CompletableFuture<InetSocketAddress> getServerIp(String serverName) {
        return null;
    }

    /**
     * Kick any player on this proxy.
     *
     * @param playerName the name of the player.
     * @param kickMessage the reason the player is kicked with.
     * @throws IllegalArgumentException if there is no players online.
     */
    public void kickPlayer(String playerName, String kickMessage) {
    }

    /**
     * Send a custom plugin message to said server. This is one of the most useful channels ever.
     * <b>Remember, the sending and receiving server(s) need to have a player online.</b>
     *
     * @param server the name of the server to send to,
     *        ALL to send to every server (except the one sending the plugin message),
     *        or ONLINE to send to every server that's online (except the one sending the plugin message).
     *
     * @param channelName Subchannel for plugin usage.
     * @param data data to send.
     * @throws IllegalArgumentException if there is no players online.
     */
    public void forward(String server, String channelName, byte[] data) {
    }

    /**
     * Send a custom plugin message to specific player.
     *
     * @param playerName the name of the player to send to.
     * @param channelName Subchannel for plugin usage.
     * @param data data to send.
     * @throws IllegalArgumentException if there is no players online.
     */
    public void forwardToPlayer(String playerName, String channelName, byte[] data) {
    }

    @SuppressWarnings("unchecked")
    private void onPluginMessageReceived(String channel, Player player, byte[] message) {

    }

    /**
     * Unregister message channels.
     */
    public void unregister() {

    }

    private BiFunction<String, Queue<CompletableFuture<?>>, Queue<CompletableFuture<?>>> computeQueueValue(CompletableFuture<?> queueValue) {
        return (key, value) -> {
            if (value == null)
                value = new ArrayDeque<CompletableFuture<?>>();
            value.add(queueValue);
            return value;
        };
    }

    private Player getFirstPlayer() {
        /**
         * if Bukkit Version < 1.7.10 then Bukkit.getOnlinePlayers() will return
         * a Player[] otherwise it'll return a Collection<? extends Player>.
         */

        return getFirstPlayer0(Bukkit.getOnlinePlayers());
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