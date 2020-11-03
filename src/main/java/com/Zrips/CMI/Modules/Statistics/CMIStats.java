package com.Zrips.CMI.Modules.Statistics;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

public class CMIStats {

    private CMIUser user;

    public CMIStats(CMIUser user) {
	this.user = user;
    }

    public CMIUser getUser() {
	return user;
    }

    public void setUser(CMIUser user) {
	this.user = user;
    }

    public Long getStat(CMIStatistic stat) {
	return getStat(stat, null);
    }

    public Long getStat(CMIStatistic stat, Object thing) {
	
	return null;
    }

    private Long getStats(CMIStatistic stat) {
	return null;
    }

    public Long getTotalTravelDistance() {
	return null;
    }

    private long getTotal(CMIStatistic stat) {
	long total = 0;
	return total;
    }
}
