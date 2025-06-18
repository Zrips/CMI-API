package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Items.CMIAsyncHead;
import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIHologramLine {
    private CMIHoloLineType type;
    private String text;
    private String hoverText;
    private String command;
    private CMIItemStack item;
    private boolean itemInHand;
    private boolean staticText;
    boolean enchanted;
    private boolean glowing;
    Integer modelData;
    private Boolean randomU;
    private Float hue;
    private double globalY;
    private List<String> image;
    private static final String regex = null;
    private static final Pattern pattern = null;

    @Override
    public CMIHologramLine clone() {
        return null;
    }

    public CMIHologramLine(String text) {
    }

    public CMIHologramLine() {
    }

    private void recheck() {
    }

    public CMIItemStack getItem(Player player) {
        return null;
    }

    public CMIItemStack getItem(Player player, CMIAsyncHead ahead) {
        return null;
    }

    public boolean isStaticText() {
        return false;
    }

    public void setStaticText(boolean staticText) {
    }

    public boolean isItemInHand() {
        return false;
    }

    public void setItemInHand(boolean itemInHand) {
    }

    public String getText() {
        return null;
    }

    public String getText(Player player) {
        return null;
    }

    public String getHoverText(Player player) {
        return null;
    }

    private String checkText(Player player, String copy) {
        return null;
    }

    public CMIItemStack getItem() {
        return null;
    }

    public void setItem(CMIItemStack item) {
    }

    public CMIHoloLineType getType() {
        return null;
    }

    public boolean isIcon() {
        return false;
    }

    public void setType(CMIHoloLineType type) {
    }

    public Boolean isRandomU() {
        return null;
    }

    public boolean isGlowing() {
        return false;
    }

    public void setGlowing(boolean glowing) {
    }

    public List<String> getPlainImage() {
        return null;
    }

    public CompletableFuture<List<String>> getImage(Player player) {
        return null;
    }

    public void setImage(List<String> image) {
    }

    public String getHoverText() {
        return null;
    }

    public void setHoverText(String hoverText) {
    }

    public String getCommand() {
        return null;
    }

    public double getGlobalY() {
        return 0.0;
    }

    public void setGlobalY(double globalY) {
    }
}
