package com.Zrips.CMI.Modules.Advancements;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.google.gson.JsonObject;

public class AdvancementManager {

    static HashMap<String, CMIAdvancement> map = new HashMap<String, CMIAdvancement>();

    public AdvancementManager() {

    }

    public static CMIAdvancement getOld(String... key) {
	return null;
    }

    public static void add(CMIAdvancement adv) {
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
	    return null;
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
