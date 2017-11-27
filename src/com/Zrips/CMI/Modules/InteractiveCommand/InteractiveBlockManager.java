
package com.Zrips.CMI.Modules.InteractiveCommand;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class InteractiveBlockManager {

    CMI plugin;

    public InteractiveBlockManager(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<String, Map<ChunkRef, Set<CMIInteractiveCommand>>> map = new HashMap<String, Map<ChunkRef, Set<CMIInteractiveCommand>>>();
    HashMap<UUID, CMIInteractiveCommand> entMap = new HashMap<UUID, CMIInteractiveCommand>();
    HashMap<String, CMIInteractiveCommand> nameMap = new HashMap<String, CMIInteractiveCommand>();

    public Entity getEntityByUUID(UUID uuid) {
	return null;
    }

    public void deleteIC(CMIInteractiveCommand cmib) {
	nameMap.remove(cmib.getName());
	clearLocationsFromIC(cmib);
    }

    public void clearLocationsFromIC(CMIInteractiveCommand cmib) {
    }

    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib) {

	return null;
    }

    public Set<CMIInteractiveCommand> getFullList() {

	return null;
    }

    public CMIInteractiveCommand getByUUID(UUID uuid) {
	return null;
    }

    public CMIInteractiveCommand getByName(String name) {
	return null;
    }

    public CMIInteractiveCommand removeLoc(Location loc) {

	return null;
    }

    public CMIInteractiveCommand getByLoc(Location loc) {

	return null;
    }

    public void save() {
	
    }

    public void forceSave() {
	
    }

    public void load() {
	
    }
}
