package com.Zrips.CMI.commands.list;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class status implements Cmd {
    static final DecimalFormat df = null;
    private static String javaVersion;

    @Override
    public void getExtra(ConfigReader c) {
    }

    private static void showPendingTasks() {
    }

    @Override
    @CAnnotation(priority = 257, info = "&eShow server status", regVar = { 0 }, consoleVar = { 0 }, customAlias = { "gc", "!lag" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static String getDiskUsageText() {
        return null;
    }

    private static String getJavaVersionText() {
        return null;
    }

    private CompletableFuture<HashMap<World, Data>> getInfo() {
        return null;
    }

    private static CompletableFuture<Entity[]> getEntitiesFromChunks(World world, int x, int z, Data data) {
        return null;
    }

    class Data {
        private int tileEntities;
        private int entities;
        private int players;
        private int loadedChunks;
        private int mostTileEntities;
        private String mostTileEntitiesAt;
        private int mostEntities;
        private String mostEntitiesAt;

        public Data(int players, int loadedChunks) {
        }

        public int getTileEntities() {
            return 0;
        }

        public int getEntities() {
            return 0;
        }

        public void add(int x, int z, int tileEntities, int entities) {
        }

        public String getMostTileEntitiesAt() {
            return null;
        }

        public String getMostEntitiesAt() {
            return null;
        }

        public int getMostTileEntities() {
            return 0;
        }

        public int getMostEntities() {
            return 0;
        }

        public int getPlayerCount() {
            return 0;
        }

        public int getLoadedChunks() {
            return 0;
        }
    }
}
