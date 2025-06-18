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
    protected boolean fixedLocation;
    protected CMIEffect effect;
    protected Vector offset;
    protected int updateTimes;
    protected double duration;
    private Player playerMove;
    private boolean hideWithVanish;
    private int interval;

    public CMIPEAnimation() {
    }

    @Override
    public Player getPlayerMove() {
        return null;
    }

    public void setPlayerMove(Player playerMove) {
    }

    public CMIPEAnimation(CMIEffect effect) {
    }

    public CMIPEAnimation(CMIParticle effect) {
    }

    @Override
    public boolean render(List<Player> players) {
        return false;
    }

    @Override
    public Location getCenter() {
        return null;
    }

    @Override
    public void setCenter(Location center) {
    }

    public Vector getOffset() {
        return null;
    }

    public void setOffset(Vector offset) {
    }

    public CMIEffect getCMIEffect() {
        return null;
    }

    public void setCMIEffect(CMIEffect effect) {
    }

    @Deprecated
    public CMIParticle getEffect() {
        return null;
    }

    @Deprecated
    public void setEffect(CMIParticle particle) {
    }

    public CMIParticle getParticle() {
        return null;
    }

    public void setParticle(CMIParticle particle) {
    }

    public org.bukkit.Color getColor() {
        return null;
    }

    @Override
    public void setColor(Color color) {
    }

    @Override
    public void setColor(org.bukkit.Color color) {
    }

    @Override
    public void setColor(CMIChatColor color) {
    }

    @Override
    public void setDuration(double d) {
    }

    @Override
    public double getDuration() {
        return 0.0;
    }

    @Override
    public boolean isFixedLocation() {
        return false;
    }

    public void setFixedLocation(boolean fixedLocation) {
    }

    @Override
    public void show() {
    }

    @Override
    public int getInterval() {
        return 0;
    }

    public void setInterval(int interval) {
    }

    @Override
    public boolean isHideWithVanish() {
        return false;
    }

    public void setHideWithVanish(boolean hideWithVanish) {
    }
}
