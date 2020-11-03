package com.Zrips.CMI.Modules.Recipes;

public class FurnaceTempData {

    private float exp = 0;
    private int cookingTime = 20;

    public FurnaceTempData(float exp, int cookingTime) {
	this.exp = exp;
	this.cookingTime = cookingTime;
    }

    public float getExp() {
	return exp;
    }

    public void setExp(float exp) {
	this.exp = exp;
    }

    public int getCookingTime() {
	return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
	this.cookingTime = cookingTime;
    }

}
