package com.Zrips.CMI.Modules.Statistics;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

public class CMIStats {

    public static long getStat(CMIUser user, CMIStatistic stat) {
        return getStat(user, stat, null);
    }

    public static long getStat(CMIUser user, CMIStatistic stat, Object thing) {

        return 0L;

    }

    private static long getStats(CMIUser user, CMIStatistic stat) {
        if (stat == CMIStatistic.PLAY_ONE_TICK && user != null) {
            return user.getTotalPlayTime(false);
        }
        if (stat == CMIStatistic.TRAVEL) {
            return getTotalTravelDistance(user);
        }
        if (stat == CMIStatistic.ACOUNT_AGE && user != null) {
            Player player = user.getPlayer();
            if (player != null)
                return System.currentTimeMillis() - player.getFirstPlayed();
        }
        return getTotal(user, stat);
    }

    public static long getTotalTravelDistance(CMIUser user) {
        Long i = 0L;
        return i;
    }

    private static long getTotal(CMIUser user, CMIStatistic stat) {

        return 0;
    }
}
