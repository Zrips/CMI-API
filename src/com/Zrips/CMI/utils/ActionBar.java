package com.Zrips.CMI.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class ActionBar {
    @Deprecated
    public ActionBar(CMI plugin) {
    }

    @Deprecated
    public void send(CommandSender receivingPacket, String msg) {
	CMI.getInstance().getActionBarManager().send(receivingPacket, msg);
    }

    @Deprecated
    public void send(CMIUser user, String msg) {
	CMI.getInstance().getActionBarManager().send(user, msg);
    }

    @Deprecated
    public void send(Player receivingPacket, String msg) {
	CMI.getInstance().getActionBarManager().send(receivingPacket, msg);
    }

    @Deprecated
    public void sendTitle(Player receivingPacket, Object title, Object subtitle) {
	CMI.getInstance().getTitleMessageManager().send(receivingPacket, title, subtitle);

    }

    @Deprecated
    public void sendTitle(final Player receivingPacket, final Object title, final Object subtitle, final int fadeIn, final int keep, final int fadeOut) {
	CMI.getInstance().getTitleMessageManager().send(receivingPacket, title, subtitle, fadeIn, keep, fadeOut);
    }

}
