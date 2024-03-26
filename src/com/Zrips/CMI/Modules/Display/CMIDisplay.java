package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.entity.Display.Billboard;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class CMIDisplay {
    CMIDisplayTransform transform;

    static {

    }

    protected Location loc;
    protected org.bukkit.entity.Display display;
    protected Object d = null;
    private int id = 0;
    private CMIDisplayType type;

    public CMIDisplay(CMIDisplayType type, Location loc) {

    }

    public void setWidth(double width) {

    }

    public void setHeight(double height) {

    }

    public void setInterpolationDuration(int duration) {
        if (Version.isFolia()) {
            CMIScheduler.runAtLocation(getLocation(), () -> setInterpolationDuration(duration));
        } else
            display.setInterpolationDuration(duration);
    }

    public int getInterpolationDuration() {
        return display.getInterpolationDuration();
    }

    public void setInterpolationDelay(int delay) {

    }

    public int getInterpolationDelay() {
        return display.getInterpolationDelay();
    }

    public void setLocation(Location loc) {
        this.loc = loc;
    }

    public float getRange() {
        return display.getViewRange();
    }

    public void setRange(int range) {

    }

    public void setBrightness(int skyValue, int blockValue) {

    }

    public void setBillboard(Billboard billboard) {
        if (Version.isFolia()) {
            CMIScheduler.runAtLocation(getLocation(), () -> display.setBillboard(billboard));
        } else
            display.setBillboard(billboard);
    }

    public Billboard getBillboard() {
        return display.getBillboard();
    }

    public Location getLocation() {
        return loc;
    }

    public Object getDisplay() {
        return d;
    }

    private static void sendPacket(Object connection, Object packet) {

    }

    public void show(Player player) {

    }

    private void show(Player player, net.minecraft.world.entity.Entity ent) {

    }

    public void update(Player player) {

    }

    private void update(Player player, net.minecraft.world.entity.Entity ent) {

    }

    public void destroy(Player player) {

    }

    public int getId() {
        return id;
    }
}
