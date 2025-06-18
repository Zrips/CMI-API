package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIAsyncHead;

public class spawnmob implements Cmd {
    int spawned;
    int spawnedPassangers;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 190, info = "&eSpawns entity at your location", args = "[EntityType]", tab = { "EntityType" }, explanation = { "Example: /cmi spawnmob sheep:adult:rainbow 3 sp:5",
        "<T>More information at www.zrips.net/cmi/commands/spawnmob/</T><URL>https://www.zrips.net/cmi/commands/spawnmob/</URL>" }, regVar = { -100 }, consoleVar = { -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void processPassenger(String value, int count, Entity current, Location loc, CommandSender sender) {
    }

    private static ItemStack getItem(String name, CMIAsyncHead ahead) {
        return null;
    }

    public static void proccessMob(CommandSender sender, Entity ent, String subValues) {
    }

    private static void proccessMob(Player owner, Entity ent, List<String> subArg) {
    }

    enum spawnmobValues {
        glow, n_$1("name-$1"), hidename, s_$1("speed-$1"), sc_$1("scale-$1"), effect_$1("effects-$1"), hp_$1, pickup("pickitems"), nopickup, immortal, invisible, nograv("nogravity"), baby, adult, derp,
        dumb("noai"), expire_$1("ex-$1"), notpersistent, t_$1("target-$1"), tamed, saddle, chest, angry, upwards("dinnerbone"), rainbow("jeb"), charge("charged"), bounce, screaming, brown, none, onfire,
        skull_$1("head-$1"), helmet_$1, chestplate_$1("breastplate-$1"), legs_$1, boots_$1, mhand_$1("mainhand-$1"), ohand_$1("offhand-$1"), noplate, arms, noarms, small, warm, cold, temperate, incendiary;

        private String alternatives;
        private boolean variable = false;
        static HashMap<String, spawnmobValues> cache = new HashMap<>();

        spawnmobValues() {
        }

        spawnmobValues(String... alternatives) {
        }

        public String[] getAlternatives() {
            return null;
        }

        public boolean isVariable() {
            return false;
        }

        public static spawnmobValues getByVariable(String variable) {
            return null;
        }
    }
}
