package com.Zrips.CMI.Containers;

public class PageInfo {

    private int totalEntries = 0;
    private int totalPages = 0;
    private int start = 0;
    private int end = 0;
    private int currentPage = 0;

    private int currentEntry = 0;

    private int perPage = 6;

    public PageInfo(int perPage, int totalEntries, int currentPage) {
    }

    public int getPositionForOutput() {
	return currentEntry;
    }

    public int getPositionForOutput(int place) {
	return this.start + place + 1;
    }

    private void calculate() {
    }

    public boolean isInRange(int place) {
	if (place >= start && place <= end)
	    return true;
	return false;
    }

    public boolean isEntryOk() {
	return true;
    }

    public boolean isBreak() {
	return currentEntry - 1 > end;
    }

    public boolean isPageOk() {
	return isPageOk(this.currentPage);
    }

    public boolean isPageOk(int page) {
	return true;
    }

    public int getStart() {
	return start;
    }

    public int getEnd() {
	return end;
    }

    public int getTotalPages() {
	return totalPages;
    }

    public int getCurrentPage() {
	return currentPage;
    }

    public int getTotalEntries() {
	return totalEntries;
    }
}
