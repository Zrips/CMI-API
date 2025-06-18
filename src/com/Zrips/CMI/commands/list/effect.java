package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class effect implements Cmd {
    HashMap<UUID, freezeTimer> freezeSched;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&eAdds potion effect to player. use clear to remove all effects", args = "[playername/all] [effect/clear] (duration/infinite) (multiplier) (-s) (-visual)", multiTab = {
        "[playername],clear [potioneffect],freeze,clear 60,infinite 1" }, explanation = { "-visual will add visible bubbles and icon on top right corner", "Examples:",
            "/cmi effect zrips nightvision 60 1 - will give 60 sec night vision for Zrips", "/cmi effect zrips nightvision +10 - will add 10 sec to current night vision time",
            "/cmi effect zrips nightvision -10 - will take out 10 sec from current night vision time", "/cmi effect all health_boost 60 1 - will boost hp by 1 for everyone online" }, regVar = { 1, 2, 3, 4,
                5, 6 }, consoleVar = { 1, 2, 3, 4, 5, 6 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void freezePlayer(Player player, long ticks) {
    }

    private enum durationAction {
        add, take, def;
    }

    class freezeTimer {
        private long until;
        private CMITask task;

        public freezeTimer(long ticks, CMITask task) {
        }

        public CMITask getTask() {
            return null;
        }

        public freezeTimer setTask(CMITask task) {
            return null;
        }

        public long getUntil() {
            return 0;
        }

        public void setUntil(long until) {
        }
    }
}
