package com.Zrips.CMI.Modules.CustomText;

import java.util.ArrayList;
import java.util.List;

public class CTextPage {

    private String label = null;
    private List<String> lines = new ArrayList<String>();

    public CTextPage() {
    }

    public CTextPage(List<String> lines) {
        this.lines = lines;
    }

    public String getLabel() {
        return label;
    }

    public CTextPage setLabel(String label) {
        this.label = label;
        return this;
    }

    public List<String> getLines() {
        return lines;
    }

    public CTextPage setLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

}
