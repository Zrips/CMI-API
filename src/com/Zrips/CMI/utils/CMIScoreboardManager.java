package com.Zrips.CMI.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class CMIScoreboardManager {

    public CMIScoreboardManager() {
    }

    private final String objName = "CMIScoreboard";

    public void removeScoreBoard(Player player) {
	
    }

    private HashMap<UUID, HashMap<Integer, String>> oldLines = new HashMap<UUID, HashMap<Integer, String>>();

    public HashMap<Integer, String> checkForUpdates(Player player, HashMap<Integer, String> lines) {

	return null;
    }

    boolean update = false;
    
    public void setScoreBoard(Player player, String displayName, HashMap<Integer, String> lines) {

    }

    private static void sendPackets(Player player, List<Object> packets) {
	
    }

    private static void sendPacket(Player player, Object packet) {
	
    }

    private static Class<?> getNMSClass(String nmsClassString) throws ClassNotFoundException {
	return Class.forName("net.minecraft.server." + CMI.getInstance().getVersionCheckManager().getVersion() + "." + nmsClassString);
    }

    private static Object getConnection(Player player) throws SecurityException, NoSuchMethodException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {

	return null;
    }
}
