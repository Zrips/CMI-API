package com.Zrips.CMI.Modules.CustomText;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class CText {

    private HashMap<Integer, CTextPage> pages = new HashMap<Integer, CTextPage>();
    private String name;
    private boolean autoPage = true;
    private boolean hidden = false;
    private boolean autoAlias = false;
    private boolean requirePermission = false;

    public CText(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalPages() {
        return pages.size();
    }

    public int getTotalLines() {
        int i = 0;
        for (Entry<Integer, CTextPage> one : pages.entrySet()) {
            i += one.getValue().getLines().size();
        }
        return i;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public HashMap<Integer, List<String>> getPages() {
        HashMap<Integer, List<String>> temp = new HashMap<Integer, List<String>>();
        pages.forEach((key, value) -> temp.put(key, value.getLines()));
        return temp;
    }

    public HashMap<Integer, CTextPage> getPagesMap() {
        return pages;
    }

    public CTextPage getPageInfo(int page) {
        return this.pages.get(page);
    }

    @Deprecated
    public List<String> getPage(Integer page) {
        return this.pages.get(page).getLines();
    }

    @Deprecated
    public void setPages(HashMap<Integer, List<String>> p) {
        p.forEach((key, value) -> pages.put(key, new CTextPage(value)));
    }

    public void setPagesMap(HashMap<Integer, CTextPage> pages) {
        this.pages = pages;
    }

    @Deprecated
    public void addPage(Integer page, List<String> lines) {
        this.pages.put(page, new CTextPage(lines));
    }

    public void addPage(int place, CTextPage page) {
        this.pages.put(place, page);
    }

    @Deprecated
    public void removePage(Integer page) {
        removePage((int) page);
    }

    public void removePage(int page) {
        pages.remove(page);
        HashMap<Integer, CTextPage> t = new HashMap<Integer, CTextPage>(pages);
        pages.clear();
        int i = 0;
        for (Entry<Integer, CTextPage> one : t.entrySet()) {
            i++;
            pages.put(i, one.getValue());
        }
    }

    @Deprecated
    public void removeLine(Integer pageNumber, Integer lineNr) {
        removeLine((int) pageNumber, (int) lineNr);
    }

    public void removeLine(int pageNumber, int lineNr) {
        CTextPage page = pages.get(pageNumber);
        if (page == null)
            return;
        if (page.getLines().size() < lineNr)
            return;
        page.getLines().remove(lineNr);
        this.pages.put(pageNumber, page);
    }

    @Deprecated
    public void replaceLine(Integer pageNumber, Integer lineNr, String line) {
        replaceLine((int) pageNumber, (int) lineNr, line);
    }

    public void replaceLine(int pageNumber, int lineNr, String line) {
        CTextPage page = pages.get(pageNumber);
        if (page == null)
            return;
        if (page.getLines().size() < lineNr)
            return;
        page.getLines().set(lineNr, line);
        this.pages.put(pageNumber, page);
    }

    @Deprecated
    public void addLine(Integer page, String line) {
        addLine((int) page, line);
    }

    public void addLine(int pageNumber, String line) {
        CTextPage page = pages.getOrDefault(pageNumber, new CTextPage());
        page.getLines().add(line);
        this.pages.put(pageNumber, page);
    }

    public void addPageLabel(int pageNumber, String label) {
        this.pages.put(pageNumber, pages.getOrDefault(pageNumber, new CTextPage()).setLabel(label));
    }

    public boolean isAutoPage() {
        return autoPage;
    }

    public void setAutoPage(boolean autoPage) {
        this.autoPage = autoPage;
    }

    public boolean isAutoAlias() {
        return autoAlias;
    }

    @SuppressWarnings("deprecation")
    public void setAutoAlias(boolean autoAlias, boolean save) {

    }

    public boolean isRequirePermission() {
        return requirePermission;
    }

    public void setRequirePermission(boolean requirePermission) {
        this.requirePermission = requirePermission;
    }

    public ItemStack convertToBook(Player player) {

        return null;
    }

    static final Pattern patern = Pattern.compile("((http|https|ftp|ftps)\\:\\/\\/)?[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,3}(\\/\\S*)?([^\\s|^\\)]+)");

    private static RawMessage translateRaw(CommandSender sender, RawMessage rm, String textLine, boolean book) {

        return null;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
