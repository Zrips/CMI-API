package com.Zrips.CMI.Modules.Packets;

import org.bukkit.entity.Player;

public class FakeInfo {

    private int id = -1;
    private Player player;
    private Object obj;

    public Player getPlayer() {
	return player;
    }

    public FakeInfo setPlayer(Player player) {
	this.player = player;
	return this;
    }

    public Object getObj() {
	return obj;
    }

    public FakeInfo setObj(Object obj) {
	this.obj = obj;
	return this;
    }

    public int getId() {
	return id;
    }

    public FakeInfo setId(int id) {
	this.id = id;
	return this;
    }

}
