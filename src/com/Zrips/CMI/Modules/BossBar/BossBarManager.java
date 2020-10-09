
package com.Zrips.CMI.Modules.BossBar;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.events.CMIBossBarHideEvent;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class BossBarManager {

    CMI plugin;

    public BossBarManager(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<String, BossBarInfo> globalBars = new HashMap();

    public void addGlobalBar(BossBarInfo binfo) {
    }

    public void removeGlobalBossbar(BossBarInfo bar) {
    }

    public void removeGlobalBossbar(String barName) {
    }

    public void updateGlobalBars(Player player) {

    }

    public synchronized void updateBossBars(CMIUser player) {
    }

    public synchronized void Show(final BossBarInfo barInfo) {

    }

}
