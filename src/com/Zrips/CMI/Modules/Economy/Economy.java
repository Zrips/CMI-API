package com.Zrips.CMI.Modules.Economy;

import java.util.List;

import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.milkbowl.vault.economy.EconomyResponse;

public class Economy {
    static public CMI plugin;
    private static final String ecoName = null;

    public Economy(CMI pl) {
    }

    public boolean isEnabled() {
        return false;
    }

    public static String getName() {
        return null;
    }

    private static String TrA(double amount) {
        return null;
    }

    public static String format(double amount) {
        return null;
    }

    public static String currencyNameSingular() {
        return null;
    }

    public static String currencyNamePlural() {
        return null;
    }

    public static double getBalance(String playerName) {
        return 0.0;
    }

    public static double getBalance(OfflinePlayer offlinePlayer) {
        return 0.0;
    }

    private static double getAccountBalance(CMIUser user) {
        return 0.0;
    }

    public static EconomyResponse withdrawPlayer(String playerName, double amount) {
        return null;
    }

    public static EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount) {
        return null;
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
        return false;
    }

    public static boolean has(OfflinePlayer offlinePlayer, double amount) {
        return false;
    }

    public static EconomyResponse createBank(String name, String player) {
        return null;
    }

    public static EconomyResponse createBank(String name, OfflinePlayer offlinePlayer) {
        return null;
    }

    public static EconomyResponse deleteBank(String name) {
        return null;
    }

    public static EconomyResponse bankHas(String name, double amount) {
        return null;
    }

    public static EconomyResponse bankWithdraw(String name, double amount) {
        return null;
    }

    public static EconomyResponse bankDeposit(String name, double amount) {
        return null;
    }

    public static EconomyResponse isBankOwner(String name, String playerName) {
        return null;
    }

    public static EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer) {
        return null;
    }

    public static EconomyResponse isBankMember(String name, String playerName) {
        return null;
    }

    public static EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer) {
        return null;
    }

    public static EconomyResponse bankBalance(String name) {
        return null;
    }

    public static List<String> getBanks() {
        return null;
    }

    public static boolean hasBankSupport() {
        return false;
    }

    public static boolean hasAccount(String playerName) {
        return false;
    }

    public static boolean hasAccount(OfflinePlayer offlinePlayer) {
        return false;
    }

    @Deprecated
    public static boolean createPlayerAccount(String playerName) {
        return false;
    }

    public static boolean createPlayerAccount(OfflinePlayer offlinePlayer) {
        return false;
    }

    public static int fractionalDigits() {
        return 0;
    }

    public static boolean hasAccount(String playerName, String worldName) {
        return false;
    }

    public static boolean hasAccount(OfflinePlayer offlinePlayer, String worldName) {
        return false;
    }

    public static double getBalance(String playerName, String worldName) {
        return 0.0;
    }

    public static double getBalance(OfflinePlayer offlinePlayer, String worldName) {
        return 0.0;
    }

    public static boolean has(String playerName, String worldName, double amount) {
        return false;
    }

    public static boolean has(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return false;
    }

    public static EconomyResponse withdrawPlayer(String playerName, String worldName, double amount) {
        return null;
    }

    public static EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return null;
    }

    public static EconomyResponse depositPlayer(String playerName, String worldName, double amount) {
        return null;
    }

    public static EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return null;
    }

    public static boolean createPlayerAccount(String playerName, String worldName) {
        return false;
    }

    public static boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName) {
        return false;
    }
}
