package com.Zrips.CMI.Modules.Particl;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIVisualEffect {
    private Player targetPlayerLocation;
    private Location loc;
    CMITask task;
    private int interval;
    private Long until;
    private CMIPEAnimationInterface effectAnimation;
    List<Player> players;
    Long nextPlayerUpdate;

    public CMIVisualEffect(Player targetPlayer, CMIPresetAnimations effect) {
    }

    public CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect) {
    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {
    }

    private Location getLocation() {
        return null;
    }

    public void show() {
    }

    public void show(Player player) {
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
        return null;
    }

    public void setEffect(CMIPEAnimationInterface effect) {
    }

    public Player getTargetPlayer() {
        return null;
    }

    public void setTargetPlayer(Player targetPlayer) {
    }

    public Long getUntil() {
        return null;
    }

    public void setUntil(Long until) {
    }

    public int getInterval() {
        return 0;
    }

    public void setInterval(int interval) {
    }
}
