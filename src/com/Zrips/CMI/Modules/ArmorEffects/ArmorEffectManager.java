package com.Zrips.CMI.Modules.ArmorEffects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.CMIEncoder;

import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.NBT.CMINBT;

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

    private int saveId = -1;

    public void onDisable() {
        if (saveId != -1) {
            Bukkit.getScheduler().cancelTask(saveId);
            saveId = -1;
        }
    }

    public void tasker() {
    }

    public boolean checkPlayerArmor(Player player) {

        return false;
    }
}
