package com.Zrips.CMI.Modules.Permissions;

import java.util.UUID;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class GroupManagerXHandler implements PermissionInterface {

    public GroupManagerXHandler(CMI plugin) {
    }

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

    @Override
    public String getMainGroup(String world, UUID uuid) {
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
