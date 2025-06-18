package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class killall implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eKill mobs around you", args = "(-monsters/-pets/-npc/-animals/-ambient/-named/-f/-lightning/-list/-m:[mobType]) (-r:range) (-s) (-w:[worldName])", tab = {
        "-monsters%%-pets%%-npc%%-animals%%-ambient%%-named%%-f%%-lightning%%-list%%EntityType",
        "-monsters%%-pets%%-npc%%-animals%%-ambient%%-named%%-f%%-lightning%%-list%%EntityType" }, explanation = {}, regVar = { -666 }, consoleVar = { -666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void list(HashMap<Action, Set<Entity>> fullList, CommandSender sender) {
    }

    private void removeEntities(CommandSender sender, Set<Action> actions, HashMap<Action, Set<Entity>> fullList, Integer range, Location center, boolean lightning, boolean silent) {
    }

    private void processEntity(HashMap<Action, Set<Entity>> fullList, Entity entity, boolean named, Set<EntityType> customTypes) {
    }

    private static boolean isEmptyArmorStand(Entity entity) {
        return false;
    }

    private static boolean isNamed(Entity entity) {
        return false;
    }

    public static boolean isMonster(Entity ent) {
        return false;
    }

    private static boolean isTamed(Entity ent) {
        return false;
    }

    private static void process(HashMap<Action, Set<Entity>> fullList, Entity entity, Action action) {
    }

    private enum Action {
        monsters("Removes monsters", "Monsters"), pets("Removes pets", "Pets"), npc("Removes NPCs", "NPCs"), animals("Removes animals", "Animals"), ambient("Removes ambient mobs", "Ambient"), vehicles(
            "Removes vehicles", "Vehicles"), named("Removes mobs with name tags", "With custom name"), custom("Removes by custom type"), f("Compounds all previous flags"), lightning(
                "Strikes lightning on removed mobs"), list("List entities");

        private String desc;
        private String category;

        Action(String desc) {
        }

        Action(String desc, String category) {
        }

        public String getCategory() {
            return null;
        }
    }
}
