package com.Zrips.CMI.Modules.Packets;

import java.lang.reflect.Field;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;

public class PacketInjector {

    private Field EntityPlayer_playerConnection;
    private Class<?> PlayerConnection;
    private Field PlayerConnection_networkManager;

    private Class<?> NetworkManager;
    private Field channel;

    public PacketInjector() {
    }

    public void addPlayer(Player p) {
    }

    public void removePlayer(Player p) {
    }

    private Object getNetworkManager(Object ep) {
	return null;
    }

    private Channel getChannel(Object networkManager) {
	return null;
    }
}