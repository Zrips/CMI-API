package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Images.CMIImage;
import net.Zrips.CMILib.Items.CMIAsyncHead;
import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIHologramLine {

    private CMIHoloLineType type = CMIHoloLineType.plainText;
    private String text;
    private String hoverText;
    private String command;
    private CMIItemStack item;
    private boolean itemInHand = false;
    private boolean staticText = true;
    boolean enchanted = false;
    private boolean glowing = false;
    Integer modelData = null;
    private Boolean randomU = null;
    private Float hue = null;

    private double globalY = -999D;

    private List<String> image = null;

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
        return getItem(player, null);
    }

    public CMIItemStack getItem(Player player, CMIAsyncHead ahead) {

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
        return checkText(player, text);
    }

    public String getHoverText(Player player) {
        return checkText(player, getHoverText());
    }

    private String checkText(Player player, String copy) {

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

    public List<String> getPlainImage() {
        return image;
    }

    public CompletableFuture<List<String>> getImage(Player player) {
        if (!this.staticText) {
            return CMIImage.convertLines(player, CMI.getInstance().getDataFolder().getPath(), new ArrayList<String>(Arrays.asList(text)), true);
        }
        return CompletableFuture.supplyAsync(() -> image);
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public String getHoverText() {
        return hoverText;
    }

    public void setHoverText(String hoverText) {
        this.hoverText = hoverText;
    }

    public String getCommand() {
        return command;
    }

    public double getGlobalY() {
        return globalY;
    }

    public void setGlobalY(double globalY) {
        this.globalY = globalY;
    }
}
