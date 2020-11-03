package com.Zrips.CMI.Modules.PlayTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;

public class PlayTimeManager {

    public static enum PlaytimeRange {
	thishour(10, false, CMIMaterial.LIME_WOOL),
	hourback(19, false, CMIMaterial.GREEN_WOOL),
	today(11, true, CMIMaterial.LIGHT_GRAY_WOOL),
	yesterday(20, true, CMIMaterial.GRAY_WOOL),
	thisweek(13, true, CMIMaterial.YELLOW_WOOL),
	week(22, true, CMIMaterial.BROWN_WOOL),
	thismonth(15, true, CMIMaterial.PINK_WOOL),
	month(24, true, CMIMaterial.RED_WOOL),
	thisyear(16, false, CMIMaterial.LIGHT_BLUE_WOOL),
	year(25, false, CMIMaterial.BLUE_WOOL),
	total(40, false, CMIMaterial.WHITE_WOOL);

	private Integer StartTime;

	private HashMap<UUID, Long> cache = new HashMap<UUID, Long>();
	private HashMap<UUID, Integer> cacheLastUpdate = new HashMap<UUID, Integer>();

	private int slot;

	private boolean detailed;

	private CMIMaterial color;

	PlaytimeRange(int slot, boolean detailed, CMIMaterial color) {
	    this.slot = slot;
	    this.detailed = detailed;
	    this.color = color;
	}

	public void update() {
	}

	public Integer getStartTime() {
	    if (StartTime == null)
		update();
	    return StartTime;
	}

	public Long getCache(UUID uuid) {
	    return cache.get(uuid);
	}

	public void setCache(UUID uuid, Long cache) {
	    this.cache.put(uuid, cache);
	}

	public Integer getCacheLastUpdate(UUID uuid) {
	    return cacheLastUpdate.get(uuid);
	}

	public void setCacheLastUpdate(UUID uuid, Integer cacheLastUpdate) {
	    this.cacheLastUpdate.put(uuid, cacheLastUpdate);
	}

	public static PlaytimeRange getByName(String name) {
	    return null;
	}

	public int getSlot() {
	    return slot;
	}

	public void setSlot(int slot) {
	    this.slot = slot;
	}

	public boolean isDetailed() {
	    return detailed;
	}

	public CMIMaterial getColor() {
	    return color;
	}

	public void setColor(CMIMaterial color) {
	    this.color = color;
	}
    }

    private int autoTimerBukkitId = 0;

    private CMI plugin;

    public static final Long checkIntervalMs = 1000 * 60L;

    public PlayTimeManager(CMI plugin) {
	this.plugin = plugin;
	if (CMIModule.cmiPlaytime.isEnabled())
	    autoTimerBukkitId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, autoTimer, 0L, checkIntervalMs / 50L);
    }

    public void stop() {
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
    Calendar calendar = Calendar.getInstance();

    private Integer getTodaysDate() {
	return null;
    }

    private Integer getYeastardayDate() {
	return null;
    }

    Integer getWeekStartDate() {
	return null;
    }

    Integer getMonthStartDate() {
	return null;
    }

    private static int currentHour() {
	return 0;
    }

    static Integer hourBack(int back) {
	return null;
    }

    Integer getYearStartDate() {
	return null;
    }

    public Integer getDaysBackDate(int i) {
	return null;
    }

    private Runnable autoTimer = new Runnable() {
	@Override
	public void run() {

	}
    };

    public void updatePlayTimes() {
    }

    public String formatDate(int date) {
	return null;
    }
}
