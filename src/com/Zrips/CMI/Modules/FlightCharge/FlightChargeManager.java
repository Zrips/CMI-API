package com.Zrips.CMI.Modules.FlightCharge;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class FlightChargeManager {

    CMI plugin;

    public FlightChargeManager(CMI plugin) {
        this.plugin = plugin;
    }

//    private boolean Enabled = false;
    private boolean FlightChargeEnabledByDefault = true;
    private boolean FlightChargeAutoSwitch = true;
    private boolean bossbar = true;
    private double ExpRechargeCost = 0;
    private double MoneyRechargeCost = 0D;
    private int MaxChargeLevel = 0;
    private int DeductOnFallMulti = 0;
    private double DeductOnIdling = 0;
    private double DeductOnlyForTime = 0;
    private boolean DamageOnFall = true;
    private boolean DamageOnToggle = true;
    private boolean KillOnFall = true;
    private CMIChatColor GlowColor = null;

    private double autoRechargeFrom = 0;
    private double autoRechargeAmount = 0;

    private HashMap<UUID, FlightCharge> flightCharges = new HashMap<UUID, FlightCharge>();

    public FlightCharge getFlightCharge(UUID uuid) {
        return flightCharges.computeIfAbsent(uuid, k -> new FlightCharge());
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid) {
        return getPCharge(uuid, true);
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid, boolean update) {
        return plugin.getSpawnerChargesManager().getPCharge(CMIUser.getUser(uuid), update);
    }

    public void load() {

    }

    public void process(Player player, Integer take) {

    }

    public void process(traveledDistance dinfo, Integer take) {

    }

    private void autorecharge(CMIUser user) {

    }

    public static final String flightChargeBossBar = "CMIFlightChargeBossBar";

    public void updateBossBar(CMIUser user) {

    }

    public double getExpRechargeCost() {
        return ExpRechargeCost;
    }

    public void setExpRechargeCost(double expRechargeCost) {
        ExpRechargeCost = expRechargeCost;
    }

    public double getMoneyRechargeCost() {
        return MoneyRechargeCost;
    }

    public void setMoneyRechargeCost(double moneyRechargeCost) {
        MoneyRechargeCost = moneyRechargeCost;
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

    public double getDeductOnIdling() {
        return DeductOnIdling;
    }

    public void setDeductOnIdling(int deductOnIdling) {
        DeductOnIdling = deductOnIdling;
    }

    public boolean isFlightChargeEnabledByDefault() {
        return FlightChargeEnabledByDefault;
    }

    public void setFlightChargeEnabledByDefault(boolean flightChargeEnabledByDefault) {
        FlightChargeEnabledByDefault = flightChargeEnabledByDefault;
    }

    public boolean isFlightChargeAutoSwitch() {
        return FlightChargeAutoSwitch;
    }

    public CMIChatColor getGlowColor() {
        return GlowColor;
    }

    public void setGlowColor(CMIChatColor glowColor) {
        GlowColor = glowColor;
    }

    public double getAutoRechargeFrom() {
        return autoRechargeFrom;
    }

    public double getAutoRechargeAmount() {
        return autoRechargeAmount;
    }

}
