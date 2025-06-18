package com.Zrips.CMI.Modules.Search;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMIPlayerDataSearch extends CMIDataSearch {
    protected static CMIPlayerDataSearch activeSearch;
    private List<OfflinePlayer> players;
    private ConcurrentHashMap<UUID, ConcurrentHashMap<CMIPlayerSearchPlaceType, CMIDataResultPlayerBase>> foundIn;

    public static CMIPlayerDataSearch getActiveSearch() {
        return null;
    }

    protected static void setActiveSearch(CMIPlayerDataSearch newSearch) {
    }

    public CMIPlayerDataSearch(CommandSender sender) {
        super(sender);
    }

    private List<OfflinePlayer> getPlayers() {
        return null;
    }

    private void add(Set<CMIDataResultBase> results) {
    }

    private static String getPotentialName(UUID uuid) {
        return null;
    }

    public ConcurrentMap<UUID, ConcurrentHashMap<CMIPlayerSearchPlaceType, CMIDataResultPlayerBase>> getSearchResults() {
        return null;
    }

    @Override
    public void search() {
    }

    @Override
    protected void initSearch() {
    }

    private void checkOfflinePlayers() {
    }

    private void checkPlayer(Player one) {
    }
}
