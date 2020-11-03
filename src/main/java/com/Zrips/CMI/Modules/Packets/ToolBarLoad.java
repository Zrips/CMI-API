package com.Zrips.CMI.Modules.Packets;

import java.util.HashSet;
import java.util.Set;

public class ToolBarLoad {
    private Set<Integer> slots = new HashSet<Integer>();
    private Long time = 0L;

    public Long getTime() {
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
    }

    public Set<Integer> getSlots() {
	return slots;
    }

    public void setSlots(Set<Integer> slots) {
	this.slots = slots;
    }

}
