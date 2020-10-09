package com.Zrips.CMI.Modules.Particl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Particl.CMIEffectManager.CMIParticle;

public class CMIPECircle extends CMIPEAnimation {

    private double MaxMoveDistance = 2D;
    int lastPos = 0;
    private boolean circling = false;
    private int times = -1;
    private Vector move;
    private Double moveMulty = null;
    private double radiusChange = 0D;
    private double radius = 1D;
    private double maxRadius = 2D;
    private boolean followDirection = false;

    private double pitch = 0D;
    private double pitchAdjust = 0D;

    private double yaw = 0D;
    private double yawAdjust = 0D;

    private boolean raindbowColorStatic = false;
    private boolean raindbowColor = false;
    private boolean raindbowColorFromStart = false;

    public CMIPECircle() {
    }

    public CMIPECircle(CMIParticle effect) {
	this.effect = effect;
    }

    @Override
    public boolean render(List<Player> players) {
	return true;
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
	return 1;
    }

    public double yPosYaw(double time, double radius) {
	return 1;
    }

    public double zPosYaw(double time, double radius, double yaw) {
	return 1;
    }

    public boolean isRotating() {
	return circling;
    }

    public void setRotating(boolean circling) {
	this.circling = circling;
    }

    public int getTimes() {
	return times;
    }

    public void setTimes(int times) {
	this.times = times;
    }

    public Vector getMove() {
	return move;
    }

    public void setMove(Vector move) {
	this.move = move;
    }

    public double getRadius() {
	return radius;
    }

    public void setRadius(double radius) {
	this.radius = radius;
    }

    public double getRadiusChange() {
	return radiusChange;
    }

    public void setRadiusChange(double radiusChange) {
	this.radiusChange = radiusChange;
    }

    public boolean isFollowDirection() {
	return followDirection;
    }

    public void setFollowDirection(boolean followDirection) {
	this.followDirection = followDirection;
    }

    public double getMaxRadius() {
	return maxRadius;
    }

    public void setMaxRadius(double maxRadius) {
	this.maxRadius = maxRadius;
    }

    public double getMaxMoveDistance() {
	return MaxMoveDistance;
    }

    public void setMaxMoveDistance(double MaxMoveDistance) {
	this.MaxMoveDistance = MaxMoveDistance;
    }

    public double getPitchAdjust() {
	return pitchAdjust;
    }

    public void setPitchAdjust(double pitchAdjust) {
	this.pitchAdjust = pitchAdjust;
    }

    public double getPitch() {
	return pitch;
    }

    public void setPitch(double pitch) {
	this.pitch = pitch;
    }

    public double getYaw() {
	return yaw;
    }

    public void setYaw(double yaw) {
	this.yaw = yaw;
    }

    public double getYawAdjust() {
	return yawAdjust;
    }

    public void setYawAdjust(double yawAdjust) {
	this.yawAdjust = yawAdjust;
    }

    public boolean isRaindbowColorStatic() {
	return raindbowColorStatic;
    }

    public void setRaindbowColorStatic(boolean raindbowColorStatic) {
	this.raindbowColorStatic = raindbowColorStatic;
    }

    public boolean isRaindbowColor() {
	return raindbowColor;
    }

    public void setRaindbowColor(boolean raindbowColor) {
	this.raindbowColor = raindbowColor;
    }

    public boolean isRaindbowColorFromStart() {
	return raindbowColorFromStart;
    }

    public void setRaindbowColorFromStart(boolean raindbowColorFromStart) {
	this.raindbowColorFromStart = raindbowColorFromStart;
    }

    public Double getMoveMulty() {
	return moveMulty;
    }

    public void setMoveMulty(Double moveMulty) {
	this.moveMulty = moveMulty;
    }
}
