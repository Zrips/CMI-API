package com.Zrips.CMI.events;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.Zrips.CMI.Modules.Teleportations.CMITeleportType;
import com.Zrips.CMI.Modules.Teleportations.SafeTeleport;

public final class CMIPlayerTeleportEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender sender;
    private SafeTeleport safe;
    private CMITeleportType type;

    public CMIPlayerTeleportEvent(final CommandSender sender, final Player player, final SafeTeleport safe, final CMITeleportType type) {
        super(player);
        this.sender = sender;
        this.safe = safe;
        this.type = type;
    }

    public final static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player teleports to new safe location")
    public final HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
        return cancel;
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
