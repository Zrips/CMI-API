package com.Zrips.CMI.Modules.TabList;

import java.util.Arrays;
import java.util.List;

public class TabList {

    private List<String> header = Arrays.asList("");
    private  List<String> footer = Arrays.asList("");
    private String playerNameFormat = "";
    
    public TabList() {
    }

    public String getPlayerNameFormat() {
	return playerNameFormat;
    }

    public void setPlayerNameFormat(String format) {
	this.playerNameFormat = format;
    }

    public List<String> getHeader() {
	return header;
    }

    public void setHeader(List<String> header) {
	this.header = header;
    }

    public List<String> getFooter() {
	return footer;
    }

    public void setFooter(List<String> footer) {
	this.footer = footer;
    }

}
