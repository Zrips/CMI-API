package com.Zrips.CMI.Modules.Economy;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.World;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;

public class CMIEconomyAcount {

    private Map<WorldGroup, Double> balances = null;
    private CMIUser user = null;

    public CMIEconomyAcount(CMIUser user) {
	this.user = user;
    }

    public WorldGroup getCurrentWorldGroup() {
	World world = user.getWorld();
	WorldGroup group = world == null ? CMI.getInstance().getEconomyManager().getWorldGroup(EconomyManager.CMIDefaultWorld) : CMI.getInstance().getEconomyManager().getWorldGroup(world.getName());
	return group;
    }

    public String getCurrentWorldGroupName() {
	World world = user.getWorld();
	String name = world == null ? EconomyManager.CMIDefaultWorld : world.getName();
	return name;
    }

    public Double setBalance(double amount) {
	WorldGroup defaultGroup = CMI.getInstance().getEconomyManager().getDefaultGroup();
	return setBalance(defaultGroup, amount);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount) {
	return setBalance(defaultGroup, amount, true);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save) {
	return setBalance(defaultGroup, amount, save, false);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save, boolean reloading) {
	Double balance = balances.put(defaultGroup, amount);
	return balance;
    }

    private static void fireEvent(final CMIUser user, final Double from, final Double to, String type, CMIUser source) {

    }

    public Double getBalance() {
	return getBalance(null);
    }

    public Double getBalance(String worldName) {
	return 0D;
    }

    public String getFormatedBalance() {
	return getFormatedBalance(null);
    }

    public String getFormatedBalance(boolean shorts) {
	return getFormatedBalance(null, shorts);
    }

    public String getFormatedBalance(String worldName) {
	return getFormatedBalance(worldName, false);
    }

    public String getFormatedBalance(String worldName, boolean shorts) {

	return "";
    }

    public static String format(double number, HashMap<Long, String> hashMap, String worldName) {

	return "";
    }

    public Double deposit(double amount) {
	return deposit(null, amount);
    }

    public Double deposit(String worldName, double amount) {
	return deposit(worldName, amount, null);
    }

    /**
    * Sets the value for a variable
    * @param source only used to indicate from who money is deposited but doesn't deduct from it
    */
    public Double deposit(String worldName, double amount, CMIUser source) {

	return 0D;
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

	return 0D;
    }

    public boolean has(double amount) {
	return has(null, amount);
    }

    public boolean has(String worldName, double amount) {
	return false;
    }

    public Map<WorldGroup, Double> getBalances() {
	return balances;
    }

    public HashMap<String, Double> getWorldGroupBalancesRounded() {
	HashMap<String, Double> map = new HashMap<String, Double>();
	return map;
    }

    public HashMap<String, Double> getWorldGroupBalances() {
	HashMap<String, Double> map = new HashMap<String, Double>();
	return map;
    }
}
