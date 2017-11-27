package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.Zrips.CMI.CMI;

public class CMIBook {

    ItemStack item;

    HashMap<Integer, List<String>> content = new HashMap<Integer, List<String>>();

    public CMIBook() {
	this.item = new ItemStack(Material.WRITTEN_BOOK);
    }

    public ItemStack getItemStack(){

	return null;
    }
    
    public boolean hasAuthor() {
	BookMeta bm = (BookMeta) item.getItemMeta();
	return bm.hasAuthor();
    }

    public boolean hasTitle() {
	BookMeta bm = (BookMeta) item.getItemMeta();
	return bm.hasTitle();
    }

    public CMIBook setTitle(String text) {
	return null;
    }

    public CMIBook setAuthor(String text) {
	return null;
    }

    public CMIBook addNewPage() {
	return null;
    }

    public CMIBook addLine(String text) {

	return null;
    }

    private static String linesToString(List<String> lines, boolean clean) {

	return null;
    }

    public void showFake(CommandSender sender) {
    }

}
