package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.entity.Player;

public class SearchTypeMaxHealth extends SearchTypePlayerBase {
    double health;

    public SearchTypeMaxHealth(int health) {
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
