package com.Zrips.CMI.Containers;

import net.Zrips.CMILib.Items.CMIMaterial;

public class itemInfo {

    private CMIMaterial mat = null;
    private int chance = 100;

    public itemInfo(CMIMaterial mat) {
	this.mat = mat;
    }

    public CMIMaterial getMat() {
	return mat;
    }

    public void setId(CMIMaterial mat) {
	this.mat = mat;
    }

    public int getChance() {
	return chance;
    }

    public void setChance(int chance) {
	this.chance = chance;
    }
}
