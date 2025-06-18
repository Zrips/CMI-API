package com.Zrips.CMI.Modules.Jail;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;

import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIJailCell {
    private int id;
    private CMILocation teleportInLocation;
    private World world;
    private Set<UUID> jailedOnes;
    private CMIJail jail;

    public CMIJailCell(CMIJail jail) {
    }

    public Integer getId() {
        return null;
    }

    public void setId(int id) {
    }

    public void loadJailed(String root) throws Exception {
    }

    public void teleportToCell(CMIUser user) {
    }

    public CMILocation getTeleportInLocation() {
        return null;
    }

    @Deprecated
    public void setTeleportInLocation(Location safeLoc) {
    }

    public void setTeleportInLocation(CMILocation safeLoc) {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public Set<UUID> getJailed() {
        return null;
    }

    public void setJailed(HashSet<UUID> jailedOnes) {
    }

    public void addJailed(UUID uuid) {
    }

    public void removeJailed(UUID uuid) {
    }

    public CMIJail getJail() {
        return null;
    }
}
