package com.Zrips.CMI.Modules.TabList;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TabListManager {
    private HashMap<Integer, TabList> TabList;
    private CMI plugin;
    private CMITask sched;
    private CMITask sortSched;
    private double interval;
    private boolean async;
    private boolean UpdateTabListNames;
    private boolean GroupedEnabled;
    private boolean UpdatesOnJoin;
    private boolean UpdatesOnLeave;
    private boolean UpdatesOnWorldChange;
    private boolean UpdatesOnPlayerDeath;
    private boolean UpdatesOnAfkStateChange;
    private boolean UpdatesOnPlayerTeleport;
    private boolean UpdatesOnNickChange;
    private boolean addTabListHeader;
    private boolean addTabListFooter;
    private boolean sortingEnabled;
    private CMITabSortingType sortingType;
    private CMITabSortingOrder sortingOrder;
    private List<String> SortingCustomGroup;
    private int SortingBalanceInterval;
    private int SortingAutoUpdate;
    private String fileName;

    public TabListManager(CMI plugin) {
    }

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

    public void updateTablistName(Player player) {
    }

    public void updateTabList(Player player) {
    }

    public void updateTabListSync(Player player) {
    }

    public void updateTabListAsync(Player player) {
    }

    public boolean isUpdatesOnJoin() {
        return false;
    }

    public boolean isUpdatesOnLeave() {
        return false;
    }

    public boolean isUpdatesOnWorldChange() {
        return false;
    }

    public boolean isUpdatesOnPlayerDeath() {
        return false;
    }

    public boolean isUpdatesOnPlayerTeleport() {
        return false;
    }

    public boolean isUpdatesOnNickChange() {
        return false;
    }

    public boolean isUpdatesOnAfkStateChange() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isUpdateTabListNames() {
        return false;
    }

    public boolean isSortingEnabled() {
        return false;
    }

    public CMITabSortingType getSortingType() {
        return null;
    }

    public CMITabSortingOrder getSortingOrder() {
        return null;
    }
}
