package com.Zrips.CMI.Modules.TabList;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Version;

public class TabListHeaderFooterHandler {
    private Version version = Version.v1_11_R1;
    private Method getHandle;
    private Method sendPacket;
    private Field playerConnection;
    private Class<?> nmsChatSerializer;
    private Class<?> IChatBaseComponent;
    private Class<?> packetType;
    private CMI plugin;

    public TabListHeaderFooterHandler(CMI plugin) {
    }

    public void send(Player receivingPacket, List<String> h, List<String> f) {

    }

    public void send(Player receivingPacket, String header, String footer) {

    }

    private void sendPacket(Player player, Object packet) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
	Object handle = getHandle.invoke(player);
	Object connection = playerConnection.get(handle);
	sendPacket.invoke(connection, packet);
    }

    private String getCraftPlayerClasspath() {
	return "org.bukkit.craftbukkit." + version + ".entity.CraftPlayer";
    }

    private String getPlayerConnectionClasspath() {
	return "net.minecraft.server." + version + ".PlayerConnection";
    }

    private String getNMSPlayerClasspath() {
	return "net.minecraft.server." + version + ".EntityPlayer";
    }

    private String getPacketClasspath() {
	return "net.minecraft.server." + version + ".Packet";
    }

    private String getChatSerializerClasspath() {
	if (!Version.isCurrentHigher(Version.v1_8_R2))
	    return "net.minecraft.server." + version + ".ChatSerializer";
	return "net.minecraft.server." + version + ".IChatBaseComponent$ChatSerializer";// 1_8_R2 moved to IChatBaseComponent
    }

    private String getPacketPlayOutPlayerListHeaderFooter() {
	return "net.minecraft.server." + version + ".PacketPlayOutPlayerListHeaderFooter";
    }
}
