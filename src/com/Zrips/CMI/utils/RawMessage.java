package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;

public class RawMessage {

    List<String> parts = new ArrayList<String>();
    List<String> cleanParts = new ArrayList<String>();
    String combined = "";
    String combinedClean = "";

    private boolean colorizeEntireWithLast = true;

    public void clear() {
	parts = new ArrayList<String>();
	cleanParts = new ArrayList<String>();
	combined = "";
	combinedClean = "";
    }

    public RawMessage add(String text) {
	return null;
    }

    public RawMessage add(String text, String hoverText) {
	return null;
    }

    public RawMessage add(String text, String hoverText, String command) {
	return null;
    }

    public RawMessage add(String text, String hoverText, String command, String suggestion) {
	return null;
    }

    public RawMessage add(String text, String hoverText, String command, String suggestion, String url) {

	return null;
    }
    
    public RawMessage addUrl(String text, String url, String preColor) {

	return null;
    }

    public RawMessage addItem(String text, ItemStack item, List<String> extraLore, String command, String suggestion) {

	return null;
    }

    private static String getItemEnchants(ItemStack item) {

	return null;
    }

    private static String convertLore(List<String> lore) {

	return null;
    }

    public List<String> softCombine() {

	return null;
    }

    public RawMessage combine() {

	return null;
    }

    public RawMessage combineClean() {

	return null;
    }

    public RawMessage show(Player player) {

	return null;
    }

    public int getFinalLenght() {
	String f = "";
	for (String part : parts) {
	    if (f.isEmpty())
		f = "[\"\",";
	    else
		f += ",";
	    f += part;
	}
	if (!f.isEmpty())
	    f += "]";
	return f.length();
    }

    public RawMessage show(CommandSender sender) {
	return null;
    }

    public String getRaw() {
	return null;
    }

    public String getShortRaw() {
	return null;
    }

    public void setColorizeEntireWithLast(boolean colorizeEntireWithLast) {
	this.colorizeEntireWithLast = colorizeEntireWithLast;
    }

}
