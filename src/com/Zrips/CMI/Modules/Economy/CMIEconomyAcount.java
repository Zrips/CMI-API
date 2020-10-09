package com.Zrips.CMI.Modules.Economy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;

public class CMIEconomyAcount {

    private Map<WorldGroup, Double> balances = null;
    private CMIUser user = null;

    public CMIEconomyAcount(CMIUser user) {
    }

    public WorldGroup getCurrentWorldGroup() {
	return null;
    }

    public String getCurrentWorldGroupName() {
	return null;
    }

    public Double setBalance(double amount) {
	return null;
    }

    public Double setBalance(WorldGroup defaultGroup, double amount) {
	return setBalance(defaultGroup, amount, true);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save) {
	return setBalance(defaultGroup, amount, save, false);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save, boolean reloading) {
	return null;
    }

    private static void fireEvent(final CMIUser user, final Double from, final Double to, String type, CMIUser source) {
    }

    public Double getBalance() {
	return null;
    }

    public Double getBalance(String worldName) {

	return null;
    }

    public String getFormatedBalance() {
	return null;
    }

    public String getFormatedBalance(boolean shorts) {
	return null;
    }

    public String getFormatedBalance(String worldName) {
	return getFormatedBalance(worldName, false);
    }

    public String getFormatedBalance(String worldName, boolean shorts) {

	return null;
    }

    private static String format(double number, List<String> suffixes) {
	return null;
    }

    public Double deposit(double amount) {
	return null;
    }

    public Double deposit(String worldName, double amount) {
	return deposit(worldName, amount, null);
    }

    /**
    * Sets the value for a variable
    * @param source only used to indicate from who money is deposited but doesn't deduct from it
    */
    public Double deposit(String worldName, double amount, CMIUser source) {

	return null;
    }

    public Double withdraw(double amount) {
	// Update for multiworld support
//	return withdraw(getCurrentWorldGroupName(), amount);
	return withdraw(null, amount);
    }

    public Double withdraw(String worldName, double amount) {
	return withdraw(worldName, amount, null);
    }

    /**
    * Sets the value for a variable
    * @param target only used to indicate who gets money but doesn't actually transfer to target player
    */
    public Double withdraw(String worldName, double amount, CMIUser target) {

	return null;
    }

    public boolean has(double amount) {
	// Update for multiworld support
//	return has(getCurrentWorldGroupName(), amount);
	return has(null, amount);
    }

    public boolean has(String worldName, double amount) {
	return false;
    }

    public Map<WorldGroup, Double> getBalances() {
	return balances;
    }

    public HashMap<String, Double> getWorldGroupBalancesRounded() {

	return null;
    }

    public HashMap<String, Double> getWorldGroupBalances() {

	return null;
    }
}
