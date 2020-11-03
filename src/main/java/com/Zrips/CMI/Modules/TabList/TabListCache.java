package com.Zrips.CMI.Modules.TabList;

import java.util.Arrays;
import java.util.List;

import org.bukkit.entity.Player;

public class TabListCache {

    private List<String> header = Arrays.asList("");
    private List<String> footer = Arrays.asList("");
    private String playerNameFormat = "";
    private Player player;
    private TabList tl;
    
    public TabListCache(Player player, TabList tl) {
	this.player = player;
	this.tl = tl;
    }

    public List<String> getHeader() {
	return header;
    }

    public void setHeader(List<String> header) {
	this.header = header;
    }

    public String getPlayerNameFormat() {
	return playerNameFormat;
    }

    public void setPlayerNameFormat(String playerNameFormat) {
	this.playerNameFormat = playerNameFormat;
    }

    public List<String> getFooter() {
	return footer;
    }

    public void setFooter(List<String> footer) {
	this.footer = footer;
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public TabList getTl() {
	return tl;
    }

    public void setTl(TabList tl) {
	this.tl = tl;
    }

}
