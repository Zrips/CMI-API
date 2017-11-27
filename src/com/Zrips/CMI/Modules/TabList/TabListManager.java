package com.Zrips.CMI.Modules.TabList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Permissions.PermissionInfo;

public class TabListManager {

    private HashMap<Integer, TabList> TabList = new HashMap<Integer, TabList>();

    private CMI plugin;

    public TabListManager(CMI plugin) {
	this.plugin = plugin;
    }

    private int sched = -1;
    private double interval = 1D;
    private boolean Enabled = true;
    private boolean GroupedEnabled = true;
    private boolean UpdatesOnJoin = true;
    private boolean UpdatesOnLeave = true;
    private boolean UpdatesOnWorldChange = true;
    private boolean UpdatesOnPlayerDeath = false;
    private boolean UpdatesOnPlayerTeleport = false;
    private boolean UpdatesOnNickChange = false;

    public void stop() {
    }

    public void loadConfig() {

    }

    private void tasker() {
    }

    public TabList getTL(Player player) {
	return null;
    }

    public void updateTabList(int delay) {
    }

    public void updateTabList() {
    }

    public void updateTabList(Player player) {

    }

    public boolean isUpdatesOnJoin() {
	return UpdatesOnJoin;
    }

    public boolean isUpdatesOnLeave() {
	return UpdatesOnLeave;
    }

    public boolean isUpdatesOnWorldChange() {
	return UpdatesOnWorldChange;
    }

    public boolean isUpdatesOnPlayerDeath() {
	return UpdatesOnPlayerDeath;
    }

    public boolean isUpdatesOnPlayerTeleport() {
	return UpdatesOnPlayerTeleport;
    }

    public boolean isUpdatesOnNickChange() {
	return UpdatesOnNickChange;
    }

}
