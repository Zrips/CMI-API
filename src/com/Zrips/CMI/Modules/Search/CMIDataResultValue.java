package com.Zrips.CMI.Modules.Search;

import java.util.UUID;

public class CMIDataResultValue extends CMIDataResultPlayerBase {
    int amount;

    public CMIDataResultValue(CMIPlayerSearchPlaceType type, UUID uuid, int amount) {
        super(type, uuid);
    }

    public int getAmount() {
        return 0;
    }

    public CMIDataResultValue addAmount(int amount) {
        return null;
    }

    @Override
    public String getValueOutput() {
        return null;
    }
}
