package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import com.Zrips.CMI.CMI;

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
	return perms.getPrimaryGroup(player);
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
