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
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class RankManager {

    private LinkedHashMap<String, CMIRank> ranks = new LinkedHashMap<String, CMIRank>();
    private HashMap<UUID, Long> nextCheck = new HashMap<UUID, Long>();
    private HashMap<UUID, Long> nextAutoRecalculate = new HashMap<UUID, Long>();
    private HashMap<UUID, InformTimer> nextInform = new HashMap<UUID, InformTimer>();
    private CMI plugin;
    BukkitScheduler scheduler;

    private HashMap<UUID, CMIRank> ranksCache = new HashMap<UUID, CMIRank>();

    public CMIRank getNullRank(CMIUser user) {
        return ranksCache.get(user.getUniqueId());
    }

    public CMIRank getRank(CMIUser user) {
        return ranksCache.computeIfAbsent(user.getUniqueId(), k -> CMI.getInstance().getRankManager().getDefaultRank(user.getPlayer(false)));
    }

    public CMIRank recalculateRank(CMIUser user) {

        return null;
    }

    public void setRank(CMIUser user, CMIRank rank) {
        ranksCache.put(user.getUniqueId(), rank);
    }

    public RankManager(CMI plugin) {
        this.plugin = plugin;
    }

    private boolean isNextCheck(UUID uuid) {
        Long time = nextCheck.get(uuid);
        if (time == null || time < System.currentTimeMillis()) {
            nextCheck.put(uuid, System.currentTimeMillis() + PlayerDelay);
            return true;
        }
        return false;
    }

    private boolean isNextAutoRecalculate(UUID uuid) {
        Long time = nextAutoRecalculate.get(uuid);
        if (time == null || time < System.currentTimeMillis()) {
            nextAutoRecalculate.put(uuid, System.currentTimeMillis() + Recalculation);
            return true;
        }
        return false;
    }

    private boolean isNextInform(UUID uuid) {
        InformTimer time = nextInform.get(uuid);
        if (time == null) {
            nextInform.put(uuid, new InformTimer(System.currentTimeMillis() + PlayerDelay));
            return true;
        }
        if (time.getNextCheck() < System.currentTimeMillis()) {
            time.addTimesInformed();
            time.setNextCheck((System.currentTimeMillis() + PlayerDelay) + (time.getTimesInformed() * PlayerDelay));
            return true;
        }
        return false;
    }

    public void removeFromCheck(UUID uuid) {
        nextCheck.remove(uuid);
        nextAutoRecalculate.remove(uuid);
        nextInform.remove(uuid);
    }

    CMITask sched = null;
    CMITask recSched = null;

    public void stop() {
        if (sched != null) {
            sched.cancel();
            sched = null;
        }
        if (recSched != null) {
            recSched.cancel();
            recSched = null;
        }
        percentCache.clear();
    }

    public void autoRecheck() {

    }

    private void cycle() {

    }

    public void run() {

        if (!CMIModule.ranks.isEnabled())
            return;
        if (Delay <= 0)
            return;

        if (async) {
            sched = CMIScheduler.runTimerAsync(this::cycle, 0L, Delay * 20L);
        } else {
            sched = CMIScheduler.scheduleSyncRepeatingTask(this::cycle, 0L, Delay * 20L);
        }
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
        Money, Exp, Stats, McMMO, Aurelium, Jobs, Placeholoder, Perm, None, NoRank, Items, Votes, SameRank
    }

    public enum rankupType {
        Money, Exp, Stats, McMMO, Aurelium, Jobs, Perm, Placeholoder, Items, Votes;
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

    private class donePercentage {
        private double percent = 0D;
        private int times = 0;

        public double getPercent() {
            return percent;
        }

        public void addPercent(double percent) {
            this.percent += percent;
        }

        public int getTimes() {
            return times;
        }

        public void incrementTimes() {
            this.times++;
        }

        public void addIncrement(int times) {
            this.times += times;
        }
    }

    private void calculate(Double v, donePercentage done, int times) {
        if (v == null)
            return;
        done.addPercent(v);
        done.addIncrement(times);
    }

    public Double getOverallDonePercentage(CMIUser user, CMIRank rank) {

        return null;
    }

    public Double getMoneyDonePercentage(CMIUser user, CMIRank rank) {
        if (rank.getMoneyCost() <= 0)
            return null;
        double have = user.getBalance();
        if (have > rank.getMoneyCost())
            return 100D;
        return have * 100D / rank.getMoneyCost();
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

        long time = 5000L;

        public rankCache(long time) {
            this.time = time;
        }

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
            nextPercentageCheck.put(type, System.currentTimeMillis() + time);
        }
    }

    HashMap<UUID, rankCache> percentCache = new HashMap<UUID, rankCache>();

    public Double getPermDonePercentage(CMIUser user, CMIRank rank) {

        return null;
    }

    public Double getPlaceholderDonePercentage(CMIUser user, CMIRank rank) {

        return null;
    }

    public void listPlaceholderRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

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

    private String fileName = "Ranks.yml";

    @SuppressWarnings("unchecked")
    public void load() {

    }

    private void calculateWeight(CMIRank rank, int weight) {
        weight++;
        if (weight > 1000)
            return;
        rank.setWeight(weight);
        for (CMIRank one : rank.getNextRanks()) {
            calculateWeight(one, weight);
        }
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
