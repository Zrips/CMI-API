package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class launch implements Cmd {
    public static HashMap<UUID, Long> fall;
    public static HashMap<UUID, extraLaunch> map;

    @Override
    public void getExtra(ConfigReader c) {
    }

    public static Vector calculateVelocity(Vector from, Vector to, double heightGain) {
        return null;
    }

    private static double distanceSquared(Vector from, Vector to) {
        return 0.0;
    }

    @Override
    @CAnnotation(priority = 125, info = "&eLaunch at direction you are looking or at angle", args = "(playerName) (p:[power]) (a:[angle]) (d:[direction]) (loc:[x]:[y]:[z]) (-nodamage)", tab = {
        "playerName", "-nodamage", "p:", "a:" }, explanation = { "cmi launch - will launch at direction you are looking", "cmi launch -nodamage - will launch and prevent damage on fall",
            "cmi launch p:3.2 - will launch with power of 3.2", "cmi launch p:2.5 a:25 - will launch at direction you are looking with angle of 25 dgrees and with power of 2.5",
            "cmi launch Zrips d:east - will launch to east direction same angle you are looking", "cmi launch Zrips d:0 - will launch at 0 degrees direction (south)",
            "cmi launch Zrips d:~180 - will launch backwards", "cmi launch d:45 a:30 p:2 - will launch south-west at 30 degree angle with power of 2",
            "cmi launch loc:150:120:123 - will launch player to target location" }, regVar = { 0, 1, 2, 3, 4, 5 }, consoleVar = { 1, 2, 3, 4, 5 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static void launchFar(extraLaunch launch) {
    }

    private void jumpByAngle(Player player, Double multy, Float angle, Float direction) {
    }

    private static double fixValue(double value) {
        return 0.0;
    }

    private enum dir {
        west(90F), east(-90F), north(-180F), south(0F);

        private Float direction;

        dir(Float direction) {
        }

        public Float getDirection() {
            return null;
        }
    }

    private class extraLaunch {
        private Player player;
        private int times;
        private CMITask task;
        private Vector vector;
        private Location prevLoc;

        public Player getPlayer() {
            return null;
        }

        public void setPlayer(Player player) {
        }

        public int getTimes() {
            return 0;
        }

        public void setTimes(int times) {
        }

        public CMITask getTask() {
            return null;
        }

        public void setTask(CMITask task) {
        }

        public Vector getVector() {
            return null;
        }

        public void setVector(Vector vector) {
        }

        public Location getPrevLoc() {
            return null;
        }

        public void setPrevLoc(Location prevLoc) {
        }
    }
}
