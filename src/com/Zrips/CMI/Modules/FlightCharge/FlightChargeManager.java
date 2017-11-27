package com.Zrips.CMI.Modules.FlightCharge;

import org.bukkit.Location;
import org.bukkit.boss.BarColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;

public class FlightChargeManager {

    CMI plugin;

    public FlightChargeManager(CMI plugin) {
	this.plugin = plugin;
    }

    private boolean Enabled = false;
    private int ExpRechargeRate = 0;
    private int MoneyRechargeRate = 0;
    private int MaxChargeLevel = 0;
    private int DeductOnFallMulti = 0;
    private int DeductOnIdling = 0;
    private boolean DamageOnFall = true;
    private boolean DamageOnToggle = true;
    private boolean KillOnFall = true;

    public void load() {
	

    }

    public void process(Player player, Integer take) {
	
    }

    public void process(traveledDistance dinfo, Integer take) {
	
    }

    public static final String flightChargeBossBar = "CMIFlightChargeBossBar";

    public void updateBossBar(CMIUser user) {
	
    }

    private void updateBossBar(traveledDistance dinfo) {
	
    }

    public boolean isEnabled() {
	return Enabled;
    }

    public void setEnabled(boolean enabled) {
	Enabled = enabled;
    }

    public int getExpRechargeRate() {
	return ExpRechargeRate;
    }

    public void setExpRechargeRate(int expRechargeRate) {
	ExpRechargeRate = expRechargeRate;
    }

    public int getMoneyRechargeRate() {
	return MoneyRechargeRate;
    }

    public void setMoneyRechargeRate(int moneyRechargeRate) {
	MoneyRechargeRate = moneyRechargeRate;
    }

    public int getMaxChargeLevel() {
	return MaxChargeLevel;
    }

    public void setMaxChargeLevel(int maxChargeLevel) {
	MaxChargeLevel = maxChargeLevel;
    }

    public int getDeductOnFallMulti() {
	return DeductOnFallMulti;
    }

    public void setDeductOnFallMulti(int deductOnFallMulti) {
	DeductOnFallMulti = deductOnFallMulti;
    }

    public boolean isDamageOnFall() {
	return DamageOnFall;
    }

    public void setDamageOnFall(boolean damageOnFall) {
	DamageOnFall = damageOnFall;
    }

    public boolean isDamageOnToggle() {
	return DamageOnToggle;
    }

    public void setDamageOnToggle(boolean damageOnToggle) {
	DamageOnToggle = damageOnToggle;
    }

    public boolean isKillOnFall() {
	return KillOnFall;
    }

    public void setKillOnFall(boolean killOnFall) {
	KillOnFall = killOnFall;
    }

    public int getDeductOnIdling() {
	return DeductOnIdling;
    }

    public void setDeductOnIdling(int deductOnIdling) {
	DeductOnIdling = deductOnIdling;
    }
}
