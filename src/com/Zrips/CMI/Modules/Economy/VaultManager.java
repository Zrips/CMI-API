package com.Zrips.CMI.Modules.Economy;

import com.Zrips.CMI.CMI;

import net.milkbowl.vault.economy.Economy;

public class VaultManager {
    private CMI plugin;
    private String version;
    private boolean supportsCmi;
    private Economy economy;

    public VaultManager(CMI plugin) {
    }

    public EconomySetupResponse setupVault() {
        return null;
    }

    public Economy getVaultEconomy() {
        return null;
    }

    public boolean isVaultEnabled() {
        return false;
    }

    public String format(Double money) {
        return null;
    }

    public String getVersion() {
        return null;
    }

    public boolean isSupportsCmi() {
        return false;
    }

    public enum EconomySetupResponse {
        Vault, NoVault, NoVaultEconomy, CMI;
    }
}
