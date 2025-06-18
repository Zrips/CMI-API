package com.Zrips.CMI.Modules.Display;

import java.util.List;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.TextDisplay.TextAlignment;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class CMITextDisplay extends CMIDisplay {
    private org.bukkit.entity.TextDisplay td;

    public CMITextDisplay(Location loc) {
        super(CMIDisplayType.Text, loc);
    }

    public String getText() {
        return null;
    }

    public void setText(List<String> text) {
    }

    public void setText(String text) {
    }

    public int getLineWidth() {
        return 0;
    }

    public void setLineWidth(int lineWidth) {
    }

    public byte getTextOpacity() {
        return 0;
    }

    public void setTextOpacity(byte textOpacity) {
    }

    public TextAlignment getAligment() {
        return null;
    }

    public void setAligment(TextAlignment aligment) {
    }

    public void setDefaultBackground(boolean show) {
    }

    public boolean isDefaultBackground() {
        return false;
    }

    @SuppressWarnings("deprecation")
    public void setBackgroundColor(Color color) {
    }

    @SuppressWarnings("deprecation")
    public void setBackgroundColor(CMIChatColor color) {
    }

    @SuppressWarnings("deprecation")
    public Color getBackgroundColor() {
        return null;
    }

    public void setFacing(double pitchDegrees, double yawDegrees) {
    }

    public float getDisplayHeight() {
        return 0.0f;
    }

    public void setShadowed(boolean shadow) {
    }

    public boolean isShadowed() {
        return false;
    }

    public void setSeeThrough(boolean seeThrough) {
    }

    public boolean isSeeThrough() {
        return false;
    }
}
