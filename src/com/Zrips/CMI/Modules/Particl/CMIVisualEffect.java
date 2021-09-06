package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Logs.CMIDebug;

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
	if (effect.getCenter() != null) {
	    loc = effect.getCenter().clone();
	}
	this.setTargetPlayer(targetPlayer);
	this.effectAnimation = effect;
	interval = effect.getInterval();
    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {
	this.loc = loc;
	this.effectAnimation = effect;
	interval = effect.getInterval();
    }

    private Location getLocation() {
	if (loc != null)
	    return loc;
	return getTargetPlayer() != null ? getTargetPlayer().isOnline() ? getTargetPlayer().getLocation() : null : null;
    }

    @SuppressWarnings("deprecation")
    public void show() {

//	Bukkit.getScheduler().runTaskAsynchronously(CMI.getInstance(), new Runnable() {
//	    @Override
//	    public void run() {

	id = Bukkit.getScheduler().scheduleAsyncRepeatingTask(CMI.getInstance(), new Runnable() {
	    @Override
	    public void run() {
		Location location = getLocation();
		if (location == null) {
		    stop();
		    return;
		}

		if (nextPlayerUpdate == null || nextPlayerUpdate < System.currentTimeMillis()) {
		    players = CMI.getInstance().getUtilManager().getPlayersFromRange(getEffect().isHideWithVanish() ? getTargetPlayer() : null, location, 16);
		    nextPlayerUpdate = System.currentTimeMillis() + 1000;
		}
		if (!effectAnimation.isFixedLocation() || effectAnimation.getCenter() == null)
		    effectAnimation.setCenter(location);
		visualize();

		if (until == null || until < System.currentTimeMillis()) {
		    stop();
		    return;
		}
	    }
	}, 0L, interval);

//		return;
//	    }
//
//	});
    }

    public void show(Player player) {
	players.clear();
	if (player != null)
	    players.add(player);
	visualize();
    }

    private void visualize() {

	Bukkit.getScheduler().runTaskAsynchronously(CMI.getInstance(), new Runnable() {
	    @Override
	    public void run() {
		Location location = getLocation();
		if (location == null) {
		    stop();
		    return;
		}
		if (effectAnimation == null) {
		    stop();
		    return;
		}

		if (!effectAnimation.render(new ArrayList<Player>(players))) {
		    stop();
		    return;
		}
		return;
	    }
	});

//	players.clear();

    }

    public void stop() {
	if (id != -1) {
	    Bukkit.getScheduler().cancelTask(id);
	    id = -1;
	    CMI.getInstance().getParticleManager().removePlayerEffects(this);
	}
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
	this.targetPlayerLocation = targetPlayer;
	if (loc == null)
	    CMI.getInstance().getParticleManager().addPlayerEffect(this);
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
