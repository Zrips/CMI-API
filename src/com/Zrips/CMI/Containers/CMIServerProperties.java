package com.Zrips.CMI.Containers;

public enum CMIServerProperties {
    max_players, motd;
    public String getPath() {
	return this.name().replace("_", "-");
    }
}
