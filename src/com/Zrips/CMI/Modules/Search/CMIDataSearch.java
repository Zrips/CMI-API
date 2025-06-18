package com.Zrips.CMI.Modules.Search;

import java.util.List;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.Containers.CMIFileAppender;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIDataSearch {
    protected List<SearchTypeBase> searchingFor;
    private CommandSender sender;
    boolean purge;
    protected CMITask task;
    protected long totalToCheck;
    private int totalChecked;
    protected double searchSpeed;
    protected int totalFound;
    protected long lastInformed;
    protected CMIFileAppender appender;

    public CMIDataSearch(CommandSender sender) {
    }

    public CommandSender getInitiator() {
        return null;
    }

    public List<SearchTypeBase> getSearchingFor() {
        return null;
    }

    public long getTotalToCheck() {
        return 0;
    }

    protected void addChecked() {
    }

    public int getTotalChecked() {
        return 0;
    }

    public void addSearchingFor(SearchTypeBase searchingFor) {
    }

    public boolean isPurge() {
        return false;
    }

    public void setPurge(boolean state) {
    }

    public void onCycle(int cyclesDone) {
    }

    public void onFinish() {
    }

    public int getTotalFound() {
        return 0;
    }

    public boolean isRunning() {
        return false;
    }

    protected void createFileAppender(String prefix) {
    }

    public void search() {
    }

    protected void initSearch() {
    }

    public void cancel() {
    }
}
