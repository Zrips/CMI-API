package com.Zrips.CMI.Modules.Search;

import java.util.UUID;

public class CMIDataResultItem extends CMIDataResultValue {
    String identifier;

    public CMIDataResultItem(CMIPlayerSearchPlaceType type, UUID uuid, int amount) {
        super(type, uuid, amount);
    }

    public String getSubIdentifier() {
        return null;
    }

    public void setSubIdentifier(String identifier) {
    }

    @Override
    public String getValueOutput() {
        return null;
    }
}
