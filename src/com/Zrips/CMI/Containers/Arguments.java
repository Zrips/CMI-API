package com.Zrips.CMI.Containers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Arguments {

    String[] args;
    Player source = null;
    Player target = null;
    World world = null;
    Vector coord = null;
    Float pitch = null;
    Float yaw = null;
    Location loc = null;

    Boolean boo = null;
    Integer number = null;
    Integer number2 = null;

    public Arguments(String[] args) {
	this.args = args;
	proccess();
    }

    public Player getSourcePlayer() {
	return this.source;
    }

    public Player getTargetPlayer() {
	return this.target;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public World getWorld() {
	return this.world;
    }

    public Vector getCoord() {
	return this.coord;
    }

    public Float getPitch() {
	return this.pitch;
    }

    public Float getYaw() {
	return this.yaw;
    }

    public Boolean getBoolean() {
	return this.boo;
    }

    public Integer getNumber() {
	return this.number;
    }

    public Integer getNumber2() {
	return this.number2;
    }

    public Location getLocation() {
	if (loc != null)
	    return loc;
	if (world == null || coord == null)
	    return null;
	Location loc = new Location(world, coord.getX(), coord.getY(), coord.getZ());
	if (pitch != null)
	    loc.setPitch(pitch.floatValue());
	if (yaw != null)
	    loc.setYaw(yaw.floatValue());
	this.loc = loc;
	return this.loc;
    }

    public void setLocation(Location loc) {
	this.loc = loc;
    }

    private void proccess() {
	for (int i = 0; i < args.length; i++) {
	    if (target == null) {
		Player p = Bukkit.getPlayer(args[i]);
		if (p != null) {
		    this.target = p;
		    continue;
		}
	    }
	    if (source == null && target != null) {
		Player p = Bukkit.getPlayer(args[i]);
		if (p != null) {
		    this.source = p;
		    continue;
		}
	    }
	    if (world == null) {
		for (World oneW : Bukkit.getWorlds()) {
		    if (oneW.getName().equalsIgnoreCase(args[i])) {
			this.world = oneW;
			continue;
		    }
		}
	    }

	    c: if (coord == null) {
		double x;
		double y;
		double z;
		try {
		    x = Double.parseDouble(args[i]);
		    y = Double.parseDouble(args[i + 1]);
		    z = Double.parseDouble(args[i + 2]);
		} catch (Exception e) {
		    break c;
		}
		coord = new Vector();
		coord.setX(x);
		coord.setY(y);
		coord.setZ(z);
		i += 2;
		continue;
	    }

	    p: if (coord != null && pitch == null) {
		try {
		    pitch = Float.parseFloat(args[i]);
		} catch (Exception e) {
		    break p;
		}
		continue;
	    }
	    y: if (coord != null && pitch != null && yaw == null) {
		try {
		    yaw = Float.parseFloat(args[i]);
		} catch (Exception e) {
		    break y;
		}
		continue;
	    }

	    if (boo == null) {
		if (args[i].equalsIgnoreCase("true"))
		    boo = true;
		else if (args[i].equalsIgnoreCase("false"))
		    boo = false;
	    }

	    y: if (number == null) {
		try {
		    number = Integer.parseInt(args[i]);
		} catch (Exception e) {
		    break y;
		}
		continue;
	    }

	    y: if (number2 == null && number != null) {
		try {
		    number2 = Integer.parseInt(args[i]);
		} catch (Exception e) {
		    break y;
		}
		continue;
	    }
	}
    }

}
