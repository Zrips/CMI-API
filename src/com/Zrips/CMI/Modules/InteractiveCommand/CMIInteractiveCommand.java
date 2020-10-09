package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMILocation;

public class CMIInteractiveCommand {

    private String name;
    private boolean publicIc = false;
    private boolean signRequiresPerm = true;
    private Set<CMILocation> loc = new HashSet<CMILocation>();
    private HashMap<UUID, CMINPC> uuid = new HashMap<UUID, CMINPC>();
    private Set<Integer> CitizensIds = new HashSet<Integer>();
    private Entity ent;
    private List<String> commands = new ArrayList<String>();

    private List<String> signLines = new ArrayList<String>();

    public CMIInteractiveCommand(String name) {
    }

    public List<String> getCommands(Player player) {
	return null;
    }

    public List<String> getCommandsOriginal() {
	return commands;
    }

    public List<String> getCommands() {
	return null;
    }

    public void setCommands(List<String> commands) {
	this.commands = new ArrayList<String>(commands);
    }

    public void addCommand(String commands) {
	this.commands.add(commands);
    }

    public Set<CMILocation> getLocList() {
	return loc;
    }

    public List<String> getLocListAsString() {
	return null;
    }

    public void setLoc(List<CMILocation> loc) {
	this.loc.clear();
	this.loc.addAll(loc);
    }

    public void addLoc(CMILocation loc) {
	if (loc == null)
	    return;
	this.loc.add(loc);
    }

    public HashMap<UUID, CMINPC> getUUIDMap() {
	return uuid;
    }

    public Set<UUID> getUUIDList() {
	return null;
    }

    public List<Integer> getIDList() {
	return null;
    }

    public List<String> getUUIDStringList() {
	return null;
    }

    public List<String> getUUIDStringListSave() {
	return null;
    }

    public void setUUIDList(HashMap<UUID, CMINPC> uuid) {
    }

    public boolean hasUUID(UUID uuid) {
	return this.uuid.containsKey(uuid);
    }

    public void addUUID(UUID uuid, Integer id) {
	this.uuid.putIfAbsent(uuid, (new CMINPC(uuid)).setId(id));
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Entity getEnt() {
	return ent;
    }

    public void setEnt(Entity ent) {
	this.ent = ent;
    }

    public boolean isPublic() {
	return publicIc;
    }

    public void setPublic(boolean publicIc) {
	this.publicIc = publicIc;
    }

    public boolean containsSigntext() {
	return false;
    }

    public List<String> getSignLines() {
	return null;
    }

    public boolean isSignLinesEmpty() {
	return false;
    }

    public void updateSignText(final Block block) {

    }

    public void setSignLines(List<String> signLines) {
	this.signLines = signLines;
    }

    public Set<Integer> getCitizensIds() {
	return CitizensIds;
    }

    public void setCitizensIds(Set<Integer> citizensIds) {
	CitizensIds = citizensIds;
    }

    public CMIInteractiveCommand removeEntity(UUID uuid) {
	return null;
    }

    public CMIInteractiveCommand removeLoc(CMILocation loc) {
	if (loc != null)
	    CMI.getInstance().getInteractiveCommandManager().removeLoc(loc);
	return this;
    }

    public boolean isSignRequiresPerm() {
	return signRequiresPerm;
    }

    public void setSignRequiresPerm(boolean signRequiresPerm) {
	this.signRequiresPerm = signRequiresPerm;
    }
}
