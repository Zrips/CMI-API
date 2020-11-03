package com.Zrips.CMI.Modules.Placeholders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class Placeholder {

    private CMI plugin;
    Pattern placeholderKeepPatern = Pattern.compile("(\\%\\%)([^\\\"^\\%^ ]+)(\\%\\%)(\\B)");
    Pattern placeholderPatern = Pattern.compile("(%)([^\"^%^ ]+)(%)");
    Pattern placeholderPatern2 = Pattern.compile("(\\{)([^\"^%^ ^{^}]+)(\\})");

    private static ChatFilterRule numericalRule = new ChatFilterRule().setPattern("(\\$)(\\d)");

    public Placeholder(CMI plugin) {
	this.plugin = plugin;
    }

    Random random = new Random(System.nanoTime());

    public enum CMIPlaceHolders {
	cmi_user_charges_left("Remaining count of flight charge"),
	cmi_user_charges_max("Maximum allowed amount of flight charges"),
	cmi_user_charges_time,
	cmi_user_charges_cooldown,
	cmi_user_display_name,
	cmi_user_nickname,
	cmi_user_name,
	cmi_user_deathloc,
	cmi_user_cuffed,
	cmi_user_muted,
	cmi_user_inpvp,
	cmi_user_god,
	cmi_user_mail_count,
	cmi_user_warning_count,
	cmi_user_warning_points,
	cmi_user_afk,
	cmi_user_afk_symbol,
	cmi_user_afk_msg,
	cmi_user_afk_for,
	cmi_user_afk_in,
	cmi_user_joinedcounter,
	cmi_user_banned,
	cmi_user_maxhomes,
	cmi_user_exp,
	cmi_user_totalexp,
	cmi_user_level,
	cmi_user_ping,
	cmi_user_gamemode,
	cmi_user_op,
	cmi_user_canfly,
	cmi_user_flying,
	cmi_user_homeamount,
	cmi_user_vanished_symbol,
	cmi_user_balance_formated(true),
	cmi_user_balance_formatted,
	cmi_user_balance,
	cmi_user_prefix,
	cmi_user_suffix,
	cmi_user_nameplate_prefix,
	cmi_user_nameplate_suffix,
	cmi_user_group,
	cmi_user_tfly,
	cmi_user_tfly_formated(true),
	cmi_user_tfly_formatted,
	cmi_user_flightcharge,
	cmi_user_tgod,
	cmi_user_tgod_formated(true),
	cmi_user_tgod_formatted,
	cmi_user_votecount,
	cmi_user_dailyvotecount,
	cmi_user_rank,
	cmi_user_nextranks,
	cmi_user_nextrankpercent,
	cmi_user_nextvalidranks,
	cmi_user_canrankup,
	cmi_user_country("Users country from geoip feature. Example: Germany"),
	cmi_user_country_code("Users country code from geoip feature. Example: UK"),
	cmi_user_city("Users city naeme from geoip feature"),
	cmi_user_name_colorcode("Bukkit color code from nameplate command and -c: variable"),
	cmi_user_glow_code("Bukkit color code from glow command."),
	cmi_user_glow_name("Color name from glow command. Example: Red"),
	cmi_user_jailname("Jail name user currently is in. Example: Prison"),
	cmi_user_jailcell("Jail cell id user currently is in. Example: 1"),
	cmi_user_jailtime("Left jail time. Example: 1hour 5minutes"),
	cmi_user_jailreason,
	cmi_user_bungeeserver,
	cmi_user_playtime_formatted,
	cmi_user_playtime_days,
	cmi_user_playtime_dayst,
	cmi_user_playtime_hours,
	cmi_user_playtime_hoursf,
	cmi_user_playtime_hourst,
	cmi_user_playtime_minutes,
	cmi_user_playtime_minutest,
	cmi_user_playtime_seconds,
	cmi_user_playtime_secondst,
	cmi_user_itemcount_$1("Number of items in players inventory by provided material", "itemIdName(:data)"),
	cmi_user_maxperm_$1_$2("Maximum value by provided permission node, and if it doesnt exist, returns default value", "corePerm", "defaultValue"),
	cmi_equation_$1("Result of provided matchematical equation with fraction", "equation"),
	cmi_equationint_$1("Result of provided matchematical equation without fraction", "equation"),

	cmi_color_$1("Colorizes text, replace spaces with _, underscore can be added by doubling it like __", "text"),

	cmi_iteminhand_displayname,
	cmi_iteminhand_realname,
	cmi_iteminhand_type,
	cmi_iteminhand_itemdata,
	cmi_iteminhand_amount,
	cmi_iteminhand_worth,
	cmi_iteminhand_worth_one,
	// Complex placeholders cant have more than 3
	cmi_schedule_nextin_$1("Left time until next schedule trigger", "schedName"),
	cmi_schedule_endat_$1("Left time until scheduler triggers last command", "schedName"),
	cmi_baltop_name_$1("Name of player from a provided place in a list", "1-10"),
	cmi_baltop_money_$1("Balance of player from a provided place in a list", "1-10"),
	cmi_baltop_shortmoney_$1("Balance of player from a provided place in a list", "1-10"),
	cmi_playtimetop_name_$1("Name of player from a provided place in a list", "1-10"),
	cmi_playtimetop_time_$1("Playtime of player from a provided place in a list", "1-10"),
	cmi_votetop_$1("Name of player from a provided place in a list", "1-10"),
	cmi_votetopcount_$1("Vote count of player from a provided place in a list", "1-10"),
	cmi_worth_buy_$1("Value of the item", "itemIdName(:data)"),
	cmi_worth_sell_$1("Sell value of the item", "itemIdName(:data)"),
	cmi_bungee_total_$1("Total allowed amount of players in defined server", "serverName"),
	cmi_bungee_current_$1("Current amount of players in defined server", "serverName"),
	cmi_bungee_motd_$1("Motd of defined server", "serverName"),
	cmi_bungee_onlinestatus_$1("True/false of servers online status", "serverName"),
	cmi_tps_1("Ttps from last 1 second"),
	cmi_tps_60("Tps from last 60 seconds"),
	cmi_tps_300("Tps from last 5 minutes"),
	cmi_tps_$1_colored("Tps from defined range", "range"),
	cmi_random_player_name,
	cmi_random_$1_$2("Random bumber from defined range", "from", "to"),
	cmi_lastrandom_$1("Random bumber from defined range", "playerName"),
	cmi_user_rank_percent_$1("Percentage of defined rank rankup progress", "rankName"),
	cmi_user_meta_$1("Players metadate by defined key", "key"),
	cmi_user_metaint_$1("Players metadate by defined key as number", "key"),

	cmi_user_kitcd_$1("Cooldown of defined kit", "kitName"),
	cmi_user_kit_available_$1("True/false if kit is avalable", "kitName"),
	cmi_user_kit_hasaccess_$1("True/false if user can use this kit", "kitName"),

	cmi_jail_time_$1_$2("Time of a jail cell", "jailName", "cellId"),
	cmi_jail_username_$1_$2("Name of user who is jailed in particular cell", "jailName", "cellId"),
	cmi_jail_reason_$1_$2("Reason of particular jail cell", "jailName", "cellId"),

	player_world,
	player_x,
	player_y,
	player_z,
	player_biome,
	vault_eco_balance_formatted,
	cmi_server_online,
	server_online,
	cmi_server_online_$1("Online amoutn in particular world. Dont use _ in world name", "worldName"),
	server_online_$1("Online amoutn in particular world. Dont use _ in world name", "worldName"),
	server_max_players,
	server_unique_joins,
	onlineplayers_names,
	onlineplayers_displaynames,

	server_time_$1_$2("Time of server by defined format and timezone", "timeFormat", "timeZone"),
	server_time_$1("Local server time", "timeFormat"),
	world_time12_$1("World time in 12 hour format", "worldName"),
	world_time24_$1("World time in 24 hour format", "worldName");

	static LinkedHashMap<String, CMIPlaceHolders> byNameStatic = new LinkedHashMap<String, CMIPlaceHolders>();
//	static HashMap<String, HashMap<String, HashMap<String, CMIPlaceHolders>>> byNameComplex = new HashMap<String, HashMap<String, HashMap<String, CMIPlaceHolders>>>();
	static LinkedHashMap<String, LinkedHashSet<CMIPlaceHolders>> byNameComplex = new LinkedHashMap<String, LinkedHashSet<CMIPlaceHolders>>();

	static {
	    for (CMIPlaceHolders one : CMIPlaceHolders.values()) {
		String fullName = one.toString();
		if (!one.isComplex()) {
		    byNameStatic.put(fullName.toLowerCase(), one);
		    continue;
		}
		String[] split = fullName.split("_");
		String first = split[0] + "_" + split[1];
		LinkedHashSet<CMIPlaceHolders> old = byNameComplex.getOrDefault(first, new LinkedHashSet<CMIPlaceHolders>());
		old.add(one);
		byNameComplex.put(first, old);
	    }
	}

	private String[] vars;
	private List<Integer> groups = new ArrayList<Integer>();
	private ChatFilterRule rule = null;
	private boolean hidden = false;
	private String desc = null;

	CMIPlaceHolders() {
	}

	CMIPlaceHolders(boolean hideen) {
	    this(null, hideen);
	}

	CMIPlaceHolders(String desc, String... vars) {
	    this(desc, false, vars);
	}

	CMIPlaceHolders(String desc, boolean hidden, String... vars) {
	}

	public static CMIPlaceHolders getByName(String name) {
	    return null;
	}

	public static CMIPlaceHolders getByNameExact(String name) {
	    return null;
	}

	public static CMIPlaceHolders getByNameOld(String name) {

	    return null;
	}

	public static CMIPlaceHolders getByNameExactOld(String name) {

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
	    return rule != null;
	}

	public ChatFilterRule getRule() {
	    return rule;
	}

	public void setRule(ChatFilterRule rule) {
	    this.rule = rule;
	}

	public boolean isHidden() {
	    return hidden;
	}

	public String getDescription() {
	    return desc;
	}
    }

    public List<String> updatePlaceHolders(Player player, List<String> messages) {

	return null;
    }

    public enum CMIPlaceholderType {
	CMI, PAPI, MVdW;
    }

    public CMIPlaceholderType getPlaceHolderType(Player player, String placeholder) {

	return null;
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
	return user.getMeta().getMap().containsKey(key.toLowerCase());
    }

    public boolean containsPlaceHolder(String msg) {
	return false;
    }

    public String translateOwnPlaceHolder(Player player, String message) {
	return translateOwnPlaceHolder(player == null ? null : player.getUniqueId(), message);
    }

    private int maxDepth = 4;

    private String matchInception(UUID uuid, String message, int depth) {

	return null;
    }

    String translateOwnPlaceHolder(UUID uuid, String message) {

	return null;
    }

    private HashMap<String, String> randomCache = new HashMap<String, String>();

    public String getValue(Player player, CMIPlaceHolders placeHolder) {
	return getValue(player, placeHolder, null);
    }

    public String getValue(Player player, CMIPlaceHolders placeHolder, String value) {
	return getValue(player != null ? player.getUniqueId() : null, placeHolder, value);
    }

    public String getValue(UUID uuid, CMIPlaceHolders placeHolder, String value) {
	return null;
    }

    private String variable(Boolean state) {
	return state ? plugin.getMsg(LC.info_variables_True) : plugin.getMsg(LC.info_variables_False);
    }
}
