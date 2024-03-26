package com.Zrips.CMI.Modules.Chat;

import java.util.Set;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMITextDisplay;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIChatBubble {
    private CMITextDisplay tDisplay;
    private Player player;
    private Location originPoint;
    private Location prevloc;
    private String text;
    private long startTime;
    private long endTime;
    private Set<Player> receivers;

    private CMITask schedId = null;

    public CMIChatBubble(Player player, String text, Set<Player> receivers) {

    }

    public void show() {
        tasker();
    }

    private void tasker() {

    }

    public void delete() {
        if (schedId != null) {
            schedId.cancel();
            schedId = null;
        }
        remove();
    }

    private void remove() {

    }

    private Location generateLoc() {
        return null;
    }

    private void spawnIn() {

    }

    private void sendUpdate() {

    }

    private void initialRecheckReceivers() {

    }

    private void recheckReceivers() {

    }

    private void generateDisplay() {

    }

}
