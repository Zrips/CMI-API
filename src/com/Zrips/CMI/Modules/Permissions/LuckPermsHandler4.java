package com.Zrips.CMI.Modules.Permissions;

import java.util.Optional;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.ServicesManager;

import me.lucko.luckperms.api.Contexts;
import me.lucko.luckperms.api.LuckPermsApi;
import me.lucko.luckperms.api.User;
import me.lucko.luckperms.api.caching.MetaData;
import me.lucko.luckperms.api.caching.UserData;

public class LuckPermsHandler4 implements PermissionInterface {

    LuckPermsApi api = null;

    public LuckPermsHandler4() {
	ServicesManager manager = Bukkit.getServicesManager();
	if (manager.isProvidedFor(LuckPermsApi.class)) {
	    api = manager.getRegistration(LuckPermsApi.class).getProvider();
	}
    }

    @Override
    public String getMainGroup(Player player) {
	User user = api.getUser(player.getUniqueId());
	if (user == null)
	    return "";
	return user.getPrimaryGroup();
    }

    @Override
    public String getPrefix(Player player) {
	User u = this.api.getUser(player.getUniqueId());
	if (u == null)
	    return null;
	UserData data = u.getCachedData();
	Optional<Contexts> contexts = api.getContextForUser(u);
	Contexts c = contexts.get();
	if (c == null)
	    c = Contexts.global();
	MetaData meta = data.getMetaData(c);
	return meta.getPrefix();
    }

    @Override
    public String getSufix(Player player) {
	User u = this.api.getUser(player.getUniqueId());
	if (u == null)
	    return null;
	UserData data = u.getCachedData();
	Optional<Contexts> contexts = api.getContextForUser(u);
	Contexts c = contexts.get();
	if (c == null)
	    c = Contexts.global();
	MetaData meta = data.getMetaData(c);
	return meta.getSuffix();
    }

}
