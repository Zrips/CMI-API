package com.Zrips.CMI.Modules.DeathMessages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.FileDownloader;

import net.Zrips.CMILib.ActionBar.CMIActionBar;
import net.Zrips.CMILib.Container.CMIList;
import net.Zrips.CMILib.Container.CMIText;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class DeathMessageManager {

    private CMI plugin;

    HashMap<String, DeathMessages> messages = new HashMap<String, DeathMessages>();

    private List<String> playerHover = new ArrayList<String>();
    private List<String> killerHover = new ArrayList<String>();

    private List<String> disabledWorlds = new ArrayList<String>();
    private List<String> mutedWorlds = new ArrayList<String>();
    private List<String> ignoredPlayers = new ArrayList<String>();

    private String prefix = "";

    private long spamTimeRange = 30 * 1000L;
    private int spamCount = 3;

    private HashMap<UUID, List<Long>> spamProtection = new HashMap<UUID, List<Long>>();

    public DeathMessageManager(CMI plugin) {
        this.plugin = plugin;
    }

    private boolean enabled = false;
    private int autoHideFrom = -1;
    private int range = -1;
    // should be changed to CMIMultiMessageType with future updates
    private String destination = "plain";

    public void relocateDeathMessageLocaleFiles() {

        File destinationFolder = new File(plugin.getDataFolder(), CMI.translationsFolderName + File.separator + CMI.deathMessagesFolderName);
        if (!destinationFolder.isDirectory())
            destinationFolder.mkdir();

        File sourceFolder = new File(plugin.getDataFolder(), CMI.settingsFolderName + File.separator + CMI.deathMessagesFolderName);

        if (sourceFolder.isDirectory()) {
            for (File file : sourceFolder.listFiles()) {
                File to = new File(destinationFolder, file.getName().substring(0, 1).toUpperCase() + file.getName().substring(1, file.getName().length()));
                if (!to.isFile())
                    file.renameTo(to);
            }
            sourceFolder.delete();
        }
    }

    public void defaultLocaleDownloader() {
        try {
            List<String> lang = Arrays.asList("ES", "EN");
            String lr = null;

            boolean download = true;
            try {
                File f = new File(plugin.getDataFolder(), "config.yml");
                if (f.isFile()) {
                    YamlConfiguration conf = YamlConfiguration.loadConfiguration(f);
                    download = conf.getBoolean("LanguageDownload", true);
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
            if (!download)
                return;

            for (String one : lang) {
                File file = new File(plugin.getDataFolder() + File.separator + "Translations" + File.separator + CMI.deathMessagesFolderName, "Locale_" + one + ".yml");
                if (!file.isFile()) {
                    lr = one;
                }
            }

            final String flr = lr;

            for (String one : lang) {
                File file = new File(plugin.getDataFolder() + File.separator + "Translations" + File.separator + CMI.deathMessagesFolderName, "Locale_" + one + ".yml");
                if (!file.isFile()) {
                    FileDownloader downloader = new FileDownloader() {
                        @Override
                        public void afterDownload() {
                            CMI.getInstance().consoleMessage("Downloaded Death Messages Locale_" + one + ".yml file");
                            if (flr != null && one.equalsIgnoreCase(flr))
                                CMI.getInstance().getConfigManager().reloadLanguage();
                        }
                    };
                    downloader.downloadUsingStream("https://raw.githubusercontent.com/Zrips/CMI/master/Settings/DeathMessages/Locale_" + one + ".yml", file.getPath());
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void load() {
        loadConfig();
        loadLocale();
    }

    private void loadConfig() {
        ConfigReader cfg = null;
        try {
            cfg = new ConfigReader(plugin, CMI.settingsFolderName + File.separator + "DeathMessages.yml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cfg == null)
            return;

        ConfigReader mainCfg = plugin.getConfigManager().getConfig();
        // Moving deathMessage section to new file
        if (mainCfg.getC().isInt("Messages.DeathMessage.AutoHideFrom") && !cfg.getC().isInt("AutoHideFrom")) {
            cfg.set("AutoHideFrom", mainCfg.getC().getInt("Messages.DeathMessage.AutoHideFrom"));
            cfg.save();
            try {
                cfg = new ConfigReader(plugin, CMI.settingsFolderName + File.separator + "DeathMessages.yml");
            } catch (Exception e1) {
                e1.printStackTrace();
                return;
            }
        }

        cfg.addComment("EnableCustom", "Enable or disable custom death messages", "Check DeathMessages dirrectory for message options", "",
            "Not all death situations might be included and future updates might be needed",
            "Report any missing death situation you encountered to github issue section with exact way to reproduce death situation");
        enabled = cfg.get("EnableCustom", false);

        cfg.addComment("AutoHideFrom", "Defines number of players from which to automatically start hiding death messages", "Set to -1 to disable this");
        autoHideFrom = cfg.get("AutoHideFrom", -1);

        cfg.addComment("Range", "Range in blocks we should broadcast players death message", "Setting this to any range will automatically exclude players in other worlds");
        range = cfg.get("Range", -1);

        cfg.addComment("Destination", "Where should we should death message", "Options: plain, actionBar");
        destination = cfg.get("Destination", "plain");

        cfg.addComment("DisabledWorlds", "List of worlds where deaths from them are never announced");
        disabledWorlds = cfg.get("DisabledWorlds", Arrays.asList(""));
        CMIList.toLowerCase(disabledWorlds);

        cfg.addComment("MutedWorlds", "List of worlds where deaths are not announced to players");
        mutedWorlds = cfg.get("MutedWorlds", Arrays.asList(""));
        CMIList.toLowerCase(mutedWorlds);

        cfg.addComment("IgnoredPlayers", "List of player names we should ignore and not show their death messages");
        ignoredPlayers = cfg.get("IgnoredPlayers", Arrays.asList(""));
        CMIList.toLowerCase(ignoredPlayers);

        cfg.addComment("AntiSpam.TimeRange", "Time range in seconds we should check when preventing death message spam", "Set to -1 if you want to disable it",
            "Keep in mind that player who dies will continue to see his own death messages even if its over the limit");
        spamTimeRange = cfg.get("AntiSpam.TimeRange", 30) * 1000L;
        cfg.addComment("AntiSpam.Count", "How many death messages we should broadcast from player in previously defined time frame");
        spamCount = cfg.get("AntiSpam.Count", 3);

        cfg.save();
    }

    private void loadLocale() {
        defaultLocaleDownloader();

        File cc = new File(CMI.getInstance().getDataFolder(), CMI.translationsFolderName + File.separator + CMI.deathMessagesFolderName);
        if (!cc.isDirectory())
            cc.mkdir();

        ConfigReader locale = null;
        try {
            locale = new ConfigReader(CMI.getInstance(), CMI.translationsFolderName + File.separator + CMI.deathMessagesFolderName + File.separator + "Locale_" + plugin.getConfigManager().Lang + ".yml");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (locale == null && !plugin.getConfigManager().Lang.equalsIgnoreCase("EN")) {
            plugin.consoleMessage("Failed to load death message (" + plugin.getConfigManager().Lang + ") locale file. Trying to default to EN version");
            try {
                locale = new ConfigReader(CMI.getInstance(), CMI.translationsFolderName + File.separator + CMI.deathMessagesFolderName + File.separator + "Locale_EN.yml");
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        if (locale == null) {
            plugin.consoleMessage("Failed to load death message locale file");
            return;
        }

        locale.addHeaderComments(Arrays.asList(
            "[mobName] - monsters name when its applicable. This can be translated.",
            "[prevMobName] - monsters name when its applicable. This can be translated.",
            "[item] - items display name which was used to kill player. If display name isint present then items material name will be used. This can be translated.",
            "[itemName] - items material name which was used to kill player. This can be translated.",
            "[playerName] - players who died original name",
            "[playerDisplayName] - players who died modified name",
            "[sourceName] - players who caused damage original name",
            "[sourceDisplayName] - players who caused damage modified name"));

        locale.addComment("Prefix", "Defines prefix for all death messages");
        prefix = locale.get("Prefix", "💀");

        locale.addComment("PlayerHover", "Defines hover over infomation about player who died. Use basic placeholders like %cmi_user_name% to include any information you would want",
            "Set this like to \'\' if you want to avoid including hover over message");
        playerHover = locale.get("PlayerHover", Arrays.asList(""));

        if (playerHover.size() == 1 && playerHover.get(0).isEmpty())
            playerHover.clear();

        locale.addComment("KillerHover", "Defines hover over infomation about player who killed. Use basic placeholders like %cmi_user_name% to include any information you would want",
            "Set this like to \'\' if you want to avoid including hover over message");
        killerHover = locale.get("KillerHover", Arrays.asList(""));
        if (killerHover.size() == 1 && killerHover.get(0).isEmpty())
            killerHover.clear();

        messages.clear();

        String path = "Escaping";
        addMessages(path, locale.get(path, Arrays.asList(" &7while escaping &2[sourceDisplayName]", " &7while fighting &2[sourceDisplayName]")));
        path = "RunningAway";
        addMessages(path, locale.get(path, Arrays.asList(" &7while running away from &2[prevMobName]", " &7while fighting &2[prevMobName]")));

        path = "Player.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was killed by &2[sourceDisplayName]", "&2[playerDisplayName] &7died by &2[sourceDisplayName] &7mighty hand",
            "&2[playerDisplayName] &7was punched to death by &2[sourceDisplayName]")));
        path = "Player.Item";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7died by &2[sourceDisplayName] &7hand who used &2[item]")));
        path = CMIDeathType.Player + ".Projectile";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was shot by &2[sourceDisplayName] &7with &2[type]")));
        path = CMIDeathType.Player + ".Fireball";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was fireballed by &2[sourceDisplayName]")));
        path = CMIDeathType.Player + ".Firework";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7went off with a bang due to &2[sourceDisplayName]")));

        path = CMIDeathType.Player + ".Tnt";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was blown up by &2[sourceDisplayName]")));
        
        path = CMIDeathType.FallingBlocks + ".Anvil.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was squashed by a falling anvil", "&2[playerDisplayName] &7was crushed by anvil",
            "&2[playerDisplayName] &7hit anvil with his head")));

        path = CMIDeathType.Block + ".Cactus.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was pricked to death", "&2[playerDisplayName] &7tried to hug cactus")));
        path = CMIDeathType.Block + ".Dispenser.Arrow";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was killed by dispenser with arrows...")));
        path = CMIDeathType.Block + ".Dispenser.Splash_potion";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was splashed all over by dispenser...")));
        path = CMIDeathType.Block + ".Magma_block.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7discovered the floor was lava")));
        path = CMIDeathType.Block + ".Sweet_berry_bush.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was poked to death by a sweet berry bush")));

        path = CMIDeathType.Block + ".Lava.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7tried to swim in lava")));

        path = CMIDeathType.Block + ".Pointed_dripstone.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was impaled on stalagmite")));

        path = CMIDeathType.Custom + ".Block_explosion.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was killed by [Intentional Game Design]")));

        path = CMIDeathType.Custom + ".Starvation.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7starved to death")));

        path = CMIDeathType.Projectile + ".Arrow";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was shot by arrow")));
        path = CMIDeathType.Projectile + ".Spectral_arrow";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was shot by spectral arrow")));
        path = CMIDeathType.Projectile + ".Tipped_arrow";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was shot by tipped arrow")));
        path = CMIDeathType.Projectile + ".Fireball";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was fireballed")));
        path = CMIDeathType.Projectile + ".Firework";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7went off with a bang")));

        path = CMIDeathType.Custom + ".Fall.Low.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7hit the ground too hard")));
        path = CMIDeathType.Custom + ".Fall.High.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7fell from a high place")));
        path = CMIDeathType.Custom + ".Fire.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7went up in flames")));
        path = CMIDeathType.Custom + ".Fire_tick.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7burned to death")));
        path = CMIDeathType.Custom + ".Lightning.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was struck by lightning")));

        path = CMIDeathType.Custom + ".Suffocation.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7suffocated in a wall")));
        path = CMIDeathType.Custom + ".Custom.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7died")));
        path = CMIDeathType.Custom + ".Drowning.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7drowned")));
        path = CMIDeathType.Custom + ".Freeze.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7frozen to death")));
        path = CMIDeathType.Custom + ".Suicide.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7took their own life")));
        path = CMIDeathType.Custom + ".Void.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7fell out of the world")));

        path = CMIDeathType.Custom + ".EndCrystal.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7shattered like a crystal")));

        path = CMIDeathType.Custom + ".Wither.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7withered away")));

        path = CMIDeathType.Custom + ".Fly_into_wall.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7experienced kinetic energy", "&2[playerDisplayName] &7learned what is conservation of momentum")));

        path = CMIDeathType.Mob + ".Primed_tnt.General";
        addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was blown up")));

        for (EntityType ent : EntityType.values()) {
            if (!ent.isAlive())
                continue;
            if (!ent.isSpawnable())
                continue;
            String mobType = CMIText.firstToUpperCase(ent.toString()).replace(" ", "_");

            path = CMIDeathType.Mob + "." + mobType + ".General";
            addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7killed by &2[mobName]")));
            path = CMIDeathType.Mob + "." + mobType + ".Item";
            addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7killed by &2[mobName] &7with &2[item]")));
//	    path = CMIDeathType.Mob + "." + mobType + ".Projectile";
//	    addMessages(path, locale.get(path, Arrays.asList("&2[playerDisplayName] &7was shot by &2[mobName] &7with &2[type]")));
        }

        locale.save();
    }

    private void addMessages(String path, List<String> ls) {
        messages.put(path, new DeathMessages(path, ls));
    }

    public String getDeathMessage(String path) {
        path = path.replace(" ", "_");
        DeathMessages msg = messages.get(path);
        if (msg != null)
            return msg.getRandom();
        return null;
    }

    private List<Player> getPlayersFromRange(Location loc, int range) {
        List<Player> list = new ArrayList<Player>();

        for (Player one : Bukkit.getOnlinePlayers()) {
            Location l = one.getLocation();
            if (range < 0) {

                if (isInMutedWorld(one.getWorld()))
                    continue;

                list.add(one);
                continue;
            }

            if (l.getWorld() != loc.getWorld())
                continue;
            if (l.getBlockX() > loc.getBlockX() + range || l.getBlockX() < loc.getBlockX() - range)
                continue;
            if (l.getBlockY() > loc.getBlockY() + range || l.getBlockY() < loc.getBlockY() - range)
                continue;
            if (l.getBlockZ() > loc.getBlockZ() + range || l.getBlockZ() < loc.getBlockZ() - range)
                continue;

            list.add(one);
        }

        return list;
    }

    public boolean broadcastDeathMessage(Player player, RawMessage rm) {

        rm.show(Bukkit.getConsoleSender());

        if (isInDisabledWorld(player.getWorld())) {
            return false;
        }

        if (ignoredPlayers.contains(player.getName().toLowerCase())) {
            return false;
        }

        addSpamRecord(player.getUniqueId());

        Set<Player> players = new HashSet<Player>();

        boolean spam = isUnderSpamCooldown(player.getUniqueId());

        if (!spam)
            players.add(player);
        else
            players.addAll(getPlayersFromRange(player.getLocation(), range));

        if (autoHideFrom > 0 && autoHideFrom <= players.size()) {
            return false;
        }

        if (destination.equalsIgnoreCase("plain"))
            rm.show(players);
        else {
            CMIActionBar.send(new ArrayList<>(players), rm.getTextOnly());
        }

        return !spam;
    }

    private void addSpamRecord(UUID uuid) {
        if (spamTimeRange < 0)
            return;
        List<Long> list = spamProtection.getOrDefault(uuid, new ArrayList<Long>());
        list.add(System.currentTimeMillis());
        spamProtection.put(uuid, list);
    }

    private boolean isUnderSpamCooldown(UUID uuid) {
        if (spamTimeRange < 0)
            return true;
        List<Long> list = spamProtection.getOrDefault(uuid, new ArrayList<Long>());
        if (list.isEmpty())
            return true;
        Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            Long time = iterator.next();
            if (time + spamTimeRange < System.currentTimeMillis())
                iterator.remove();
        }

        return list.size() <= spamCount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getAutoHideFrom() {
        return autoHideFrom;
    }

    public List<String> getPlayerHover() {
        return new ArrayList<String>(playerHover);
    }

    public List<String> getKillerHover() {
        return new ArrayList<String>(killerHover);
    }

    private boolean isInMutedWorld(World world) {
        if (world == null || world.getName() == null)
            return false;
        return isInMutedWorld(world.getName());
    }

    private boolean isInMutedWorld(String worldName) {
        return mutedWorlds.contains(worldName.toLowerCase());
    }

    private boolean isInDisabledWorld(World world) {
        if (world == null || world.getName() == null)
            return false;
        return isInDisabledWorld(world.getName());
    }

    private boolean isInDisabledWorld(String worldName) {
        return disabledWorlds.contains(worldName.toLowerCase());
    }

    public String getPrefix() {
        return prefix;
    }
}
