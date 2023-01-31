package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public class CMIVisualEffect {

    private Player targetPlayerLocation;
    private Location loc;

    int id = -1;
    private int interval = 1;

    private Long until = null;
    private CMIPEAnimationInterface effectAnimation = null;
    List<Player> players = new ArrayList<Player>();
    Long nextPlayerUpdate;

    public CMIVisualEffect(Player targetPlayer, CMIPresetAnimations effect) {
        this(targetPlayer, effect.getInter(targetPlayer));
    }

    public CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect) {

    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {

    }

    private Location getLocation() {
        if (loc != null)
            return loc;
        return getTargetPlayer() != null ? getTargetPlayer().isOnline() ? getTargetPlayer().getLocation() : null : null;
    }

    @SuppressWarnings("deprecation")
    public void show() {

    }

    @SuppressWarnings("deprecation")
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
