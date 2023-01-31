package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.List;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class CMIHologramPage {

    private int page = -1;
    private List<CMIHologramLine> lines = new ArrayList<CMIHologramLine>();
    private List<String> commands = new ArrayList<String>();
    private double height = 0D;
    private int width = 0;

    public CMIHologramPage() {
    }

    public List<CMIHologramLine> getLines() {
        return lines;
    }

    public void setLines(List<CMIHologramLine> lines) {
        this.lines = lines;
        calculateWidth();
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculateWidth() {

    }

}
