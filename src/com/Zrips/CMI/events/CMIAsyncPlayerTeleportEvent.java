package com.Zrips.CMI.events;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Teleportations.CMITeleportType;
import com.Zrips.CMI.Modules.Teleportations.SafeTeleport;

public final class CMIAsyncPlayerTeleportEvent extends CMIPlayerCancellableEvent {
    private CommandSender sender;
    private SafeTeleport safe;
    private CMITeleportType type;

    public CMIAsyncPlayerTeleportEvent(CommandSender sender, Player player, SafeTeleport safe, CMITeleportType type) {
        super(player, true);
    }

    public CommandSender getSender() {
        return null;
    }

    public SafeTeleport getSafe() {
        return null;
    }

    public CMITeleportType getType() {
        return null;
    }

    public Location getTo() {
        return null;
    }
}
