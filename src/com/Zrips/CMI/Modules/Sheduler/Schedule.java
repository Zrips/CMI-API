package com.Zrips.CMI.Modules.Sheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class Schedule {

    private boolean enabled = false;
    private String name;
    private Long performOn = 0L;
    private boolean performed = false;
    private List<String> commands = new ArrayList<String>();
    private List<String> tempCommands = new ArrayList<String>();
    private List<String> minPlayerCommands = new ArrayList<String>();
    private boolean repeatable = false;
    private boolean randomize = false;
    private boolean duplicateRandomize = false;
    private boolean singleLinear = false;
    private long delay = 0L;
    private Long lastPerformedOn = 0L;
    private List<SchedTime> time = new ArrayList<SchedTime>();
    private Integer MinPlayer = null;
    private Integer MaxPlayer = null;
    private Boolean playerAmountFeedback = true;
    private double commandDelay = 0D;

    private boolean randomPlayer = false;

    public Schedule(String name) {
	this.name = name;
    }

    public void reset() {

    }

    public String getDuplicatedRandomCommand() {

	return null;

    }

    public String getRandomCommand() {

	return null;
    }

    public String getSingleLinearCommand() {

	return null;
    }

    public List<String> getCommands() {
	return commands;
    }

    public void setCommands(List<String> commands) {

    }

    public boolean isPerformed() {
	return performed;
    }

    public void setPerformed(boolean performed) {
	this.performed = performed;
    }

    public boolean isPlayerAmountOk() {
	return isPlayerMinOk() && isPlayerMaxOk();
    }

    public boolean isPlayerMinOk() {
	return this.getMinPlayer() == null || Bukkit.getOnlinePlayers().size() >= this.getMinPlayer();
    }

    public boolean isPlayerMaxOk() {
	return this.getMaxPlayer() == null || Bukkit.getOnlinePlayers().size() <= this.getMaxPlayer();
    }

    public boolean itsTimeToPerform() {

	return false;
    }

    public void recalculateNext() {

    }

    public Long getPerformOn() {

	this.recalculateNext();

	return performOn;
    }

//    public void setPerformOn(Long performOn) {
//	this.performOn = performOn;
//    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public boolean isRepeatable() {
	return repeatable;
    }

    public void setRepeatable(boolean repeatable) {
	this.repeatable = repeatable;
    }

    public long getDelay() {
	return delay;
    }

    public void setDelay(long delay) {
	this.delay = delay;
    }

    public Long getLastPerformedOn() {
	return lastPerformedOn;
    }

    public void setLastPerformedOn() {
	if (this.time.isEmpty())
	    setLastPerformedOn(System.currentTimeMillis());
	else {
	    recalculateNext();
	}
    }

    public void setLastPerformedOn(Long lastPerformedOn) {
	this.lastPerformedOn = lastPerformedOn;
	updateNextPerform();
    }

    private void updateNextPerform() {
	performOn = (lastPerformedOn == 0L ? System.currentTimeMillis() : lastPerformedOn) + (delay * 1000);
    }

    public List<SchedTime> getTime() {
	return time;
    }

    public void setTime(List<SchedTime> time) {
	this.time = time;
    }

    public Integer getMinPlayer() {
	return MinPlayer;
    }

    public void setMinPlayer(Integer minPlayer) {
	MinPlayer = minPlayer;
    }

    public Integer getMaxPlayer() {
	return MaxPlayer;
    }

    public void setMaxPlayer(Integer maxPlayer) {
	MaxPlayer = maxPlayer;
    }

    public boolean isRandomize() {
	return randomize;
    }

    public void setRandomize(boolean randomize) {
	this.randomize = randomize;
    }

    public void safePerform() {

    }

    Pattern placeholderKeepPatern = Pattern.compile("(\\{\\%)([^\\\"^\\%^ ]+)(\\%\\})(\\B)");

    public void perform() {

    }

    public List<String> updateSchedCmds(List<String> cmds, Player player) {

	return null;
    }

    public Player getRandomPlayer() {

	return null;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public Boolean isPlayerAmountFeedback() {
	return playerAmountFeedback;
    }

    public void setPlayerAmountFeedback(Boolean playerAmountFeedback) {
	this.playerAmountFeedback = playerAmountFeedback;
    }

    public Double getTotalCommandDelay() {
	return commandDelay;
    }

    public boolean isSingleLinear() {
	return singleLinear;
    }

    public void setSingleLinear(boolean singleLinear) {
	this.singleLinear = singleLinear;
    }

    public boolean isDuplicateRandomize() {
	return duplicateRandomize;
    }

    public void setDuplicateRandomize(boolean duplicateRandomize) {
	this.duplicateRandomize = duplicateRandomize;
    }

    public List<String> getMinPlayerCommands() {
	return minPlayerCommands;
    }

    public void setMinPlayerCommands(List<String> minPlayerCommands) {
	this.minPlayerCommands = minPlayerCommands;
    }
}
