package com.Zrips.CMI.Modules.Particl;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class CMIPECircle extends CMIPEAnimation {
    private double MaxMoveDistance;
    int lastPos;
    private boolean circling;
    private int times;
    private Vector move;
    private Double moveMulty;
    private double radiusChange;
    private double radius;
    private double maxRadius;
    private boolean followPitch;
    private boolean followYaw;
    private double pitch;
    private double pitchAdjust;
    private double yaw;
    private double yawAdjust;
    private boolean raindbowColorStatic;
    private boolean raindbowColor;
    private boolean raindbowColorFromStart;
    private short startingAngle;

    public CMIPECircle() {
    }

    public CMIPECircle(CMIEffect effect) {
    }

    @Deprecated
    public CMIPECircle(CMIParticle effect) {
    }

    @Override
    public boolean render(List<Player> players) {
        return false;
    }

    private List<Location> getLocations(Location location, double radius, double yaw, double pitch) {
        return null;
    }

    private static Vector rotateX(Vector v, double a) {
        return null;
    }

    private static Vector rotateY(Vector v, double a) {
        return null;
    }

    public double xPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public double yPosYaw(double time, double radius) {
        return 0.0;
    }

    public double zPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public boolean isRotating() {
        return false;
    }

    public void setRotating(boolean circling) {
    }

    public int getTimes() {
        return 0;
    }

    public void setTimes(int times) {
    }

    public Vector getMove() {
        return null;
    }

    public void setMove(Vector move) {
    }

    public double getRadius() {
        return 0.0;
    }

    public void setRadius(double radius) {
    }

    public double getRadiusChange() {
        return 0.0;
    }

    public void setRadiusChange(double radiusChange) {
    }

    public boolean isFollowDirection() {
        return false;
    }

    public void setFollowDirection(boolean followDirection) {
    }

    public double getMaxRadius() {
        return 0.0;
    }

    public void setMaxRadius(double maxRadius) {
    }

    public double getMaxMoveDistance() {
        return 0.0;
    }

    public void setMaxMoveDistance(double MaxMoveDistance) {
    }

    public double getPitchAdjust() {
        return 0.0;
    }

    public void setPitchAdjust(double pitchAdjust) {
    }

    public double getPitch() {
        return 0.0;
    }

    public void setPitch(double pitch) {
    }

    public double getYaw() {
        return 0.0;
    }

    public void setYaw(double yaw) {
    }

    public double getYawAdjust() {
        return 0.0;
    }

    public void setYawAdjust(double yawAdjust) {
    }

    public boolean isRaindbowColorStatic() {
        return false;
    }

    public void setRaindbowColorStatic(boolean raindbowColorStatic) {
    }

    public boolean isRaindbowColor() {
        return false;
    }

    public void setRaindbowColor(boolean raindbowColor) {
    }

    public boolean isRaindbowColorFromStart() {
        return false;
    }

    public void setRaindbowColorFromStart(boolean raindbowColorFromStart) {
    }

    public Double getMoveMulty() {
        return null;
    }

    public void setMoveMulty(Double moveMulty) {
    }

    public short getStartingAngle() {
        return 0;
    }

    public void setStartingAngle(short startingAngle) {
    }

    public boolean isFollowPitch() {
        return false;
    }

    public void setFollowPitch(boolean followPitch) {
    }

    public boolean isFollowYaw() {
        return false;
    }

    public void setFollowYaw(boolean followYaw) {
    }
}
