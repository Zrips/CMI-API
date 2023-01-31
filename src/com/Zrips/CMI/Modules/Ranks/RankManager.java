package com.Zrips.CMI.Modules.Ranks;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

import net.Zrips.CMILib.Items.CMIItemStack;

public class RankManager {

    private LinkedHashMap<String, CMIRank> ranks = new LinkedHashMap<String, CMIRank>();
    private HashMap<UUID, Long> nextCheck = new HashMap<UUID, Long>();
    private HashMap<UUID, Long> nextAutoRecalculate = new HashMap<UUID, Long>();
    private HashMap<UUID, InformTimer> nextInform = new HashMap<UUID, InformTimer>();
    private CMI plugin;
    BukkitScheduler scheduler;

    public RankManager(CMI plugin) {
        this.plugin = plugin;
    }

    private boolean isNextCheck(UUID uuid) {
        return false;
    }

    private boolean isNextAutoRecalculate(UUID uuid) {
        return false;
    }

    private boolean isNextInform(UUID uuid) {
        return false;
    }

    public void removeFromCheck(UUID uuid) {
        nextCheck.remove(uuid);
        nextAutoRecalculate.remove(uuid);
        nextInform.remove(uuid);
    }

    int sched = -1;
    int recSched = -1;

    public void stop() {
        if (sched != -1) {
            Bukkit.getScheduler().cancelTask(sched);
            sched = -1;
        }
        if (recSched != -1) {
            Bukkit.getScheduler().cancelTask(recSched);
            recSched = -1;
        }
        percentCache.clear();
    }

    public void autoRecheck() {

    }

    public void run() {

    }

    public void addRank(CMIRank rank) {

    }

    public HashMap<String, CMIRank> getRanks() {
        return ranks;
    }

    public CMIRank getRank(String name) {
        if (name == null)
            return null;
        return ranks.get(name.toLowerCase());
    }

    public CMIRank getDefaultRank(Player player) {

        return null;
    }

    public enum rankupFailType {
        Money, Exp, Stats, McMMO, Aurelium, Jobs, Perm, None, NoRank, Items, Votes, SameRank
    }

    public enum rankupType {
        Money, Exp, Stats, McMMO, Aurelium, Jobs, Perm, Items, Votes;
    }

    public boolean canRankUpAuto(CMIUser user) {

        return true;

    }

    public rankupFailType canRankUp(CMIUser user, CMIRank rank) {

        return rankupFailType.None;
    }

    private static HashMap<String, CMIItemStack> getInvContentsAmounts(Player player) {
        HashMap<String, CMIItemStack> map = new HashMap<String, CMIItemStack>();
        return map;
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
        HashMap<CMIStatistic, LinkedHashMap<Object, rankCurrentRequirement>> haveMap = new HashMap<CMIStatistic, LinkedHashMap<Object, rankCurrentRequirement>>();

        return haveMap;
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
        if (rank.getVotes() <= 0 || !plugin.isVotifierEnabled())
            return null;
        int have = user.getVotifierVotes();
        if (have > rank.getVotes())
            return 100D;
        return (have * 100D) / ((double) rank.getVotes());
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
            percentage.put(type, percent);
            nextPercentageCheck.put(type, System.currentTimeMillis() + 5000L);
        }
    }

    HashMap<UUID, rankCache> percentCache = new HashMap<UUID, rankCache>();

    public Double getPermDonePercentage(CMIUser user, CMIRank rank) {

        return null;
    }

    public Double getAureliumDonePercentage(CMIUser user, CMIRank rank) {

        return null;
    }

    public void listAureliumRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

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

    private void calculateWeight(CMIRank rank, int weight) {

    }

    private int Delay = 30;
    private int Recalculation = 0;
    private boolean OnlyHours = false;
    private boolean includeMinutes = false;
    private boolean async = false;
    private boolean ListSamePathOnly = false;
    private int PlayerDelay = 120;
    private boolean progressBar = true;
    private boolean permissionCheck = false;
    private boolean strictPermissionCheck = false;
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

    public boolean isPermissionCheck() {
        return permissionCheck;
    }

    public boolean isStrictPermissionCheck() {
        return strictPermissionCheck;
    }
}
