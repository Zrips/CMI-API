package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

public class SearchTypePlayerBase extends SearchTypeBase {
    @Nonnull
    public Set<CMIDataResultBase> checkPlayer(Player player) {
        return null;
    }
}
