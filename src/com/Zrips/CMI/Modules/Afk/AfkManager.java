package com.Zrips.CMI.Modules.Afk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.events.CMIAfkKickEvent;
import com.Zrips.CMI.events.CMIAfkLeaveEvent;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

public class AfkManager {

    private HashMap<CMIUser, Long> lastAction = new HashMap<CMIUser, Long>();

    private CMI plugin;

    public AfkManager(CMI plugin) {
	this.plugin = plugin;
	tasker();
    }

    private int sched = -1;
    private long awayTrigerTime = 3000;
    private List<String> awayTrigerCommands = new ArrayList<String>();
    private long kickTrigerTime = 5000;
    private long RepeatingAutoKickInterval = 5000;
    private List<String> kickTrigerCommands = new ArrayList<String>();

    private boolean AfkEnabled = true;
    private boolean PreventJumping = true;
    private boolean PreventDamage = true;
    private int interval = 1;

    private boolean disableOnPublicChat = true;
    private boolean disableOnPrivateChat = true;
    private boolean disableOnInteract = true;
    private boolean DisableOnInventoryClick = true;
    private boolean RepeatKickCommand = false;
    private boolean disableOnCommand = true;
    private boolean disableOnMove = true;
    private boolean disableItemPickup = false;

    public void stop() {
	if (sched == -1)
	    return;
	Bukkit.getScheduler().cancelTask(sched);
	sched = -1;
    }

    public void loadConfig() {

    }

    private void tasker() {
    }

    public void setUserToAfk(CMIUser user, List<String> cmds) {

    }

    public void removeUserFromAfk(CMIUser user) {
    }

    public void removeUser(CMIUser user) {

    }

    public void updateUser(CMIUser user) {
    }

    public boolean isAfkEnabled() {
	return AfkEnabled;
    }

    public boolean isDisableOnMove() {
	return disableOnMove;
    }

    public boolean isDisableOnInteract() {
	return disableOnInteract;
    }

    public boolean isDisableOnInventoryClick() {
	return DisableOnInventoryClick;
    }

    public boolean isDisableOnCommand() {
	return disableOnCommand;
    }

    public boolean isDisableItemPickup() {
	return disableItemPickup;
    }

    public boolean isDisableOnPublicChat() {
	return disableOnPublicChat;
    }

    public boolean isDisableOnPrivateChat() {
	return disableOnPrivateChat;
    }

    public List<String> getAwayTrigerCommands() {
	return awayTrigerCommands;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
	this.awayTrigerCommands = awayTrigerCommands;
    }

    public boolean isPreventDamage() {
	return PreventDamage;
    }

    public boolean isPreventJumping() {
	return PreventJumping;
    }

}
