package com.Zrips.CMI.Modules.RawMessages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class RawMessage {

    List<String> parts = new ArrayList<String>();
    List<String> onlyText = new ArrayList<String>();

    LinkedHashMap<RawMessagePartType, String> temp = new LinkedHashMap<RawMessagePartType, String>();

    RawMessageFragment fragment = new RawMessageFragment();
    RawMessageFragment hoverFragment = new RawMessageFragment();

    private RawMessageFragment frozenFragment = new RawMessageFragment();
    private boolean freezeFormat = false;

    private String combined = "";
    String combinedClean = "";

    private boolean dontBreakLine = false;

    public void clear() {
    }

    private String textIntoJson(String text, boolean hover) {
	
	return null;
    }

    @Deprecated
    public RawMessage add(String text, String hoverText, String command, String suggestion, String url) {
	return null;
    }

    @Deprecated
    public RawMessage add(String text, String hoverText, String command, String suggestion, String url, String insertion) {
	return null;
    }

    @Deprecated
    public RawMessage addUrl(String text, String url) {
	return null;
    }

    @Deprecated
    public RawMessage addUrl(String text, String url, String hoverText) {
	return null;
    }

    @Deprecated
    public RawMessage add(String text) {
	return add(text, null, null, null, null);
    }

    @Deprecated
    public RawMessage add(String text, String hoverText) {
	return add(text, hoverText, null, null, null);
    }

    @Deprecated
    public RawMessage add(String text, List<String> hoverText) {
	return null;
    }

    @Deprecated
    public RawMessage add(String text, String hoverText, RawMessageCommand rmc) {
	return add(text, hoverText, rmc.getCommand(), null, null);
    }

    @Deprecated
    public RawMessage add(String text, String hoverText, String command) {
	return add(text, hoverText, command, null, null);
    }

    @Deprecated
    public RawMessage add(String text, String hoverText, String command, String suggestion) {
	return add(text, hoverText, command, suggestion, null);
    }

    @Deprecated
    public RawMessage addHoverText(List<String> hoverText) {
	return addHover(hoverText);
    }

    @Deprecated
    public RawMessage addHoverText(String hover) {
	return addHover(hover);
    }

    public RawMessage addItem(String text, ItemStack item, String command, String suggestion, String insertion) {
	return null;
    }

    public RawMessage addText(String text) {
	return null;
    }

    public RawMessage addHover(List<String> hoverText) {
	return null;
    }

    public RawMessage addHover(String hover) {
	return null;
    }

    public RawMessage addCommand(String command) {
	return null;
    }

    public RawMessage addSuggestion(String suggestion) {
	return null;
    }

    public RawMessage addInsertion(String insertion) {
	return null;
    }

    public RawMessage addItem(ItemStack item) {
	return null;
    }

    public RawMessage addUrl(String url) {
	return null;
    }

    public RawMessage build() {
	return null;
    }

    private static String escape(String s, boolean escapeNewLn) {
	return null;
    }

    private static final String nl = "\u00A5n";

    private static void escape(String s, StringBuffer sb) {
	
    }

    public List<String> softCombine() {
	return null;
    }

    private RawMessage combine() {
	return null;
    }

    public RawMessage combineClean() {
	return null;
    }

    public RawMessage show(Player player) {
	return show(player, true);
    }

    public RawMessage show(Player player, boolean softCombined) {
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

    public void setCombined(String combined) {
	this.combined = combined;
    }

    public String getShortRaw() {
	return null;
    }

    public boolean isDontBreakLine() {
	return dontBreakLine;
    }

    public void setDontBreakLine(boolean dontBreakLine) {
	this.dontBreakLine = dontBreakLine;
    }

    public boolean isFormatFrozen() {
	return freezeFormat;
    }

    public void freezeFormat() {
	frozenFragment = new RawMessageFragment(fragment);
	this.freezeFormat = true;
    }

    public void unFreezeFormat() {
	fragment = new RawMessageFragment(frozenFragment);
	this.freezeFormat = false;
    }
}
