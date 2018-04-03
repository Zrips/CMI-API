package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIBlock;
import com.Zrips.CMI.Modules.Portals.CuboidArea;
import com.Zrips.CMI.utils.Util.CMIChatColor;

public class CMISign {

    private CuboidArea area;

    private String[] lines = new String[0];
    private Sign sign;

    private int updateIntervalSec = 5;
    private Long lastUpdate = 0L;
    private boolean personal = true;

    private int activationRange = 8;

    private int currentLine = 0;

    public CMISign(Sign sign) {
	this.sign = sign;
    }

    public World getWorld() {
	return sign.getWorld();
    }

    public Location getLoc() {
	return sign == null ? null : sign.getLocation();
    }

    public String[] getLines() {
	return lines;
    }

    public String getLine(int place) {
	return lines.length - 1 < place || place < 0 ? "" : lines[place] == null ? "" : lines[place];
    }

    public List<String> getLinesAsList() {
	List<String> ls = new ArrayList<String>();
	return ls;
    }

    public void setLines(List<String> l) {
    }

    public void setLines(String[] lines) {
    }

    public CuboidArea getArea() {
	return area;
    }

    public void setArea(CuboidArea area) {
	this.area = area;
    }

    public Sign getSign() {
	return sign;
    }

    public void setSign(Sign sign) {
	this.sign = sign;
    }

    public boolean isTimeToUpdate() {
	if (this.lastUpdate + (this.updateIntervalSec * 1000) > System.currentTimeMillis())
	    return false;
	return true;
    }

    public void setAsUpdated() {
	this.lastUpdate = System.currentTimeMillis();
    }

    public void update() {
	update(null);
    }

    public void update(final Player player) {
    }

    public int getUpdateIntervalSec() {
	return updateIntervalSec;
    }

    public void setUpdateIntervalSec(int updateIntervalSec) {
    }

    public boolean isPersonal() {
	return personal;
    }

    public void setPersonal(boolean personal) {
	this.personal = personal;
    }

    public int getActivationRange() {
	return activationRange;
    }

    public void setActivationRange(int activationRange) {
    }

    public void updateCurrentLine() {
    }

}
