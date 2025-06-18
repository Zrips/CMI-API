package com.Zrips.CMI.Modules.AStand;

import java.util.Set;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandSaveOptions;

public class ArmorStandSave {
    private Player player;
    private ArmorStand stand;
    private Set<armorStandSaveOptions> save;
    private String name;
    private String serialized;
    static String prefix;
    static String suffix;

    ArmorStandSave(Player player, ArmorStand stand, Set<armorStandSaveOptions> save) {
    }

    ArmorStandSave(String name, String serialized) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public ArmorStand getStand() {
        return null;
    }

    public void setStand(ArmorStand stand) {
    }

    public Set<armorStandSaveOptions> getSaveOptions() {
        return null;
    }

    private boolean valid(ItemStack item) {
        return false;
    }

    public String serialize() {
        return null;
    }

    private static String getAngle(ArmorStand armor, armorStandSaveOptions apose) {
        return null;
    }

    private static EulerAngle getAngle(armorStandSaveOptions option, String value) {
        return null;
    }

    public boolean apply(ArmorStand stand) {
        return false;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public String getSerialized() {
        return null;
    }

    public void setSerialized(String serialized) {
    }

    public ItemStack createItem() {
        return null;
    }
}
