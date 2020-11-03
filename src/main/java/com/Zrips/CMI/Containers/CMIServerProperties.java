package com.Zrips.CMI.Containers;

public enum CMIServerProperties {
    max_players, motd, rate_limit;
    public String getPath() {
	return this.name().replace("_", "-");
    }
}
