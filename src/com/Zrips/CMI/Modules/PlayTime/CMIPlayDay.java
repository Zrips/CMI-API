package com.Zrips.CMI.Modules.PlayTime;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager.PlaytimeRange;

public class CMIPlayDay {

    Long[] map = new Long[24];
    private Long lastUpdate = null;
    private CMIUser user;

    private int date;
    private Integer id = 0;

    public CMIPlayDay(CMIUser user, int date) {
        this.user = user;
        this.date = date;
    }

    public Long getLastUpdate() {
        return lastUpdate;
    }

    public Long getTotalTime() {
        Long total = 0L;
        for (int i = 0; i < 24; i++) {
            total += getHourPlaytime(i);
        }
        return total;
    }

    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    private final static Long maxValue = 3600000L;

    public void updatePlayTime() {

    }

    public void checkPreviousHour(int hour) {

    }

    public Long getCurrentHourPlaytime() {
        return getHourPlaytime(PlaytimeRange.thishour.getStartTime());
    }

    public Long getHourPlaytime(int hour) {
        Long current = map[hour];
        return current == null ? 0L : current;
    }

    public void setHourPlaytime(int hour, Long playTime, boolean overTime) {
        if (!overTime)
            playTime = playTime > maxValue ? maxValue : playTime;
        playTime = playTime <= 0 ? null : playTime;
        map[hour] = playTime;
    }

    public int getDate() {
        return date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
