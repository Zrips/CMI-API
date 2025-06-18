package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;

public class SpawnerChargeManager {
    private LinkedHashMap<String, SCharges> map;
    private Integer total;
    private HashMap<UUID, PlayerCharge> spawnerCharges;
    private boolean SpawnersSupportDisabled;
    private double SpawnersBreakBaseDropChance;
    private long SpawnersStopDroppingAfter;
    private boolean SpawnersStopDroppingEnabled;
    private boolean SpawnersStopDroppingLinear;
    private boolean SpawnersXpDrop;
    private boolean SpawnersBreakEnabled;
    private boolean SpawnersIntoInventory;
    private boolean SpawnersPlaceEnabled;
    private boolean SpawnersPlaceRequiresPermission;
    private boolean SpawnersBreakRequiresExactPermission;
    private boolean SpawnersPlaceRequiresExactPermission;
    private boolean SpawnerEggInteractRequiresPermission;
    private boolean TrialSpawnerEggInteractRequiresPermission;
    private int SpawnersBreakSilkTouchLevel;
    private boolean SpawnerDropFromTnt;
    private int SpawnerDropChanceTnt;
    private boolean SpawnerDropFromCreeper;
    private int SpawnerDropChanceCreeper;
    private boolean ChargesUse;
    private boolean ChargesBreakWithoutCharge;
    private boolean SpawnersProximityUse;
    private int SpawnersProximityRange;

    public void loadConfig() {
    }

    public PlayerCharge getPCharge(CMIUser user, boolean update) {
        return null;
    }

    private void recalculateTotalSpawnerEntities() {
    }

    public void addCharge(SCharges charge) {
    }

    public SCharges getCharge(String name) {
        return null;
    }

    public SCharges getCharge(Player player) {
        return null;
    }

    public boolean changeSpawnerType(Block block, EntityType type) {
        return false;
    }

    @Deprecated
    public void openSpawnerPickerUI(Player player) {
    }

    public void openSpawnerPickerUI(Player player, int page) {
    }

    @Deprecated
    public int getSpawnerDropChance(Player player, Block block) {
        return 0;
    }

    public double getDropChance(Player player, Block block) {
        return 0.0;
    }

    public int getSpawnersStopDroppingAfter(Player player) {
        return 0;
    }

    public boolean isSpawnersSupportDisabled() {
        return false;
    }

    public boolean isSpawnersXpDrop() {
        return false;
    }

    public boolean isSpawnersEggInteractRequiresPermission() {
        return false;
    }

    public boolean isTrialSpawnersEggInteractRequiresPermission() {
        return false;
    }

    public boolean isSpawnersPlaceRequiresExactPermission() {
        return false;
    }

    public boolean isSpawnersPlaceRequiresPermission() {
        return false;
    }

    public boolean isSpawnersPlaceEnabled() {
        return false;
    }

    public boolean isSpawnerDropFromCreeper() {
        return false;
    }

    public int getSpawnerDropChanceCreeper() {
        return 0;
    }

    public boolean isSpawnersBreakEnabled() {
        return false;
    }

    public boolean isSpawnersIntoInventory() {
        return false;
    }

    public int getSpawnerDropChanceTnt() {
        return 0;
    }

    public boolean isSpawnerDropFromTnt() {
        return false;
    }

    public boolean isChargesUse() {
        return false;
    }

    public boolean isChargesBreakWithoutCharge() {
        return false;
    }

    public boolean isSpawnersProximityUse() {
        return false;
    }

    public int getSpawnersProximityRange() {
        return 0;
    }
}
