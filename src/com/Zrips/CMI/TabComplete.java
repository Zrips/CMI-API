package com.Zrips.CMI;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import com.Zrips.CMI.Containers.CMITabComplete;

public class TabComplete implements TabCompleter {
    private CMI plugin;
    static HashMap<String, TabAction> map;
    public static CMITabComplete tabs;
    private static Set<String> itemNameCache;
    private static Set<String> blockNameCache;

    public TabComplete(CMI plugin) {
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }

    public List<Object> getTabCompleteList(String[] args) {
        return null;
    }

    public String getTabComplete(String tab) {
        return null;
    }

    public void addTabComplete(String tab) {
    }

    public List<String> get(CommandSender sender, String command, String label, String[] args) {
        return null;
    }

    public List<String> getByAction(CommandSender sender, TabAction action, String[] args, int i) {
        return null;
    }

    private static List<String> getColorNames() {
        return null;
    }

    public enum TabAction {
        na, allPlayername("All players including vanished ones"), allIGNPlayername("All IGN players including vanished ones"), playername("All players excluding vanished ones"), mutedplayername(
            "All online muted players"), damageCause("Damage cause variations"), bannedplayername("Banned player names"), playerOption("Player options"), gamemode("Game modes"), worlds("Worlds"), portals(
                "List of portal names. Exclude disabled"), allportals("List of portal names"), itemname("Materials"), playeritems("Materials in player inventory"), blockname("Blocks"), EntityType(
                    "Entity Types"), cleanEntityType("Entity Types without _"), kit("Kit names by access"), kitnames("Kit config names by access"), kitp("Kits by preview access"), chatroom("Chat rooms"),
        biome("Biomes"), treeType("Tree types"), maxplayers("Server max player limit"), potioneffect("Potion effects"), effect("Particle effects"), merchants("Villager professions"), enchant(
            "Enchant names"), limitedEnchant("Enchant names by permission"), halfViewRange("Half of max server view range"), doubleViewRange("Double of max server view range"), ViewRange(
                "Server view range"), maxenchantlevel("Max enchant level. Uses previous variable to determine enchantment"), currentItemName("Item name in main hand"), loreLine(
                    "Lists numbers of lore lines of item in main hand"), currentItemLore("Lists lore of item in main hand"), currentLocation("Current player location"), currentFullLocation(
                        "Current player location with pitch and yaw"), currentX("Current player X position"), currentY("Current player Y position"), currentZ("Current player Z position"), currentWorld(
                            "World name player is in"), currentPitch("Players pitch"), currentYaw("Players yaw"), itemFlag("Item flag values"), nickName("Users display name excluding color codes"),
        fullNickName("Users display name"), gamerule("List of world game rules"), gamerulevalue("Game rule value"), nickNames("All online users nick names"), homes("Users home list"), warps(
            "Warps by access to them"), allwarps("All warps"), playerwarps("Warps by access to them"), rankname("Rank names"), statstype("Statistics names"), statssubtype(
                "Sub statistics names. Uses previous variable to determine main statistic"), motd("Servers motd"), bungeeserver("Bungee servers"), scheduleName("Schedule names"), ctext(
                    "Custom text names"), attachedCommand("Includes attached command"), jail("Jail names"), cellId("Cewll id's. Uses previous variable to determine jail"), sound("Sound names"),
        customalias("Custom alias list"), dbusercollumsshort, placeholders("Placeholders"), warncategory("Warn categories"), projectiletype("Projectile types"), holograms("Hologram names"), mobtype(
            "Mob types"), vanishaction("Vanish actions"), signLine("Sign line text. Uses previous variable to determine line number");

        private String desc;

        TabAction() {
        }

        TabAction(String desc) {
        }

        public static TabAction getAction(String name) {
            return null;
        }

        public String getDesc() {
            return null;
        }
    }
}
