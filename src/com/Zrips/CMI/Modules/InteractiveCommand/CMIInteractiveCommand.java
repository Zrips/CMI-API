package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIInteractiveCommand {
    private String name;
    private boolean publicIc;
    private boolean signRequiresPerm;
    private boolean cancelInteraction;
    private Set<CMILocation> loc;
    private HashMap<UUID, CMINPC> uuid;
    private Set<CMINPC> citizensCache;
    private List<String> commands;
    private List<String> signLines;

    public CMIInteractiveCommand(String name) {
    }

    public List<String> getCommands(Player player) {
        return null;
    }

    public List<String> getCommandsOriginal() {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public void addCommand(String commands) {
    }

    public Set<CMILocation> getLocList() {
        return null;
    }

    public List<String> getLocListAsString() {
        return null;
    }

    public void setLoc(List<CMILocation> loc) {
    }

    @Deprecated
    public void addLoc(CMILocation loc) {
    }

    public HashMap<UUID, CMINPC> getUUIDMap() {
        return null;
    }

    public Set<UUID> getUUIDList() {
        return null;
    }

    @Deprecated
    public List<Integer> getIDList() {
        return null;
    }

    public List<CMINPC> getNPCList() {
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
        return false;
    }

    public void addUUID(UUID uuid, Integer id) {
    }

    public void addUUID(UUID uuid, UUID secondaryUUID, Integer id) {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean isPublic() {
        return false;
    }

    public void setPublic(boolean publicIc) {
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

    public void updateSignText(Block block) {
    }

    public void setSignLines(List<String> signLines) {
    }

    public Set<CMINPC> getCitizensCache() {
        return null;
    }

    public void setCitizensCache(Set<CMINPC> citizensCache) {
    }

    public void addCitizensCache(CMINPC citizen) {
    }

    public CMIInteractiveCommand removeEntity(UUID uuid) {
        return null;
    }

    public CMIInteractiveCommand removeLoc(CMILocation loc) {
        return null;
    }

    public boolean isSignRequiresPerm() {
        return false;
    }

    public void setSignRequiresPerm(boolean signRequiresPerm) {
    }

    public boolean isCancelInteraction() {
        return false;
    }

    public void setCancelInteraction(boolean cancelInteraction) {
    }
}
