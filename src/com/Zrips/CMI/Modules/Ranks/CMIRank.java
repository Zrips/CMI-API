package com.Zrips.CMI.Modules.Ranks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.Ranks.RankManager.rankupFailType;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

public class CMIRank {

    private String name;
    private String displayName;
    private boolean enabled;
    private boolean defaultRank;
    private boolean AutoRankup;
    private boolean rankUpConfirmation;
    private List<CMIRank> nextRanks;
    private List<String> nextRanksT;
    private List<String> Commands;
    private LinkedHashMap<CMIStatistic, LinkedHashMap<String, Long>> statRequirements;
    private LinkedHashMap<String, String> permRequirements;
    private LinkedHashMap<String, Integer> mcmmoRequirements;
    private LinkedHashMap<String, Integer> JobsRequirements;
    private LinkedHashMap<CMIItemStack, Integer> ItemRequirements;
    private double moneyCost;
    private double expCost;

    public void reset() {
	enabled = false;
	defaultRank = false;
	AutoRankup = false;
	rankUpConfirmation = false;
	nextRanks = new ArrayList<CMIRank>();
	nextRanksT = new ArrayList<String>();
	Commands = new ArrayList<String>();
	statRequirements = new LinkedHashMap<CMIStatistic, LinkedHashMap<String, Long>>();
	permRequirements = new LinkedHashMap<String, String>();
	mcmmoRequirements = new LinkedHashMap<String, Integer>();
	JobsRequirements = new LinkedHashMap<String, Integer>();
	ItemRequirements = new LinkedHashMap<CMIItemStack, Integer>();
	moneyCost = 0D;
	expCost = 0D;
    }

    public CMIRank(String name) {
	this.name = name;
	reset();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public boolean isDefaultRank() {
	return defaultRank;
    }

    public void setDefaultRank(boolean defaultRank) {
	this.defaultRank = defaultRank;
    }

    public boolean isRankUpConfirmation() {
	return rankUpConfirmation;
    }

    public void setRankUpConfirmation(boolean rankUpConfirmation) {
	this.rankUpConfirmation = rankUpConfirmation;
    }

    public List<CMIRank> getNextRanks() {
	return nextRanks;
    }

    public List<CMIRank> getNextValidRankUps(CMIUser user) {
	return null;
    }

    public rankupFailType canRankup(CMIUser user) {
	return CMI.getInstance().getRankManager().canRankUp(user, this);
    }

    public double getMoneyCost() {
	return moneyCost;
    }

    public void setMoneyCost(double moneyCost) {
	this.moneyCost = moneyCost;
    }

    public double getExpCost() {
	return expCost;
    }

    public void setExpCost(double expCost) {
	this.expCost = expCost;
    }

    public List<String> getCommands() {
	return Commands;
    }

    public void setCommands(List<String> commands) {
	Commands = commands;
    }

    public LinkedHashMap<CMIStatistic, LinkedHashMap<String, Long>> getStatRequirements() {
	return statRequirements;
    }

    public LinkedHashMap<String, Long> getStatRequirement(CMIStatistic stat) {
	return statRequirements.get(stat);
    }

    public CMIRank addStatRequirement(CMIStatistic stat, String name, Long amount) {
	return null;
    }

    public void setStatRequirements(LinkedHashMap<CMIStatistic, LinkedHashMap<String, Long>> statRequirements) {
	this.statRequirements = statRequirements;
    }

    public boolean isAutoRankup() {
	return AutoRankup;
    }

    public void setAutoRankup(boolean autoRankup) {
	AutoRankup = autoRankup;
    }

    public void setNextRanksT(List<String> nextRanksT) {
	this.nextRanksT = nextRanksT;
    }

    public void calculateNextRanks() {
    }

    public void finalizeRankup(CMIUser user) {
    }

    private void takeExp(CMIUser user) {

    }

    private void takeMoney(CMIUser user) {
    }

    private void performCommands(CMIUser user) {
    }

    public String getDisplayName() {
	return null;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public LinkedHashMap<String, String> getPermRequirements() {
	return permRequirements;
    }

    public void setPermRequirements(LinkedHashMap<String, String> permRequirements) {
	this.permRequirements = permRequirements;
    }

    public LinkedHashMap<String, Integer> getMcmmoRequirements() {
	return mcmmoRequirements;
    }

    public void setMcmmoRequirements(LinkedHashMap<String, Integer> mcmmoRequirements) {
	this.mcmmoRequirements = mcmmoRequirements;
    }

    public LinkedHashMap<String, Integer> getJobsRequirements() {
	return JobsRequirements;
    }

    public void setJobsRequirements(LinkedHashMap<String, Integer> jobsRequirements) {
	JobsRequirements = jobsRequirements;
    }

    public LinkedHashMap<CMIItemStack, Integer> getItemRequirements() {
	return ItemRequirements;
    }

    public void setItemRequirements(LinkedHashMap<CMIItemStack, Integer> itemRequirements) {
	ItemRequirements = itemRequirements;
    }
}
