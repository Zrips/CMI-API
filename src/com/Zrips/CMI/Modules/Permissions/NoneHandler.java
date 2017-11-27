package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.entity.Player;

public class NoneHandler implements PermissionInterface {

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
}
