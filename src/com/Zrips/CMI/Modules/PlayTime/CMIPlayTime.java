package com.Zrips.CMI.Modules.PlayTime;

import java.util.Set;
import java.util.TreeMap;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager.PlaytimeRange;

public class CMIPlayTime {
    TreeMap<Integer, CMIPlayDay> map;
    private Set<CMIPlayDay> forSave;
    private CMIUser user;

    public CMIPlayTime(CMIUser user) {
    }

    public TreeMap<Integer, CMIPlayDay> getDays() {
        return null;
    }

    public CMIPlayDay getPlayDay(Integer date) {
        return null;
    }

    public CMIPlayDay getPlayDayOfToday() {
        return null;
    }

    private void checkYestarday() {
    }

    public void addDayForSave(CMIPlayDay playDay) {
    }

    public void updatePlayTime() {
    }

    public void updatePlayTime(boolean checkForOnline) {
    }

    public Long getPlayTime(PlaytimeRange range) {
        return null;
    }

    public Long getTotalPlayTime() {
        return null;
    }

    public Set<CMIPlayDay> getForSave() {
        return null;
    }
}
