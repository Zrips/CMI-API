package com.Zrips.CMI.Modules.TimedCommands;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

import net.Zrips.CMILib.ActionBar.CMIActionBar;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Time.CMITimeManager;

public class TimedCommandManager {

    private CMI plugin;
    private int autoTimerBukkitId = -1;
    private long nextIn = -1L;
    private boolean delay = false;

    public TimedCommandManager(CMI plugin) {
	this.plugin = plugin;
    }

    public Set<CMIUser> timed = new HashSet<CMIUser>();

    public void addTimed(CMIUser user) {
    }

    public void stop() {
	if (autoTimerBukkitId == -1)
	    return;
	Bukkit.getScheduler().cancelTask(autoTimerBukkitId);
	autoTimerBukkitId = -1;
    }

    private Runnable autoTimer = new Runnable() {
	@Override
	public void run() {
	}
    };

    private void checkUsers() {
	
    }

    private void updateNextIn(Long time) {
	if (nextIn == -1L || nextIn > time)
	    nextIn = time;
    }

    public boolean checkTFly(final CMIUser user, boolean logout) {
	
	return true;
    }

    public boolean checkTGod(final CMIUser user, boolean logout) {

	return true;
    }

    private static Location getSafeLocation(Location loc) {

	return null;
    }

}
