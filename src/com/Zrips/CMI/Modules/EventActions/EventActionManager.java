package com.Zrips.CMI.Modules.EventActions;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class EventActionManager {

    private CMI plugin;

    public EventActionManager(CMI plugin) {
        this.plugin = plugin;
    }

    public enum eventAction {
        firstJoinServer,
        joinServer,
        quitServer,
        playerDeath(true),
        playerKillPlayer(true),
        playerRespawn,
        playerTeleport,
        bedLeave,
        bedEnter,
        playerWorldChange,
        playerPreWorldChange,
        playerGameModeChange,
        playerKick,
        playerBan,
        playerLevelChange,
        voidFall,
        elytraStartGlide,
        advancementDone,
        elytraEndGlide,
        sneakingSwapHandItems,
        swapHandItems,
        pvpstart,
        pvpend;

        private List<String> commands = new ArrayList<String>();
        private List<String> sourceCommands = new ArrayList<String>();
        private boolean secondary = false;

        private boolean enabled = false;

        eventAction() {
        }

        eventAction(boolean secondary) {
            this.secondary = secondary;
        }

        public List<String> getCommands() {
            return this.commands;
        }

        public List<String> getSourceCommands() {
            return this.sourceCommands;
        }

        public void setCommands(List<String> commands) {
            this.commands = commands;
        }

        public void setSourceCommands(List<String> commands) {
            this.sourceCommands = commands;
        }

        public void clear() {
            commands.clear();
            sourceCommands.clear();
        }

        public boolean isIncludeSource() {
            return secondary;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }

    public void performCommands(eventAction action, Player player) {
        performCommands(action, player, null, null);
    }

    public void performCommands(eventAction action, Player player, String value) {
        performCommands(action, player, null, value);
    }

    public void performCommands(eventAction action, Player player, Player source) {
        performCommands(action, player, source, null);
    }

    public void performCommands(eventAction action, Player player, Player source, String value) {
        performCommands(action, player, source, value, null);
    }

    public void performCommands(eventAction action, Player player, Player source, Object value1, Object value2) {
    }

    private String fileName = "EventCommands.yml";

    public void load() {

    }
}
