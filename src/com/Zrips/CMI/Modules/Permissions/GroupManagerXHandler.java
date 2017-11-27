package com.Zrips.CMI.Modules.Permissions;

import org.anjocaido.groupmanager.GroupManager;
import org.anjocaido.groupmanager.dataholder.worlds.WorldsHolder;
import org.anjocaido.groupmanager.permissions.AnjoPermissionsHandler;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.Zrips.CMI.CMI;

public class GroupManagerXHandler implements PermissionInterface {

    private GroupManager groupManager;

    public GroupManagerXHandler(CMI plugin) {
	Plugin pl = plugin.getServer().getPluginManager().getPlugin("GroupManagerX");
	groupManager = (GroupManager) pl;
    }

    @Override
    public String getMainGroup(Player player) {
	AnjoPermissionsHandler handler = getHandler(player);
	if (handler == null)
	    return null;	
	return handler.getPrimaryGroup(player.getName());
    }

    @Override
    public String getPrefix(Player player) {
	AnjoPermissionsHandler handler = getHandler(player);
	if (handler == null)
	    return null;	
	return handler.getUserPrefix(player.getName());
    }

    @Override
    public String getSufix(Player player) {
	AnjoPermissionsHandler handler = getHandler(player);
	if (handler == null)
	    return null;	
	return handler.getUserSuffix(player.getName());
    }

    private AnjoPermissionsHandler getHandler(Player player) {
	WorldsHolder holder = groupManager.getWorldsHolder();
	if (holder == null)
	    return null;	
	try {
	    return holder.getWorldPermissions(player);
	} catch (Exception e) {
	    return null;
	}
    }
}
