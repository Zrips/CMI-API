package com.Zrips.CMI.Modules.PlayTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PlayTimeManager {
    private CMITask autoTimerBukkitId;
    private CMI plugin;
    public static final Long checkIntervalMs = null;
    protected Map<UUID, CMIPlayTime> playtimeCache;
    SimpleDateFormat formatter;
    Calendar calendar;
    private Runnable autoTimer;

    public CMIPlayTime getCMIPlayTime(UUID uuid) {
        return null;
    }

    public void setCMIPlayTime(UUID uuid, CMIPlayTime playTime) {
    }

    public PlayTimeManager(CMI plugin) {
    }

    public void stop() {
    }

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

    public void updatePlayTimes() {
    }

    public String formatDate(int date) {
        return null;
    }

    public static enum PlaytimeRange {
        thishour(10, false, CMIMaterial.LIME_WOOL), hourback(19, false, CMIMaterial.GREEN_WOOL), today(11, true, CMIMaterial.LIGHT_GRAY_WOOL), yesterday(20, true, CMIMaterial.GRAY_WOOL), thisweek(13, true,
            CMIMaterial.YELLOW_WOOL), week(22, true, CMIMaterial.BROWN_WOOL), thismonth(15, true, CMIMaterial.PINK_WOOL), month(24, true, CMIMaterial.RED_WOOL), thisyear(16, false,
                CMIMaterial.LIGHT_BLUE_WOOL), year(25, false, CMIMaterial.BLUE_WOOL), total(40, false, CMIMaterial.WHITE_WOOL);

        private Integer StartTime;
        private HashMap<UUID, Long> cache = new HashMap<>();
        private HashMap<UUID, Integer> cacheLastUpdate = new HashMap<>();
        private int slot;
        private boolean detailed;
        private CMIMaterial color;

        PlaytimeRange(int slot, boolean detailed, CMIMaterial color) {
        }

        public void update() {
        }

        public Integer getStartTime() {
            return null;
        }

        public Long getCache(UUID uuid) {
            return null;
        }

        public void setCache(UUID uuid, Long cache) {
        }

        public Integer getCacheLastUpdate(UUID uuid) {
            return null;
        }

        public void setCacheLastUpdate(UUID uuid, Integer cacheLastUpdate) {
        }

        public static PlaytimeRange getByName(String name) {
            return null;
        }

        public int getSlot() {
            return 0;
        }

        public void setSlot(int slot) {
        }

        public boolean isDetailed() {
            return false;
        }

        public CMIMaterial getColor() {
            return null;
        }

        public void setColor(CMIMaterial color) {
        }
    }
}
