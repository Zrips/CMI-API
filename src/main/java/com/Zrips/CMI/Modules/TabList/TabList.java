package com.Zrips.CMI.Modules.TabList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TabList {

    private HashMap<Integer, List<String>> headerMap = new HashMap<Integer, List<String>>();
    Integer lastHeader = 1;
    private HashMap<Integer, List<String>> footerMap = new HashMap<Integer, List<String>>();
    Integer lastFooter = 1;
    private String playerNameFormat = "";

    public TabList() {
    }

    public String getPlayerNameFormat() {
	return playerNameFormat;
    }

    public void setPlayerNameFormat(String format) {
	this.playerNameFormat = format;
    }

    public void prepareNextAnimationForHeader() {
    }

    public void prepareNextAnimationForFooter() {
    }

    public List<String> getHeader() {
	return null;
    }

    @Deprecated
    public void setHeader(List<String> header) {
	headerMap.put(1, header);
    }

    public void addHeaderAnimation(List<String> header) {
	headerMap.put(headerMap.size() + 1, header);
    }

    public void addFooterAnimation(List<String> footer) {
	footerMap.put(footerMap.size() + 1, footer);
    }

    public List<String> getFooter() {
	return null;
    }

    @Deprecated
    public void setFooter(List<String> footer) {
	footerMap.put(1, footer);
    }

    public HashMap<Integer, List<String>> getHeaderMap() {
	return headerMap;
    }

    public void setHeaderMap(HashMap<Integer, List<String>> headerMap) {
	this.headerMap = headerMap;
    }

    public HashMap<Integer, List<String>> getFooterMap() {
	return footerMap;
    }

    public void setFooterMap(HashMap<Integer, List<String>> footerMap) {
	this.footerMap = footerMap;
    }

}
