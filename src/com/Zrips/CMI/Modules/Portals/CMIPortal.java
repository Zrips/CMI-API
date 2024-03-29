package com.Zrips.CMI.Modules.Portals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class CMIPortal {

    private CuboidArea area;
    private Location tpLoc;
    private Location safeLoc;
    private String bungeeServer;
    private String bungeeLocation;
    private boolean toExactBungeeLocation = true;
    private boolean performCommandsWithoutTp = PortalManager.performCmd;
    private World world;
    private String worldName;

    private boolean enabled = true;
    private boolean showParticles = true;
    private int particleAmount = 10;

    private boolean requiresPermission = false;
    private boolean kickBack = true;
    private boolean informOnMissingPerm = false;

    private int percentToHide = 0;
    private int activationRange = 16;

    private CMIEffect cmiEffect = null;

    private List<String> commands = null;

    private String name;

    private boolean particlesByPermission = false;
    private Set<UUID> particleForPlayers = new HashSet<UUID>();

    public CMIPortal() {
        area = new CuboidArea(null);
    }

    public boolean containsLoc(Location loc) {
        return area.containsLoc(loc);
    }

    public boolean containsLoc(Location loc, int range) {
        return area.containsLoc(loc, range);
    }

    public CuboidArea getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public World getWorld() {
        if (world == null && this.getWorldName() != null)
            return CMI.getInstance().getUtilManager().getWorld(this.worldName);
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
        if (world != null)
            this.worldName = world.getName();
    }

    public boolean checkCollision(CuboidArea area) {
        if (this.area != null) {
            if (this.area.checkCollision(area)) {
                return true;
            }
        }
        return false;
    }

    public boolean teleport(Player player) {

        return true;
    }

    public Location loadTpLoc(Object root) throws Exception {
        tpLoc = (Location) root;
        return tpLoc;
    }

    public CuboidArea loadBounds(String root) throws Exception {

        return null;
    }

    public Location getTpLoc() {
        return tpLoc;
    }

    public void setTpLoc(Location tpLoc) {
        this.tpLoc = tpLoc;
    }

    public void setArea(CuboidArea area, boolean recalculatePart) {

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isShowParticles() {
        return showParticles;
    }

    public void setShowParticles(boolean showParticles) {
        this.showParticles = showParticles;
    }

    public int getParticleAmount() {
        return particleAmount;
    }

    public void setParticleAmount(int particleAmount) {
        this.particleAmount = particleAmount;
        if (this.particleAmount < 0)
            this.particleAmount = 0;
        if (this.particleAmount > 300)
            this.particleAmount = 300;
    }

    public int getPercentToHide() {
        return percentToHide;
    }

    public void setPercentToHide(int percentToHide) {
        this.percentToHide = percentToHide;
        if (this.percentToHide < 0)
            this.percentToHide = 0;
        if (this.percentToHide > 99)
            this.percentToHide = 99;
    }

    public int getActivationRange() {
        return activationRange;
    }

    public void setActivationRange(int activationRange) {
        this.activationRange = activationRange;
        if (this.activationRange < 2)
            this.activationRange = 2;
        if (this.activationRange > 128)
            this.activationRange = 128;
    }

    public List<String> getCommands() {
//	if (!CMI.getInstance().getPortalManager().performCmd)
//	    return new ArrayList<String>();
        if (this.commands == null)
            setCommands(CMI.getInstance().getPortalManager().getCommandsOnTeleport());
        return commands;
    }

    public List<String> getCommands(Player player) {
        Snd snd = new Snd().setSender(player).setTarget(player);
        List<String> cmd = new ArrayList<String>();
        for (String one : this.getCommands()) {
            cmd.add(CMI.getInstance().getLM().updateSnd(snd, one));
        }
        return cmd;
    }

    public void setCommands(List<String> commands) {
        if (this.commands == null)
            this.commands = new ArrayList<String>();
        this.commands.addAll(commands);
    }

    public boolean getPerformCommandsWithoutTp() {
        return performCommandsWithoutTp;
    }

    public void setPerformCommandsWithoutTp(boolean performCommandsWithoutTp) {
        this.performCommandsWithoutTp = performCommandsWithoutTp;
    }

    public String getBungeeServer() {
        return bungeeServer;
    }

    public void setBungeeServer(String bungeeServer) {
        this.bungeeServer = bungeeServer;
    }

    public String getBungeeLocation() {
        return bungeeLocation;
    }

    public void setBungeeLocation(String bungeeLocation) {
        this.bungeeLocation = bungeeLocation;
    }

    public Location getSafeLoc() {
        return safeLoc;
    }

    public void setSafeLoc(Location safeLoc) {
        this.safeLoc = safeLoc;
    }

    public boolean isToExactBungeeLocation() {
        return toExactBungeeLocation;
    }

    public void setToExactBungeeLocation(boolean toExactBungeeLocation) {
        this.toExactBungeeLocation = toExactBungeeLocation;
    }

    public boolean isRequiresPermission() {
        return requiresPermission;
    }

    public void setRequiresPermission(boolean requiresPermission) {
        this.requiresPermission = requiresPermission;
    }

    public boolean isInformOnMissingPerm() {
        return informOnMissingPerm;
    }

    public void setInformOnMissingPerm(boolean informOnMissingPerm) {
        this.informOnMissingPerm = informOnMissingPerm;
    }

    public String getWorldName() {
        if (worldName == null && world != null)
            return world.getName();
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
        this.world = CMI.getInstance().getUtilManager().getWorld(worldName);
    }

    public Set<UUID> getParticleForPlayers() {
        return particleForPlayers;
    }

    public void setParticleForPlayers(Set<UUID> particleForPlayers) {
        this.particleForPlayers = particleForPlayers;
    }

    public Set<UUID> removeParticleLimitations(Player player) {
        return removeParticleLimitations(player.getUniqueId());
    }

    public Set<UUID> removeParticleLimitations(UUID uuid) {
        particleForPlayers.remove(uuid);
        return particleForPlayers;
    }

    public Set<UUID> updateParticleLimitations(Player player) {
        if (player != null) {
            if (!this.isParticlesByPermission() || player.isOnline() && CMIPerm.command_portal_$1.hasPermission(player, this.getName())) {
                particleForPlayers.add(player.getUniqueId());
            }
            // We might not want to remove player from particle list
//            else {
//                particleForPlayers.remove(player.getUniqueId());
//            } 
        }
        return particleForPlayers;
    }

    public boolean isParticlesByPermission() {
        return particlesByPermission;
    }

    public void setParticlesByPermission(boolean particlesByPermission) {
        this.particlesByPermission = particlesByPermission;
    }

    public boolean isKickBack() {
        return this.kickBack;
    }

    public void setKickBack(boolean kickBack) {
        this.kickBack = kickBack;
    }

    @Deprecated
    public CMIParticle getEffect() {
        return getCMIEffect().getParticle();
    }

    public void setEffect(CMIParticle effect) {
        getCMIEffect().setParticle(effect);
    }

    public CMIEffect getCMIEffect() {
        if (cmiEffect == null) {
            cmiEffect = new CMIEffect(CMIParticle.COLOURED_DUST);
            cmiEffect.setColor(org.bukkit.Color.fromRGB(125, 125, 125));
        }
        return cmiEffect;
    }

    public void setCMIEffect(CMIEffect cmiEffect) {
        this.cmiEffect = cmiEffect;
    }

    public CMIPortal setEffectColor(Color color) {
        getCMIEffect().setColor(color);
        return this;
    }

}
