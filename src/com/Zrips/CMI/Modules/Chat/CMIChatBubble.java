package com.Zrips.CMI.Modules.Chat;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMITextDisplay;
import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramFadeInAnimation;

import net.Zrips.CMILib.Version.Schedulers.CMITask;
import net.Zrips.CMILib.Version.Schedulers.CMITaskResult;

public class CMIChatBubble {
    private CMITextDisplay tDisplay;
    private Player player;
    private Location originPoint;
    private String text;
    private long startTime;
    private long endTime;
    private Set<Player> receivers;
    private CMITask schedId;
    private CompletableFuture<CMITaskResult> initTask;
    CMIHologramFadeInAnimation faneId;

    public CMIChatBubble(Player player, String text, Set<Player> receivers) {
    }

    public void show() {
    }

    private void fadeInTasker() {
    }

    public CompletableFuture<Void> delete() {
        return null;
    }

    private CompletableFuture<Void> remove() {
        return null;
    }

    private Location generateLoc() {
        return null;
    }

    private void spawnIn() {
    }

    private void initialRecheckReceivers() {
    }

    private void updateLooks() {
    }

    private void generateDisplay() {
    }

    public CMITextDisplay getDisplay() {
        return null;
    }
}
