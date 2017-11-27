package com.Zrips.CMI.Modules.Permissions;

import java.util.Optional;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.ServicesManager;

import me.lucko.luckperms.api.Contexts;
import me.lucko.luckperms.api.LuckPermsApi;
import me.lucko.luckperms.api.User;
import me.lucko.luckperms.api.caching.UserData;
import me.lucko.luckperms.api.context.MutableContextSet;

public class LuckPermsHandler 
//implements PermissionInterface 
{

    LuckPermsApi api = null;

    public LuckPermsHandler() {
	ServicesManager manager = Bukkit.getServicesManager();
	if (manager.isProvidedFor(LuckPermsApi.class)) {
	    api = manager.getRegistration(LuckPermsApi.class).getProvider();
	}
    }

//    @Override
//    public String getMainGroup(Player player) {
//	User user = api.getUser(player.getUniqueId());
//	if (user == null)
//	    return "";
//	return user.getPrimaryGroup();
//    }
//
//    @Override
//    public String getPrefix(Player player) {
//	User u = this.api.getUser(player.getUniqueId());
//	if (u == null)
//	    return null;
//	Optional<UserData> d = u.getUserDataCache();
//	if (!d.isPresent())
//	    return null;
//	UserData data = d.get();
//	String prefix = data.calculateMeta(build(player)).getPrefix();
//	return prefix;
//    }
//
//    @Override
//    public String getSufix(Player player) {
//	Optional<User> u = this.api.getUserSafe(this.api.getUuidCache().getUUID(player.getUniqueId()));
//	if (!u.isPresent())
//	    return null;
//	User user = u.get();
//	Optional<UserData> d = user.getUserDataCache();
//	if (!d.isPresent())
//	    return null;
//	UserData data = d.get();
//	String suffix = data.calculateMeta(build(player)).getSuffix();
//	return suffix;
//    }
//
//    private Contexts build(Player player) {
//	MutableContextSet contextSet = new MutableContextSet();
//	contextSet.add("server", this.api.getConfiguration().getVaultServer());
//	contextSet.add("world", player.getWorld().getName());
//	return Contexts.of(contextSet.makeImmutable(), this.api.getConfiguration().getVaultIncludeGlobal(), true, true, true, true, player.isOp());
//    }
}
