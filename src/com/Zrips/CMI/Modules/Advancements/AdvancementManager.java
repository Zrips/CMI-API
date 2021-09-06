package com.Zrips.CMI.Modules.Advancements;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.google.gson.JsonObject;

public class AdvancementManager {

    static HashMap<String, CMIAdvancement> map = new HashMap<String, CMIAdvancement>();

    public static CMIAdvancement getOld(String... key) {
	String oneKey = "";
	for (String one : key) {
	    oneKey += one;
	}
	return map.get(oneKey);
    }

    public static void add(CMIAdvancement adv) {
	map.put(adv.getId().getKey(), adv);
    }

    public enum FrameType {
	TASK("task"),
	GOAL("goal"),
	CHALLENGE("challenge");

	private String name;

	FrameType(String name) {
	    this.name = name;
	}

	public static FrameType getFromString(String frameType) {
	    try {
		for (FrameType one : FrameType.values()) {
		    if (one.name.equalsIgnoreCase(frameType))
			return one;
		}
	    } catch (EnumConstantNotPresentException e) {
	    }
	    return FrameType.TASK;
	}

	@Override
	public String toString() {
	    return name;
	}
    }

    public class Condition {
	protected String name;
	protected JsonObject set;

	public Condition(String name, JsonObject set) {
	    this.name = name;
	    this.set = set;
	}
    }

    public class ConditionBuilder {
	private String name;
	private JsonObject set;

	ConditionBuilder() {
	}

	public Condition build() {
	    return new Condition(name, set);
	}
    }

    public static void sendToast(Player player, String msg) {
    }
}
