package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.List;

public class CMIHologramPage {

    private int page = -1;
    private List<CMIHologramLine> lines = new ArrayList<CMIHologramLine>();
    private List<String> commands = new ArrayList<String>();

    public CMIHologramPage() {
    }

    public List<CMIHologramLine> getLines() {
	return lines;
    }

    public void setLines(List<CMIHologramLine> lines) {
	this.lines = lines;
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

}
