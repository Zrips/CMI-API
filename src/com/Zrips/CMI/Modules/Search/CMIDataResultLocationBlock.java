package com.Zrips.CMI.Modules.Search;

import net.Zrips.CMILib.Container.CMIVectorInt3D;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CMIDataResultLocationBlock extends CMIDataResultLocationBase {
    CMIMaterial type;

    public CMIDataResultLocationBlock(CMIMaterial type, CMIVectorInt3D vector, int amount) {
        super(vector, amount);
    }

    public CMIMaterial getType() {
        return null;
    }

    @Override
    public String getValueOutput() {
        return null;
    }
}
