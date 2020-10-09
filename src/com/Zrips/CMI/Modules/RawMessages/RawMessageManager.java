package com.Zrips.CMI.Modules.RawMessages;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class RawMessageManager {

    private static Object packet;
    private static Method getHandle;
    private static Method sendPacket;
    private static Field playerConnection;
    private static Class<?> nmsChatSerializer;
    private static Class<?> nmsIChatBaseComponent;
    private static Class<?> packetType;

    private static Class<?> ChatMessageclz;
    private static Class<?> sub;
    private static Object[] consts;

    static HashMap<Long, RawMessageCommand> map = new HashMap<Long, RawMessageCommand>();

    public static final String rmc = "rmc";
    public static final String rmccmd = "/" + CommandsHandler.getLabel() + " " + rmc + " ";

    public static Long add(RawMessageCommand rmc) {
	Random rnd = new Random();
	long id = rnd.nextLong();
	return id;
    }

    public static void delete(RawMessageCommand rmc) {
	map.remove(rmc.getId());
    }

    public static boolean perform(CommandSender sender, Long id) {
	return true;
    }

    public static void remove(Long id) {
	map.remove(id);
    }

    static {
    }

    public static void send(CommandSender receivingPacket, String msg) {
    }

    public static void send(CMIUser user, String json) {
    }

    public static void send(Player receivingPacket, String json) {
	
    }

    private static String getChatSerializerClasspath() {
	return null;
    }
}
