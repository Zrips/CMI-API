package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

public class TpInfo {
    private Player whoOffers;
    private Player whoAccepts;
    private TpAction action;
    private Location loc;
    private long when;

    public TpInfo(Player whoOffers, Player whoAccepts, TpAction action) {
    }

    public Player getWhoOffers() {
        return null;
    }

    public void setWhoOffers(Player whoOffers) {
    }

    public Player getWhoAccepts() {
        return null;
    }

    public void setWhoAccepts(Player whoAccepts) {
    }

    public TpAction getAction() {
        return null;
    }

    public void setAction(TpAction action) {
    }

    public long getWhen() {
        return 0;
    }

    public void setWhen(long when) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }
}
