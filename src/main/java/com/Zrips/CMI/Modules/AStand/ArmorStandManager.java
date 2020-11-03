package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;

public class ArmorStandManager {

    private CMI plugin;

    public ArmorStandManager(CMI plugin) {
	this.plugin = plugin;
    }

    private static HashMap<UUID, Entity> last = new HashMap<UUID, Entity>();
    private static HashMap<UUID, Entity> editing = new HashMap<UUID, Entity>();

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

    public enum armorStandEditorSlots {

	helmet(1), chest(10), offhand(11), mainhand(9), leggings(19), boots(28);

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
	return last.get(player.getUniqueId());
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

    private void addCopyButton(CMIGui gui, int slot, armorStandActions action) {

    }

    private void addCopyButton(CMIGui gui, int slot, armorStandExtraActions action) {

    }

    public boolean openCopyWindow(Player player, ArmorStand armor) {

	return true;
    }

    public boolean openEditor(Player player, Entity ent, boolean checkInteraction) {

	return true;
    }

    private int getValue(GUIClickType type) {
	switch (type) {
	case Left:
	    return 1;
	case LeftShift:
	    return 10;
	case MiddleMouse:
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

    private void setAngleButtons(CMIGui gui, ArmorStand armor, armorStandActions pose, int startSlot) {

    }

    public boolean isOk(CMIGui gui) {

	return true;
    }

    private static double getAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord) {

	return 0D;
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

    private boolean canBuild(Player player, Location loc) {

	return false;
    }

    public boolean canInteract(Player player, Entity ent, boolean checkInteraction) {
	return true;
    }

    public void changeAngle(CMIGui gui, armorStandActions apose, armorStandPoseC coord, int value) {
	if (!isOk(gui))
	    return;

	Entity ent = (Entity) gui.getWhatShows();

	changeAngle((ArmorStand) ent, gui.getPlayer(), apose, coord, value);
    }

    public void changeAngle(ArmorStand armor, Player player, armorStandActions apose, armorStandPoseC coord, int value) {

    }

    private static void setAngle(ArmorStand armor, armorStandActions apose, armorStandPoseC coord, EulerAngle pose) {

    }

    public void switchArmorStandArms(CMIGui gui) {
    }

    public void updateArmorStandItems(CMIGui gui) {
    }

}
