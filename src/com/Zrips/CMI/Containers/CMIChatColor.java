package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;

import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class CMIChatColor {

    private static final Map<Character, CMIChatColor> BY_CHAR = new HashMap<>();
    private static final Map<String, CMIChatColor> BY_NAME = new HashMap<>();
    private static final LinkedHashMap<String, CMIChatColor> CUSTOM_BY_NAME = new LinkedHashMap<>();
    private static final Map<String, CMIChatColor> CUSTOM_BY_HEX = new HashMap<>();
    private static final TreeMap<String, CMIChatColor> CUSTOM_BY_RGB = new TreeMap<>();

    static {
    }

    public static final String colorReplacerPlaceholder = "\uFF06";
    public static final String colorHexReplacerPlaceholder = "{" + colorReplacerPlaceholder + "#";

    public static final String colorFontPrefix = "{@";
    public static final String colorCodePrefix = "{#";
    public static final String colorCodeSuffix = "}";

    private static String charEscape(String s) {
	return null;
    }

    private static String escape(String text) {
	return text.replace("#", "\\#").replace("{", "\\{").replace("}", "\\}");
    }

    public static final String hexColorRegex = "(\\" + colorCodePrefix + ")([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})(\\" + colorCodeSuffix + ")";
    public static final Pattern hexColorRegexPattern = Pattern.compile(CMIChatColor.hexColorRegex);
    public static final Pattern hexColorRegexPatternLast = Pattern.compile(CMIChatColor.hexColorRegex + "(?!.*\\{#)");
    public static final Pattern hexDeColorNamePattern = Pattern.compile("((&|§)x)(((&|§)[0-9A-Fa-f]){6})");
    public static final String ColorNameRegex = "(\\" + colorCodePrefix + ")([a-zA-Z_]{3,})(\\" + colorCodeSuffix + ")";
    public static final Pattern hexColorNamePattern = Pattern.compile(CMIChatColor.ColorNameRegex);
    public static final Pattern hexColorNamePatternLast = Pattern.compile(ColorNameRegex + "(?!.*\\{#)");

    public static final String ColorFontRegex = "(\\" + colorFontPrefix + ")([a-zA-Z_]{3,})(\\" + colorCodeSuffix + ")";

    public static final Pattern gradientPattern = Pattern.compile("(\\{(#[^\\{]*?)>\\})(.*?)(\\{(#.*?)<(>?)\\})");

    public static final String hexColorDecolRegex = "(&x)(&[0-9A-Fa-f]){6}";

    public static final Pattern postGradientPattern = Pattern.compile("(" + CMIChatColor.hexColorRegex + "|" + CMIChatColor.ColorNameRegex + ")" + "(.)" + "(" + CMIChatColor.hexColorRegex + "|"
	+ CMIChatColor.ColorNameRegex + ")");
    public static final Pattern post2GradientPattern = Pattern.compile("(" + CMIChatColor.hexColorRegex + "|" + CMIChatColor.ColorNameRegex + ")" + "(.)" + "((" + CMIChatColor.hexColorRegex + "|"
	+ CMIChatColor.ColorNameRegex + ")" + "(.))+");
    public static final Pattern fullPattern = Pattern.compile("(&[0123456789abcdefklmnorABCDEFKLMNOR])|" + CMIChatColor.hexColorRegex + "|" + CMIChatColor.ColorNameRegex + "|"
	+ CMIChatColor.ColorFontRegex);

    public static final CMIChatColor BLACK = new CMIChatColor("Black", '0', 0, 0, 0);
    public static final CMIChatColor DARK_BLUE = new CMIChatColor("Dark_Blue", '1', 0, 0, 170);
    public static final CMIChatColor DARK_GREEN = new CMIChatColor("Dark_Green", '2', 0, 170, 0);
    public static final CMIChatColor DARK_AQUA = new CMIChatColor("Dark_Aqua", '3', 0, 170, 170);
    public static final CMIChatColor DARK_RED = new CMIChatColor("Dark_Red", '4', 170, 0, 0);
    public static final CMIChatColor DARK_PURPLE = new CMIChatColor("Dark_Purple", '5', 170, 0, 170);
    public static final CMIChatColor GOLD = new CMIChatColor("Gold", '6', 255, 170, 0);
    public static final CMIChatColor GRAY = new CMIChatColor("Gray", '7', 170, 170, 170);
    public static final CMIChatColor DARK_GRAY = new CMIChatColor("Dark_Gray", '8', 85, 85, 85);
    public static final CMIChatColor BLUE = new CMIChatColor("Blue", '9', 85, 85, 255);
    public static final CMIChatColor GREEN = new CMIChatColor("Green", 'a', 85, 255, 85);
    public static final CMIChatColor AQUA = new CMIChatColor("Aqua", 'b', 85, 255, 255);
    public static final CMIChatColor RED = new CMIChatColor("Red", 'c', 255, 85, 85);
    public static final CMIChatColor LIGHT_PURPLE = new CMIChatColor("Light_Purple", 'd', 255, 85, 255);
    public static final CMIChatColor YELLOW = new CMIChatColor("Yellow", 'e', 255, 255, 85);
    public static final CMIChatColor WHITE = new CMIChatColor("White", 'f', 255, 255, 255);
    public static final CMIChatColor OBFUSCATED = new CMIChatColor("Obfuscated", 'k', false);
    public static final CMIChatColor BOLD = new CMIChatColor("Bold", 'l', false);
    public static final CMIChatColor STRIKETHROUGH = new CMIChatColor("Strikethrough", 'm', false);
    public static final CMIChatColor UNDERLINE = new CMIChatColor("Underline", 'n', false);
    public static final CMIChatColor ITALIC = new CMIChatColor("Italic", 'o', false);
    public static final CMIChatColor RESET = new CMIChatColor("Reset", 'r', false, true);
    public static final CMIChatColor HEX = new CMIChatColor("Hex", 'x', false, false);

    private char c;
    private boolean color = true;
    private boolean isReset = false;
    private Pattern pattern = null;
    private int redChannel;
    private int greenChannel;
    private int blueChannel;
    private String hexCode = null;
    private String name;

    public CMIChatColor(String name, char c, int red, int green, int blue) {
	this(name, c, true, false, red, green, blue);
    }

    public CMIChatColor(String hex) {
	this(null, hex);
    }

    public CMIChatColor(String name, String hex) {
    }

    public CMIChatColor(String name, char c, Boolean color) {
	this(name, c, color, false);
    }

    public CMIChatColor(String name, char c, Boolean color, Boolean reset) {
	this(name, c, color, reset, -1, -1, -1);
    }

    public CMIChatColor(String name, char c, Boolean color, Boolean reset, int red, int green, int blue) {
    }

    public static String processGradient(String text) {
	return null;
    }

    public static String translate(String text) {
	return null;
    }

    public static String applyEqualGradient(String text, List<CMIChatColor> gradients) {
	return null;
    }

    @Deprecated
    public static String translateAlternateColorCodes(String text) {
	return translate(text);
    }

    public static String colorize(String text) {
	if (text == null)
	    return null;
	return translate(text);
    }

    public static String deColorize(String text) {
	return null;
    }

    public static List<String> deColorize(List<String> lore) {
	return null;
    }

    public static String stripColor(String text) {
	return null;
    }

    public static String stripHexColor(String message) {
	return null;
    }

    public static String getLastColors(String text) {
	return null;
    }

    public String getColorCode() {
	return null;
    }

    public String getBukkitColorCode() {
	return null;
    }

    @Override
    public String toString() {
	return getBukkitColorCode();
    }

    public char getChar() {
	return c;
    }

    public void setChar(char c) {
	this.c = c;
    }

    public boolean isColor() {
	return color;
    }

    public boolean isFormat() {
	return !color && !isReset;
    }

    public boolean isReset() {
	return isReset;
    }

    public ChatColor getColor() {
	return ChatColor.getByChar(this.getChar());
    }

    public static CMIChatColor getColor(String text) {
	return null;
    }

    public static CMIChatColor getRandomColor() {
	return null;
    }

    public Pattern getPattern() {
	return pattern;
    }

    public Color getRGBColor() {
	return null;
    }

    public String getHex() {
	return hexCode;
    }

    public String getFormatedHex() {
	return getFormatedHex(null);
    }

    public String getFormatedHex(String subSuffix) {
	return colorCodePrefix + hexCode + (subSuffix == null ? "" : subSuffix) + colorCodeSuffix;
    }

    public String getName() {
	return name;
    }

    public String getCleanName() {
	return name.replace("_", "");
    }

    public static CMIChatColor getByCustomName(String name) {
	return null;
    }

    public static CMIChatColor getByHex(String hex) {
	return null;
    }

    public static Map<String, CMIChatColor> getByName() {
	return BY_NAME;
    }

    public static Map<String, CMIChatColor> getByCustomName() {
	return CUSTOM_BY_NAME;
    }

    public static String getHexFromCoord(int x, int y) {
	return null;
    }

    public static String getHexRedGreenByPercent(int percentage, int parts) {
	return null;
    }

    public int getRed() {
	return redChannel;
    }

    public int getGreen() {
	return greenChannel;
    }

    public int getBlue() {
	return blueChannel;
    }

    public static CMIChatColor getClosest(String hex) {
	return null;
    }

    public CMIChatColor mixColors(CMIChatColor color, double percent) {
	return mixColors(this, color, percent);
    }

    public static CMIChatColor mixColors(CMIChatColor color1, CMIChatColor color2, double percent) {
	return null;
    }

}
