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

    public CMIAsyncPlayerTeleportEvent(final CommandSender sender, final Player player, final SafeTeleport safe, final CMITeleportType type) {
        super(player, true);
        this.sender = sender;
        this.safe = safe;
        this.type = type;
    }

    public CommandSender getSender() {
        return sender;
    }

    public SafeTeleport getSafe() {
        return safe;
    }

    public CMITeleportType getType() {
        return type;
    }

    public Location getTo() {
        return getSafe().getSafeLoc();
    }
}
