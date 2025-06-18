package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.entity.Player;

public class SearchTypeFlyMode extends SearchTypePlayerBase {
    boolean allowFlight;

    public SearchTypeFlyMode(boolean allowFlight) {
    }

    @Override
    public Set<CMIDataResultBase> checkPlayer(Player player) {
        return null;
    }

    @Override
    public String getSearchTypeName() {
        return null;
    }
}
