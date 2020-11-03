package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;

import org.bukkit.entity.Player;

public interface PermissionInterface {
    String getMainGroup(Player player);

    String getPrefix(Player player);

    String getSufix(Player player);
    
    String getNameColor(Player player);

    String getMainGroup(String world, UUID uuid);

    String getPrefix(UUID uuid);

    String getSufix(UUID uuid);
}
