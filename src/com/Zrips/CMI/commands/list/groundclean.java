package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class groundclean implements Cmd {
    public static final boolean isUsefull(ItemStack stack, boolean keepShulker) {
        return false;
    }

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eClears server from unnecessary items", args = "(+cb) (+cm) (+ci) (+b) (+sh) (+tnt) (+all) (+fl) (+named) (-w:[worldName]) (-s)", multiTab = {
        "+cb +cm +ci +b +sh +tnt +fl +named -w:" }, explanation = { "+cm will include minecarts into cleaning", "+cb will include boats into cleaning", "+sh will include shulker box into cleaning",
            "+ci defines if you want to include weapons and armors", "+tnt defines if you want to include primed tnt", "+named removes items with custom name or lore",
            "+b broadcasts clear message to everyone" }, regVar = { -66 }, consoleVar = { -66 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum removedTypes {
        Items, Arrows, Orbs, Falling, Projectile, Tnt, Boat, Minecart;
    }

    private enum inclusionType {
        Boat, Minecart, Armor, Shulker, Tnt, Named, Falling, All;
    }
}
