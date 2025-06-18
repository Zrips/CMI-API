package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import com.Zrips.CMI.events.CMIPlayerEvent;

public final class CMIHologramStopHoverEvent extends CMIPlayerEvent {
    private CMIHologram hologram;

    public CMIHologramStopHoverEvent(Player player, CMIHologram holo) {
        super(player, true);
    }

    public CMIHologram getHologram() {
        return null;
    }
}
