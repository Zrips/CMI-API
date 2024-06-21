package com.Zrips.CMI.events;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Worth.WorthManager.worthType;

import net.Zrips.CMILib.Items.CMIMaterial;

public final class CMIPlayerItemsSellEvent extends CMIPlayerEvent {

    private HashMap<CMIMaterial, Integer> amounts = new HashMap<CMIMaterial, Integer>();
    private HashMap<CMIMaterial, Double> payments = new HashMap<CMIMaterial, Double>();

    private worthType sellType = worthType.all;
    private double totalPayment = 0D;
    private int totalAmount = 0;

    public CMIPlayerItemsSellEvent(Player player, worthType sellType, int totalAmount, double totalPayment, HashMap<CMIMaterial, Integer> amounts, HashMap<CMIMaterial, Double> payments) {
        super(player);
        this.sellType = sellType;
        this.totalAmount = totalAmount;
        this.totalPayment = totalPayment;
        this.amounts = amounts;
        this.payments = payments;
    }

    public worthType getSellType() {
        return sellType;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public HashMap<CMIMaterial, Integer> getAmounts() {
        return amounts;
    }

    public HashMap<CMIMaterial, Double> getPayments() {
        return payments;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
