package com.Zrips.CMI.Modules.Sheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;

public class Schedule {

    private String name;
    private Long performOn = 0L;
    private boolean performed = false;
    private List<String> commands = new ArrayList<String>();
    private boolean repeatable = false;
    private boolean randomize = false;
    private long delay = 0L;
    private Long lastPerformedOn = 0L;
    private List<SchedTime> time = new ArrayList<SchedTime>();
    private Integer MinPlayer = null;
    private Integer MaxPlayer = null;

    public Schedule(String name) {
	this.name = name;
    }

    public void reset() {
	performOn = 0L;
	performed = false;
	commands = new ArrayList<String>();
	repeatable = false;
	delay = 0L;
    }

    public String getRandomCommand() {	
	List<String> t = new ArrayList<String>(commands);	
	Collections.shuffle(t, new Random(System.currentTimeMillis()));	
	return t.get(0);
    }
    
    public List<String> getCommands() {
	return commands;
    }

    public void setCommands(List<String> commands) {
	this.commands = commands;
    }

    public boolean isPerformed() {
	return performed;
    }

    public void setPerformed(boolean performed) {
	this.performed = performed;
    }

    public boolean isPlayerAmountOk() {
	return true;
    }

    public boolean itsTimeToPerform() {
	
	return false;
    }

    public Long getPerformOn() {
	return performOn;
    }

    public void setPerformOn(Long performOn) {
	this.performOn = performOn;
    }

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
	updateNextPerform();
    }

    public void setLastPerformedOn(Long lastPerformedOn) {
	this.lastPerformedOn = lastPerformedOn;
	updateNextPerform();
    }

    private void updateNextPerform() {
	performOn = lastPerformedOn + (delay * 1000);
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

}
