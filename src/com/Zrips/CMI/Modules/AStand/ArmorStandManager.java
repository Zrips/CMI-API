package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;

public class ArmorStandManager {
    private CMI plugin;
    private static HashMap<UUID, Entity> last;
    private static ConcurrentHashMap<UUID, Entity> editing;
    private LinkedHashMap<String, ArmorStandSave> savedArmorStands;
    public static final String savedArmorStandLabel = null;
    public static boolean ArmorStandsCheckBlockPlace;
    public static boolean TemplatesSpecificPermission;

    public ArmorStandManager(CMI plugin) {
    }

    public void loadConfig(ConfigReader cfg) {
    }

    public Entity getLast(Player player) {
        return null;
    }

    public void removeEditor(Player player) {
    }

    public void removeEditorWithDelay(UUID uuid) {
    }

    public boolean isBeingEdited(UUID uuid) {
        return false;
    }

    public UUID getEditorOf(UUID uuid) {
        return null;
    }

    public boolean isTooFar(Player player, Entity ent) {
        return false;
    }

    private static void addSaveButton(CMIGui gui, int slot, armorStandSaveOptions action) {
    }

    private void addCopyButton(CMIGui gui, int slot, armorStandActions action) {
    }

    private void addCopyButton(CMIGui gui, int slot, armorStandExtraActions action) {
    }

    public boolean openCopyWindow(Player player, ArmorStand armor) {
        return false;
    }

    public boolean openSaveWindow(Player player, Entity ent) {
        return false;
    }

    private void addFinalSaveButton(CMIGui gui, int slot) {
    }

    public boolean openEditor(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    private boolean openEditorInternal(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    private void openDelayedEditor(Player player, Entity ent) {
    }

    private boolean hasActionAccess(Player player) {
        return false;
    }

    private boolean hasExtraActionAccess(Player player) {
        return false;
    }

    public boolean openPositionEditor(Player player, Entity ent) {
        return false;
    }

    private int getValue(GUIClickType type) {
        return 0;
    }

    private void setAngleButtons(CMIGui gui, ArmorStand armor, armorStandActions pose, int startSlot) {
    }

    public boolean isOk(CMIGui gui) {
        return false;
    }

    private static double getAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord) {
        return 0.0;
    }

    private static EulerAngle getEulerAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord) {
        return null;
    }

    private static void duplicate(armorStandActions part, ArmorStand source, ArmorStand target) {
    }

    public void duplicate(ArmorStand source, ArmorStand target, Set<armorStandActions> copy) {
    }

    public void duplicateExtra(ArmorStand source, ArmorStand target, Set<armorStandExtraActions> copy) {
    }

    private static void adjustAttribute(ArmorStand source, ArmorStand target) {
    }

    private boolean canBuild(Player player, Location loc) {
        return false;
    }

    public boolean canInteract(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    public void changeAngle(CMIGui gui, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    public void changeAngle(ArmorStand armor, Player player, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    private static void setAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord, EulerAngle pose) {
    }

    public void switchArmorStandArms(CMIGui gui) {
    }

    public void updateArmorStandItems(CMIGui gui) {
    }

    public ArmorStandSave getSavedArmorStand(String name) {
        return null;
    }

    public void save() {
    }

    public void load() {
    }

    public HashMap<String, ArmorStandSave> getSavedArmorStands() {
        return null;
    }

    public void removeSavedArmorStand(String name) {
    }

    public enum armorStandPoseC {
        x, y, z;
    }

    public enum armorStandExtraActions {
        updateitems, plate, size, visible, arms, gravity, glow, invulnerable, name, interactable, scale;

        public static armorStandExtraActions getByName(String name) {
            return null;
        }
    }

    public enum armorStandActions {
        head, body, torso, leftArm, rightArm, leftLeg, rightLeg, pos;

        public static armorStandActions getByName(String name) {
            return null;
        }
    }

    public enum armorStandSaveOptions {
        helmet, chest, offhand, mainhand, leggings, boots, name, body, plate, size, visible, arms, gravity, glow, invulnerable, interactable, scale, head(new Vector(-30, -50, -30), new Vector(30, 50, 30)),
        torso(new Vector(-5, -20, -5), new Vector(5, 20, 5)), leftArm(new Vector(-160, -35, -150), new Vector(20, 40, 5), new Vector(-10.0, 0.0, -10.0)), rightArm(new Vector(-160, -40, -5), new Vector(20,
            35, 150), new Vector(-14.99, 0.0, 10.0)), leftLeg(new Vector(-85, -10, -35), new Vector(25, 10, 5), new Vector(-1.0, 0.0, -1.0)), rightLeg(new Vector(-85, -10, -5), new Vector(25, 10, 35),
                new Vector(1.0, 0.0, 1.0));

        private Vector defaults = new Vector(0D, 0D, 0D);
        private Vector min = new Vector(0, 0, 0);
        private Vector max = new Vector(0, 0, 0);

        armorStandSaveOptions() {
        }

        armorStandSaveOptions(Vector min, Vector max, Vector defaults) {
        }

        armorStandSaveOptions(Vector min, Vector max) {
        }

        public static armorStandSaveOptions getByName(String name) {
            return null;
        }

        public Vector getDefault() {
            return null;
        }

        public Vector getMin() {
            return null;
        }

        public Vector getMax() {
            return null;
        }
    }

    public enum armorStandEditorSlots {
        helmet(11), chest(20), offhand(21), mainhand(19), leggings(29), boots(38);

        private int slot;

        armorStandEditorSlots(int slot) {
        }

        public int getSlot() {
            return 0;
        }

        public static armorStandEditorSlots getBySlot(int slot) {
            return null;
        }
    }
}
