package com.Zrips.CMI.Modules.Warnings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class WarningManager {

    private CMI plugin;

    private LinkedHashMap<Integer, List<String>> commands = new LinkedHashMap<Integer, List<String>>();
    private HashMap<String, CMIWarningCategory> Categories = new HashMap<String, CMIWarningCategory>();

    private HashMap<UUID, List<CMIPlayerWarning>> warnings = new HashMap<UUID, List<CMIPlayerWarning>>();

    public List<CMIPlayerWarning> getWarnings(UUID uuid) {
        List<CMIPlayerWarning> w = warnings.computeIfAbsent(uuid, k -> new ArrayList<CMIPlayerWarning>());
        if (w != null)
            w.removeIf(one -> one.getGivenAt() + one.getCategory().getLifeTime() < System.currentTimeMillis());
        return w;
    }

    public void setWarnings(UUID uuid, List<CMIPlayerWarning> warnings) {
        if (warnings == null || warnings.isEmpty())
            this.warnings.remove(uuid);
        else
            this.warnings.put(uuid, warnings);
    }

    public WarningManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {

    }

    public CMIWarningCategory getDefaultCategory() {
        return Categories.get("default");
    }

    public CMIWarningCategory getCategory(String name) {
        if (name == null)
            return null;
        return Categories.get(name.toLowerCase());
    }

    public List<String> getCommandsByWarns(Player player, int from, int to) {

        return null;
    }

    public List<String> getCommandsByWarns(int warns) {
        return commands.get(warns) != null ? new ArrayList<String>(commands.get(warns)) : null;
    }

    public HashMap<String, CMIWarningCategory> getCategories() {
        return Categories;
    }
}
