package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Container.CMILocation;

public class CMISign {

//    private String name;

    private CuboidArea area;

    private List<String> lines = new ArrayList<String>();
    private Sign sign;

    private double updateIntervalSec = 5;
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

    public List<String> getLines() {
        return lines;
    }

    public String getLine(int place) {
        return lines.size() - 1 < place || place < 0 ? "" : lines.get(place) == null ? "" : lines.get(place);
    }

    public List<String> getLinesAsList() {
        List<String> ls = new ArrayList<String>();
        for (String one : lines) {
            ls.add(one);
        }
        return ls;
    }

    public void setLines(List<String> l) {
        this.lines = l;
    }

    public void setLines(String[] lines) {
        this.lines = Arrays.asList(lines);
    }

    public CuboidArea getArea() {

        return null;
    }

    public void setArea(CuboidArea area) {
        this.area = area;
    }

    public Sign getSign() {
        if (sign == null) {
            Block block = loc.getBlock();
            if (!(block.getState() instanceof Sign)) {
                return sign;
            }
            sign = (Sign) block.getState();
        }
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public boolean isTimeToUpdate() {
        return this.lastUpdate + (this.updateIntervalSec * 1000L) - 10L <= System.currentTimeMillis();
    }

    public void setAsUpdated() {
        this.lastUpdate = System.currentTimeMillis();
    }

    public void update() {
        update(null);
    }

    public void update(final Player player) {

    }

    public double getUpdateIntervalSec() {
        return updateIntervalSec;
    }

    public void setUpdateIntervalSec(double updateIntervalSec) {
        this.updateIntervalSec = updateIntervalSec;
        if (this.updateIntervalSec < 0)
            this.updateIntervalSec = 0;
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
        this.activationRange = activationRange;
        if (this.activationRange < 1)
            this.activationRange = 1;
    }

    public void updateCurrentLine() {
        if (lines.size() > 4) {
            currentLine++;
        }
        if (currentLine >= lines.size())
            currentLine = 0;
        if (lines.size() <= 4)
            currentLine = 0;
    }

}
