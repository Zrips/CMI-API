package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class SpawnerChargeManager {

    private LinkedHashMap<String, SCharges> map = new LinkedHashMap<String, SCharges>();
    private Integer total = 0;
    private HashMap<UUID, PlayerCharge> spawnerCharges = new HashMap<UUID, PlayerCharge>();

    private boolean SpawnersSupportDisabled = false;
    private int SpawnersBreakBaseDropChance = 100;
    private boolean SpawnersXpDrop = true;
    private boolean SpawnersBreakEnabled = false;
    private boolean SpawnersPlaceEnabled = false;
    private boolean SpawnersPlaceRequiresPermission = false;
    private boolean SpawnersBreakRequiresExactPermission = false;
    private boolean SpawnersPlaceRequiresExactPermission = false;
    private boolean SpawnersEggInteractRequiresPermission = false;
    private int SpawnersBreakSilkTouchLevel = 1;

    private boolean SpawnerDropFromTnt = false;
    private int SpawnerDropChanceTnt = 30;
    private boolean SpawnerDropFromCreeper = false;
    private int SpawnerDropChanceCreeper = 30;

    private boolean ChargesUse = false;
    private boolean ChargesBreakWithoutCharge = false;
    private boolean SpawnersProximityUse = false;
    private int SpawnersProximityRange = 0;

    public void loadConfig() {

    }

    public PlayerCharge getPCharge(CMIUser user, boolean update) {
        return spawnerCharges.computeIfAbsent(user.getUniqueId(), k -> new PlayerCharge(user, update));
    }

    private void recalculateTotalSpawnerEntities() {

    }

    public void addCharge(SCharges charge) {
        map.put(charge.getName().toLowerCase(), charge);
    }

    public SCharges getCharge(String name) {
        return map.get(name.toLowerCase());
    }

    public SCharges getCharge(Player player) {
        SCharges charge = null;
        if (player == null)
            return charge;
        for (Entry<String, SCharges> one : map.entrySet()) {
            if (CMIPerm.spawners_charge_$1.hasPermission(player, one.getKey()))
                charge = one.getValue();
        }
        return charge;
    }

    public boolean changeSpawnerType(Block block, EntityType type) {
        return true;
    }

    @Deprecated
    public void openSpawnerPickerUI(Player player) {
        openSpawnerPickerUI(player, 1);
    }

    public void openSpawnerPickerUI(Player player, int page) {

    }

    public int getSpawnerDropChance(Player player, Block block) {

        return 0;
    }

    public boolean isSpawnersSupportDisabled() {
        return SpawnersSupportDisabled;
    }

    public boolean isSpawnersXpDrop() {
        return SpawnersXpDrop;
    }

    public boolean isSpawnersEggInteractRequiresPermission() {
        return SpawnersEggInteractRequiresPermission;
    }

    public boolean isSpawnersPlaceRequiresExactPermission() {
        return SpawnersPlaceRequiresExactPermission;
    }

    public boolean isSpawnersPlaceRequiresPermission() {
        return SpawnersPlaceRequiresPermission;
    }

    public boolean isSpawnersPlaceEnabled() {
        return SpawnersPlaceEnabled;
    }

    public boolean isSpawnerDropFromCreeper() {
        return SpawnerDropFromCreeper;
    }

    public int getSpawnerDropChanceCreeper() {
        return SpawnerDropChanceCreeper;
    }

    public boolean isSpawnersBreakEnabled() {
        return SpawnersBreakEnabled;
    }

    public int getSpawnerDropChanceTnt() {
        return SpawnerDropChanceTnt;
    }

    public boolean isSpawnerDropFromTnt() {
        return SpawnerDropFromTnt;
    }

    public boolean isChargesUse() {
        return ChargesUse;
    }

    public boolean isChargesBreakWithoutCharge() {
        return ChargesBreakWithoutCharge;
    }

    public boolean isSpawnersProximityUse() {
        return SpawnersProximityUse;
    }

    public int getSpawnersProximityRange() {
        return SpawnersProximityRange;
    }

}
