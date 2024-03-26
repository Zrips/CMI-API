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
        return td.getText();
    }

    public void setText(String text) {

    }

    public void setText(List<String> text) {
     
    }

    public int getLineWidth() {
        return td.getLineWidth();
    }

    public void setLineWidth(int lineWidth) {

    }

    public byte getTextOpacity() {
        return td.getTextOpacity();
    }

    public void setTextOpacity(byte textOpacity) {

    }

    public TextAlignment getAligment() {
        return td.getAlignment();
    }

    public void setAligment(TextAlignment aligment) {

    }

    public void setDefaultBackground(boolean show) {

    }

    public boolean isDefaultBackground() {
        return this.td.isDefaultBackground();
    }

    @SuppressWarnings("deprecation")
    public void setBackgroundColor(Color color) {

    }

    @SuppressWarnings("deprecation")
    public void setBackgroundColor(CMIChatColor color) {

    }

    @SuppressWarnings("deprecation")
    public Color getBackgroundColor() {
        return this.td.getBackgroundColor();
    }

    public void setFacing(double pitchDegrees, double yawDegrees) {

    }

    public float getDisplayHeight() {
        return td.getDisplayHeight();
    }

    public void setShadowed(boolean shadow) {

    }

    public boolean isShadowed() {
        return td.isShadowed();
    }

    public void setSeeThrough(boolean seeThrough) {

    }

    public boolean isSeeThrough() {
        return td.isSeeThrough();
    }

}
