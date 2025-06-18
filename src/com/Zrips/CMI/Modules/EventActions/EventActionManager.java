package com.Zrips.CMI.Modules.EventActions;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class EventActionManager {
    private CMI plugin;
    private String fileName;

    public EventActionManager(CMI plugin) {
    }

    public void performCommands(eventAction action, Player player) {
    }

    public void performCommands(eventAction action, Player player, String value) {
    }

    public void performCommands(eventAction action, Player player, Player source) {
    }

    public void performCommands(eventAction action, Player player, Player source, String value) {
    }

    public void performCommands(eventAction action, Player player, Player source, Object value1, Object value2) {
    }

    public void load() {
    }

    public enum eventAction {
        firstJoinServer, joinServer, quitServer, playerDeath(true), playerKillPlayer(true), playerRespawn, playerTeleport, bedLeave, bedEnter, playerWorldChange, playerPreWorldChange, playerGameModeChange,
        playerKick, playerBan, playerLevelChange, voidFall, elytraStartGlide, advancementDone, elytraEndGlide, sneakingSwapHandItems, swapHandItems, pvpstart, pvpend;

        private List<String> commands = new ArrayList<>();
        private List<String> sourceCommands = new ArrayList<>();
        private boolean secondary = false;
        private boolean enabled = false;
        private boolean disableEvent = false;

        eventAction() {
        }

        eventAction(boolean secondary) {
        }

        public List<String> getCommands() {
            return null;
        }

        public List<String> getSourceCommands() {
            return null;
        }

        public void setCommands(List<String> commands) {
        }

        public void setSourceCommands(List<String> commands) {
        }

        public void clear() {
        }

        public boolean isIncludeSource() {
            return false;
        }

        public boolean isEnabled() {
            return false;
        }

        public void setEnabled(boolean enabled) {
        }

        public boolean isDisableEvent() {
            return false;
        }

        public void setDisableEvent(boolean disableEvent) {
        }
    }
}
