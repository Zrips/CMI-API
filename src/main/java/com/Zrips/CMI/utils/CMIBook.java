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
import com.Zrips.CMI.Containers.CMIChatColor;

public class CMIBook {

    ItemStack item;

    HashMap<Integer, List<String>> content = new HashMap<Integer, List<String>>();

    public CMIBook() {
	this.item = new ItemStack(Material.WRITTEN_BOOK);
    }

    public ItemStack getItemStack() {
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
	BookMeta bm = (BookMeta) item.getItemMeta();
	bm.setTitle(text);
	item.setItemMeta(bm);
	return this;
    }

    public CMIBook setAuthor(String text) {
	BookMeta bm = (BookMeta) item.getItemMeta();
	bm.setAuthor(text);
	item.setItemMeta(bm);
	return this;
    }

    public CMIBook addNewPage() {
	int page = content.size() + 1;
	List<String> lines = new ArrayList<String>();
	content.put(page, lines);
	return this;
    }

    public CMIBook addLine(String text) {
	return this;
    }

    private static String linesToString(List<String> lines, boolean clean) {
	return null;
    }

}
