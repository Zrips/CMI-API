package com.Zrips.CMI.Modules.ArmorEffects;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ArmorEffectManager {
    private CMI plugin;
    public static final String NBTName = null;
    private Set<UUID> players;
    private CMITask saveId;

    public ArmorEffectManager(CMI plugin) {
    }

    public void removePlayer(UUID uuid) {
    }

    public void addPlayer(UUID uuid) {
    }

    public void onDisable() {
    }

    public void tasker() {
    }

    public boolean checkPlayerArmor(Player player) {
        return false;
    }

    public static PotionEffect getPotionEffect(Player player, PotionEffectType type) {
        return null;
    }
}
