package com.Zrips.CMI.Modules.Economy;

import com.Zrips.CMI.CMI;

import net.milkbowl.vault.economy.Economy;

public class VaultManager {

    private CMI plugin;
    private String version = "";
    private boolean supportsCmi = false;

    public VaultManager(CMI plugin) {
	this.plugin = plugin;
    }

//    private Economy vaultHandler = null;

    private Economy economy = null;

    public enum EconomySetupResponse {
	Vault, NoVault, NoVaultEconomy, CMI;
    }

    public EconomySetupResponse setupVault() {
	return null;
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

    public String getVersion() {
	return version;
    }

    public boolean isSupportsCmi() {
	return supportsCmi;
    }
}
