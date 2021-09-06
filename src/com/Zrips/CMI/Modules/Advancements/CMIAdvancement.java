package com.Zrips.CMI.Modules.Advancements;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.Zrips.CMI.Modules.Advancements.AdvancementManager.FrameType;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class CMIAdvancement {

    private static final Gson gson = new Gson();

    private NamespacedKey id;
    private String parent;
    private String icon;
    private String background;
    private String title;
    private String description;
    private int data;
    private FrameType frame;
    private boolean announce = true;
    private boolean toast = true;
    private boolean hidden = true;

    private CMIAdvancement(NamespacedKey id, String parent, String icon, int data, String background, String title, String description, FrameType frame, boolean announce, boolean toast, boolean hidden) {
	this.id = id;
	this.parent = parent;
	this.icon = icon;
	this.data = data;
	this.background = background;
	this.title = title;
	this.description = description;
	this.frame = frame;
	this.announce = announce;
	this.toast = toast;
	this.hidden = hidden;
    }

    public static AdvancementBuilder builder(NamespacedKey id) {
	return new AdvancementBuilder().id(id);
    }

    public String getJSON() {
	return gson.toJson("");
    }

    public String getIcon() {
	return this.icon;
    }

    public int getData() {
	return this.data;
    }

    public static JsonElement getJsonFromComponent(String textComponent) {

	return gson.fromJson("\"" + textComponent + "\"", JsonElement.class);
    }

    public String getTitle() {
	return this.title;
    }

    public String getDescription() {
	return this.description;
    }

    public String getBackground() {
	return this.background;
    }

    public FrameType getFrame() {
	return this.frame;
    }

    public String getParent() {
	return this.parent;
    }

    public CMIAdvancement show(JavaPlugin plugin, final Player... players) {
	
	return this;
    }

    public CMIAdvancement add() {
	
	return this;
    }

    public CMIAdvancement grant(Player... players) {
	
	return this;
    }

    public CMIAdvancement revoke(Player... players) {
	
	return this;
    }

    public Advancement getAdvancement() {
	return Bukkit.getAdvancement(id);
    }

    public NamespacedKey getId() {
	return this.id;
    }

    public boolean isAnnounce() {
	return this.announce;
    }

    public boolean isToast() {
	return this.toast;
    }

    public boolean isHidden() {
	return this.hidden;
    }

    public static class AdvancementBuilder {
	private NamespacedKey id;
	private String parent;
	private String icon;
	private String background;
	private String title;
	private String description;
	private FrameType frame;
	private boolean announce;
	private boolean toast;
	private boolean hidden;
	private int data;

	AdvancementBuilder() {
	}

	public AdvancementBuilder title(String title) {
	    this.title = title;
	    return this;
	}

	public AdvancementBuilder description(String description) {
	    this.description = description;
	    return this;
	}

	public AdvancementBuilder id(NamespacedKey id) {
	    this.id = id;
	    return this;
	}

	public AdvancementBuilder parent(String parent) {
	    this.parent = parent;
	    return this;
	}

	public AdvancementBuilder icon(String icon) {
	    this.icon = icon;
	    return this;
	}

	public AdvancementBuilder data(int data) {
	    this.data = data;
	    return this;
	}

	public AdvancementBuilder background(String background) {
	    this.background = background;
	    return this;
	}

	public AdvancementBuilder frame(FrameType frame) {
	    this.frame = frame;
	    return this;
	}

	public AdvancementBuilder announce(boolean announce) {
	    this.announce = announce;
	    return this;
	}

	public AdvancementBuilder toast(boolean toast) {
	    this.toast = toast;
	    return this;
	}

	public AdvancementBuilder hidden(boolean hidden) {
	    this.hidden = hidden;
	    return this;
	}

	public CMIAdvancement build() {
	    return new CMIAdvancement(id, parent, icon, data, background, title, description, frame, announce, toast, hidden);
	}
    }
}
