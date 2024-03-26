package com.Zrips.CMI.Modules.PlayTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;

import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

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
            for (PlaytimeRange one : PlaytimeRange.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
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

    private CMITask autoTimerBukkitId = null;

    private CMI plugin;

    public static final Long checkIntervalMs = 1000 * 60L;

    protected Map<UUID, CMIPlayTime> playtimeCache = new HashMap<UUID, CMIPlayTime>();

    public CMIPlayTime getCMIPlayTime(UUID uuid) {
        return playtimeCache.computeIfAbsent(uuid, k -> new CMIPlayTime(CMIUser.getUser(uuid)));
    }

    public void setCMIPlayTime(UUID uuid, CMIPlayTime playTime) {
        playtimeCache.put(uuid, playTime);
    }

    public PlayTimeManager(CMI plugin) {
        this.plugin = plugin;
        if (CMIModule.cmiPlaytime.isEnabled())
            autoTimerBukkitId = CMIScheduler.scheduleSyncRepeatingTask(autoTimer, 0L, checkIntervalMs / 50L);
    }

    public void stop() {
        if (autoTimerBukkitId != null) {
            autoTimerBukkitId.cancel();
            autoTimerBukkitId = null;
        }
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
    Calendar calendar = Calendar.getInstance();

    private Integer getTodaysDate() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    private Integer getYeastardayDate() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    Integer getWeekStartDate() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
        }
        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    Integer getMonthStartDate() {
        calendar.setTimeInMillis(System.currentTimeMillis());

        while (calendar.get(Calendar.DAY_OF_MONTH) != 1) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
        }

        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    private static int currentHour() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    static Integer hourBack(int back) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, -back);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    Integer getYearStartDate() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    public Integer getDaysBackDate(int i) {
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.DAY_OF_MONTH, -i);
        return Integer.parseInt(formatter.format(calendar.getTime()));
    }

    private Runnable autoTimer = new Runnable() {
        @Override
        public void run() {
            try {
                updatePlayTimes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public void updatePlayTimes() {
        for (PlaytimeRange one : PlaytimeRange.values()) {
            one.update();
        }
        for (Player one : Bukkit.getOnlinePlayers()) {
            CMIUser user = plugin.getPlayerManager().getUser(one);
            user.updatePlayTime();
        }
    }

    public String formatDate(int date) {
        int year = date / 10000;
        int month = (date - (year * 10000)) / 100;
        int day = date % 100;
        return day + "/" + month + "/" + year;
    }

}
