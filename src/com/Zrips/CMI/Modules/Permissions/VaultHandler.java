package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.milkbowl.vault.permission.Permission;

public class VaultHandler implements PermissionInterface {
    private CMI plugin;
    private Permission perms;

    public VaultHandler(CMI plugin) {
    }

    @Override
    public String getMainGroup(Player player) {
        return null;
    }

    @Override
    public String getPrefix(Player player) {
        return null;
    }

    @Override
    public String getSufix(Player player) {
        return null;
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
