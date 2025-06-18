package com.Zrips.CMI.Modules.PlayerCombat;

public class CMIPlayerCombat {
    private long gotLastDamageAt;
    private long gotLastDamageFromPlayer;
    private long didLastDamageToPlayer;
    private long gotLastDamageFromEntity;
    private long didLastDamageToEntity;

    public Long getGotLastDamageAt() {
        return null;
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
    }

    public boolean isInCombatWithPlayer() {
        return false;
    }

    public long getGotLastDamageFromPlayer() {
        return 0;
    }

    public void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer) {
    }

    public void setDidLastDamageToPlayer(Long didLastDamageToPlayer) {
    }

    public boolean isInCombat() {
        return false;
    }

    public boolean isInCombatWithMob() {
        return false;
    }

    public long getGotLastDamageFromMob() {
        return 0;
    }

    public void setGotLastDamageFromMob(Long gotLastDamageFromEntity) {
    }

    public void setDidLastDamageToMob(Long didLastDamageToEntity) {
    }

    public long getLeftCombatTime() {
        return 0;
    }
}
