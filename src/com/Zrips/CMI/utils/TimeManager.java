package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.TimeInfo;

public class TimeManager {

    double tPHour = 1000d;
    double tPMin = 1000d / 60d;
    double tPSec = 1000d / 60d / 60d;
    private int schedID = -1;
    private CMI plugin;

    private List<String> worlds = new ArrayList<String>();

    public TimeManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum timeModifier {
	s(1), m(60), h(60 * 60), d(60 * 60 * 24), w(60 * 60 * 24 * 7), M(60 * 60 * 24 * 30), Y(60 * 60 * 24 * 365);
	private int modifier = 0;

	timeModifier(int modifier) {
	    this.modifier = modifier;
	}

	public int getModifier() {
	    return modifier;
	}

	public void setModifier(int modifier) {
	    this.modifier = modifier;
	}

	public static Long getTimeRangeFromString(String time) {
	    try {
		return Long.parseLong(time);
	    } catch (Exception e) {
	    }

	    for (timeModifier one : timeModifier.values()) {
		if (time.endsWith(one.name())) {
		    try {
			Long amount = Long.parseLong(time.substring(0, time.length() - one.name().length()));
			return (long) (amount * one.getModifier());
		    } catch (Exception e) {
			break;
		    }
		}
	    }
	    return null;
	}
    }

    public List<String> getWorlds() {
	return worlds;
    }

    public void runTimer() {
	
    }

    public String to24hour(Long ticks) {
	return null;
    }

    public String to24hourShort(Long ticks) {

	return null;
    }

    public long toSec(Long ticks) {
	return (ticks - ((ticks / (60 * 1000)) * 60 * 1000)) / 1000;
    }

    public long toMin(Long ticks) {
	return (ticks - ((ticks / (60 * 60 * 1000)) * 60 * 60 * 1000)) / (1000 * 60);
    }

    public long toHour(Long ticks) {
	return (ticks - ((ticks / (24 * 60 * 60 * 1000)) * 24 * 60 * 60 * 1000)) / (1000 * 60 * 60);
    }

    public long toSeconds(Long ticks) {
	long m = toMinutes(ticks);
	long seconds = (ticks - (m * 60 * 1000)) / 1000 / 60;
	return seconds;
    }

    public long toMinutes(Long ticks) {
	long d = toDays(ticks);
	ticks = ticks - (d * 1000 * 60 * 60 * 24);
	long h = toHours(ticks);
	long minutes = (ticks - (h * 60 * 60 * 1000)) / 1000 / 60;
	return minutes;
    }

    public long toHours(Long ticks) {
	long d = toDays(ticks);
	long hours = (ticks - (d * 1000 * 60 * 60 * 24)) / 1000 / 60 / 60;
	return hours;
    }

    public long toDays(Long ticks) {
	long days = (ticks - (toYears(ticks) * 1000 * 60 * 60 * 24 * 365)) / 1000 / 60 / 60 / 24;
	return days;
    }

    public long toYears(Long ticks) {
	long years = ticks / 1000 / 60 / 60 / 24 / 365;
	return years;
    }

    public String to12hour(Long ticks) {
	return null;
    }

    private TimeInfo convertToTicks(TimeInfo tInfo) {
	return null;
    }

    public long setTime(World world, String time) {
	TimeInfo tInfo = stringToTimeInfo(time);
	return setTime(world, tInfo);
    }

    public long setPTime(Player player, String time) {
	TimeInfo tInfo = stringToTimeInfo(time);
	return setPTime(player, tInfo);
    }

    public TimeInfo stringToTimeInfo(String time) {

	return null;
    }

    public long setTime(World world, TimeInfo tInfo) {
	if (tInfo.getHours() < 0L && tInfo.getTicks() < 0L)
	    return -1L;

	if (tInfo.getTicks() < 0L) {
	    convertToTicks(tInfo);
	    tInfo.setTicks(tInfo.getTicks() - 6000);
	}

	Long overalTicks = Long.valueOf(tInfo.getTicks());
	world.setTime(overalTicks);
	return world.getTime();
    }

    public long setPTime(Player player, TimeInfo tInfo) {
	if (tInfo.getHours() < 0L && tInfo.getTicks() < 0L)
	    return -1L;
	if (tInfo.getTicks() < 0L) {
	    convertToTicks(tInfo);
	    tInfo.setTicks(tInfo.getTicks() - 6000);
	}
	Long overalTicks = Long.valueOf(tInfo.getTicks());
	player.setPlayerTime(overalTicks, false);
	plugin.getPlayerManager().getUser(player).setpTime(overalTicks);
	if (!player.isOnline())
	    player.saveData();
	return overalTicks;
    }
}
