package com.Zrips.CMI.Modules.tp;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.tp.TpManager.TpAction;

public class TpInfo {

    private Player whoOffers;
    private Player whoAccepts;
    private TpAction action;
    private Location loc = null;
    private long when;

    public TpInfo(Player whoOffers, Player whoAccepts, TpAction action) {
	this.whoOffers = whoOffers;
	this.whoAccepts = whoAccepts;
	this.action = action;
	this.when = System.currentTimeMillis();
    }

    public Player getWhoOffers() {
	return whoOffers;
    }

    public void setWhoOffers(Player whoOffers) {
	this.whoOffers = whoOffers;
    }

    public Player getWhoAccepts() {
	return whoAccepts;
    }

    public void setWhoAccepts(Player whoAccepts) {
	this.whoAccepts = whoAccepts;
    }

    public TpAction getAction() {
	return action;
    }

    public void setAction(TpAction action) {
	this.action = action;
    }

    public long getWhen() {
	return when;
    }

    public void setWhen(long when) {
	this.when = when;
    }

    public Location getLoc() {
	return loc;
    }

    public void setLoc(Location loc) {
	this.loc = loc;
    }

}
