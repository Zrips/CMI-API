
package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class InteractiveCommandManager {

    CMI plugin;
    private boolean checkCitizens = false;

    public InteractiveCommandManager(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<String, Map<ChunkRef, Set<CMIInteractiveCommand>>> map = new HashMap<String, Map<ChunkRef, Set<CMIInteractiveCommand>>>();
    HashMap<UUID, CMIInteractiveCommand> entMap = new HashMap<UUID, CMIInteractiveCommand>();
    HashMap<Integer, CMIInteractiveCommand> citiznesMap = new HashMap<Integer, CMIInteractiveCommand>();
    LinkedHashMap<String, CMIInteractiveCommand> nameMap = new LinkedHashMap<String, CMIInteractiveCommand>();

    public Entity getEntityByUUID(UUID uuid) {
	return null;
    }

    public void deleteIC(CMIInteractiveCommand cmib) {
    }

    public void clearLocationsFromIC(CMIInteractiveCommand cmib) {
    }

    public void addEntity(UUID uuid, CMIInteractiveCommand cmib) {
    }

    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib) {
	return addInteractiveCommand(cmib, true);
    }

    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib, boolean save) {

	return null;
    }

    public Set<CMIInteractiveCommand> getFullList() {
	return null;
    }

    public Set<CMIInteractiveCommand> getSortedByDistance(Location loc) {

	return null;
    }

    public CMIInteractiveCommand getByUUID(UUID uuid) {
	return null;
    }

    public CMIInteractiveCommand getByCitizensId(Integer id) {
	return null;
    }

    private void checkCitizens() {
    }

    public CMIInteractiveCommand getByName(String name) {
	return null;
    }

    public CMIInteractiveCommand removeLoc(CMILocation loc) {

	return null;
    }

    public CMIInteractiveCommand removeEntity(UUID uuid) {

	return null;
    }

    public CMIInteractiveCommand getByLoc(Location loc) {

	return null;
    }

    private int saveId = -1;

    public void save() {

    }

    boolean saving = false;

    public void forceSave() {

    }

    public void load() {

    }

    public int getSaveId() {
	return saveId;
    }
}
