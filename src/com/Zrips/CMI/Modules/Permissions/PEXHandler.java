package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.entity.Player;
import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PEXHandler implements PermissionInterface {

    private PermissionManager perms;

    public PEXHandler() {
	perms = PermissionsEx.getPermissionManager();
    }

    @Override
    public String getMainGroup(Player player) {
	PermissionUser user = perms.getUser(player);
	if (user == null)
	    return null;

	String[] groups = user.getGroupNames();
	if (groups == null || groups.length == 0)
	    return null;
	return groups[0];
    }

    @Override
    public String getPrefix(Player player) {
	PermissionUser user = perms.getUser(player);
	if (user == null)
	    return null;
	return user.getPrefix();
    }

    @Override
    public String getSufix(Player player) {
	PermissionUser user = perms.getUser(player);
	if (user == null)
	    return null;
	return user.getSuffix();
    }
}
