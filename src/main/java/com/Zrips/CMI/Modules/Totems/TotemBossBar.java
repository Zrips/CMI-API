package com.Zrips.CMI.Modules.Totems;

import org.bukkit.boss.BossBar;

import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;
import com.Zrips.CMI.Modules.Totems.TotemManager.BossBarType;

public class TotemBossBar {

    private BossBar bar = null;
    private BossBarType type;
    private CMIVisualEffect effect;

    public TotemBossBar(BossBar bar, BossBarType type) {
	this.bar = bar;
	this.type = type;
    }

    public BossBar getBar() {
	return bar;
    }

    public void setBar(BossBar bar) {
	this.bar = bar;
    }

    public BossBarType getType() {
	return type;
    }

    public void setType(BossBarType type) {
	this.type = type;
    }

    public CMIVisualEffect getEffect() {
	return effect;
    }

    public void setEffect(CMIVisualEffect effect) {
	this.effect = effect;
    }

}
