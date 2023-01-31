package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;

import org.bukkit.entity.Player;

public class PowerfullPermsHandler implements PermissionInterface {

    public PowerfullPermsHandler() {

    }

    @Override
    public String getMainGroup(Player player) {
        return this.getMainGroup(player.getWorld().getName(), player.getUniqueId());
    }

    @Override
    public String getPrefix(Player player) {
        return this.getPrefix(player.getUniqueId());
    }

    @Override
    public String getSufix(Player player) {
        return this.getSufix(player.getUniqueId());
    }

    @Override
    public String getMainGroup(String world, UUID uuid) {
        return null;
    }

    @Override
    public String getPrefix(UUID uuid) {
        return null;
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
