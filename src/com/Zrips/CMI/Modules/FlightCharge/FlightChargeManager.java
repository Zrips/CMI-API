package com.Zrips.CMI.Modules.FlightCharge;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class FlightChargeManager {
    CMI plugin;
    private boolean FlightChargeEnabledByDefault;
    private boolean FlightChargeAutoSwitch;
    private boolean bossbar;
    private double ExpRechargeCost;
    private double MoneyRechargeCost;
    private int MaxChargeLevel;
    private int DeductOnFallMulti;
    private double DeductOnIdling;
    private double DeductOnlyForTime;
    private boolean DamageOnFall;
    private boolean DamageOnToggle;
    private boolean KillOnFall;
    private CMIChatColor GlowColor;
    private double autoRechargeFrom;
    private double autoRechargeAmount;
    private ConcurrentHashMap<UUID, FlightCharge> flightCharges;
    public static final String flightChargeBossBar = null;

    public FlightChargeManager(CMI plugin) {
    }

    public FlightCharge getFlightCharge(UUID uuid) {
        return null;
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid) {
        return null;
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid, boolean update) {
        return null;
    }

    public void load() {
    }

    public void process(Player player, Integer take) {
    }

    public void process(traveledDistance dinfo, Integer take) {
    }

    public void autorecharge(CMIUser user) {
    }

    public void updateBossBar(CMIUser user) {
    }

    private void updateBossBar(traveledDistance dinfo) {
    }

    public double getExpRechargeCost() {
        return 0.0;
    }

    public void setExpRechargeCost(double expRechargeCost) {
    }

    public double getMoneyRechargeCost() {
        return 0.0;
    }

    public void setMoneyRechargeCost(double moneyRechargeCost) {
    }

    public int getMaxChargeLevel() {
        return 0;
    }

    public void setMaxChargeLevel(int maxChargeLevel) {
    }

    public int getDeductOnFallMulti() {
        return 0;
    }

    public void setDeductOnFallMulti(int deductOnFallMulti) {
    }

    public boolean isDamageOnFall() {
        return false;
    }

    public void setDamageOnFall(boolean damageOnFall) {
    }

    public boolean isDamageOnToggle() {
        return false;
    }

    public void setDamageOnToggle(boolean damageOnToggle) {
    }

    public boolean isKillOnFall() {
        return false;
    }

    public void setKillOnFall(boolean killOnFall) {
    }

    public double getDeductOnIdling() {
        return 0.0;
    }

    public void setDeductOnIdling(int deductOnIdling) {
    }

    public boolean isFlightChargeEnabledByDefault() {
        return false;
    }

    public void setFlightChargeEnabledByDefault(boolean flightChargeEnabledByDefault) {
    }

    public boolean isFlightChargeAutoSwitch() {
        return false;
    }

    public CMIChatColor getGlowColor() {
        return null;
    }

    public void setGlowColor(CMIChatColor glowColor) {
    }

    public double getAutoRechargeFrom() {
        return 0.0;
    }

    public double getAutoRechargeAmount() {
        return 0.0;
    }
}
