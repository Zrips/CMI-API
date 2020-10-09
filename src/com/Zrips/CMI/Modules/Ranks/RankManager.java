package com.Zrips.CMI.Modules.Ranks;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

public class RankManager {

    private LinkedHashMap<String, CMIRank> ranks = new LinkedHashMap<String, CMIRank>();
    private HashMap<UUID, Long> nextCheck = new HashMap<UUID, Long>();
    private HashMap<UUID, InformTimer> nextInform = new HashMap<UUID, InformTimer>();
    private CMI plugin;
    BukkitScheduler scheduler;

    public RankManager(CMI plugin) {
	this.plugin = plugin;
    }

    private boolean isNextCheck(UUID uuid) {
	return false;
    }

    private boolean isNextInform(UUID uuid) {
	return false;
    }

    public void removeFromCheck(UUID uuid) {
    }

    int sched = -1;

    public void stop() {
    }

    public void run() {

    }

    public void addRank(CMIRank rank) {

    }

    public HashMap<String, CMIRank> getRanks() {
	return ranks;
    }

    public CMIRank getRank(String name) {
	return null;
    }

    public CMIRank getDefaultRank(Player player) {
	return null;
    }

    public enum rankupFailType {
	Money, Exp, Stats, McMMO, Jobs, Perm, None, NoRank, Items, Votes, SameRank
    }

    public enum rankupType {
	Money, Exp, Stats, McMMO, Jobs, Perm, Items, Votes;
    }

    public boolean canRankUpAuto(CMIUser user) {
	return false;
    }

    public rankupFailType canRankUp(CMIUser user, CMIRank rank) {
	return null;
    }

    private static HashMap<String, CMIItemStack> getInvContentsAmounts(Player player) {
	return null;
    }

    public boolean removeContents(Player player, LinkedHashMap<CMIItemStack, Integer> map) {
	return true;
    }

    public void listStatsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public class rankCurrentRequirement {
	private Long need;
	private Long have;

	public rankCurrentRequirement(Long need, Long have) {
	    this.have = have;
	    this.need = need;
	}

	public Long getNeed() {
	    return need;
	}

	public void setNeed(Long need) {
	    this.need = need;
	}

	public Long getHave() {
	    return have;
	}

	public void setHave(Long have) {
	    this.have = have;
	}

    }

    public HashMap<CMIStatistic, LinkedHashMap<Object, rankCurrentRequirement>> getStatsRequirements(CMIUser user, CMIRank rank) {

	return null;
    }

    public Double getStatsDonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    private static String firstCap(String msg) {
	return msg.substring(0, 1).toUpperCase() + msg.substring(1);
    }

    public Double getOverallDonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    public Double getMoneyDonePercentage(CMIUser user, CMIRank rank) {
	return null;
    }

    public void listMoneyRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getExpDonePercentage(CMIUser user, CMIRank rank) {
	return null;
    }

    public void listExpRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getVoteDonePercentage(CMIUser user, CMIRank rank) {
	return null;
    }

    public void listVoteRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public void listPermRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public class rankCache {
	HashMap<rankupType, Double> percentage = new HashMap<rankupType, Double>();
	HashMap<rankupType, Long> nextPercentageCheck = new HashMap<rankupType, Long>();

	public rankCache() {

	}

	public boolean timeToCheck(rankupType type) {
	    return !nextPercentageCheck.containsKey(type) || nextPercentageCheck.get(type) < System.currentTimeMillis();
	}

	public Double getCache(rankupType type) {
	    return percentage.get(type);
	}

	public void setCache(rankupType type, Double percent) {
	}
    }

    HashMap<UUID, rankCache> percentCache = new HashMap<UUID, rankCache>();

    public Double getPermDonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    public Double getMcMMODonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    public void listMcmmoRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public Double getJobsDonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    public void listJobsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public Double getItemDonePercentage(CMIUser user, CMIRank rank) {

	return null;
    }

    public void listItemRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public String translateValue(CMIStatistic stat, Long value) {

	return null;
    }

    NumberFormat formatter = new DecimalFormat("#0.00");

    private String convertDistance(long distance) {

	return null;
    }

    @SuppressWarnings("unchecked")
    public void load() {

    }

    private int Delay = 30;
    private boolean OnlyHours = false;
    private boolean includeMinutes = false;
    private boolean async = false;
    private boolean ListSamePathOnly = false;
    private int PlayerDelay = 120;
    private boolean progressBar = true;
    private CMIPresetAnimations RanksEffect = CMIPresetAnimations.GColumn;

    public void loadConfig() {
    }

    public boolean isProgressBar() {
	return progressBar;
    }

    public boolean isListSamePathOnly() {
	return ListSamePathOnly;
    }

    public CMIPresetAnimations getRankEffect() {
	return RanksEffect;
    }
}
