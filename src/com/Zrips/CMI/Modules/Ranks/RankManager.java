package com.Zrips.CMI.Modules.Ranks;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitScheduler;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIType;
import com.Zrips.CMI.Modules.Statistics.StatsManager.svt;
import com.Zrips.CMI.utils.RawMessage;

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
	return null;
    }

    public CMIRank getRank(String name) {
	return null;
    }

    public CMIRank getDefaultRank(Player player) {
	return null;
    }

    public enum rankupFailType {
	Money, Exp, Stats, McMMO, Jobs, Perm, None, NoRank, Items
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

    private static String firstCap(String msg) {
	return msg.substring(0, 1).toUpperCase() + msg.substring(1);
    }

    public void listMoneyRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public void listExpRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public void listPermRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public void listMcmmoRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

    }

    public void listJobsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {

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
    private int PlayerDelay = 120;

    public void loadConfig() {

    }
}
