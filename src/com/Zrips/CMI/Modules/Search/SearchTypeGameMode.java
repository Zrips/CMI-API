package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class SearchTypeGameMode extends SearchTypePlayerBase {
    GameMode mode;

    public SearchTypeGameMode(GameMode mode) {
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
