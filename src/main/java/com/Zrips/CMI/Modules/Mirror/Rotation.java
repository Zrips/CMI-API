package com.Zrips.CMI.Modules.Mirror;

import org.bukkit.Material;

public class Rotation {

    private Material mat;
    private short data;

    public Rotation() {
    }

    public Rotation(Material mat, short data) {
	this.mat = mat;
	this.data = data;
    }

    public Material getMat() {
	return mat;
    }

    public void setMat(Material mat) {
	this.mat = mat;
    }

    public short getData() {
	return data;
    }

    public void setData(short data) {
	this.data = data;
    }
}
