package com.Zrips.CMI.Modules.Economy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.World;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;

public class CMIEconomyAcount {

    private Map<WorldGroup, Double> balances = null;
    private CMIUser user = null;
    private int balTopPos = 0;

    public CMIEconomyAcount(CMIUser user) {
        this.user = user;
        balances = Collections.synchronizedMap(new HashMap<WorldGroup, Double>());
        for (WorldGroup one : CMI.getInstance().getEconomyManager().getWorldGroups()) {
            balances.put(one, null);
        }
    }

    public WorldGroup getCurrentWorldGroup() {
        World world = user.getWorld();
        return world == null ? CMI.getInstance().getEconomyManager().getWorldGroup(EconomyManager.CMIDefaultWorld) : CMI.getInstance().getEconomyManager().getWorldGroup(world.getName());
    }

    public String getCurrentWorldGroupName() {
        World world = user.getWorld();
        return world == null ? EconomyManager.CMIDefaultWorld : world.getName();
    }

    public Double setBalance(double amount) {
        return setBalance(CMI.getInstance().getEconomyManager().getDefaultGroup(), amount, true, false);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount) {
        return setBalance(defaultGroup, amount, true, false);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save) {
        return setBalance(defaultGroup, amount, save, false);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save, boolean reloading) {
        if (CMI.getInstance().isFullyLoaded())
            fireEvent(this.user, balances.get(defaultGroup) == null ? defaultGroup.getStartingAmount() : balances.get(defaultGroup), amount, reloading ? "setBalanceReload" : "setBalance", null);
        Double balance = balances.put(defaultGroup, amount);
        if (save)
            this.user.saveIfOffline();
        return balance;
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
//	Update for multiworld
//	return getFormatedBalance(getCurrentWorldGroupName());
        return getFormatedBalance(null);
    }

    public String getFormatedBalance(boolean shorts) {
//	Update for multiworld
//	return getFormatedBalance(getCurrentWorldGroupName());
        return getFormatedBalance(null, shorts);
    }

    public String getFormatedBalance(String worldName) {
        return getFormatedBalance(worldName, false);
    }

    public String getFormatedBalance(String worldName, boolean shorts) {

        return null;
    }

    public static String format(double number, HashMap<Double, String> hashMap, String worldName) {

        return null;
    }

    public Double deposit(double amount) {
        // Update for multiworld support
//	return deposit(getCurrentWorldGroupName(), amount);
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
        HashMap<String, Double> map = new HashMap<String, Double>();
        for (Entry<WorldGroup, Double> one : balances.entrySet()) {
            map.put(one.getKey().getName(), one.getValue());
        }
        return map;
    }

    public int updateBalTopPosition() {
        balTopPos = CMI.getInstance().getEconomyManager().getBalTopPlace(user.getUniqueId());
        return balTopPos;
    }

    public int getBalTopPosition() {
        if (balTopPos == 0)
            balTopPos = CMI.getInstance().getEconomyManager().getBalTopPlace(user.getUniqueId());
        return balTopPos;
    }

    public void setBalTopPosition(int balTopPos) {
        this.balTopPos = balTopPos;
    }
}
