package com.Zrips.CMI.Modules.Ranks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIEntityType;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Ranks.RankManager.rankupFailType;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIType;

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
    private List<String> CommandsOnRankDown;
    private LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> statRequirements;
    private LinkedHashMap<String, String> permRequirements;
    private LinkedHashMap<String, Integer> mcmmoRequirements;
    private LinkedHashMap<String, Integer> JobsRequirements;
    private LinkedHashMap<CMIItemStack, Integer> ItemRequirements;
    private double moneyCost;
    private double expCost;
    private int votes;

    public void reset() {
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
	List<CMIRank> r = new ArrayList<CMIRank>();

	for (CMIRank oneR : getNextRanks()) {
	    if (oneR.canRankup(user) != rankupFailType.None)
		continue;
	    r.add(oneR);
	}
	return r;
    }

    public boolean isOnSamePathWith(CMIRank rank2) {
	return false;
    }

    private boolean checkPrevious(CMIRank rank1, CMIRank rank2) {
	return false;
    }

    private boolean checkNext(CMIRank rank1, CMIRank rank2) {
	return false;
    }

    public List<CMIRank> getPreviousRanks() {
	return null;
    }

    public List<CMIRank> getValidPreviousRanks(CMIUser user) {
	return null;
    }

    public String getValidPreviousRanksAsString() {
	return null;
    }

    public rankupFailType canRankup(CMIUser user) {
	return null;
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

    public LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> getStatRequirements() {
	return statRequirements;
    }

    public LinkedHashMap<Object, Long> getStatRequirement(CMIStatistic stat) {
	return statRequirements.get(stat);
    }

    public CMIRank addStatRequirement(CMIStatistic stat, String name, Long amount) {

	return null;
    }

    public void setStatRequirements(LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> statRequirements) {
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
	finalizeRankup(user, true, true);
    }

    public void finalizeRankup(CMIUser user, Boolean commands, Boolean cost) {
	
    }

    @Deprecated
    public void takeExp(CMIUser user) {
	

    }

    @Deprecated
    public void takeMoney(CMIUser user) {
    }

    public void takeItems(CMIUser user) {
	CMI.getInstance().getRankManager().removeContents(user.getPlayer(), this.getItemRequirements());
    }

    public void performCommands(CMIUser user) {
    }

    public void performCommandsOnRankDown(CMIUser user) {
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

    public int getVotes() {
	return votes;
    }

    public void setVotes(int votes) {
	this.votes = votes;
    }

    public List<String> getCommandsOnRankDown() {
	return CommandsOnRankDown;
    }

    public void setCommandsOnRankDown(List<String> commandsOnRankDown) {
	CommandsOnRankDown = commandsOnRankDown;
    }
}
