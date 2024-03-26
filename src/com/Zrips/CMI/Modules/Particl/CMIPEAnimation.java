package com.Zrips.CMI.Modules.Particl;

import java.awt.Color;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class CMIPEAnimation implements CMIPEAnimationInterface {

    protected Location center;
    protected boolean fixedLocation = false;

    protected CMIEffect effect = new CMIEffect(CMIParticle.COLOURED_DUST);
    protected Vector offset = new Vector(0, 0, 0);

    protected int updateTimes = 0;
    protected double duration = 5;
    private Player playerMove;
    private boolean hideWithVanish = false;
    private int interval = 1;

    public CMIPEAnimation() {
    }

    @Override
    public Player getPlayerMove() {
	return playerMove;
    }

    public void setPlayerMove(Player playerMove) {
	this.playerMove = playerMove;
    }

    public CMIPEAnimation(CMIEffect effect) {
	this.effect = effect;
    }

    public CMIPEAnimation(CMIParticle effect) {
	this.effect.setParticle(effect);
    }

    @Override
    public boolean render(List<Player> players) {
	return true;
    }

    @Override
    public Location getCenter() {
	return center;
    }

    @Override
    public void setCenter(Location center) {
	this.center = center;
    }

    public Vector getOffset() {
	return offset;
    }

    public void setOffset(Vector offset) {
	this.offset = offset;
    }

    public CMIEffect getCMIEffect() {
	return effect;
    }

    public void setCMIEffect(CMIEffect effect) {
	this.effect = effect;
    }

    @Deprecated
    public CMIParticle getEffect() {
	return getParticle();
    }

    @Deprecated
    public void setEffect(CMIParticle particle) {
	setParticle(particle);
    }

    public CMIParticle getParticle() {
	return this.effect.getParticle();
    }

    public void setParticle(CMIParticle particle) {
	this.effect.setParticle(particle);
    }

    public org.bukkit.Color getColor() {
	return this.effect.getColor();
    }

    @Override
    public void setColor(Color color) {
	this.effect.setColor(org.bukkit.Color.fromRGB(color.getRed(), color.getGreen(), color.getBlue()));
    }

    @Override
    public void setColor(org.bukkit.Color color) {
	this.effect.setColor(color);
    }

    @Override
    public void setColor(CMIChatColor color) {
	this.effect.setColor(org.bukkit.Color.fromRGB(color.getRed(), color.getGreen(), color.getBlue()));
    }

    @Override
    public void setDuration(double d) {
	this.duration = d;
    }

    @Override
    public double getDuration() {
	return this.duration;
    }

    @Override
    public boolean isFixedLocation() {
	return fixedLocation;
    }

    public void setFixedLocation(boolean fixedLocation) {
	this.fixedLocation = fixedLocation;
    }

    @Override
    public void show() {
	CMIVisualEffect spir = new CMIVisualEffect(center, this);
	spir.setUntil(System.currentTimeMillis() + (int) (1000L * duration));
	spir.show();
    }

    @Override
    public int getInterval() {
	return interval;
    }

    public void setInterval(int interval) {
	this.interval = interval;
    }

    @Override
    public boolean isHideWithVanish() {
	return hideWithVanish;
    }

    public void setHideWithVanish(boolean hideWithVanish) {
	this.hideWithVanish = hideWithVanish;
    }
}
