package com.Zrips.CMI.Modules.Economy;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.World;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;
import com.Zrips.CMI.events.CMIUserBalanceChangeEvent;

import net.milkbowl.vault.economy.EconomyResponse;

public class CMIEconomyAcount {

    private HashMap<WorldGroup, Double> balances = null;
    private CMIUser user = null;

    public CMIEconomyAcount(CMIUser user) {
	this.user = user;
	balances = new HashMap<WorldGroup, Double>();
	for (WorldGroup one : CMI.getInstance().getEconomyManager().getWorldGroups()) {
	    balances.put(one, null);
	}
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
	return setBalance(getCurrentWorldGroup(), amount);
    }

    public Double setBalance(WorldGroup defaultGroup, double amount) {
	return null;
    }

    private static void fireEvent(final CMIUser user, final Double from, final Double to) {
	Bukkit.getScheduler().runTaskAsynchronously(CMI.getInstance(), new Runnable() {
	    @Override
	    public void run() {
		CMIUserBalanceChangeEvent e = new CMIUserBalanceChangeEvent(user, from, to);
		Bukkit.getServer().getPluginManager().callEvent(e);
		return;
	    }
	});
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

    public String getFormatedBalance(String worldName) {
	return null;
    }

    public Double deposit(double amount) {
	return deposit(getCurrentWorldGroupName(), amount);
    }

    public Double deposit(String worldName, double amount) {
	return null;
    }

    public Double withdraw(double amount) {
	return null;
    }

    public Double withdraw(String worldName, double amount) {
	return null;
    }

    public boolean has(double amount) {
	return has(getCurrentWorldGroupName(), amount);
    }

    public boolean has(String worldName, double amount) {
	return true;
    }

    public HashMap<WorldGroup, Double> getBalances() {
	return null;
    }

    public HashMap<String, Double> getWorldGroupBalancesRounded() {
	return null;
    }

    public HashMap<String, Double> getWorldGroupBalances() {
	return null;
    }
}
