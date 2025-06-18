package com.Zrips.CMI.Modules.Search;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class CMIDataResultLocationBase extends CMIDataResultBase {
    CMIVectorInt3D vector;
    int amount;
    UUID uuid;

    public CMIDataResultLocationBase(CMIVectorInt3D vector, int amount) {
    }

    public UUID getUUID() {
        return null;
    }

    public int getAmount() {
        return 0;
    }

    public CMIDataResultLocationBase addAmount(int amount) {
        return null;
    }

    public CMIVectorInt3D getVector() {
        return null;
    }

    public Location getLocation(World world) {
        return null;
    }

    public String getValueOutput() {
        return null;
    }
}
