package com.Zrips.CMI.Modules.Search;

import java.util.UUID;

import org.bukkit.entity.Entity;

import net.Zrips.CMILib.Container.CMIVectorInt3D;
import net.Zrips.CMILib.Entities.CMIEntityType;

public class CMIDataResultLocationEntity extends CMIDataResultLocationBase {
    CMIEntityType type;

    public CMIDataResultLocationEntity(Entity ent, CMIVectorInt3D vector, int amount) {
        super(vector, amount);
    }

    public CMIDataResultLocationEntity(CMIEntityType type, CMIVectorInt3D vector, int amount) {
        super(vector, amount);
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    public CMIEntityType getType() {
        return null;
    }

    @Override
    public String getValueOutput() {
        return null;
    }
}
