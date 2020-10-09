package com.Zrips.CMI.Containers;

import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;

public class itemInfo {

    private CMIMaterial mat = null;
    private int data = -1;
    private int chance = 100;

    public itemInfo(CMIMaterial mat, int data) {
	this.mat = mat;
	this.data = data;
    }

    public int getData() {
	return data;
    }

    public void setData(int data) {
	this.data = data;
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
