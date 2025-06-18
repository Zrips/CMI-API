package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;

public class CMIAfkLeaveEvent extends CMIPlayerEvent {
    private List<String> leaveTrigerCommands;
    private long time;
    private String reason;

    public CMIAfkLeaveEvent(Player player) {
        super(player);
    }

    @Deprecated
    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands) {
        super(player);
    }

    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands, long time, String reason) {
        super(player);
    }

    public List<String> getLeaveTrigerCommands() {
        return null;
    }

    public void setLeaveTrigerCommands(List<String> leaveTrigerCommands) {
    }

    public long getTime() {
        return 0;
    }

    public String getReason() {
        return null;
    }
}
