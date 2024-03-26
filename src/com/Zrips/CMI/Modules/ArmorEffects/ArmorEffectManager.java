package com.Zrips.CMI.Modules.ArmorEffects;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ArmorEffectManager {

    private CMI plugin;

    public static final String NBTName = "CMIArmorEffects";

    private Set<UUID> players = new HashSet<UUID>();

    public ArmorEffectManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void removePlayer(UUID uuid) {
        players.remove(uuid);
        if (players.isEmpty())
            onDisable();
    }

    public void addPlayer(UUID uuid) {
        players.add(uuid);
    }

    private CMITask saveId = null;

    public void onDisable() {
        if (saveId != null) {
            saveId.cancel();
            saveId = null;
        }
    }

    public void tasker() {

    }

    public boolean checkPlayerArmor(Player player) {

        return true;
    }

    public static PotionEffect getPotionEffect(Player player, PotionEffectType type) {
        return null;
    }
}
