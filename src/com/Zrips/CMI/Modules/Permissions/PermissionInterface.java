package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.entity.Player;

public interface PermissionInterface {
    String getMainGroup(Player player);

    String getPrefix(Player player);

    String getSufix(Player player);
}
