
package com.Zrips.CMI.Modules.BossBar;

import org.bukkit.boss.BarColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class BossBarManager {

    CMI plugin;

    public BossBarManager(CMI plugin) {
	this.plugin = plugin;
    }

    public synchronized void updateBossBars(CMIUser player) {
    }

    public synchronized void Show(final BossBarInfo barInfo) {

    }

    public void showBossBar(Player player, Integer timeInTicks, Double percentage, String name, String text, BarColor color) {

    }
}
