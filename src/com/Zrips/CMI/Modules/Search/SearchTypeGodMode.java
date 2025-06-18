package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.entity.Player;

public class SearchTypeGodMode extends SearchTypePlayerBase {
    boolean godMode;

    public SearchTypeGodMode(boolean godMode) {
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
