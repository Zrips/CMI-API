package com.Zrips.CMI.Modules.Portals;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Particl.CMIEffectManager.CMIParticleEffect;
import com.Zrips.CMI.Modules.tp.Teleportations.TpCondition;
import com.Zrips.CMI.events.CMIPortalUseEvent;

public class CMIPortal {

    private CuboidArea area;
    private Location tpLoc;
    private Boolean performCommandsWithoutTp = false;
    private World world;

    private boolean enabled = true;
    private boolean showParticles = true;
    private int particleAmount = 10;

    private int percentToHide = 0;
    private int activationRange = 16;

    private CMIParticleEffect effect = CMIParticleEffect.COLOURED_DUST;

    private List<String> commands = null;

    private String name;

    public CMIPortal() {
	area = new CuboidArea();
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
	return world;
    }

    public void setWorld(World world) {
	this.world = world;
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
	    return false;
    }

    public Location loadTpLoc(Object root) throws Exception {
	return null;
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

    public void setArea(CuboidArea area) {
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
    }

    public int getPercentToHide() {
	return percentToHide;
    }

    public void setPercentToHide(int percentToHide) {
    }

    public int getActivationRange() {
	return activationRange;
    }

    public void setActivationRange(int activationRange) {
    }

    public CMIParticleEffect getEffect() {
	return effect;
    }

    public void setEffect(CMIParticleEffect effect) {
	this.effect = effect;
    }

    public List<String> getCommands() {
	return null;
    }

    public List<String> getCommands(Player player) {
	return null;
    }

    public void setCommands(List<String> commands) {
    }

    public Boolean getPerformCommandsWithoutTp() {
	return performCommandsWithoutTp;
    }

    public void setPerformCommandsWithoutTp(Boolean performCommandsWithoutTp) {
	this.performCommandsWithoutTp = performCommandsWithoutTp;
    }
}
