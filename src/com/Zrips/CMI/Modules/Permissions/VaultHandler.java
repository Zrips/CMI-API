package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.milkbowl.vault.permission.Permission;

public class VaultHandler implements PermissionInterface {

    private CMI plugin;
    private Permission perms;

    public VaultHandler(CMI plugin) {
	this.plugin = plugin;
	RegisteredServiceProvider<Permission> rsp = this.plugin.getServer().getServicesManager().getRegistration(Permission.class);
	perms = rsp.getProvider();
    }

    @Override
    public String getMainGroup(Player player) {
	try {
	    return perms.getPrimaryGroup(player);
	} catch (Exception | Error e) {
	}
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
	try {
	    CMIUser u = plugin.getPlayerManager().getUser(uuid);
	    if (!u.isOnline())
		return null;
	    Player player = u.getPlayer();
	    if (player != null && world != null)
		return perms.getPrimaryGroup(world, player);
	} catch (Exception | Error e) {
	}
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
