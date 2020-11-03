package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIBlock;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class CMISign {

//    private String name;

    private CuboidArea area;

    private String[] lines = new String[0];
    private Sign sign;

    private int updateIntervalSec = 5;
    private Long lastUpdate = 0L;
    private boolean personal = true;

    private int activationRange = 8;

    private int currentLine = 0;

    private CMILocation loc;

    public CMISign(CMILocation loc) {
	this.loc = loc;
    }

    public World getWorld() {
	return loc.getWorld();
    }

    public CMILocation getLoc() {
	return loc;
    }

    public String[] getLines() {
	return lines;
    }

    public String getLine(int place) {
	return null;
    }

    public List<String> getLinesAsList() {
	return null;
    }

    public void setLines(List<String> l) {
    }

    public void setLines(String[] lines) {
    }

    public CuboidArea getArea() {

	return null;
    }

    public void setArea(CuboidArea area) {
	this.area = area;
    }

    public Sign getSign() {
	return null;
    }

    public void setSign(Sign sign) {
	this.sign = sign;
    }

    public boolean isTimeToUpdate() {
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
