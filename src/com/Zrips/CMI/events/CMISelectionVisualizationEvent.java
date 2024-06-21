package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Selection.Visualizer;

public final class CMISelectionVisualizationEvent extends CMIPlayerCancellableEvent {

    private Visualizer visualizer;

    @Deprecated
    public CMISelectionVisualizationEvent(Player player) {
        super(player);
    }

    public CMISelectionVisualizationEvent(Player player, Visualizer visualizer) {
        super(player);
        this.visualizer = visualizer;
    }

    public Visualizer getVisualizer() {
        return visualizer;
    }
}
