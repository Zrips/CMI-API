package com.Zrips.CMI.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.LastOnline;
import com.Zrips.CMI.Containers.PageInfo;
import com.Zrips.CMI.Locale.LC;

public class FindLastOnline {

    private CMI plugin;

    public HashMap<String, LastOnline> map = new HashMap<String, LastOnline>();

    public HashMap<String, LastOnline> getMap() {
	return map;
    }

    public FindLastOnline(CMI plugin) {
	this.plugin = plugin;
    }

    public void find(final LastOnline LO) {

    }

    public void printInfo(LastOnline LO, int page) {
	
    }

    public HashMap<String, Long> sortByComparator(Map<String, Long> unsortMap) {

	return null;
    }
}
