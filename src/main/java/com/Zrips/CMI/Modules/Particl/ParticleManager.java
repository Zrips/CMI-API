package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Particl.CMIEffectManager.CMIParticle;

public class ParticleManager {

    private CMI plugin;

    Map<UUID, Set<CMIVisualEffect>> playerEffects = Collections.synchronizedMap(new ConcurrentHashMap<UUID, Set<CMIVisualEffect>>());

    public ParticleManager(CMI plugin) {
	this.plugin = plugin;
    }

    public synchronized boolean addPlayerEffect(CMIVisualEffect effect) {
	return true;
    }

    public synchronized boolean removePlayerEffects(CMIVisualEffect effect) {
	return true;
    }

    public synchronized boolean removePlayerEffects(UUID uuid) {
	return true;
    }

    public synchronized boolean removeAllPlayerEffects() {
	return true;
    }

    public void drawLine(Player player, Location loc1, Location loc2, CMIParticle effect, boolean center) {
    }

    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, Player player) {
    }

    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, List<Player> players) {
	drawLine(loc1, loc2, effect, center, players, 5000L);
    }

    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, List<Player> players, Long keepFor) {
	drawLine(loc1, loc2, effect, center, players, keepFor, 0.3);
    }

    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, List<Player> players, Long keepFor, Double speed) {
	ArrayList<Location> primaryLocations = getLineLocations(loc1, loc2, center, speed);
	drawShed(primaryLocations, effect, players, keepFor);
    }

    private static ArrayList<Location> getLineLocations(Location loc1, Location loc2, boolean center, Double speed) {
	return null;
    }

    private void drawShed(final ArrayList<Location> primaryLocations, final CMIParticle effect, final List<Player> players, final Long keepFor) {

    }

    private class taskCancel {
	private int id = -1;

	taskCancel(int id) {
	    this.id = id;
	}

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public void cancel() {
	    if (id > 0)
		Bukkit.getScheduler().cancelTask(id);
	}

    }

    private void markBlockShed(final Location o, final CMIParticle effect, final Long until, final List<Player> players) {

    }

    private void markBlock(Location o, CMIParticle effect, final List<Player> players) {
    }

    private static List<Vector> remakePlotLineInRange(Double rowSpacing, int range, Vector p1, Vector p2, Location loc) {

	return null;
    }

    private static boolean inRange(Location loc, Location loc2, Integer range) {
	return true;
    }

    private static Vectors shortenVectors(Double rowSpacing, Integer range, Vector p1, Vector p2, Location loc) {

	return null;
    }

    private static final String customPreset = "circle;effect:reddust;dur:5;pitchc:5;part:10;offset:0,1,0;radius:1;yawc:4";

    public enum CMIPresetAnimations {
//	Rotator2("circle;effect:reddust;dur:5;pitchc:5;part:10;offset:0,1.7,0;radius:1;yawc:5;color:rs"),
	TotemHalo("circle;effect:reddust;c:255,255,10;twist;part:3;offset:0,2,0;pitch:90;radius:0.3;interval:2"),
//	STwister2("circle;effect:redstonedust;part:4;radius:0.75;color:rfs;yaw:[playerName];pitch:[playerName];move:[playerName],0.5;twist;rc:-0.02;mmdist:30;offset:0,1.5,0;fixed"),
//	CTree2("circle;effect:flame;part:4;radius:0.75;color:rs;pitch:90;move:0,0.1,0;twist;rc:-0.04;mmdist:2"),
	Healing("circle;effect:heart;dur:0.1;part:1;offset:0,1.7,0;radius:0.3"),
	GlyphHead("circle;effect:flying_glyph;dur:5;pitchc:15;part:10;offset:0,1.7,0;radius:0.5;yawc:12;color:rs;pitch:90"),
	tpaWarmup("circle;effect:flying_glyph;dur:5;pitchc:15;part:10;offset:0,1.7,0;radius:0.5;yawc:12;color:rs;pitch:90"),
	GColumn("circle;c:0,255,0;twist;part:5;r:0.75;pitch:90;move:0,0.1,0;rc:-0.02"),
	SmallBoop("circle;effect:flying_glyph;yaw:[playerName];pitch:[playerName];r:0.1;part:3;rc:0.03;mr:0.3;twist"),
	TpUp("circle;c:200,50,210;twist;part:5;r:0.5;pitch:90;move:0,0.33,0;offset:0,-0.2,0"),
	TpDown("circle;c:150,50,10;part:5;r:0.5;pitch:90;move:0,-0.33,0;offset:0,2.2,0"),
	custom1(customPreset),
	custom2(customPreset),
	custom3(customPreset),
	custom4(customPreset),
	custom5(customPreset),
	custom6(customPreset),
	custom7(customPreset),
	custom8(customPreset),
	custom9(customPreset),
	custom10(customPreset),
	custom11(customPreset),
	custom12(customPreset),
	custom13(customPreset),
	custom14(customPreset),
	custom15(customPreset),
	custom16(customPreset),
	custom17(customPreset),
	custom18(customPreset),
	custom19(customPreset),
	custom20(customPreset),
	custom21(customPreset),
	custom22(customPreset),
	custom23(customPreset),
	custom24(customPreset),
	custom25(customPreset),
	custom26(customPreset),
	custom27(customPreset),
	custom28(customPreset),
	custom29(customPreset),
	custom30(customPreset);

//	private CMIPEAnimationInterface inter;
	private String string = "";
	private boolean enabled = true;

	CMIPresetAnimations(String anim) {
	    string = anim;
	}

	public CMIPEAnimationInterface getInter() {
	    return null;
	}

	public CMIPEAnimationInterface getInter(Player player) {
	    return null;
	}

	public void show(Location loc) {
	    CMI.getInstance().getParticleManager().show(CMI.getInstance().getParticleManager().getParticleAnimation(string), loc);
	}

	public void show(Player player) {

	}

	public static CMIPresetAnimations getByName(String name) {
	    return null;
	}

	public void setAnimString(String string) {
	    this.string = string;
	}

	public String getAnimString() {
	    return string;
	}

	public boolean isEnabled() {
	    return enabled;
	}

	public void setEnabled(boolean enabled) {
	    this.enabled = enabled;
	}
    }

    public void show(final String a, final Player player) {
	CMIPEAnimationInterface animation = getParticleAnimation(a);
	show(animation, player);
    }

    public void show(final CMIPEAnimationInterface animation, final Location loc) {
    }

    public void show(final CMIPEAnimationInterface animation, final Player player) {
    }

    public CMIPEAnimationInterface getParticleAnimation(String string) {

	return null;
    }

}
