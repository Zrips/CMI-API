package com.Zrips.CMI.commands.list;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIRows;
import com.Zrips.CMI.Modules.GUI.GUIManager.InvType;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

public class vanishedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
	c.get("vanished", "&eYou have vanished");
	c.get("unvanish", "&eYou become visible");
	c.get("targetVanished", "&6[playerDisplayName] &eis now vanished");
	c.get("targetUnvanish", "&6[playerDisplayName] &eis no longer vanished");

	c.get("isVanished", "&eVanished");
	c.get("damageToEntity", "&eCan deal damage to others");
	c.get("playerDamage", "&eCan take damage");
	c.get("itemPickup", "&eCan pickup items");
	c.get("mobAggro", "&eMobs can target");
	c.get("interaction", "&eCan physically interact");
	c.get("silentChest", "&eNoisy chest's");
	c.get("informOnLeave", "&eShows leave message");
	c.get("informOnJoin", "&eShows join message");
	c.get("nightVision", "&eApply night vision");
	c.get("bossbar", "&eShow bossBar when vanished");
	c.get("bossbarTitle", "&fVanished");

    }

    public enum VanishAction {
	isVanished(4), damageToEntity(10), playerDamage(11), itemPickup(12), mobAggro(13), interaction(14), silentChest(15), informOnLeave(21), informOnJoin(22), nightVision(16), bossbar(23);
	private int slot;

	VanishAction(int slot) {
	    this.slot = slot;
	}

	public int getSlot() {
	    return slot;
	}

	public void setSlot(int slot) {
	    this.slot = slot;
	}
    }

    @Override
    @CAnnotation(priority = 120, info = "&eEdit vanish mode for player", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = { 666 })
    public boolean perform(CMI plugin, CommandSender sender, String[] args) {
	return true;
    }
}
