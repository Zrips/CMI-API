package com.Zrips.CMI.Modules.Economy;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.Plugin;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.milkbowl.vault.economy.AbstractEconomy;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;

public class VaultHandler extends AbstractEconomy {
    public CMI cmi;
    Plugin plugin;
    private final String name = "CMIEconomy";

    public VaultHandler(CMI plugin) {

	if (cmi == null) {
	    this.cmi = plugin;
	    EconomyServerListener listener = new EconomyServerListener(this);
	    Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
	}
//	plugin.log("Vault support enabled.");
    }

    public VaultHandler(Plugin plugin) {
	this.plugin = plugin;
	Bukkit.getServer().getPluginManager().registerEvents(new EconomyServerListener(this), plugin);

	// Load Plugin in case it was loaded before
	if (cmi == null) {
	    Plugin cm = plugin.getServer().getPluginManager().getPlugin("CMI");
	    if (cm != null && cm.isEnabled()) {
		cmi = (CMI) cm;
		CMI.getInstance().consoleMessage(String.format("[%s][Economy] %s hooked.", plugin.getDescription().getName(), name));
	    }
	}
    }

    public void setCMI(CMI cmi) {
	this.cmi = cmi;
    }

    @Override
    public boolean isEnabled() {
	return this.cmi != null;
    }

    @Override
    public String getName() {
	return "CMIEconomy";
    }

    public String TrA(double amount) {
	DecimalFormat decimalFormat = CMI.getInstance().getEconomyManager().getMoneyFormat();
	return decimalFormat.format(amount);
    }

    @Override
    public String format(double amount) {
	return TrA(amount);
    }

    @Override
    public String currencyNameSingular() {
	return "";
    }

    @Override
    public String currencyNamePlural() {
	return "";
    }

    @Override
    public double getBalance(String playerName) {
	CMIUser user = cmi.getPlayerManager().getUser(playerName, false, true, false, true);
	return getAccountBalance(user);
    }

    @Override
    public double getBalance(OfflinePlayer offlinePlayer) {
	CMIUser user = cmi.getPlayerManager().getUser(offlinePlayer);
	return getAccountBalance(user);
    }

    private static double getAccountBalance(CMIUser user) {
	if (user == null)
	    return 0.0D;
	return user.getBalance().doubleValue();
    }

    @Override
    public EconomyResponse withdrawPlayer(String playerName, double amount) {
	CMIUser user = cmi.getPlayerManager().getUser(playerName, false, true, false, true);
	return withdraw(user, amount);
    }

    @Override
    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount) {
	CMIUser user = cmi.getPlayerManager().getUser(offlinePlayer);
	return withdraw(user, amount);
    }

    private static EconomyResponse withdraw(CMIUser user, double amount) {
	if (user == null) {
	    return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.FAILURE, "Account doesn't exist");
	}
	if (amount < 0.0D) {
	    return new EconomyResponse(0.0D, user.getBalance(), EconomyResponse.ResponseType.FAILURE, "Cannot withdraw negative funds");
	}
	if (user.hasMoney(amount)) {
	    Double before = user.getBalance();
	    user.withdraw(amount);
//	    fireEvent(user, before, user.getBalance(), "Withdraw");
	    return new EconomyResponse(amount, user.getBalance(), EconomyResponse.ResponseType.SUCCESS, "");
	}
	return new EconomyResponse(0.0D, user.getBalance(), EconomyResponse.ResponseType.FAILURE, "Insufficient funds");
    }

    @Override
    public EconomyResponse depositPlayer(String playerName, double amount) {
	CMIUser user = cmi.getPlayerManager().getUser(playerName, false, true, false, true);
	return deposit(user, amount);
    }

    @Override
    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double amount) {
	CMIUser user = cmi.getPlayerManager().getUser(offlinePlayer);
	return deposit(user, amount);
    }

    private static EconomyResponse deposit(CMIUser user, double amount) {
	if (user == null) {
	    return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.FAILURE, "Account doesn't exist");
	}
	if (amount < 0.0D) {
	    return new EconomyResponse(0.0D, user.getBalance(), EconomyResponse.ResponseType.FAILURE, "Cannot deposit negative funds");
	}

	Double before = user.getBalance();
	user.deposit(amount);
//	fireEvent(user, before, user.getBalance(), "Deposit");
	return new EconomyResponse(amount, user.getBalance(), EconomyResponse.ResponseType.SUCCESS, "");
    }

    @Override
    public boolean has(String playerName, double amount) {
	return getBalance(playerName) >= amount;
    }

    @Override
    public boolean has(OfflinePlayer offlinePlayer, double amount) {
	return getBalance(offlinePlayer) >= amount;
    }

    @Override
    public EconomyResponse createBank(String name, String player) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse createBank(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse deleteBank(String name) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse bankHas(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse bankWithdraw(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse bankDeposit(String name, double amount) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse isBankOwner(String name, String playerName) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse isBankMember(String name, String playerName) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public EconomyResponse bankBalance(String name) {
	return new EconomyResponse(0.0D, 0.0D, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    @Override
    public List<String> getBanks() {
	return new ArrayList<String>();
    }

    @Override
    public boolean hasBankSupport() {
	return false;
    }

    @Override
    public boolean hasAccount(String playerName) {
	return CMI.getInstance().getPlayerManager().getUser(playerName) != null;
    }

    @Override
    public boolean hasAccount(OfflinePlayer offlinePlayer) {
	return CMI.getInstance().getPlayerManager().getUser(offlinePlayer) != null;
    }

    @Override
    public boolean createPlayerAccount(String playerName) {
	if (hasAccount(playerName))
	    return true;
	return cmi.getPlayerManager().getUser(playerName, true, false, true, true) != null;
    }

    @Override
    public boolean createPlayerAccount(OfflinePlayer offlinePlayer) {
	if (hasAccount(offlinePlayer))
	    return true;
	return cmi.getPlayerManager().getUser(offlinePlayer) != null;
    }

    @Override
    public int fractionalDigits() {
	return -1;
    }

    @Override
    public boolean hasAccount(String playerName, String worldName) {
	return hasAccount(playerName);
    }

    @Override
    public boolean hasAccount(OfflinePlayer offlinePlayer, String worldName) {
	return hasAccount(offlinePlayer);
    }

    @Override
    public double getBalance(String playerName, String worldName) {
	return getBalance(playerName);
    }

    @Override
    public double getBalance(OfflinePlayer offlinePlayer, String worldName) {
	return getBalance(offlinePlayer);
    }

    @Override
    public boolean has(String playerName, String worldName, double amount) {
	return has(playerName, amount);
    }

    @Override
    public boolean has(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return has(offlinePlayer, amount);
    }

    @Override
    public EconomyResponse withdrawPlayer(String playerName, String worldName, double amount) {
	return withdrawPlayer(playerName, amount);
    }

    @Override
    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return withdrawPlayer(offlinePlayer, amount);
    }

    @Override
    public EconomyResponse depositPlayer(String playerName, String worldName, double amount) {
	return depositPlayer(playerName, amount);
    }

    @Override
    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
	return depositPlayer(offlinePlayer, amount);
    }

    @Override
    public boolean createPlayerAccount(String playerName, String worldName) {
	return createPlayerAccount(playerName);
    }

    @Override
    public boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName) {
	return createPlayerAccount(offlinePlayer);
    }

    public class EconomyServerListener implements Listener {
	VaultHandler economy = null;

	public EconomyServerListener(VaultHandler economy) {
	    this.economy = economy;
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPluginEnable(PluginEnableEvent event) {
	    if (economy.cmi == null) {
		Plugin cm = event.getPlugin();

		if (cm.getDescription().getName().equals("CMI")) {
		    CMI cmi = (CMI) cm;
		    if (cmi.getEconomyManager().isEnabled()) {
			economy.cmi = cmi;
			CMI.getInstance().consoleMessage("&2" + String.format("[%s][Economy] %s hooked.", plugin.getDescription().getName(), economy.name));
		    } else {
			plugin.getServer().getServicesManager().unregister(Economy.class, economy);
			if (CMI.getInstance().getEconomyManager().getVaultManager() != null)
			    CMI.getInstance().getEconomyManager().getVaultManager().setupVault();
		    }
		}
	    }
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPluginDisable(PluginDisableEvent event) {
	    if (economy.cmi != null) {
		if (event.getPlugin().getDescription().getName().equals("CMI")) {
		    try {
			plugin.getServer().getServicesManager().unregister(Economy.class, economy);
		    } catch (Exception e) {
		    }
		    economy.cmi = null;
		    try {
			CMI.getInstance().consoleMessage("&2" + String.format("[%s][Economy] %s unhooked.", plugin.getDescription().getName(), economy.name));
		    } catch (Exception e) {
		    }
		}
	    }
	}
    }
}
