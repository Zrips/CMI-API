package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIVisualEffect {

    private Player targetPlayerLocation;
    private Location loc;

    CMITask task = null;
    private int interval = 1;

    private Long until = null;
    private CMIPEAnimationInterface effectAnimation = null;
    List<Player> players = new ArrayList<Player>();
    Long nextPlayerUpdate;

    public CMIVisualEffect(Player targetPlayer, CMIPresetAnimations effect) {
        this(targetPlayer, effect.getInter(targetPlayer));
    }

    public CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect) {
        if (effect != null) {
            if (effect.getCenter() != null) {
                loc = effect.getCenter().clone();
            }
            this.effectAnimation = effect;
            interval = effect.getInterval();
        }
        this.setTargetPlayer(targetPlayer);
    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {
        this.loc = loc;
        this.effectAnimation = effect;
        if (effect != null)
            interval = effect.getInterval();
    }

    private Location getLocation() {
        if (loc != null)
            return loc;
        return getTargetPlayer() != null ? getTargetPlayer().isOnline() ? getTargetPlayer().getLocation() : null : null;
    }

    public void show() {
        if (effectAnimation == null)
            return;

        task = CMIScheduler.runTimerAsync(() -> {
            Location location = getLocation();
            if (location == null) {
                stop();
                return;
            }

            if (nextPlayerUpdate == null || nextPlayerUpdate < System.currentTimeMillis()) {
                players = CMI.getInstance().getUtilManager().getPlayersFromRange(getEffect().isHideWithVanish() ? getTargetPlayer() : null, location, 32);
                nextPlayerUpdate = System.currentTimeMillis() + 1000;
            }
            if (!effectAnimation.isFixedLocation() || effectAnimation.getCenter() == null)
                effectAnimation.setCenter(location);
            visualize();

            if (until == null || until < System.currentTimeMillis()) {
                stop();
                return;
            }
        }, 1L, interval);
    }

    public void show(Player player) {
        players.clear();
        if (player != null)
            players.add(player);

        task = CMIScheduler.runTimerAsync(() -> {
            Location location = getLocation();
            if (location == null) {
                stop();
                return;
            }
            if (!effectAnimation.isFixedLocation() || effectAnimation.getCenter() == null)
                effectAnimation.setCenter(location);
            visualize();

            if (until == null || until < System.currentTimeMillis()) {
                stop();
                return;
            }
        }, 0L, interval);
    }

    private void visualize() {

        CMIScheduler.runTaskAsynchronously(() -> {
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
        });
    }

    public void stop() {
        if (task == null)
            return;
        task.cancel();
        task = null;
        CMI.getInstance().getParticleManager().removePlayerEffects(this);

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
