package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;

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

	this.name = name;

	signLines.add(" ");
	signLines.add(" ");
	signLines.add(" ");
	signLines.add(" ");
    }

    public List<String> getCommands(Player player) {
	Snd snd = new Snd();
	snd.setSender(player);
	snd.setTarget(player);
	return CMI.getInstance().getLM().updateSnd(snd, new ArrayList<String>(commands));
    }

    public List<String> getCommandsOriginal() {
	return commands;
    }

    public List<String> getCommands() {
	List<String> cmd = new ArrayList<String>();
	for (String one : commands) {
	    cmd.add(CMIChatColor.deColorize(one));
	}
	return cmd;
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
	List<String> ls = new ArrayList<String>();
	for (CMILocation one : loc) {
	    ls.add(CMI.getInstance().getPlayerManager().convertLocToStringShort(one));
	}
	return ls;
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
	Set<UUID> ls = new HashSet<UUID>();
	return ls;
    }

    public List<Integer> getIDList() {
	List<Integer> ls = new ArrayList<Integer>();
	return ls;
    }

    public List<String> getUUIDStringList() {
	List<String> ls = new ArrayList<String>();
	return ls;
    }

    public List<String> getUUIDStringListSave() {
	List<String> ls = new ArrayList<String>();
	return ls;
    }

    public void setUUIDList(HashMap<UUID, CMINPC> uuid) {
	this.uuid.clear();
	this.uuid.putAll(uuid);
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
	return signLines;
    }

    public boolean isSignLinesEmpty() {
	return true;
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
	if (uuid != null)
	    CMI.getInstance().getInteractiveCommandManager().removeEntity(uuid);
	return this;
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
