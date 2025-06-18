package com.Zrips.CMI.events;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Worth.WorthManager.worthType;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMIPlayerItemsSellEvent extends CMIPlayerEvent {
    private HashMap<CMIMaterial, Integer> amounts;
    private HashMap<CMIMaterial, Double> payments;
    private worthType sellType;
    private double totalPayment;
    private int totalAmount;

    public CMIPlayerItemsSellEvent(Player player, worthType sellType, int totalAmount, double totalPayment, HashMap<CMIMaterial, Integer> amounts, HashMap<CMIMaterial, Double> payments) {
        super(player);
    }

    public worthType getSellType() {
        return null;
    }

    public double getTotalPayment() {
        return 0.0;
    }

    public int getTotalAmount() {
        return 0;
    }

    public HashMap<CMIMaterial, Integer> getAmounts() {
        return null;
    }

    public HashMap<CMIMaterial, Double> getPayments() {
        return null;
    }

    public void setTotalPayment(double totalPayment) {
    }
}
