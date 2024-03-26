package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;

public class ArmorStandManager {

    private CMI plugin;

    public ArmorStandManager(CMI plugin) {
        this.plugin = plugin;
    }

    private static HashMap<UUID, Entity> last = new HashMap<UUID, Entity>();
    private static HashMap<UUID, Entity> editing = new HashMap<UUID, Entity>();

    private LinkedHashMap<String, ArmorStandSave> savedArmorStands = new LinkedHashMap<String, ArmorStandSave>();

    public static final String savedArmorStandLabel = "CMISavedArmorStand";

    public static boolean ArmorStandsCheckBlockPlace = true;
    public static boolean TemplatesSpecificPermission = true;

    public void loadConfig(ConfigReader cfg) {

    }

    public enum armorStandPoseC {
        x, y, z;
    }

    public enum armorStandExtraActions {
        updateitems, plate, size, visible, arms, gravity, glow, invulnerable, name, interactable;

        public static armorStandExtraActions getByName(String name) {
            for (armorStandExtraActions one : armorStandExtraActions.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }
    }

    public enum armorStandActions {
        head, body, torso, leftArm, rightArm, leftLeg, rightLeg, pos;

        public static armorStandActions getByName(String name) {
            for (armorStandActions one : armorStandActions.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }
    }

    public enum armorStandSaveOptions {
        helmet, chest, offhand, mainhand, leggings, boots,
        name, body,
        plate, size, visible, arms, gravity, glow, invulnerable, interactable,
        head(new Vector(-30, -50, -30), new Vector(30, 50, 30)),
        torso(new Vector(-5, -20, -5), new Vector(5, 20, 5)),
        leftArm(new Vector(-160, -35, -150), new Vector(20, 40, 5), new Vector(-10.0, 0.0, -10.0)),
        rightArm(new Vector(-160, -40, -5), new Vector(20, 35, 150), new Vector(-14.99, 0.0, 10.0)),
        leftLeg(new Vector(-85, -10, -35), new Vector(25, 10, 5), new Vector(-1.0, 0.0, -1.0)),
        rightLeg(new Vector(-85, -10, -5), new Vector(25, 10, 35), new Vector(1.0, 0.0, 1.0));

        private Vector defaults = new Vector(0D, 0D, 0D);

        private Vector min = new Vector(0, 0, 0);
        private Vector max = new Vector(0, 0, 0);

        armorStandSaveOptions() {

        }

        armorStandSaveOptions(Vector min, Vector max, Vector defaults) {
            this.min = min;
            this.max = max;
            this.defaults = defaults;
        }

        armorStandSaveOptions(Vector min, Vector max) {
            this.min = min;
            this.max = max;
        }

        public static armorStandSaveOptions getByName(String name) {
            for (armorStandSaveOptions one : armorStandSaveOptions.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }

        public Vector getDefault() {
            return defaults;
        }

        public Vector getMin() {
            return min;
        }

        public Vector getMax() {
            return max;
        }
    }

    public enum armorStandEditorSlots {

        helmet(11), chest(20), offhand(21), mainhand(19), leggings(29), boots(38);

        private int slot;

        armorStandEditorSlots(int slot) {
            this.slot = slot;
        }

        public int getSlot() {
            return slot;
        }

        public static armorStandEditorSlots getBySlot(int slot) {
            for (armorStandEditorSlots one : armorStandEditorSlots.values()) {
                if (one.getSlot() == slot)
                    return one;
            }
            return null;
        }
    }

    public Entity getLast(Player player) {
        Entity ent = last.get(player.getUniqueId());
        if (ent == null)
            return null;
        Entity closest = plugin.getUtilManager().getClosestEntity(ent.getLocation(), 10, EntityType.ARMOR_STAND);
        if (closest != null && closest.getUniqueId().toString().equals(ent.getUniqueId().toString()))
            return closest;
        return null;
    }

    public boolean isBeingEdited(UUID uuid) {
        return false;
    }

    public UUID getEditorOf(UUID uuid) {

        return null;
    }

    public boolean isTooFar(Player player, Entity ent) {

        Location loc1 = player.getLocation();
        Location loc2 = ent.getLocation();

        if (!loc1.getWorld().equals(loc2.getWorld()))
            return true;

        return loc1.distance(loc2) > 20;
    }

    public boolean openCopyWindow(Player player, ArmorStand armor) {

        return true;
    }

    public boolean openSaveWindow(Player player, Entity ent) {

        return true;
    }

    public boolean openEditor(Player player, Entity ent, boolean checkInteraction) {

        return true;
    }

    public boolean openPositionEditor(Player player, Entity ent) {

        return true;
    }

    private int getValue(GUIClickType type) {
        switch (type) {
        case Left:
            return 1;
        case LeftShift:
            return 10;
        case MiddleMouse:
        case Q:
            return 0;
        case Right:
            return -1;
        case RightShift:
            return -10;
        default:
            break;
        }
        return 0;
    }

    public boolean isOk(CMIGui gui) {

        return true;
    }

    private static double getAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord) {

        return 0D;
    }

    private static EulerAngle getEulerAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord) {
        EulerAngle pose = null;

        switch (apose) {
        case head:
            pose = armor.getHeadPose();
            break;
        case leftArm:
            pose = armor.getLeftArmPose();
            break;
        case torso:
            pose = armor.getBodyPose();
            break;
        case leftLeg:
            pose = armor.getLeftLegPose();
            break;
        case rightArm:
            pose = armor.getRightArmPose();
            break;
        case rightLeg:
            pose = armor.getRightLegPose();
            break;
        default:
            break;
        }
        return pose;
    }

    public void duplicate(ArmorStand source, ArmorStand target, Set<armorStandActions> copy) {

    }

    public void duplicateExtra(ArmorStand source, ArmorStand target, Set<armorStandExtraActions> copy) {

    }

    private boolean canBuild(Player player, Location loc) {
        return true;
    }

    public boolean canInteract(Player player, Entity ent, boolean checkInteraction) {

        return true;
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
        if (name == null)
            return null;
        return savedArmorStands.get(name.toLowerCase());
    }

    public void save() {

    }

    public void load() {

    }

    public HashMap<String, ArmorStandSave> getSavedArmorStands() {
        return savedArmorStands;
    }

    public void removeSavedArmorStand(String name) {
        savedArmorStands.remove(name.toLowerCase());
    }
}
