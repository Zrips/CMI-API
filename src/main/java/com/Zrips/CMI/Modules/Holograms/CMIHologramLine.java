package com.Zrips.CMI.Modules.Holograms;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.utils.VersionChecker.Version;
import com.Zrips.CMI.Containers.CMIChatColor;

public class CMIHologramLine {

    private CMIHoloLineType type = CMIHoloLineType.plainText;
    private String text;
    private CMIItemStack item;
    private boolean itemInHand = false;
    private boolean staticText = true;
    boolean enchanted = false;
    private boolean glowing = false;
    Integer modelData = null;
    private Boolean randomU = null;
    private Float hue = null;

    private static final String regex = "(%)(?i)(CustomModelData:)(\\d+)(%)";
    private static final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    @Override
    public CMIHologramLine clone() {
	return null;
    }

    public CMIHologramLine(String text) {
	this.text = text;
	recheck();
    }

    public CMIHologramLine() {
    }

    private void recheck() {

    }

    public CMIItemStack getItem(Player player) {
	return null;
    }

    public boolean isStaticText() {
	return staticText;
    }

    public void setStaticText(boolean staticText) {
	this.staticText = staticText;
    }

    public boolean isItemInHand() {
	return itemInHand;
    }

    public void setItemInHand(boolean itemInHand) {
	this.itemInHand = itemInHand;
    }

    public String getText() {
	return text;
    }

    public String getText(Player player) {

	return null;
    }

    public CMIItemStack getItem() {
	return item;
    }

    public void setItem(CMIItemStack item) {
	this.item = item;
    }

    public CMIHoloLineType getType() {
	return type;
    }

    public boolean isIcon() {
	return type == CMIHoloLineType.icon || type == CMIHoloLineType.staticIcon;
    }

    public void setType(CMIHoloLineType type) {
	this.type = type;
    }

    public Boolean isRandomU() {
	return randomU == null ? false : randomU;
    }

    public boolean isGlowing() {
	return glowing;
    }

    public void setGlowing(boolean glowing) {
	this.glowing = glowing;
    }

}
