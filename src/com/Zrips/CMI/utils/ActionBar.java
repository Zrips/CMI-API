package com.Zrips.CMI.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class ActionBar {
    private Version version = Version.v1_11_R1;
    private Object packet;
    private Method getHandle;
    private Method sendPacket;
    private Field playerConnection;
    private Class<?> nmsChatSerializer;
    private Class<?> nmsIChatBaseComponent;
    private Class<?> packetType;
    private CMI plugin;

    private Constructor<?> nmsPacketPlayOutTitle;
    private Class<?> enumTitleAction;
    private Method fromString;
    private boolean simpleTitleMessages = false;

    private Class<?> ChatMessageclz;
    private Class<?> sub;
    private Object[] consts;

    public ActionBar(CMI plugin) {
	
    }

    public void send(CommandSender receivingPacket, String msg) {
	
    }

    public void send(Player receivingPacket, String msg) {
	
    }

    public void sendTitle(Player receivingPacket, Object title, Object subtitle) {
	
    }

    private void sendPacket(Player player, Object packet) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
	
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

    private String getIChatBaseComponentClasspath() {
	return "net.minecraft.server." + version + ".IChatBaseComponent";
    }

    private String getChatSerializerClasspath() {
	if (!plugin.getVersionCheckManager().getVersion().isHigher(Version.v1_8_R2))
	    return "net.minecraft.server." + version + ".ChatSerializer";
	return "net.minecraft.server." + version + ".IChatBaseComponent$ChatSerializer";// 1_8_R2 moved to IChatBaseComponent
    }

    private String getPacketPlayOutChat() {
	return "net.minecraft.server." + version + ".PacketPlayOutChat";
    }

    private String getPacketPlayOutTitleClasspath() {
	return "net.minecraft.server." + version + ".PacketPlayOutTitle";
    }

    private String getEnumTitleActionClasspath() {
	return getPacketPlayOutTitleClasspath() + "$EnumTitleAction";
    }

    private String getClassMessageClasspath() {
	return "org.bukkit.craftbukkit." + version + ".util.CraftChatMessage";
    }

    private String getChatMessageTypeClasspath() {
	return "net.minecraft.server." + version + ".ChatMessageType";
    }
}
