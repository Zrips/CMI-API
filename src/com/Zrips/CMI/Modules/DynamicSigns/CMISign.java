package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Container.CMILocation;

public class CMISign {
    private CuboidArea area;
    private List<String> lines;
    private Sign sign;
    private double updateIntervalSec;
    private Long lastUpdate;
    private boolean personal;
    private int activationRange;
    private int currentLine;
    private CMILocation loc;

    public CMISign(CMILocation loc) {
    }

    public World getWorld() {
        return null;
    }

    public CMILocation getLoc() {
        return null;
    }

    public List<String> getLines() {
        return null;
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

    public CuboidArea getBasicArea() {
        return null;
    }

    public CompletableFuture<CuboidArea> getArea() {
        return null;
    }

    public void setArea(CuboidArea area) {
    }

    public Sign getSign() {
        return null;
    }

    public void setSign(Sign sign) {
    }

    public boolean isTimeToUpdate() {
        return false;
    }

    public void setAsUpdated() {
    }

    public void update() {
    }

    public void update(Player player) {
    }

    public double getUpdateIntervalSec() {
        return 0.0;
    }

    public void setUpdateIntervalSec(double updateIntervalSec) {
    }

    public boolean isPersonal() {
        return false;
    }

    public void setPersonal(boolean personal) {
    }

    public int getActivationRange() {
        return 0;
    }

    public void setActivationRange(int activationRange) {
    }

    public void updateCurrentLine() {
    }
}
