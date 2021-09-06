package com.Zrips.CMI.Modules.Statistics;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Statistics.StatsManager.svt;
import net.Zrips.CMILib.Version.Version;

import net.Zrips.CMILib.Entities.CMIEntityType;
import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Logs.CMIDebug;

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
	if (stat == CMIStatistic.PLAY_ONE_TICK && user != null) {
	    return user.getTotalPlayTime(false);
	}
	if (stat == CMIStatistic.TRAVEL) {
	    return getTotalTravelDistance();
	}
	if (stat == CMIStatistic.ACOUNT_AGE && user != null) {
	    Player player = user.getPlayer();
	    if (player != null)
		return System.currentTimeMillis() - player.getFirstPlayed();
	}
	return getTotal(stat);
    }

    public Long getTotalTravelDistance() {
	Long i = 0L;
	for (CMIStatistic oneS : CMIStatistic.values()) {
	    if (oneS.getType() != svt.Distance)
		continue;
	    if (oneS.getBukkitStat() == null)
		continue;
	    i += getStat(oneS);
	}
	return i;
    }

    private long getTotal(CMIStatistic stat) {

	return 0L;
    }
}
