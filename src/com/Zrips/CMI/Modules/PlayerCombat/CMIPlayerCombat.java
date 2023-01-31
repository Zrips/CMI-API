package com.Zrips.CMI.Modules.PlayerCombat;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Logs.CMIDebug;

public class CMIPlayerCombat {
    private long gotLastDamageAt = 0L;

    private long gotLastDamageFromPlayer = 0L;
    private long didLastDamageToPlayer = 0L;

    private long gotLastDamageFromEntity = 0L;
    private long didLastDamageToEntity = 0L;

    public Long getGotLastDamageAt() {
        return gotLastDamageAt;
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
        this.gotLastDamageAt = gotLastDamageAt;
    }

    public boolean isInCombatWithPlayer() {

        return false;
    }

    public long getGotLastDamageFromPlayer() {
        return gotLastDamageFromPlayer;
    }

    public void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer) {
        this.gotLastDamageFromPlayer = gotLastDamageFromPlayer;
    }

    public void setDidLastDamageToPlayer(Long didLastDamageToPlayer) {
        this.didLastDamageToPlayer = didLastDamageToPlayer;
    }

    public boolean isInCombat() {
        return isInCombatWithMob() || isInCombatWithPlayer();
    }

    public boolean isInCombatWithMob() {
        return false;
    }

    public long getGotLastDamageFromMob() {
        return gotLastDamageFromEntity;
    }

    public void setGotLastDamageFromMob(Long gotLastDamageFromEntity) {
        this.gotLastDamageFromEntity = gotLastDamageFromEntity;
    }

    public void setDidLastDamageToMob(Long didLastDamageToEntity) {
        this.didLastDamageToEntity = didLastDamageToEntity;
    }

    public long getLeftCombatTime() {
        return 0L;
    }
}
