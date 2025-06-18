package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ParticleManager {
    private CMI plugin;
    Map<UUID, Set<CMIVisualEffect>> playerEffects;
    private static final String fileName = null;
    private static final String customPreset = null;

    public ParticleManager(CMI plugin) {
    }

    public synchronized boolean addPlayerEffect(CMIVisualEffect effect) {
        return false;
    }

    public synchronized boolean removePlayerEffects(CMIVisualEffect effect) {
        return false;
    }

    public synchronized boolean removePlayerEffects(UUID uuid) {
        return false;
    }

    public synchronized boolean removeAllPlayerEffects() {
        return false;
    }

    @Deprecated
    public void drawLine(Player player, Location loc1, Location loc2, CMIParticle effect, boolean center) {
    }

    @Deprecated
    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, Player player) {
    }

    @Deprecated
    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, List<Player> players) {
    }

    @Deprecated
    public void drawLine(Location loc1, Location loc2, CMIParticle effect, boolean center, List<Player> players, Long keepFor) {
    }

    public void drawLine(Location loc1, Location loc2, CMIEffect effect, boolean center, List<Player> players, Long keepFor, Double speed) {
    }

    private static ArrayList<Location> getLineLocations(Location loc1, Location loc2, boolean center, Double speed) {
        return null;
    }

    private void drawShed(ArrayList<Location> primaryLocations, CMIEffect effect, List<Player> players, Long keepFor) {
    }

    private void markBlockShed(Location o, CMIEffect effect, Long until, List<Player> players) {
    }

    private static void markBlock(Location o, CMIEffect effect, List<Player> players) {
    }

    private static List<Vector> remakePlotLineInRange(Double rowSpacing, int range, Vector p1, Vector p2, Location loc) {
        return null;
    }

    private static boolean inRange(Location loc, Location loc2, Integer range) {
        return false;
    }

    private static Vectors shortenVectors(Double rowSpacing, Integer range, Vector p1, Vector p2, Location loc) {
        return null;
    }

    public void loadConfig() {
    }

    public void show(String a, Player player) {
    }

    public void show(CMIPEAnimationInterface animation, Location loc) {
    }

    public void show(CMIPEAnimationInterface animation, Player player) {
    }

    public CMIPEAnimationInterface getParticleAnimation(String string) {
        return null;
    }

    private class taskCancel {
        private CMITask task;

        taskCancel(CMITask task) {
        }

        public void setTask(CMITask task) {
        }

        public void cancel() {
        }
    }

    public enum CMIPresetAnimations {
        TotemHalo("circle;effect:reddust;c:255,255,10;twist;part:3;offset:0,2,0;pitch:90;radius:0.3;interval:2"), Healing("circle;effect:heart;dur:0.1;part:1;offset:0,1.7,0;radius:0.3"), GlyphHead(
            "circle;effect:flying_glyph;dur:5;pitchc:15;part:10;offset:0,1.7,0;radius:0.5;yawc:12;color:rs;pitch:90"), tpaWarmup(
                "circle;effect:flying_glyph;dur:5;pitchc:15;part:10;offset:0,1.7,0;radius:0.5;yawc:12;color:rs;pitch:90"), GColumn("circle;c:0,255,0;twist;part:5;r:0.75;pitch:90;move:0,0.1,0;rc:-0.02"),
        SmallBoop("circle;effect:flying_glyph;yaw:[playerName];pitch:[playerName];r:0.1;part:3;rc:0.03;mr:0.3;twist"), HologramInteraction(
            "circle;effect:flying_glyph;yaw:[playerName];pitch:[playerName];r:0.1;part:3;rc:0.03;mr:0.3;twist"), HologramNewInteraction(
                "circle;effect:reddust;r:0;part:2;rc:0.2;mr:1;color:rs;yaw:[playerName];a:90"), HologramHover("circle;effect:crit;r:0;part:1;"), TpUp(
                    "circle;c:200,50,210;twist;part:5;r:0.5;pitch:90;move:0,0.33,0;offset:0,-0.2,0"), TpDown("circle;c:150,50,10;part:5;r:0.5;pitch:90;move:0,-0.33,0;offset:0,2.2,0"), custom1(
                        customPreset), custom2(customPreset), custom3(customPreset), custom4(customPreset), custom5(customPreset), custom6(customPreset), custom7(customPreset), custom8(customPreset),
        custom9(customPreset), custom10(customPreset), custom11(customPreset), custom12(customPreset), custom13(customPreset), custom14(customPreset), custom15(customPreset), custom16(customPreset),
        custom17(customPreset), custom18(customPreset), custom19(customPreset), custom20(customPreset), custom21(customPreset), custom22(customPreset), custom23(customPreset), custom24(customPreset),
        custom25(customPreset), custom26(customPreset), custom27(customPreset), custom28(customPreset), custom29(customPreset), custom30(customPreset);

        private String string = "";
        private boolean enabled = true;

        CMIPresetAnimations(String anim) {
        }

        public CMIPEAnimationInterface getInter() {
            return null;
        }

        public CMIPEAnimationInterface getInter(Player player) {
            return null;
        }

        public void show(Location loc) {
        }

        public void show(Player player) {
        }

        public static CMIPresetAnimations getByName(String name) {
            return null;
        }

        public void setAnimString(String string) {
        }

        public String getAnimString() {
            return null;
        }

        public boolean isEnabled() {
            return false;
        }

        public void setEnabled(boolean enabled) {
        }
    }
}
