package com.Zrips.CMI.Modules.TitleMessages;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class TitleMessageManager {
    private Method getHandle;
    private Method sendPacket;
    private Field playerConnection;
    private Class<?> nmsIChatBaseComponent;
    private CMI plugin;

    private Constructor<?> nmsPacketPlayOutTitle;
    private Constructor<?> nmsPacketPlayOutTimes;
    private Class<?> enumTitleAction;
    private Method fromString;
    private boolean simpleTitleMessages = false;

    public TitleMessageManager(CMI plugin) {
    }

    public void send(final Player receivingPacket, final Object title, final Object subtitle) {
	send(receivingPacket, title, subtitle, 0, 40, 10);
    }

    public void send(final Player receivingPacket, final Object title, final Object subtitle, final int fadeIn, final int keep, final int fadeOut) {

    }

    private void sendPacket(Player player, Object packet) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    }

    private static String getPacketPlayOutTitleClasspath() {
	return null;
    }

    private static String getEnumTitleActionClasspath() {
	return null;
    }

}
