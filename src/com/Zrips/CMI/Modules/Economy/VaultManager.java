package com.Zrips.CMI.Modules.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;

import com.Zrips.CMI.CMI;

import net.milkbowl.vault.economy.Economy;

public class VaultManager {

    private CMI plugin;

    public VaultManager(CMI plugin) {
	this.plugin = plugin;
    }

    private Economy vaultHandler = null;

    private Economy economy = null;

    public boolean setupVault() {
	return economy != null;
    }

    public Economy getVaultEconomy() {
	return economy;
    }

    public boolean isVaultEnabled() {
	return economy != null;
    }

    public String format(Double money) {
	return null;
    }

    public void setVault() {
	
    }

    public Economy getVaultHandler() {
	return vaultHandler;
    }
}
