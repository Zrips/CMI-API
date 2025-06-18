package com.Zrips.CMI.Modules.CustomText;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class CText {
    private HashMap<Integer, CTextPage> pages;
    private String name;
    private boolean autoPage;
    private boolean hidden;
    private boolean autoAlias;
    private boolean requirePermission;
    private String path;
    static final Pattern patern = null;

    public CText(String name) {
    }

    public String getName() {
        return null;
    }

    public int getTotalPages() {
        return 0;
    }

    public int getTotalLines() {
        return 0;
    }

    public void setName(String name) {
    }

    @Deprecated
    public HashMap<Integer, List<String>> getPages() {
        return null;
    }

    public HashMap<Integer, CTextPage> getPagesMap() {
        return null;
    }

    public CTextPage getPageInfo(int page) {
        return null;
    }

    @Deprecated
    public List<String> getPage(Integer page) {
        return null;
    }

    @Deprecated
    public void setPages(HashMap<Integer, List<String>> p) {
    }

    public void setPagesMap(HashMap<Integer, CTextPage> pages) {
    }

    @Deprecated
    public void addPage(Integer page, List<String> lines) {
    }

    public void addPage(int place, CTextPage page) {
    }

    @Deprecated
    public void removePage(Integer page) {
    }

    public void removePage(int page) {
    }

    @Deprecated
    public void removeLine(Integer pageNumber, Integer lineNr) {
    }

    public void removeLine(int pageNumber, int lineNr) {
    }

    @Deprecated
    public void replaceLine(Integer pageNumber, Integer lineNr, String line) {
    }

    public void replaceLine(int pageNumber, int lineNr, String line) {
    }

    @Deprecated
    public void addLine(Integer page, String line) {
    }

    public void addLine(int pageNumber, String line) {
    }

    public void addPageLabel(int pageNumber, String label) {
    }

    public boolean isAutoPage() {
        return false;
    }

    public void setAutoPage(boolean autoPage) {
    }

    public boolean isAutoAlias() {
        return false;
    }

    @SuppressWarnings("deprecation")
    public void setAutoAlias(boolean autoAlias, boolean save) {
    }

    public boolean isRequirePermission() {
        return false;
    }

    public void setRequirePermission(boolean requirePermission) {
    }

    public ItemStack convertToBook(Player player) {
        return null;
    }

    private static RawMessage translateRaw(CommandSender sender, RawMessage rm, String textLine, boolean book) {
        return null;
    }

    public boolean isHidden() {
        return false;
    }

    public void setHidden(boolean hidden) {
    }

    public String getPath() {
        return null;
    }

    public void setPath(String path) {
    }

    public class bookPage {
        private boolean json;
        private String lines;

        public bookPage(String lines) {
        }

        public bookPage(boolean json, String lines) {
        }

        public boolean isJson() {
            return false;
        }

        public void setJson(boolean json) {
        }

        public String getLines() {
            return null;
        }

        public void setLines(String lines) {
        }
    }
}
