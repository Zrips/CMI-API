package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;

public class CmdCooldown {
    HashMap<String, Long> list = new HashMap<String, Long>();

    public void addCooldown(String cmd, Long time) {
	list.put(cmd, time);
    }

    public HashMap<String, Long> getList() {
	return this.list;
    }
}
