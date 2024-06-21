package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.EventActions.EventActionManager.eventAction;

public final class CMIEventCommandEvent extends CMIPlayerCancellableEvent {

    private final eventAction action;
    private List<String> commands;
    private List<String> sourceCommands;
    private Player source;

    public CMIEventCommandEvent(final Player player, Player source, final eventAction action, List<String> commands, List<String> sourceCommands) {
        super(player);
        this.source = source;
        this.action = action;
        this.commands = commands;
        this.sourceCommands = sourceCommands;
    }

    public eventAction getAction() {
        return action;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Deprecated
    public void setCommands(List<String> commands) {
        this.commands.clear();
        this.commands.addAll(commands);
    }

    public Player getSource() {
        return source;
    }

    public void setSource(Player source) {
        this.source = source;
    }

    public List<String> getSourceCommands() {
        return sourceCommands;
    }
}
