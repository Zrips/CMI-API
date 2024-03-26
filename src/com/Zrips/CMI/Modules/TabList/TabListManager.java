package com.Zrips.CMI.Modules.TabList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;

import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TabListManager {

    private HashMap<Integer, TabList> TabList = new HashMap<Integer, TabList>();

    private CMI plugin;

    public TabListManager(CMI plugin) {
        this.plugin = plugin;
    }

    private CMITask sched = null;
    private CMITask sortSched = null;
    private double interval = 1D;
//    private Boolean Enabled = true;
    private boolean async = true;
    private boolean UpdateTabListNames = true;
    private boolean GroupedEnabled = true;
    private boolean UpdatesOnJoin = true;
    private boolean UpdatesOnLeave = true;
    private boolean UpdatesOnWorldChange = true;
    private boolean UpdatesOnPlayerDeath = false;
    private boolean UpdatesOnAfkStateChange = false;
    private boolean UpdatesOnPlayerTeleport = false;
    private boolean UpdatesOnNickChange = false;

    private boolean addTabListHeader = true;
    private boolean addTabListFooter = true;

    private boolean sortingEnabled = false;
    private CMITabSortingType sortingType = CMITabSortingType.Name;
    private CMITabSortingOrder sortingOrder = CMITabSortingOrder.ASC;

    private List<String> SortingCustomGroup = new ArrayList<String>();
    private int SortingBalanceInterval = 10;
    private int SortingAutoUpdate = 1;

    public void stop() {
        if (sched != null) {
            sched.cancel();

            sched = null;
        }
        if (sortSched != null) {
            sortSched.cancel();
            sortSched = null;
        }
    }

    private String fileName = "TabList.yml";

    public void loadConfig() {

    }

    private void tasker() {

    }

    public TabList getTL(Player player) {

        return null;
    }

    public void updateTabList(int delay) {
        if (!CMIModule.tablist.isEnabled())
            return;
        CMIScheduler.runTaskLater(() -> plugin.getTabListManager().updateTabList(), delay);
    }

    public void updateTabList() {

    }

    public void updateTablistName(Player player) {

    }

    public void updateTabList(Player player) {

    }

    public void updateTabListSync(Player player) {

    }

    public void updateTabListAsync(final Player player) {

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

    public boolean isUpdatesOnAfkStateChange() {
        return UpdatesOnAfkStateChange;
    }

    public boolean isEnabled() {
        return CMIModule.tablist.isEnabled();
    }

    public boolean isUpdateTabListNames() {
        return UpdateTabListNames;
    }

    public boolean isSortingEnabled() {
        return sortingEnabled;
    }

    public CMITabSortingType getSortingType() {
        return sortingType;
    }

    public CMITabSortingOrder getSortingOrder() {
        return sortingOrder;
    }

}
