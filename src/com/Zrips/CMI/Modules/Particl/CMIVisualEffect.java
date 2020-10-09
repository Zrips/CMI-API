package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class CMIVisualEffect {

    private Player targetPlayerLocation;
    private Location loc;

    int id = -1;
    private int interval = 1;

    private Long until;
    private CMIPEAnimationInterface effectAnimation;
    List<Player> players = new ArrayList<Player>();
    Long nextPlayerUpdate;

    public CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect) {
    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {
    }

    private Location getLocation() {
	return null;
    }

    @SuppressWarnings("deprecation")
    public void show() {

    }

    public void show(Player player) {
	players.clear();
	if (player != null)
	    players.add(player);
	visualize();
    }

    private void visualize() {

    }

    public void stop() {

    }

    public void pause() {

    }

    public void continueAnimation() {

    }

    public CMIPEAnimationInterface getEffect() {
	return effectAnimation;
    }

    public void setEffect(CMIPEAnimationInterface effect) {
	this.effectAnimation = effect;
    }

    public Player getTargetPlayer() {
	return targetPlayerLocation;
    }

    public void setTargetPlayer(Player targetPlayer) {
    }

    public Long getUntil() {
	return until;
    }

    public void setUntil(Long until) {
	this.until = until;
    }

    public int getInterval() {
	return interval;
    }

    public void setInterval(int interval) {
	this.interval = interval;
    }

}
