package com.Zrips.CMI.Modules.Ranks;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class RankManager {
    private LinkedHashMap<String, CMIRank> ranks;
    private HashMap<UUID, Long> nextCheck;
    private HashMap<UUID, Long> nextAutoRecalculate;
    private HashMap<UUID, InformTimer> nextInform;
    private CMI plugin;
    BukkitScheduler scheduler;
    private HashMap<UUID, CMIRank> ranksCache;
    CMITask sched;
    CMITask recSched;
    HashMap<UUID, rankCache> percentCache;
    NumberFormat formatter;
    private String fileName;
    private int Delay;
    private int Recalculation;
    private boolean OnlyHours;
    private boolean includeMinutes;
    private boolean async;
    private boolean ListSamePathOnly;
    private int PlayerDelay;
    private boolean progressBar;
    private boolean permissionCheck;
    private boolean strictPermissionCheck;
    private CMIPresetAnimations RanksEffect;

    public CMIRank getNullRank(CMIUser user) {
        return null;
    }

    public CMIRank getRank(CMIUser user) {
        return null;
    }

    public CMIRank recalculateRank(CMIUser user) {
        return null;
    }

    public void setRank(CMIUser user, CMIRank rank) {
    }

    public RankManager(CMI plugin) {
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
    }

    public void stop() {
    }

    public void autoRecheck() {
    }

    private void cycle() {
    }

    public void run() {
    }

    public void addRank(CMIRank rank) {
    }

    public HashMap<String, CMIRank> getRanks() {
        return null;
    }

    public CMIRank getRank(String name) {
        return null;
    }

    public CMIRank getDefaultRank(Player player) {
        return null;
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
        return false;
    }

    public void listStatsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public HashMap<CMIStatistic, LinkedHashMap<Object, rankCurrentRequirement>> getStatsRequirements(CMIUser user, CMIRank rank) {
        return null;
    }

    public Double getStatsDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    private static String firstCap(String msg) {
        return null;
    }

    private void calculate(Double v, donePercentage done, int times) {
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

    public Double getAuraSkillsDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listAuraSkillsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
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

    private String convertDistance(long distance) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public void load() {
    }

    private void calculateWeight(CMIRank rank, int weight) {
    }

    public void loadConfig() {
    }

    public boolean isProgressBar() {
        return false;
    }

    public boolean isListSamePathOnly() {
        return false;
    }

    public CMIPresetAnimations getRankEffect() {
        return null;
    }

    public boolean isPermissionCheck() {
        return false;
    }

    public boolean isStrictPermissionCheck() {
        return false;
    }

    public enum rankupFailType {
        Money, Exp, Stats, McMMO, Aurelium, AuraSkills, Jobs, Placeholoder, Perm, None, NoRank, Items, Votes, SameRank;
    }

    public enum rankupType {
        Money, Exp, Stats, McMMO, Aurelium, AuraSkills, Jobs, Perm, Placeholoder, Items, Votes;
    }

    public class rankCurrentRequirement {
        private Long need;
        private Long have;

        public rankCurrentRequirement(Long need, Long have) {
        }

        public Long getNeed() {
            return null;
        }

        public void setNeed(Long need) {
        }

        public Long getHave() {
            return null;
        }

        public void setHave(Long have) {
        }
    }

    private class donePercentage {
        private double percent;
        private int times;

        public double getPercent() {
            return 0.0;
        }

        public void addPercent(double percent) {
        }

        public int getTimes() {
            return 0;
        }

        public void incrementTimes() {
        }

        public void addIncrement(int times) {
        }
    }

    public class rankCache {
        HashMap<rankupType, Double> percentage;
        HashMap<rankupType, Long> nextPercentageCheck;
        long time;

        public rankCache(long time) {
        }

        public rankCache() {
        }

        public boolean timeToCheck(rankupType type) {
            return false;
        }

        public Double getCache(rankupType type) {
            return null;
        }

        public void setCache(rankupType type, Double percent) {
        }
    }
}
