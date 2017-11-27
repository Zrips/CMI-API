package com.Zrips.CMI.Containers;

public enum Direction {
    SOUTH("South"),
    WEST("West"),
    NORTH("North"),
    EAST("East");

    private String direction;

    private Direction(String direction) {
	this.direction = direction;
    }

    public String getDirection() {
	return direction;
    }
}
