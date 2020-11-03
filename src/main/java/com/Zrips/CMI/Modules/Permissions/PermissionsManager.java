package com.Zrips.CMI.Modules.Permissions;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachmentInfo;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.tp.Teleportations.TpCondition;

public class PermissionsManager {

    private CMI plugin;

    private PermissionInterface perm = null;

    public PermissionsManager(CMI plugin, String label) {
	this.plugin = plugin;
	this.label = label;
	checkPermissions();
    }

    public enum CMIPerm {
	security_admin("Sets players security level"),
	buttonteleport("Allows to teleport to target location when clicking on inventory edit GUI on location icon"),
	enderedit("Allows to edit ender chest of some one else"),
	bedhome("Allows to set home location on interaction"),
	actionbar_colors("Allows to use colors in actionbarmsg command"),
	elevator_use("Allows to use elevator based on signs"),
	elevator_create("Allows to create elevator signs"),
	bossbar_colors("Allows to use colors in bossbarmsg command"),
	bossbar_hpbar("Allows to see hp boss bar when dealing damage to entity. Rechecks every minute."),
//	me_colors("Allows to use colors in me command"),
	dynmap_hidden("Hides player from dynmap map"),
	prewards_notification("Allows to see playtime rewards notifications"),
	prewards_$1("Allows to get particular playtime reward"),
	anvil_colors("Allows to use colors when renaming item"),
	title_colors("Allows to use colors in titlemsg command"),
	tag_color("Tagged player name gets colorized"),
	colors_$1_$star2("Allows all color usage in particular areas", "type"),
	colors_$1_$2("Allows color usage in particular areas. Types: publicmessage, privatemessage, nickname, signs, books, me", "type", "colorName/hex"),
	seevanished("Allows to see vanished people"),
	messages_disablelogin("Disables login message"),
	messages_disablequit("Disables logout message"),
	scrollpainting("Allows to modify paintings"),
	autorespawn("Allows to respawn automatically"),
	elytralaunch("Allows to use elytra launch feature"),
	permisiononerror("Allows to see missing permission on error message"),
	invedit("Allow to edit players inventory"),
	book_colors("Allows to colorize books"),
	damagecontrol_$1("Defines damage multiplier by group", "groupName"),
	chorusteleport("Allows to use chorus to teleport around"),
	teleport_with_$1("Allows teleportation with defined mount", "entityType"),
	randomteleport_cooldownbypass("Allows to bypass random teleport cooldown"),
	fullserver_bypass("Allows to join full server"),
	signs_shiftedit("Allows to edit signs with shift right click"),
	signs_shifteditbypass("Allows to edit signs on protected land"),
	netherportalbypass("Allows nether portal creation when its disabled in config file"),
	silentchest_editing("Allows to edit chests while in silent open mode"),
	interactivesign_$1("Allows to create interactive signs when using [ic:[icName]] as top line of sign", "icName"),
	versioncheck("Allows to see new version message on login"),
	worldlimit_gamemode_bypass("Allows to bypass game mode limitations by worlds"),
	worldlimit_fly_bypass("Allows to bypass fly mode limitations by worlds"),
	worldlimit_fly_aboveroof("Allows to fly over world build limit. Feature should be enabled in config file"),
	worldlimit_god_bypass("Allows to bypass god mode limitations by worlds"),
	spawners_charge_bypass("Allows to bypass charge limitations"),
	namehistory("Allows to see previous players names"),
	inventoryhat("Allows to put block on head from inventory"),
	minecart_change_$1("Allows to change minecart type by right clicking with appropriate item", "minecartType"),
	hologram_$1("Allows to see hologram", "hologramName"),
	kit_$1("Allows to use kit", "kitName"),
	kit_$1_preview("Allows to preview kit without having access to kit", "kitName"),
	kit_bypass_money("Allows to bypass kit money requirement"),
	kit_bypass_exp("Allows to bypass kit exp requirement"),
	kit_bypass_time("Allows to bypass kit time limitations"),
	kit_bypass_onetimeuse("Allows to bypass kit onetimeuse limitations"),

	pvp_godBypass("Allows to damage player while being in god mode"),

	spawngroup_$1("Defines player individual spawn point", "spawnGroup"),
	respawngroup_$1("Defines player individual respawn point", "respawnGroup"),

	rank_$1("Defines default player rank", "rankName"),
	select("Allows to select with selection tool"),

	chatgroup_$1("Defines player custom chat group for public message format", "groupNumber"),
	chatmessagegroup_$1("Defines player custom chat message group for public message format", "groupNumber"),
	chat_shout("Allows to send messges over greater distances"),
	chat_rangebypass("Allows to send messages over greater distances"),
	tablist_$1("Defines player custom tab list group", "groupNumber"),

	elytra("Allows to equip elytra"),
	elytra_boost("Allows to use basic elytra boost. Right click"),
	elytra_superboost("Allows to use elytra super boost. +Shift click"),
	elytra_speedometer("Allows to see speedometer while flying with elytra"),
	elytra_freeflight("Allows to see elytra boost for free"),

	hunger_keepafterdeath("Prevents from hunger to be replenished after death"),

//	hunger_max_$1("Defines max amount of hunger player can have", "value"),
//	hunger_rate_$1("Defines mhow fast hunger is depleating, default rate is 1.0", "value"),

	anvil_itemrename_bypass("Allows to rename items with black listed names"),
	anvil_nolimits("Allows repair items without level limitations"),

	chatfilter_inform("Informs player when some one breaks chat filter rules"),
	chatfilter_bypass_$1("Allows to bypass particular chat filter group", "groupName"),
	commandfilter_bypass("Allows to bypass command spam filter"),
	chatfilter_spambypass("Allows to bypass chat spam filter"),
	deathlocation("Allows to see death location after death"),
	saveinv("Saves player inventory on death to be restored if needed later on"),
	scheduler_exclude("Excludes player from scheduler random player list"),
	openshulker("Allows to use shulkerbox as backpack"),
	openshulker_shift("Allows to use shulkerbox as backpack with shift right click"),
	safeteleport("Prevents teleportation to unsafe locations"),
	safeteleport_bypass_$1("Allows to teleport into unsafe location without confirmation", TpCondition.getBadLocations()),

	viewrange("Allows to have custom view range"),
	viewrange_$1("Defines custom view range", "range(1-15)"),

//	specialized_target("Allows to channge ptarget in specialized commands while performing command"),

	dropspawner("Allows for spawner to be dropped after its being broken"),
	dropspawner_$1("Allows for spawner to be dropped after its being broken by defined type", "entityType"),
	dropspawner_nosilk("Drops spawner without silk touch"),
	spawners_proximity_bypass("Bypass spawner place range limitations"),
	spawners_charge_$1("Defines spawner charge group", "groupName"),

	keepinventory("Allows to keep inventory after death"),
	keepexp("Allows to keep exp after death"),

	informDurability("Player will be informed when durability reaches threshold"),

	egginteract_$1("Allows to change spawner by interacting with egg", "entityType"),
	placespawner("Allows to place spawner and keep its type"),
	placespawner_$1("Allows to place spawner by particular type and keep its type", "entityType"),

	teleport_bypassblacklist("Allows to bypass protection from teleporting with blacklisted items"),
	teleport_currentlocation("Allows to initiate teleportation to the current player location"),

	armorstand_hands("Allows to spawn armorstand with hands"),
	armorstand_offhand("Allows to manipulate armorstand off hand items"),
	bungee_publicmessages_$1("Allows to send public messages to target server", "serverName"),

	warmupbypass_$1("Allows to bypass particular CMI command warmup", "commandName"),

	command("Gives access to base usage of commands"),

//	command_speccommand_$1_cooldownbypass("Allows to bypass specialised command cooldown"),
	command_jump_$1("Defines max jump distance", "[distance]"),
	costbypass_$1("Allows to bypass command cost", "commandName"),
	cooldownbypass_$1("Allows to bypass command cooldown", "commandName"),
	cooldown_$1_$2("Defines command cooldown for player. Spaces need to be separate with _", "some_command", "timer"),
	command_armorstand_$1("Allows to access particular armor stand editor features",
	    "updateitems plate size visible arms gravity glow invulnerable name interactable head body leftArm rightArm leftLeg rightLeg pos"),
	command_armorstand_movebypass("Allows to move armor stand where you cant build. Can help to bypass AntiCheat plugin restrictions"),

	command_donate_bypass("Prevents you from getting items with donate command"),
	command_donate_accept("Allows you to accept items sent throw donate command"),
	command_donate_send("Allows you to send items throw donate command"),

	command_portal_$1("Allows to use portal", "portalName"),
//	command_portalparticles_$1("Allows to see portal particles when requirement is enabled", "portalName"),

	command_world_$1("Allows to teleport to particular world with command", "worldName"),
	command_skin_perm_$1("Allows to change skin to particular player", "skinName"),
	command_point_$1("Allows to change particle type", "particleType"),
	command_ender_preventmodify("Prevents ender chest modification by some one else"),
	command_ender_preventmodify_bypass("Bypass for ender chest modification protection"),
	command_inv_preventmodify("Prevent inventory modifications by others"),
	command_inv_location("Shows target player location in GUI"),
	command_inv_information("Shows target player information in GUI"),
	command_inv_preventmodify_bypass("Bypass for regular inventory modification protection"),
	command_give_max_$1("Max item stack size player can use", "number"),
//	command_tgod_give("Allows to give tgod for some one else"),
//	command_tfly_give("Allows to give tfly for some one else"),
	command_tfly_admin("Allows to manage tfly for players"),
	command_tfly_maxtime_$1("Defines max amount of time player can have with tfly command", "seconds"),
	command_spawner_shiftclick("Allows to use spawner set GUI on shift clicking it"),
	command_spawner_$1("Allows to change spawner with command to defined type", "entityType"),
	command_repair_$1("Allows to repair specific area", "hand/armor/all"),
	command_head_othersource("Allows to get head of another player"),
	command_note_add("Allows to add notes"),
	command_note_remove("Allows to remove or clear notes"),
	command_gm_$1("Allows to change game mode to particular type", "gameType"),
	command_replaceblock_speed("Allows to adjust replaceblock speed"),
	command_scan_speed("Allows to adjust scan speed"),
	command_fixchunk_speed("Allows to adjust chunk fix speed"),
	command_enchant_bypasslimit("Allows to bypass enchant limitations"),
	command_enchant_bypassinvalid("Allows to enchant items with enchants which usualy are not possible on items"),
	enchantments_$1("Allows to enchant items with specific enchant"),
	enchantments_$1_$2("Allows to enchant items with specific enchant to specific max level"),
	command_attachcommand_cc("Allows to attach console command to item"),
	command_attachcommand_silent("Allows to attach silent commands"),
	command_sendall_bypass("Prevents player from being sent to target server"),
	command_heal_all("Allows to heal every online player"),
	command_feed_all("Allows to feed every online player"),
	command_$1_others("Allows to perform command on another player", "commandName"),
	command_prewards_others_claim("Allows to claim rewards for others"),
	command_$1_others_$2("Allows to perform command on another player", "commandName", "extra"),
	command_msg_vanish("Allows to send private messages to vanished players"),
	command_msg_togglebypass("Allows to send private messages even if player has pm toggled off"),
	command_msg_$1_send("Allows to send private messages to specific player groups", "mainGroupName"),
	command_bossbarmsg_admin("Allows to use commands in bossbar automated messages"),
	command_sell_$1("Allows to sell items not only from your hand", "blocks/all"),

	command_patrol_bypass("Player with permission will not be included into patrol list"),

	command_afk_auto("Places player into afk mode autoamticaly"),
	command_afk_staffinform("Uses different afk auto response message"),
	command_afk_kickbypass("Prevents player from being kicked out of server when afk mode triggers event"),

	command_cheque_admin("Allows to give out checque with money amount directly to target player without requiring paper"),

	command_invcheck_edit("Allows to edit saved inventory"),

	command_warp_$1("Allows to use particular warp if warp requires permission node", "warpName"),
	command_warp_showlist("Allows to see warp list in chat or gui"),
	command_warp_redefine("Allows to redefine warps"),
	command_counter_autojoin("Players will automatically join counter group on server join"),

	command_tpa_warmupbypass("Allows to bypass tpa command warmup"),
	command_tpahere_warmupbypass("Allows to bypass tpahere command warmup"),

	command_home_bypassprivate("Allows to teleport to private another player home location"),
	command_homes_range("Allows to see homes by range from you"),
	command_sethome_unlimited("Allows to have unlimited amount of homes"),
	command_sethome_$1("Allows to have defined amount of homes", "anyPositiveNumber"),
	command_sethome_customloc("Allows to define custom location for new home"),
	command_sethome_iconpicker("Allows to see icon picker after using command"),
	command_sethome_overwrite("Allows to overwrite existing home location"),
	command_sethome_bypass("Allows to bypass block break protection"),

	command_setwarp_unlimited("Allows to have unlimited amount of warps"),
	command_setwarp_$1("Allows to have defined amount of warps", "anyPositiveNumber"),
	command_removewarp_bypass("Allows to remove warps which belong to anoher player"),

	command_mail_read("Allows to read mail"),
	command_mail_clear("Allows to clear mail"),
	command_mail_send("Allows to send mail"),

	command_glow_color_$1("Allows to change glow color", "colorName"),
	command_walkspeed_$1("Defines max walkspeed player can set", "range0-10"),
	command_tptoggle_bypass("Allows teleportation to players with disabled teleportations"),
	command_sudo_bypass("Prevents player from using sudo on player with permission"),
	command_repair_repairshare_bypass("Allows to bypass repair share being applied on item"),
	command_nick_bypassblacklist("Allows to bypass nick name black list"),
	command_nick_bypass_length("Allows to bypass nick name lenght limitations"),
	command_nick_bypassinuse("Allows to bypass limitationn in using already existing name"),
	command_nick_different("Allows to set nick name to different one than original"),
	command_msg_clean("Allows to send clean messages to player by using ! at beginning"),
	command_msg_noreply("Allows to send clean messages to player by using !- at beginning without option to reply"),
	command_ignore_bypass("Allows to perform commands on who ignores you"),
	command_silence_bypass("Allows to send messages who is in silence mode"),
	command_more_oversize("Allows to get oversized stacks"),
	command_list_admin("Places player into admin group in list"),
	command_list_staff("Places player into staff group in list"),
	command_list_hidden("Allows to see hidden players in player list"),
	command_list_group_$1("Assigns player to defined group", "groupNumber"),
	command_checkban_seereason("Allows to see players ban reason"),
	command_mirror_nodeduct("Will not use blocks when placing them in survival and in mirror mode"),
	command_lfix_admin("Allows to fix light in area bigger than you can see"),
	command_commandspy_hide("Hides performed commands from commandspy"),
	command_commandspy_bypass("Bypasses blacklisted command spy commands"),
	command_signspy_hide("Hides created signs from signspy"),
	command_socialspy_hide("Hides social messages from social spy"),
	command_mute_bypass("Bypass personal public chat mute"),
	command_mutechat_bypass("Bypass public chat mute"),
	command_money_admin("Allows to manipulate player balance"),
	command_money_betweenworldgroups("Allows money transfer between worlds"),
	command_time_edit("Allows to manipulate time"),
	command_weather_$1_$2("Allows to define max lenght player can change weather to", "sun/rain", "maxValue"),
	command_back_ondeath("Allows returning to death location by using back command after death"),
	command_back_worldbypass("Allows returning to blacklisted worlds"),
	command_flightcharge_admin("Allows to edit flight charges for players"),
	command_kick_bypass("Prevent player from being kicked from server"),
	command_ride_$1("Allow to ride entity", "entityType"),
	command_sit_stairs("Allows to sit on stairs automatically"),
	command_maintenance_bypass("Allows to bypass maintenance mode"),
	command_alert_inform("Player will get notification on player join with alert"),
	command_helpop_inform("Players with permission gets helpop messages"),
	command_fly_safelogin("Safely lands player after relog if he is in air"),
	command_cuff_bypass("Allows command usage while cuffed"),
	command_jail_bypasscmd("Allows command usage while jailed"),
	command_jail_bypass("Prevents player from being jailed"),
	command_jail_maxtime_$1("Defines max amount of time player can jail someone", "seconds"),
	command_near_hide("Hides player from being shown in near command"),
	command_near_max_$1("Defines max distance for near command to override default", "blocks"),
	command_silent("Allows to use -s variable in commands to avoid sending feedback messages to target player"),
	command_warn_bypass("Prevents player from being warned"),
	command_ban_bypass("Prevents player from being banned"),
	command_banip_bypass("Prevents player from being banned by ip"),
	command_tempban_bypass("Prevents player from being tempbanned"),
	command_tempban_max_unlimited("Allows to temp ban for more than config allows"),
	command_tempban_max_$1("Allows to temp ban for defined max time", "anyPositiveNumber"),
	command_broadcast_colors("Allows to use colors in broadcast messages"),
	command_charges_edit("Allows to edit players spawner charges"),
	command_checkaccount_showip("Allows to see players ip in check account"),
	command_info_ip("Allows to see players ip in info page"),
	command_info_pos("Allows to see pos location in info page"),
	command_info_bed("Allows to see bed location in info page"),
	command_info_back("Allows to see back location in info page"),
	command_info_deathlocation("Allows to see death location in info page"),
	command_clearchat_bypass("Players chat with permission will not be cleared"),
	command_counter_force("Allows to force counter message on surrounding players"),
	command_counter_time("Allows to change counter default time"),
	command_counter_range("Allows to change counter default range"),
	command_counter_center("Allows to use counter custom location"),
	command_counter_msg("Allows to change counter default message"),
	command_ctext_$1("Allows to see defined custom message", "ctextName"),
	command_flyspeed_$1("Defines max flight speed player can set", "range1-10"),

	command_chat_kick("Allows to kick players from chat room"),
	command_chat_create("Allows to create chatroom"),
	command_chat_create_private("Allows to create private chatrooms"),
	command_chat_invite("Allows to intite player into chatroom"),
	command_chat_joinbypass("Allows to join private chat room without invitation"),
	command_chat_list("Allows to list players in chat room"),
	command_chat_listrooms("Allows to list all chat rooms"),

	customalias_$1("Allows to use particular alias if it requires permission", "alias"),

	command_repair("", false),
	command_$1("", false);

	private Boolean show = true;
	private String desc;
	private String[] wars;

	CMIPerm(String desc, Boolean show) {
	    this.desc = desc;
	    this.show = show;
	}

	CMIPerm(String desc) {
	    this.desc = desc;
	}

	CMIPerm(String desc, String... wars) {
	    this.desc = desc;
	    this.wars = wars;
	}

	public String getDesc() {
	    return desc;
	}

	public void setDesc(String desc) {
	    this.desc = desc;
	}

	public String getPermissionForShow() {
	    return getPermissionForShow(false);
	}

	public String getPermissionForShow(boolean cmd) {
	    return null;
	}

	public String getPermission() {
	    return getPermission("");
	}

	public String getPermission(String... extra) {
	    return null;
	}

	public boolean hasPermission(CommandSender sender) {
	    return hasPermission(sender, false);
	}

	public boolean hasPermission(CommandSender sender, Integer... extra) {
	    return false;
	}

	public boolean hasPermission(CommandSender sender, String... extra) {
	    return hasPermission(sender, false, extra);
	}

	public boolean hasPermission(CommandSender sender, Long delay, String... extra) {
	    return hasPermission(sender, false, true, delay, extra);
	}

	public boolean hasPermission(CommandSender sender, boolean inform, String... extra) {
	    return hasPermission(sender, inform, true, extra);
	}

	public boolean hasPermission(CommandSender sender, boolean inform, boolean informConsole, String... extra) {
	    return hasPermission(sender, inform, informConsole, null, extra);
	}

	public boolean hasPermission(CommandSender sender, boolean inform, Long delayInMiliSeconds) {
	    return hasPermission(sender, inform, true, delayInMiliSeconds);
	}

	public boolean hasPermission(CommandSender sender, boolean inform, boolean informConsole, Long delay, String... extra) {
	    return false;
	}

	private static void informConsole(CommandSender sender, String permission, boolean informConsole) {
	}

	public boolean hasSetPermission(CommandSender sender, String... extra) {
	    return hasSetPermission(sender, false, extra);
	}

	public boolean hasSetPermission(CommandSender sender, boolean inform, String... extra) {
	    return hasSetPermission(sender, this.getPermission(extra), inform);
	}

	public static boolean hasSetPermission(CommandSender sender, String perm, boolean inform) {
	    return false;

	}

	public String[] getWars() {
	    return wars;
	}

	public void setWars(String[] wars) {
	    this.wars = wars;
	}

	public Boolean getShow() {
	    return show;
	}

	public void setShow(Boolean show) {
	    this.show = show;
	}

	public static boolean hasPermission(CommandSender sender, String permision, Boolean output) {
	    return hasPermission(sender, permision, output, true);
	}

	public static boolean hasPermission(CommandSender sender, String permision, Boolean output, boolean informConsole) {
	    return false;
	}
    }

    private void permissionMessage(String permissionPlugin) {
	plugin.consoleMessage("Permission plugin: &5" + permissionPlugin);
    }

    public void checkPermissions() {
	
    }

    public String getMainGroup(Player player) {
	return null;
    }

    public String getPrefix(UUID uuid) {
	return null;
    }

    public String getSufix(UUID uuid) {
	return null;
    }

    public String getPrefix(Player player) {
	return null;
    }

    public String getSufix(Player player) {
	return null;
    }

    public String getNameColor(Player player) {
	return null;
    }

    private String label = "";

    public PermissionAttachmentInfo getSetPermission(CommandSender sender, String perm) {
	return null;
    }

    public boolean isSetPermission(CommandSender sender, String perm) {
	return true;
    }

    public boolean isSetPermission(Player player, String perm) {
	return false;
    }

    private HashMap<UUID, HashMap<String, PermissionInfo>> cache = new HashMap<UUID, HashMap<String, PermissionInfo>>();

    public void removeFromCache(Player player) {
	cache.remove(player.getUniqueId());
    }

    public PermissionInfo getFromCache(Player player, String perm) {
	return null;
    }

    public PermissionInfo addToCache(Player player, String perm, boolean has, Long delayInMiliseconds) {
	return null;
    }

    public PermissionInfo getPermissionInfo(Player player, String perm, Long delayInMiliseconds) {
	return getPermissionInfo(player, perm, false, delayInMiliseconds);
    }

    public PermissionInfo getPermissionInfo(Player player, CMIPerm perm) {
	return getPermissionInfo(player, perm, 1000L);
    }

    public PermissionInfo getPermissionInfo(Player player, CMIPerm perm, Long delayInMiliseconds) {
	return null;
    }

    @Deprecated
    public PermissionInfo getPermissionInfo(Player player, String perm) {
	return getPermissionInfo(player, perm, false, 1000L);
    }

    public PermissionInfo getPermissionInfo(Player player, String perm, boolean force) {
	return getPermissionInfo(player, perm, force, 1000L);
    }

    public PermissionInfo getPermissionInfo(Player player, String perm, boolean force, Long delay) {	
	return null;
    }
}
