package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.tyrannyofheaven.bukkit.zPermissions.ZPermissionsService;

public class ZPermissionsHandler implements PermissionInterface {

    private ZPermissionsService handler;

    public ZPermissionsHandler() {
	handler = Bukkit.getServicesManager().load(ZPermissionsService.class);
    }

    @Override
    public String getMainGroup(Player player) {
	return handler.getPlayerPrimaryGroup(player.getUniqueId());
    }

    @Override
    public String getPrefix(Player player) {
	return handler.getPlayerPrefix(player.getUniqueId());
    }

    @Override
    public String getSufix(Player player) {
	return handler.getPlayerSuffix(player.getUniqueId());
    }

}
