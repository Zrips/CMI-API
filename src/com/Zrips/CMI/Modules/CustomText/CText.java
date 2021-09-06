package com.Zrips.CMI.Modules.CustomText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.Snd;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class CText {

    private HashMap<Integer, List<String>> pages = new HashMap<Integer, List<String>>();
    private String name;
    private boolean autoPage = true;
    private boolean autoAlias = true;
    private boolean requirePermission = false;

    public CText(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public int getTotalPages() {
	return pages.size();
    }

    public int getTotalLines() {
	int i = 0;
	for (Entry<Integer, List<String>> one : pages.entrySet()) {
	    i += one.getValue().size();
	}
	return i;
    }

    public void setName(String name) {
	this.name = name;
    }

    public HashMap<Integer, List<String>> getPages() {
	return pages;
    }

    public List<String> getPage(Integer page) {
	return this.pages.get(page);
    }

    public void setPages(HashMap<Integer, List<String>> pages) {
	this.pages = pages;
    }

    public void addPage(Integer page, List<String> lines) {
	this.pages.put(page, lines);
    }

    public void removePage(int page) {
    }

    public void removeLine(Integer page, int lineNr) {

    }

    public void replaceLine(Integer page, Integer lineNr, String line) {

    }

    public void addLine(Integer page, String line) {

    }

    public boolean isAutoPage() {
	return autoPage;
    }

    public void setAutoPage(boolean autoPage) {
	this.autoPage = autoPage;
    }

    public boolean isAutoAlias() {
	return autoAlias;
    }

    public void setAutoAlias(boolean autoAlias, boolean save) {

    }

    public boolean isRequirePermission() {
	return requirePermission;
    }

    public void setRequirePermission(boolean requirePermission) {
	this.requirePermission = requirePermission;
    }

    public ItemStack convertToBook(Player player) {

	return null;
    }
}
