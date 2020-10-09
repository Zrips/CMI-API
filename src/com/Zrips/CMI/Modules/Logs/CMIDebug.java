package com.Zrips.CMI.Modules.Logs;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;

public class CMIDebug {
    private CMILogType type;
    private Object[] message;

    private static long fixedTime = 0L;

    public static void it() {
	fixedTime = System.nanoTime();
    }

    public static double getIT() {
	return ((System.nanoTime() - fixedTime) / 1000) / 1000D;
    }

    public static void d(Object... message) {
    }

    @SuppressWarnings("unused")
    public static void c(Object... message) {
	if (!CMI.getInstance().getLogManager().enabledDebug)
	    return;
	new CMIDebug(null, message);
    }

    public CMIDebug(String msg) {
	this(null, msg);
    }

    public CMIDebug(CMILogType type, Object... message) {
    }

    public CMILogType getType() {
	return type;
    }

    public void setType(CMILogType type) {
	this.type = type;
    }

    public String getMsg() {
	return null;
    }

    public void setMsg(Object... message) {
	this.message = message;
    }
}
