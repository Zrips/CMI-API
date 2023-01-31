package com.Zrips.CMI.Modules.PlayTime;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager.PlaytimeRange;

public class CMIPlayTime {

    TreeMap<Integer, CMIPlayDay> map = new TreeMap<Integer, CMIPlayDay>(Collections.reverseOrder());
    private Set<CMIPlayDay> forSave = new HashSet<CMIPlayDay>();

    Long lastUpdate = null;

    private CMIUser user;

    Integer dayBack = null;

    public CMIPlayTime(CMIUser user) {
        this.user = user;
    }

    public TreeMap<Integer, CMIPlayDay> getDays() {
        return map;
    }

    public CMIPlayDay getPlayDay(Integer date) {
        CMIPlayDay playDay = map.get(date);
        if (playDay == null) {
            playDay = new CMIPlayDay(user, date);
            map.put(date, playDay);
        }
        return playDay;
    }

    public CMIPlayDay getPlayDayOfToday() {
        return null;
    }

    private void checkYestarday() {
    }

    public void addDayForSave(CMIPlayDay playDay) {
        forSave.add(playDay);
    }

    public void updatePlayTime() {
        updatePlayTime(true);
    }

    public void updatePlayTime(boolean checkForOnline) {
    }

    public Long getPlayTime(PlaytimeRange range) {

        return 0L;
    }

    public Long getTotalPlayTime() {
        Long total = 0L;
        for (Entry<Integer, CMIPlayDay> one : map.entrySet()) {
            total += one.getValue().getTotalTime();
        }
        return total;
    }

    public Set<CMIPlayDay> getForSave() {
        return forSave;
    }
}
