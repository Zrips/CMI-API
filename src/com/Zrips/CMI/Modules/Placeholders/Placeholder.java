package com.Zrips.CMI.Modules.Placeholders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class Placeholder {
    private CMI plugin;
    Pattern placeholderKeepPatern;
    Pattern placeholderOthersKeepPatern;
    Pattern placeholderPatern;
    Pattern placeholderPatern2;
    private static ChatFilterRule numericalRule;
    private static Random random;
    private static final String checkItem = null;
    private int maxDepth;
    private HashMap<String, String> randomCache;
    private Player lastRandomPlayer;
    private HashMap<Integer, Player> randomPlayers;

    public Placeholder(CMI plugin) {
    }

    public List<String> updatePlaceHolders(Player player, List<String> messages) {
        return null;
    }

    public CMIPlaceholderType getPlaceHolderType(Player player, String placeholder) {
        return null;
    }

    private static void reportIssue() {
    }

    public String updatePlaceHolders(UUID uuid, String message) {
        return null;
    }

    public String updatePlaceHolders(String message) {
        return null;
    }

    public String updatePlaceHolders(Player player, String message) {
        return null;
    }

    public boolean hasMetaValue(CMIUser user, String key) {
        return false;
    }

    public boolean containsPlaceHolder(String msg) {
        return false;
    }

    public String replacePlaceHolders(String msg, String with) {
        return null;
    }

    public String coolDownPlaceHolders(String msg, Player player) {
        return null;
    }

    public String coolDownPlaceHolders(String msg) {
        return null;
    }

    public String translatePAPIPlaceHolder(Player player, CMIPlaceHolders place, String group) {
        return null;
    }

    public String translateOwnPlaceHolder(Player player, String message) {
        return null;
    }

    private String matchInception(UUID uuid, String message, int depth) {
        return null;
    }

    public String translateOwnPlaceHolder(UUID uuid, String message) {
        return null;
    }

    public String getValue(Player player, CMIPlaceHolders placeHolder) {
        return null;
    }

    public String getValue(Player player, CMIPlaceHolders placeHolder, String value) {
        return null;
    }

    public String getValue(UUID uuid, CMIPlaceHolders placeHolder, String value) {
        return null;
    }

    private void informFailed(String value) {
    }

    private static String variable(Boolean state) {
        return null;
    }

    public enum CMIPlaceHolders {
        cmi_user_charges_left("Remaining count of spawner charges"), cmi_user_charges_max("Maximum allowed amount of spawner charges"), cmi_user_charges_time("Time until next spawner charge"),
        cmi_user_charges_cooldown("Spawner charge cooldown"), cmi_user_display_name("Formatted players display name"), cmi_p_$1_display_name(CMIPlaceHolders.cmi_user_display_name), cmi_user_cleannickname(
            "Players nick name if set or players name otherwise. No color codes"), cmi_user_nickname("Players nick name if set or players name otherwise"), cmi_user_name("Original players name"),
        cmi_user_uuid("Player uuid"), cmi_user_uuid_$1(CMIPlaceHolders.cmi_user_uuid), cmi_user_deathloc("Players last death location"), cmi_user_backloc("Players back location"), cmi_user_cuffed(
            "Identification if player is cuffed"), cmi_p_$1_cuffed(CMIPlaceHolders.cmi_user_cuffed), cmi_user_muted("Identification if player is muted"), cmi_p_$1_muted(CMIPlaceHolders.cmi_user_muted),
        cmi_user_inpvp("Identification if player is in pvp mode"), cmi_user_god("Identification if player has god mode enabled"), cmi_p_$1_god(CMIPlaceHolders.cmi_user_god), cmi_user_sneaking(
            "Identification if player is sneaking"), cmi_user_mail_count("Amount of mails player have"), cmi_user_warning_count("Amount of warnings player have"), cmi_user_warning_points(
                "Amount of warning points player have"), cmi_user_afk("Afk state"), cmi_user_afk_symbol("Afk symbol"), cmi_user_afk_msg("Afk message if present"), cmi_user_afk_for(
                    "Time for how long player is in afk mode"), cmi_user_afk_in("Time when player enters auto afk mode"), cmi_user_spy("Spy state"), cmi_user_cmdspy("Command spy state"), cmi_user_signspy(
                        "Sign spy state"), cmi_user_joinedcounter("Indication if player is joined counter"), cmi_user_banned("Indication if player is banned"), cmi_p_$1_banned(
                            CMIPlaceHolders.cmi_user_banned), cmi_user_maxhomes("Max amount of homes player can have"), cmi_user_homeamount("Amount of homes player has"), cmi_user_homelist(
                                "List of players homes"), cmi_user_missingexp("Missing exp amount until next level"), cmi_user_missingexpp("Missing exp in percentage until next level"), cmi_user_exp(
                                    "Current exp amount for current level"), cmi_user_expp("Current exp in percentage for current level"), cmi_user_totalexp("Total amount of exp player have"),
        cmi_user_level("Players level"), cmi_user_ping("Ping"), cmi_user_gamemode("Game mode"), cmi_user_op("OP state"), cmi_user_pweather("Player weather"), cmi_user_weather("Weather at players world"),
        cmi_user_weatherduration("Weather duration at players world"), cmi_user_canfly("Players ability to fly"), cmi_user_flying("Is player currently flying"), cmi_user_vanished_symbol("Vanish symbol"),
        cmi_user_balance_formated(true), cmi_user_balance_formatted("Formatted users balance"), cmi_user_balance("Clean users balance"), cmi_user_prefix("Players prefix set by permission plugin"),
        cmi_user_suffix("Players suffix set by permission plugin"), cmi_user_group("Players main permission group name"), cmi_user_nameplate_prefix("Players nameplate prefix"), cmi_user_nameplate_suffix(
            "Players nameplate suffix"), cmi_user_tfly("Left temp fly amount in seconds"), cmi_user_tfly_formated(true), cmi_user_tfly_formatted("Formatted temp fly amount"), cmi_user_flightcharge(
                "Flight charge amount"), cmi_user_tgod("Time in seconds for temp god mode"), cmi_user_tgod_formated(true), cmi_user_tgod_formatted("Formatted time for temp god mode"), cmi_user_votecount(
                    "Amount of votes"), cmi_user_dailyvotecount("Daily vote count"), cmi_user_chatcolor("Player chatcolor"), cmi_user_rank(true), cmi_user_rank_displayname("Current rank display name"),
        cmi_user_rank_name("Current rank name"), cmi_user_nextranks("List of next ranks"), cmi_user_nextrankpercent("Percentage done for next rank"), cmi_user_nextvalidranks(
            "Rank list to which player can rank up to"), cmi_user_canrankup("Returns true if player can rank up"), cmi_user_country("Users country from geoip feature. Example: Germany"),
        cmi_user_country_code("Users country code from geoip feature. Example: UK"), cmi_user_city("Users city name from geoip feature"), cmi_user_name_colorcode(
            "Bukkit color code from nameplate command and -c: variable"), cmi_user_glow_code("Bukkit color code from glow command."), cmi_user_glow_name("Color name from glow command. Example: Red"),
        cmi_user_jailed("True or false if player is jailed"), cmi_p_$1_jailed(CMIPlaceHolders.cmi_user_jailed), cmi_user_jailname("Jail name user currently is in. Example: Prison"), cmi_p_$1_jailname(
            CMIPlaceHolders.cmi_user_jailname), cmi_user_jailcell("Jail cell id user currently is in. Example: 1"), cmi_p_$1_jailcell(CMIPlaceHolders.cmi_user_jailcell), cmi_user_jailtime(
                "Left jail time. Example: 1hour 5minutes"), cmi_p_$1_jailtime(CMIPlaceHolders.cmi_user_jailtime), cmi_user_jailreason("Jailed reason"), cmi_p_$1_jailreason(
                    CMIPlaceHolders.cmi_user_jailreason), cmi_user_jailedby("Jailer name"), cmi_p_$1_jailedby(CMIPlaceHolders.cmi_user_jailedby), cmi_user_riding("Entity name player is riding"),
        cmi_user_beingriddenby("Player name who is riding user"), cmi_user_bungeeserver("Bungee server name"), cmi_user_rt_cooldown("Remaining cooldown on random teleportation"), cmi_user_rt_cooldown_$1(
            "Remaining cooldown on random teleportation by world", "worldName"), cmi_user_playtime_formatted("Formatted playtime"), cmi_user_playtime_days("Playtime in days"), cmi_user_playtime_dayst(
                "Playtime in days with fraction"), cmi_user_playtime_hours("Playtime in hours"), cmi_user_playtime_hoursf("Total playtime in hours"), cmi_user_playtime_hourst(
                    "Total playtime in hours with fraction"), cmi_user_playtime_minutes("Playtime in minutes"), cmi_user_playtime_minutest("Total playtime in minutes"), cmi_user_playtime_seconds(
                        "Playtime in minutes"), cmi_user_playtime_secondst("Total playtime in minutes"), cmi_user_prewards_count("Number of claimable prewards"), cmi_user_world_formatted(
                            "Current players world name by using custom identification"), cmi_user_online("Returns player online status"), cmi_p_$1_online(CMIPlaceHolders.cmi_user_online),
        cmi_user_itemcount_$1("Number of items in players inventory by provided material", "itemIdName(:data)"), cmi_user_maxperm_$1_$2(
            "Maximum value by provided permission node, and if it doesn't exist, returns default value", "corePerm", "defaultValue"), cmi_user_toggle_$1(
                "Outputs 1 or 0 if defined feature is toggled on or off", "msg|pay|tp|compass|sospy|sispy|cospy|schest|autoflightrecharge|totem|shiftedit|tagsound|chatbubble"), cmi_user_togglename_$1(
                    "Outputs formatted True or False if defined feature is toggled on or off", "msg|pay|tp|compass|sospy|sispy|cospy|schest|autoflightrecharge|totem|shiftedit|tagsound|chatbubble"),
        cmi_user_holo_page_$1("Outputs page number of hologram player is in at the moment", "hologramName"), cmi_equation_$1("Result of provided mathematical equation with fraction", "equation"),
        cmi_equationint_$1("Result of provided mathematical equation without fraction", "equation"), cmi_color_$1("Colorizes text, replace spaces with _, underscore can be added by doubling it like __",
            "text"), cmi_iteminhand_displayname("Items in main hand display name or formatted material name"), cmi_iteminhand_realname("Items in main hand formatted material name"), cmi_iteminhand_type(
                "Items in main hand material name"), cmi_iteminhand_itemdata("Items in main hand data value. As of 1.13+ returns 0"), cmi_iteminhand_amount("Amount of items in main hand"),
        cmi_iteminhand_durability("Items in main hand left durability"), cmi_iteminhand_maxdurability("Items in main hand max durability"), cmi_iteminhand_custommodeldata(
            "Items in main hand custom model data"), cmi_iteminhand_worth("Returns total worth value of items in main hand"), cmi_iteminhand_worth_one("Returns worth value of one item from main hand"),
        cmi_iteminhand_worthc("Returns total worth value of items in main hand without formatting"), cmi_iteminhand_worthc_one("Returns worth value of one item from main hand without formatting"),
        cmi_schedule_nextin_$1("Left time until next schedule trigger", "schedName"), cmi_schedule_endat_$1("Left time until scheduler triggers last command", "schedName"), cmi_baltop_name_$1(
            "Name of player from a provided place in a list", "1-10"), cmi_baltop_money_$1("Balance of player from a provided place in a list", "1-10"), cmi_baltop_shortmoney_$1(
                "Balance of player from a provided place in a list", "1-10"), cmi_playtimetop_name_$1("Name of player from a provided place in a list", "1-10"), cmi_playtimetop_time_$1(
                    "Playtime of player from a provided place in a list", "1-10"), cmi_votetop_$1("Name of player from a provided place in a list", "1-10"), cmi_votetopcount_$1(
                        "Vote count of player from a provided place in a list", "1-10"), cmi_worth_buy_$1("Value of the item", "itemIdName(:data)"), cmi_worth_sell_$1("Sell value of the item",
                            "itemIdName(:data)"), cmi_worthc_buy_$1("Value of the item without formatting", "itemIdName(:data)"), cmi_worthc_sell_$1("Sell value of the item without formatting",
                                "itemIdName(:data)"), cmi_bungee_total_$1("Total allowed amount of players in defined server", "serverName"), cmi_bungee_current_$1(
                                    "Current amount of players in defined server", "serverName"), cmi_bungee_motd_$1("Motd of defined server", "serverName"), cmi_bungee_onlinestatus_$1(
                                        "True/false of servers online status", "serverName"), cmi_tps_1("Ttps from last 1 second"), cmi_tps_60("Tps from last 60 seconds"), cmi_tps_300(
                                            "Tps from last 5 minutes"), cmi_tps_$1_colored("Tps from defined range", "range"), cmi_tps_$1("Tps from defined range", "range"), cmi_random_player_name(
                                                "Returns random online player name", false), cmi_lastrandom_player_name("Returns last random online player name", false), cmi_random_$1_$2(
                                                    "Random number from defined range", false, "from", "to"), cmi_lastrandom_$1("Last random number assigned to player from random placeholder", false,
                                                        "playerName"), cmi_user_rank_percent_$1("Percentage of defined rank rankup progress", "rankName"), cmi_user_meta_$1(
                                                            "Players metadate by defined key", "key"), cmi_user_metaint_$1("Players metadate by defined key as number", "key"), cmi_chatmute_time(
                                                                "Provides left time for global chat mute"), cmi_chatmute_reason("Provides reason for global chat mute"), cmi_user_baltop(
                                                                    "Player position in baltop"), cmi_user_stats_$1("Player statistics", "mainStat(:optionalSubStat)"), cmi_user_kitcd_$1(
                                                                        "Cooldown of defined kit", "kitName"), cmi_user_kit_available("Amount of kits you can claim"), cmi_user_kit_available_$1(
                                                                            "True/false if kit is available", "kitName"), cmi_user_kit_hasaccess_$1("True/false if user can use this kit", "kitName"),
        cmi_jail_time_$1_$2("Time of a jail cell", "jailName", "cellId"), cmi_jail_username_$1_$2("Name of user who is jailed in particular cell", "jailName", "cellId"), cmi_jail_reason_$1_$2(
            "Reason of particular jail cell", "jailName", "cellId"), cmi_weather_$1("World weather", "worldName"), cmi_weatherduration_$1("World weather duration", "worldName"), cmi_afk_count(
                "Number of afk players"), cmi_maintenance_state("Maintenance state"), cmi_maintenance_message("Maintenance message"), cmi_chat_range("Range for chat messages"), cmi_server_uptime(
                    "How long server is running"), cmi_server_uptime_seconds("How long server is running in seconds"), cmi_server_worlds("List of all existing worlds on server in a list format"),
        cmi_server_vanished("Online vanished player count"), cmi_server_users("Recorder user count"), player_world("Current players world name", true), cmi_player_world("Current players world name"),
        player_x("Current players x position", true), cmi_player_x("Current players x position"), player_y("Current players y position", true), cmi_player_y("Current players y position"), player_z(
            "Current players z position", true), cmi_player_z("Current players z position"), player_biome("Current players biome name", true), cmi_player_biome("Current players biome name"),
        vault_eco_balance_formatted("Formatted players balance. Deprecated", true), server_online("Online player amount", true), cmi_server_online("Online player count"), server_max_players(
            "Max allowed players", true), cmi_server_max_players("Max allowed players"), server_online_$1("Online amount in particular world. Don't use _ in world name", true, true, "worldName"),
        cmi_server_online_$1("Online amount in particular world. Don't use _ in world name", "worldName"), server_unique_joins("Unique player joins to the server", true), cmi_server_unique_joins(
            "Unique player joins to the server"), onlineplayers_names("Formatted list of online players", true), cmi_onlineplayers_names("Formatted list of online players"), onlineplayers_displaynames(
                "Formatted list of online players by using their display names if possible", true), cmi_onlineplayers_displaynames(
                    "Formatted list of online players by using their display names if possible"), server_time_$1_$2("Time of server by defined format and timezone", true, true, "timeFormat", "timeZone"),
        cmi_server_time_$1_$2("Time of server by defined format and timezone", "timeFormat", "timeZone"), server_time_$1("Local server time", true, true, "timeFormat"), cmi_server_time_$1(
            "Local server time", "timeFormat"), world_time12_$1("World time in 12 hour format", true, true, "worldName"), cmi_world_time12_$1("World time in 12 hour format", "worldName"), world_time24_$1(
                "World time in 24 hour format", true, true, "worldName"), cmi_world_time24_$1("World time in 24 hour format", "worldName");

        static LinkedHashMap<String, CMIPlaceHolders> byNameStatic = new LinkedHashMap<>();
        static LinkedHashMap<String, LinkedHashSet<CMIPlaceHolders>> byNameComplex = new LinkedHashMap<>();
        private static int count = 0;
        private int MAX_ENTRIES = 20;
        LinkedHashMap<UUID, PlaceholderCache> map = new LinkedHashMap<UUID, PlaceholderCache>(MAX_ENTRIES + 1, .75F, false) {

            @Override
            protected boolean removeEldestEntry(Map.Entry<UUID, PlaceholderCache> eldest) {
                return size() > MAX_ENTRIES;
            }
        };
        private String vars;
        private List<Integer> groups = new ArrayList<>();
        private ChatFilterRule rule = null;
        private boolean hidden = false;
        private boolean cache = true;
        private String desc = null;
        private CMIPlaceHolders userRedirect = null;

        CMIPlaceHolders() {
        }

        CMIPlaceHolders(String desc, boolean cache, String... vars) {
        }

        CMIPlaceHolders(boolean hideen) {
        }

        CMIPlaceHolders(String desc, String... vars) {
        }

        CMIPlaceHolders(CMIPlaceHolders userRedirect) {
        }

        CMIPlaceHolders(String desc, boolean hidden, boolean cache, String... vars) {
        }

        CMIPlaceHolders(String desc, CMIPlaceHolders userRedirect, boolean hidden, boolean cache, String... vars) {
        }

        public static int getCount() {
            return 0;
        }

        public Object getCachedValue(UUID uuid) {
            return null;
        }

        public void addCachedValue(UUID uuid, String value, int validForMiliSeconds) {
        }

        public static CMIPlaceHolders getByName(String name) {
            return null;
        }

        public static CMIPlaceHolders getByNameExact(String name) {
            return null;
        }

        public String getFull() {
            return null;
        }

        public String getMVdW() {
            return null;
        }

        public List<String> getComplexRegexMatchers(String text) {
            return null;
        }

        public List<String> getComplexValues(String text) {
            return null;
        }

        public boolean isComplex() {
            return false;
        }

        public ChatFilterRule getRule() {
            return null;
        }

        public void setRule(ChatFilterRule rule) {
        }

        public boolean isHidden() {
            return false;
        }

        public String getDescription() {
            return null;
        }

        public boolean isCache() {
            return false;
        }

        public CMIPlaceHolders getUserRedirect() {
            return null;
        }
    }

    public enum CMIPlaceholderType {
        CMI, PAPI, MVdW;
    }
}
