package com.Zrips.CMI.Modules.Economy;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;

import net.milkbowl.vault.economy.Economy;

public class EconomyManager {

    private CMI plugin;

    private boolean Enabled = false;
    private boolean CustomWorldsEnabled = false;

    public final static String CMIDefaultWorld = "CMIGlobal";

    HashMap<String, WorldGroup> groups = new HashMap<String, WorldGroup>();

    private VaultManager vmanager = null;

    public EconomyManager(CMI plugin) {
    }

    TreeMap<Double, CMIUser> balTop = new TreeMap<Double, CMIUser>(Collections.reverseOrder());
    Long lastRecalculated = null;

    public void setForBalTopRecalculation() {
	lastRecalculated = null;
    }

    public String format(Double money) {
	return null;
    }

    public boolean isVaultEnabled() {
	return vmanager != null && vmanager.getVaultEconomy() != null;
    }

    public boolean setupVault() {
	return false;
    }

    public void recalculateBalTop() {
    }

    public TreeMap<Double, CMIUser> getBalTopMap() {
	return null;
    }

    public Set<WorldGroup> getWorldGroups() {
	return null;
    }

    public Set<String> getWorlds(WorldGroup worldGroup) {
	return null;
    }

    public WorldGroup getWorldGroup(String name) {
	return null;
    }

    public void loadConfig() {


    }

    public boolean isCustomWorldsEnabled() {
	return CustomWorldsEnabled;
    }

    public boolean isEnabled() {
	return Enabled;
    }

    public void setEnabled(boolean enabled) {
	Enabled = enabled;
    }

    public VaultManager getVmanager() {
	return vmanager;
    }

    public enum EconResponseType {
	SUCCESS, FAILURE, NOT_IMPLEMENTED;
    }

    public class CMIEconomyResponse {
	private double amount;
	private double balance;
	private EconResponseType type;

	public CMIEconomyResponse(double amount, double balance, EconResponseType type) {
	    this.amount = amount;
	    this.balance = balance;
	    this.type = type;
	}

	public double getAmount() {
	    return amount;
	}

	public double getBalance() {
	    return balance;
	}

	public EconResponseType getType() {
	    return type;
	}
    }

    public class WorldGroup {
	private Double StartingAmount = 0D;
	private Double MinimalAmount = 0D;
	private Double MaximumAmount = 100D;
	private String CurrencyName = "Euro";
	private String CurrencySymbol = "€";
	private String name;

	public WorldGroup(String name) {
	    this.name = name;
	}

	public Double getStartingAmount() {
	    return StartingAmount;
	}

	public WorldGroup setStartingAmount(Double startingAmount) {
	    StartingAmount = startingAmount;
	    return this;
	}

	public Double getMinimalAmount() {
	    return MinimalAmount;
	}

	public WorldGroup setMinimalAmount(Double minimalAmount) {
	    MinimalAmount = minimalAmount;
	    return this;
	}

	public Double getMaximumAmount() {
	    return MaximumAmount;
	}

	public WorldGroup setMaximumAmount(Double maximumAmount) {
	    if (maximumAmount == -1)
		MaximumAmount = Double.MAX_VALUE;
	    else
		MaximumAmount = maximumAmount;
	    return this;
	}

	public String getCurrencyName() {
	    return CurrencyName;
	}

	public WorldGroup setCurrencyName(String currencyName) {
	    CurrencyName = currencyName;
	    return this;
	}

	public String getCurrencySymbol() {
	    return CurrencySymbol;
	}

	public WorldGroup setCurrencySymbol(String currencySymbol) {
	    CurrencySymbol = currencySymbol;
	    return this;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
    }

}
