package com.Zrips.CMI.Modules.AStand;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandSaveOptions;

public class ArmorStandSave {

    private Player player;
    private ArmorStand stand;
    private Set<armorStandSaveOptions> save = new HashSet<armorStandSaveOptions>();
    private String name = "ArmorStand_" + new Random().nextInt();
    private String serialized = "";

    ArmorStandSave(Player player, ArmorStand stand, Set<armorStandSaveOptions> save) {
        this.player = player;
        this.stand = stand;
        this.save = save;
    }

    ArmorStandSave(String name, String serialized) {
        this.name = name;
        this.serialized = serialized;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArmorStand getStand() {
        return stand;
    }

    public void setStand(ArmorStand stand) {
        this.stand = stand;
    }

    public Set<armorStandSaveOptions> getSaveOptions() {
        return save;
    }

    static String prefix = "{";
    static String suffix = "}";

    private boolean valid(ItemStack item) {
        if (item == null)
            return false;

        if (item.getType() == Material.AIR) {
            return false;
        }
        return true;
    }

    public String serialize() {

        return "";
    }

    private static String getAngle(ArmorStand armor, armorStandSaveOptions apose) {

        return "";
    }

    private static EulerAngle getAngle(armorStandSaveOptions option, String value) {

        return null;
    }

    public boolean apply(ArmorStand stand) {

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialized() {
        return serialized;
    }

    public void setSerialized(String serialized) {
        this.serialized = serialized;
    }

    public ItemStack createItem() {

        return null;
    }
}
