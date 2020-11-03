package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class CondenseResult {
    private int iAmount = 0;
    private int rAmount = 0;
    private List<ItemStack> items = new ArrayList<ItemStack>();

    public CondenseResult() {
    }

    public CondenseResult(int inputAmount, int resultAmount) {
	this.iAmount = inputAmount;
	this.rAmount = resultAmount;
    }

    public int getImputAmount() {
	return iAmount;
    }

    public void addImputAmount(int imputAmount) {
	this.iAmount += imputAmount;
    }

    public int getResultAmount() {
	return rAmount;
    }

    public void addResultAmount(int resultAmount) {
	this.rAmount += resultAmount;
    }

    public List<ItemStack> getToAdd() {
	return items;
    }

    public void addToAdd(ItemStack toAdd) {
	this.items.add(toAdd);
    }

}
