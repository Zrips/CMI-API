package com.Zrips.CMI.Containers;

public class itemInfo {

    private int id = 0;
    private int data = -1;
    private int chance = 100;

    public itemInfo(int id, int data) {
	this.id = id;
	this.data = data;
    }

    public int getData() {
	return data;
    }

    public void setData(int data) {
	this.data = data;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getChance() {
	return chance;
    }

    public void setChance(int chance) {
	this.chance = chance;
    }
}
