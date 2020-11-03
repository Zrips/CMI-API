package com.Zrips.CMI.Modules.PlayTimeRewards;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;

public class PlayTimeReward {
    private String name;
    private String displayName;
    private List<String> description;
    private List<String> commands;
    private Long range;

    private boolean autoClaim = false;
    
    public PlayTimeReward(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public List<String> getDescription() {
	return description;
    }

    public void setDescription(List<String> description) {
	this.description = description;
    }

    public List<String> getCommands() {
	return commands;
    }

    public void setCommands(List<String> commands) {
	this.commands = commands;
    }
    
    public void performCommands(Player player){
	Snd snd = new Snd();
	snd.setTarget(player);
	List<String> cmds = CMI.getInstance().getLM().updateSnd(snd, new ArrayList<String>(getCommands()));
	CMI.getInstance().getSpecializedCommandManager().processCmds(cmds, player);
    }

    public boolean isAutoClaim() {
	return autoClaim;
    }

    public void setAutoClaim(boolean autoClaim) {
	this.autoClaim = autoClaim;
    }

    public Long getRange() {
	return range;
    }

    public void setRange(Long range) {
	this.range = range;
    }

}
