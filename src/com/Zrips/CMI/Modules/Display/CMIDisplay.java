package com.Zrips.CMI.Modules.Display;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Display.Billboard;
import org.bukkit.entity.Display.Brightness;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMINumber;

public class CMIDisplay {
    CMIDisplayTransform transform;

    private static Constructor<?> TextDisplay;
    private static Constructor<?> ItemDisplay;
    private static Constructor<?> BlockDisplay;
//    private static Class<?> Interaction;
    private static Object textDisplayEntityType;
    private static Object itemDisplayEntityType;
    private static Object blockDisplayEntityType;
//    private static Object interactionEntityType;
    private static Class<?> worldClass;
//    private static Method locMethod;
    private static Constructor<?> PacketPlayOutSpawnEntity;
    private static Constructor<?> PacketPlayOutEntityMetadata;
    private static Constructor<?> PacketPlayOutEntityDestroy;

    private static Method sendPacket;
    private static Method method1;
    private static Method method2;
    private static Field playerConnection;

    static {
      
    }

    protected Location loc;
    protected org.bukkit.entity.Display display;
    protected Object d = null;
    private int id = 0;

    public CMIDisplay(CMIDisplayType type, World world) {
       
    }


    public void setWidth(double width) {
       
    }

    public void setHeight(double height) {
      
    }

    public void setInterpolationDuration(int duration) {
        display.setInterpolationDuration(duration);
    }

    public int getInterpolationDuration() {
        return display.getInterpolationDuration();
    }

    public void setInterpolationDelay(int delay) {
        display.setInterpolationDelay(delay);
    }

    public int getInterpolationDelay() {
        return display.getInterpolationDelay();
    }

    public void setLocation(Location loc) {
//        display.teleport(loc); 
        this.loc = loc;
    }

    public float getRange() {
        return display.getViewRange();
    }

    public void setRange(int range) {
        display.setViewRange(range);
    }

    public void setBrightness(int skyValue, int blockValue) {
        display.setBrightness(new Brightness(CMINumber.clamp(skyValue, 0, 15), CMINumber.clamp(blockValue, 0, 15)));
    }

    public void setBillboard(Billboard billboard) {
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


    public void update(Player player) {
       
    }


    public void destroy(Player player) {
     
    }
}
