package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;

import org.bukkit.entity.Player;

public class UltraPermissions3Handler implements PermissionInterface {

    public UltraPermissions3Handler() {

    }

    @Override
    public String getMainGroup(Player player) {
        return null;
    }

    @Override
    public String getMainGroup(String world, UUID uuid) {
        return null;
    }

    @Override
    public String getPrefix(Player player) {
        if (player == null)
            return "";
        return getPrefix(player.getUniqueId());
    }

    @Override
    public String getPrefix(UUID uuid) {
        return null;
    }

    @Override
    public String getSufix(Player player) {
        if (player == null)
            return "";
        return getSufix(player.getUniqueId());
    }

    @Override
    public String getSufix(UUID uuid) {
        return null;
    }

    @Override
    public String getNameColor(Player player) {
        return null;
    }
}
