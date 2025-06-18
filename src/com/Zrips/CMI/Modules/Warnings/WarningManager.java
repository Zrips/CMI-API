package com.Zrips.CMI.Modules.Warnings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class WarningManager {
    private CMI plugin;
    private LinkedHashMap<Integer, List<String>> commands;
    private HashMap<String, CMIWarningCategory> Categories;
    private HashMap<UUID, List<CMIPlayerWarning>> warnings;

    @Nullable
    public List<CMIPlayerWarning> getWarnings(UUID uuid) {
        return null;
    }

    public List<CMIPlayerWarning> getOrCreateWarnings(UUID uuid) {
        return null;
    }

    public void setWarnings(UUID uuid, List<CMIPlayerWarning> warnings) {
    }

    public WarningManager(CMI plugin) {
    }

    public String serializeWarnings(List<CMIPlayerWarning> warnings) {
        return null;
    }

    public List<CMIPlayerWarning> deserializeWarnings(String warnings) {
        return null;
    }

    public void loadConfig() {
    }

    public CMIWarningCategory getDefaultCategory() {
        return null;
    }

    public CMIWarningCategory getCategory(String name) {
        return null;
    }

    public List<String> getCommandsByWarns(Player player, int from, int to) {
        return null;
    }

    public List<String> getCommandsByWarns(int warns) {
        return null;
    }

    public HashMap<String, CMIWarningCategory> getCategories() {
        return null;
    }
}
