package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.entity.Player;
import de.bananaco.bpermissions.api.ApiLayer;
import de.bananaco.bpermissions.api.CalculableType;

public class BPermissionsHandler implements PermissionInterface {

    @Override
    public String getMainGroup(Player player) {
	String[] groups = ApiLayer.getGroups(player.getWorld().getName(), CalculableType.USER, player.getName());
	return groups[0];
    }

    @Override
    public String getPrefix(Player player) {
	return ApiLayer.getValue(player.getWorld().getName(), CalculableType.USER, player.getName(), "prefix");
    }

    @Override
    public String getSufix(Player player) {
	return ApiLayer.getValue(player.getWorld().getName(), CalculableType.USER, player.getName(), "suffix");
    }
}
