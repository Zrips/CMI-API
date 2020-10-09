package com.Zrips.CMI.Modules.BossBar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Logs.CMIDebug;

public class BossBarInfo {
    private CMIUser user;
    private Double percentage = null;
    private Double adjustPerc = null;
    private Integer keepFor = 60;
    private Integer auto = null;
    private BossBar bar;
    private BarColor startingColor = null;
    private BarStyle style = null;
    private Integer autoId = null;
    private Integer id = null;
    private String nameOfBar;
    private String titleOfBar = "Title";
    private boolean withPlaceholder = false;
    private List<String> cmds = null;
    private boolean global = false;
    private boolean makeVisible = false;
    private long started = 0L;

    public BossBarInfo clone(CMIUser user) {
	return null;
    }

    public BossBarInfo(String nameOfBar) {
	this(null, nameOfBar, null);
    }

    public BossBarInfo(CMIUser user, String nameOfBar) {
	this(user, nameOfBar, null);
    }

    public BossBarInfo(CMIUser user, String nameOfBar, BossBar bar) {
    }

    public void setHideId(Integer id) {
//	cancelHideScheduler();
	this.id = id;
    }

    public synchronized void cancelAutoScheduler() {
    }

    public synchronized void cancelHideScheduler() {
    }

    public void remove() {
    }

    public CMIUser getUser() {
	return this.user;
    }

    public BossBar getBar() {
	return this.bar;
    }

    public Double getPercentage() {
	return null;
    }

    public void setPercentage(Double max, Double current) {
    }

    public void setPercentage(Double percentage) {
    }

    public String getNameOfBar() {
	if (nameOfBar == null)
	    nameOfBar = "CmiBossbar" + (new Random().nextInt(Integer.MAX_VALUE));
	return nameOfBar;
    }

    public void setNameOfBar(String nameOfBar) {
	this.nameOfBar = nameOfBar;
    }

    public Integer getKeepFor() {
	return keepFor == null ? 30 : keepFor;
    }

    public void setKeepForTicks(Integer keepFor) {
	if (keepFor != null)
	    this.keepFor = keepFor;
    }

    public String getTitleOfBarClean() {
	return titleOfBar == null ? "" : titleOfBar;
    }

    public String getTitleOfBar() {
	return null;
    }

    public String getTitleOfBar(Player player) {
	return null;
    }

    public long getLeftDuration() {
	return 0l;
    }

    public void setTitleOfBar(String titleOfBar) {
    }

    public void setBar(BossBar bar) {
	this.bar = bar;
    }

    public BarColor getColor() {
	return startingColor;
    }

    public void setColor(BarColor startingColor) {
//	if (startingColor == null)
//	    startingColor = BarColor.GREEN;
	this.startingColor = startingColor;
    }

    public Double getAdjustPerc() {
	return adjustPerc;
    }

    public void setAdjustPerc(Double adjustPerc) {
	this.adjustPerc = adjustPerc;
    }

    public BarStyle getStyle() {
	return style;
    }

    public void setStyle(BarStyle style) {
	this.style = style;
    }

    public void setUser(CMIUser user) {
	this.user = user;
    }

    public Integer getHideId() {
	return id;
    }

    public Integer getAuto() {
	return auto == null ? 20 : auto;
    }

    public void setAuto(Integer auto) {
	this.auto = auto;
    }

    public Integer getAutoId() {
	return autoId;
    }

    public void setAutoId(Integer autoId) {
	this.autoId = autoId;
    }

    public List<String> getCommands() {
	return cmds;
    }

    public List<String> getCommands(Player player) {
	return null;
    }

    public void setCmds(List<String> cmds) {
	this.cmds = cmds;
    }

    public boolean stillRunning() {
	return false;
    }

    public boolean isGlobal() {
	return global;
    }

    public void setGlobal(boolean global) {
	this.global = global;
    }

    public boolean isMakeVisible() {
	return makeVisible;
    }

    public void setMakeVisible(boolean makeVisible) {
	this.makeVisible = makeVisible;
    }

    public long getStarted() {
	return started;
    }

    public void setStarted(long started) {
	this.started = started;
    }

    public void setSeconds(int time) {
    }

    public boolean isWithPlaceholder() {
	return withPlaceholder;
    }
}
