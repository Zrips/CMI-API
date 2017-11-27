package com.Zrips.CMI.Modules.Sheduler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;

public class SchedulerManager {

    HashMap<String, Schedule> map = new HashMap<String, Schedule>();

    private CMI plugin;

    private int autoTimerBukkitId = 0;

    public SchedulerManager(CMI plugin) {
	this.plugin = plugin;
    }

    public Schedule getSchedule(String name) {
	return map.get(name.toLowerCase());
    }

    public void stop() {
    }

    @SuppressWarnings("unchecked")
    public void load() {

    }

    private Runnable autoTimer = new Runnable() {
	@Override
	public void run() {
	}
    };

    private void checkSchedulers() {

    }

    public void processAliasCmdsAsPlayer(List<String> cmds, final Player player) {

    }

    public void processCmds(List<String> cmds) {
    }

    public void processCmds(List<String> cmds, final Player player) {

    }

    private enum failType {
	proceed, cancel, none;
    }

    private class permCheck {
	private String perm;
	private boolean inform = false;
	private boolean cancel = false;

	public String getPerm() {
	    return perm;
	}

	public void setPerm(String perm) {
	    this.perm = perm;
	}

	public boolean isInform() {
	    return inform;
	}

	public void setInform(boolean inform) {
	    this.inform = inform;
	}

	public boolean isCancel() {
	    return cancel;
	}

	public void setCancel(boolean cancel) {
	    this.cancel = cancel;
	}
    }

    private class amountCheck {
	private Double amount;
	private boolean inform = false;
	private boolean cancel = false;

	public boolean isInform() {
	    return inform;
	}

	public void setInform(boolean inform) {
	    this.inform = inform;
	}

	public boolean isCancel() {
	    return cancel;
	}

	public void setCancel(boolean cancel) {
	    this.cancel = cancel;
	}

	public Double getAmount() {
	    return amount;
	}

	public void setAmount(Double amount) {
	    this.amount = amount;
	}
    }

    public boolean executeCmd(String cmd, Player senderPlayer) {

	return true;
    }

    private failType canPerformCommand(Player player, permCheck permC, amountCheck moneyCheck, amountCheck expCheck) {

	return failType.none;
    }

    private List<String> processSchedCmds(List<String> cmds) {

	return null;
    }

}
