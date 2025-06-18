package com.Zrips.CMI.Modules.Particl;

import java.awt.Color;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Colors.CMIChatColor;

public interface CMIPEAnimationInterface {
    public boolean render(List<Player> players);

    public void setCenter(Location location);

    public double getDuration();

    public void setDuration(double durations);

    boolean isFixedLocation();

    public Location getCenter();

    public void setColor(Color color);

    public void setColor(org.bukkit.Color color);

    public void setColor(CMIChatColor color);

    public void show();

    Player getPlayerMove();

    int getInterval();

    boolean isHideWithVanish();
}
