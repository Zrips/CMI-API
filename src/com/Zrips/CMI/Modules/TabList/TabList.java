package com.Zrips.CMI.Modules.TabList;

import java.util.HashMap;
import java.util.List;

public class TabList {
    private HashMap<Integer, List<String>> headerMap;
    Integer lastHeader;
    private HashMap<Integer, List<String>> footerMap;
    Integer lastFooter;
    private String playerNameFormat;

    public TabList() {
    }

    public String getPlayerNameFormat() {
        return null;
    }

    public void setPlayerNameFormat(String format) {
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
    }

    public void addHeaderAnimation(List<String> header) {
    }

    public void addFooterAnimation(List<String> footer) {
    }

    public List<String> getFooter() {
        return null;
    }

    @Deprecated
    public void setFooter(List<String> footer) {
    }

    public HashMap<Integer, List<String>> getHeaderMap() {
        return null;
    }

    public void setHeaderMap(HashMap<Integer, List<String>> headerMap) {
    }

    public HashMap<Integer, List<String>> getFooterMap() {
        return null;
    }

    public void setFooterMap(HashMap<Integer, List<String>> footerMap) {
    }
}
