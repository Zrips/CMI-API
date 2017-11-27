package com.Zrips.CMI.Modules.Statistics;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

public class CMIStats {

    private CMIUser user;

    private HashMap<CMIStatistic, HashMap<String, Long>> map = new HashMap<CMIStatistic, HashMap<String, Long>>();

    public CMIStats(CMIUser user) {
	this.user = user;
    }

    public CMIUser getUser() {
	return user;
    }

    public void setUser(CMIUser user) {
	this.user = user;
    }

    public void fillStats() {
	CMI.getInstance().getStatsManager().fillStats(this);
    }

    public HashMap<CMIStatistic, HashMap<String, Long>> getMap() {
	return map;
    }

    public Long getStat(CMIStatistic stat, EntityType entity) {
	return null;
    }

    public Long getStat(CMIStatistic stat, Material mat) {
	return null;
    }

    public Long getStat(CMIStatistic stat, String name) {
	return null;
    }

    public Long getStat(CMIStatistic stat) {
	return null;
    }

    public Long getTotalTravelDistance() {
	return null;
    }

    public void setStats(HashMap<CMIStatistic, HashMap<String, Long>> map) {
	this.map = map;
    }

    public void addStat(CMIStatistic stat, HashMap<String, Long> map) {
	this.map.put(stat, map);
    }
}
