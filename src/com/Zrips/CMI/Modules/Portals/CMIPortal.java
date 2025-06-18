package com.Zrips.CMI.Modules.Portals;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class CMIPortal {
    private CuboidArea area;
    private Location tpLoc;
    private Location safeLoc;
    private String bungeeServer;
    private String bungeeLocation;
    private boolean toExactBungeeLocation;
    private boolean performCommandsWithoutTp;
    private World world;
    private String worldName;
    private boolean enabled;
    private boolean showParticles;
    private int particleAmount;
    private boolean requiresPermission;
    private boolean kickBack;
    private boolean informOnMissingPerm;
    private int percentToHide;
    private int activationRange;
    private CMIEffect cmiEffect;
    private List<String> commands;
    private String name;
    private boolean particlesByPermission;
    private Set<UUID> particleForPlayers;

    public CMIPortal() {
    }

    public boolean containsLoc(Location loc) {
        return false;
    }

    public boolean containsLoc(Location loc, int range) {
        return false;
    }

    public CuboidArea getArea() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public boolean checkCollision(CuboidArea area) {
        return false;
    }

    public boolean teleport(Player player) {
        return false;
    }

    public Location loadTpLoc(Object root) throws Exception {
        return null;
    }

    public CuboidArea loadBounds(String root) throws Exception {
        return null;
    }

    public Location getTpLoc() {
        return null;
    }

    public void setTpLoc(Location tpLoc) {
    }

    public void setArea(CuboidArea area, boolean recalculatePart) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public boolean isShowParticles() {
        return false;
    }

    public void setShowParticles(boolean showParticles) {
    }

    public int getParticleAmount() {
        return 0;
    }

    public void setParticleAmount(int particleAmount) {
    }

    public int getPercentToHide() {
        return 0;
    }

    public void setPercentToHide(int percentToHide) {
    }

    public int getActivationRange() {
        return 0;
    }

    public void setActivationRange(int activationRange) {
    }

    public List<String> getCommands() {
        return null;
    }

    public List<String> getCommands(Player player) {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public boolean getPerformCommandsWithoutTp() {
        return false;
    }

    public void setPerformCommandsWithoutTp(boolean performCommandsWithoutTp) {
    }

    public String getBungeeServer() {
        return null;
    }

    public void setBungeeServer(String bungeeServer) {
    }

    public String getBungeeLocation() {
        return null;
    }

    public void setBungeeLocation(String bungeeLocation) {
    }

    public Location getSafeLoc() {
        return null;
    }

    public void setSafeLoc(Location safeLoc) {
    }

    public boolean isToExactBungeeLocation() {
        return false;
    }

    public void setToExactBungeeLocation(boolean toExactBungeeLocation) {
    }

    public boolean isRequiresPermission() {
        return false;
    }

    public void setRequiresPermission(boolean requiresPermission) {
    }

    public boolean isInformOnMissingPerm() {
        return false;
    }

    public void setInformOnMissingPerm(boolean informOnMissingPerm) {
    }

    public String getWorldName() {
        return null;
    }

    public void setWorldName(String worldName) {
    }

    public synchronized Set<UUID> getParticleForPlayers() {
        return null;
    }

    public synchronized void setParticleForPlayers(Set<UUID> particleForPlayers) {
    }

    public Set<UUID> removeParticleLimitations(Player player) {
        return null;
    }

    public synchronized Set<UUID> removeParticleLimitations(UUID uuid) {
        return null;
    }

    public synchronized Set<UUID> updateParticleLimitations(Player player) {
        return null;
    }

    public boolean isParticlesByPermission() {
        return false;
    }

    public void setParticlesByPermission(boolean particlesByPermission) {
    }

    public boolean isKickBack() {
        return false;
    }

    public void setKickBack(boolean kickBack) {
    }

    @Deprecated
    public CMIParticle getEffect() {
        return null;
    }

    public void setEffect(CMIParticle effect) {
    }

    public CMIEffect getCMIEffect() {
        return null;
    }

    public void setCMIEffect(CMIEffect cmiEffect) {
    }

    public CMIPortal setEffectColor(Color color) {
        return null;
    }
}
