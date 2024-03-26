package com.Zrips.CMI.Modules.Chat;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Container.CMINumber;
import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ChatBubbleManager {
    private HashMap<UUID, CMIChatBubble> bubbles = new HashMap<UUID, CMIChatBubble>();

    private CMI plugin;

    private boolean publicMessages = true;

    private double offset = 2.5D;
    private double baseShowFor = 5;
    private double maxShowFor = 8;
    private double extraTime = 0.02;
    private double scale = 0.5;
    private boolean shadow = true;

    private int range = 32;
    private Color backgroundColor;

    private int LineWidth = 255;

    public ChatBubbleManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig(ConfigReader cfg) {

    }

    public void showBubble(Player sender, String text, Set<Player> receivers) {

    }

    public double getOffset() {
        return offset;
    }

    public double getShowFor(String text) {
        double value = baseShowFor + (text.length() * extraTime);
        return CMINumber.clamp(value, value, (int) maxShowFor);
    }

    public boolean inRange(Location loc1, Location loc2) {

        return true;
    }

    public double getScale() {
        return scale;
    }

    public int getLineWidth() {
        return LineWidth;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public boolean isShadow() {
        return shadow;
    }
}
