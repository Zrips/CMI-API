package com.Zrips.CMI.Modules.Economy;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.milkbowl.vault.economy.EconomyResponse;

public class Economy {

    static public CMI plugin;
//    private final String name = "CMI Economy";
    private static final String ecoName = "CMIEconomy";

    public Economy(CMI pl) {
	plugin = pl;
    }

    public boolean isEnabled() {
	return plugin != null;
    }

    public static String getName() {
	return ecoName;
    }

    private static String TrA(double amount) {

        return null;
    }

    public static String format(double amount) {
	return TrA(amount);
    }

    public static String currencyNameSingular() {
	return "";
    }

    public static String currencyNamePlural() {
	return "";
    }

    public static double getBalance(String playerName) {
	if (plugin == null)
	    return 0D;
	if (plugin.getEconomyManager().isTownyAccount(playerName)) {
	    CMIUser user = plugin.getPlayerManager().getUser(playerName, false, true, true, true);
	    return getAccountBalance(user);
	}
	CMIUser user = plugin.getPlayerManager().getUser(playerName, false, true, false, true);
	return getAccountBalance(user);
    }

    public static double getBalance(OfflinePlayer offlinePlayer) {
	if (plugin == null)
	    return 0D;
	CMIUser user = plugin.getPlayerManager().getUser(offlinePlayer);
	return getAccountBalance(user);
    }

    private static double getAccountBalance(CMIUser user) {
	if (user == null)
	    return 0.0D;
	return user.getBalance().doubleValue();
    }

    public static EconomyResponse withdrawPlayer(String playerName, double amount) {
        return null;
    }

    public static EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount) {
	if (plugin == null)
	    return new EconomyResponse(0.0D, 0D, EconomyResponse.ResponseType.FAILURE, "Plugin is not loaded");
	CMIUser user = plugin.getPlayerManager().getUser(offlinePlayer);
	return withdraw(user, amount);
    }

    private static EconomyResponse withdraw(CMIUser user, double amount) {
        return null;
    }

    public static EconomyResponse depositPlayer(String playerName, double amount) {
        return null;
    }

    public static EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double amount) {
        return null;
    }

    private static EconomyResponse deposit(CMIUser user, double amount) {
        return null;
    }

    public static boolean has(String playerName, double amount) {
	return getBalance(playerName) >= amount;
    }

    public static boolean has(OfflinePlayer offlinePlayer, double amount) {
	return getBalance(offlinePlayer) >= amount;
    }

    public static EconomyResponse createBank(String name, String player) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse createBank(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse deleteBank(String name) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse bankHas(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse bankWithdraw(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse bankDeposit(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse isBankOwner(String name, String playerName) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse isBankMember(String name, String playerName) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static EconomyResponse bankBalance(String name) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public static List<String> getBanks() {
	return new ArrayList<String>();
    }

    public static boolean hasBankSupport() {
	return false;
    }

    public static boolean hasAccount(String playerName) {
	return plugin.getPlayerManager().getUser(playerName) != null;
    }

    public static boolean hasAccount(OfflinePlayer offlinePlayer) {
	return plugin.getPlayerManager().getUser(offlinePlayer) != null;
    }

    @Deprecated
    public static boolean createPlayerAccount(String playerName) {
	if (plugin == null)
	    return false;

	if (hasAccount(playerName)) {
	    return true;
	}

	CMIUser u = CMI.getInstance().getPlayerManager().getUser(playerName, true, false, true, true);

	return u != null;
    }

    public static boolean createPlayerAccount(OfflinePlayer offlinePlayer) {
	if (plugin == null)
	    return false;
	return plugin.getPlayerManager().getUser(offlinePlayer) != null;
    }

    public static int fractionalDigits() {
	return -1;
    }

    public static boolean hasAccount(String playerName, String worldName) {
	return hasAccount(playerName);
    }

    public static boolean hasAccount(OfflinePlayer offlinePlayer, String worldName) {
	return hasAccount(offlinePlayer);
    }

    public static double getBalance(String playerName, String worldName) {
	return getBalance(playerName);
    }

    public static double getBalance(OfflinePlayer offlinePlayer, String worldName) {
	return getBalance(offlinePlayer);
    }

    public static boolean has(String playerName, String worldName, double amount) {
	return has(playerName, amount);
    }

    public static boolean has(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return has(offlinePlayer, amount);
    }

    public static EconomyResponse withdrawPlayer(String playerName, String worldName, double amount) {
	return withdrawPlayer(playerName, amount);
    }

    public static EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return withdrawPlayer(offlinePlayer, amount);
    }

    public static EconomyResponse depositPlayer(String playerName, String worldName, double amount) {
	return depositPlayer(playerName, amount);
    }

    public static EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return depositPlayer(offlinePlayer, amount);
    }

    public static boolean createPlayerAccount(String playerName, String worldName) {
	return createPlayerAccount(playerName);
    }

    public static boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName) {
	return createPlayerAccount(offlinePlayer);
    }
}
