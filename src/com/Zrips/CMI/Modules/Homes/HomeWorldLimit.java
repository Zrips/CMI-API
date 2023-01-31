package com.Zrips.CMI.Modules.Homes;

import java.util.ArrayList;
import java.util.List;

public class HomeWorldLimit {

    private List<String> worlds = new ArrayList<String>();
    private int limit = 0;

    public List<String> getWorlds() {
	return worlds;
    }

    public void setWorlds(List<String> worlds) {
	this.worlds = worlds;
    }

    public int getLimit() {
	return limit;
    }

    public void setLimit(int limit) {
	if (limit < -1)
	    limit = -1;
	this.limit = limit;
    }

}
