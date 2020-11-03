package com.Zrips.CMI.Locale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Zrips.CMI.Config;
import com.Zrips.CMI.utils.DateFormat;

public enum LC {
    info_prefix("&e[&aCMI&e] ", "Use !prefix! in any locale line to automatically include this prefix"),
    info_NoPermission("&cYou don't have permission!"),
    info_CantHavePermission("&cYou can't have this permission!"),
    info_WrongGroup("&cYou are in wrong group for this!"),
    info_NoPlayerPermission("&c[playerName] doesn't have permission for: [permission]"),
    info_Ingame("&cYou can only use this in game!"),
    info_NoInformation("&cNo information found!"),
    info_Console("&6Server"),
    info_FromConsole("&cYou can only use this in the console!"),
    info_NotOnline("&cThe player is not online!"),
    info_NobodyOnline("&cThere is no one online!"),
    info_Same("&cCan't open your own inventory for editing!"),
    info_cantLoginWithDifCap("&cCan't login with different name capitalization! Old name: &e[oldName]&c. Current: &e[currentName]"),
    info_Searching("&eSearching for player data, please wait, this can take some time to finish!"),
//    info_PlayerDataLoading("&cCan't find player with this name. &eBut player data is still beying loaded in background, check it again later!"),
    info_NoPlayer("&cCan't find player with this name!"),
    info_NoCommand("&cThere is no command by this name!"),
    info_NoCommandWhileSleeping("&cCan't perform commands while sleeping!"),
    info_cantFindCommand("&5Couldn't find &7[%1]&5 command, did you mean &7[%2]&5?"),
    info_nolocation("&4Can't find suitable location"),
    info_PurgeNotEnabled("&cPurge function is not enabled in config file!"),
    info_FeatureNotEnabled("&cThis feature is not enabled!"),
    info_TeamManagementDisabled("&7This feature will have limited functionalaty while DisableTeamManagement is set to true!"),
    info_ModuleNotEnabled("&cThis module is not enabled!"),
    info_versionNotSupported("&cServer version is not supported for this feature"),
    info_bungeeNoGo("&cThis feature will not work on bungee network based servers"),
    info_clickToTeleport("&eClick to teleport"),
    info_UseMaterial("&4Please use material names!"),
    info_UseInteger("&4Please use numbers!"),
    info_UseBoolean("&4Please use True or False!"),
    info_NoLessThan("&4Number can't be less than [amount]!"),
    info_NoMoreThan("&4Value can't be more than [amount]"),
    info_NoGameMode("&cPlease use 0/1/2/3 or Survival/Creative/Adventure/Spectator or s/c/a/sp!"),
    info_NoWorld("&4Can't find world with this name!"),
    info_IncorrectLocation("&4Location defined incorrectly!"),
    info_NameChange("&6[playerDisplayName] &elogged in, also known as: &6[namelist]"),
    info_Cooldowns("&eThis command is on cooldown for another &6[time]"),
    info_specializedCooldowns("&eCooldown in motion for this command, please wait &6[time]"),
    info_CooldownOneTime("&eThis command can only be used once!"),
    info_WarmUp_canceled("&eCommand was cancelled due to your movement"),
    info_WarmUp_counter("!actionbar!&6--> Wait &e[time] &6seconds <--"),
    info_WarmUp_DontMove("!title!&6Don't move!!subtitle!&7Wait &c[time] &7seconds"),
    info_WarmUp_Boss_DontMove("&4Don't move for &7[autoTimeLeft] &4seconds!"),
    info_WarmUp_Boss_WaitFor("&4Wait for &7[autoTimeLeft] &4seconds!"),
    info_Spawner("&r[type] Spawner"),
    info_FailedSpawnerMine("!actionbar!&cFailed to mine spawner. &7[percent]% &cdrop chance"),
    info_ClickSpawner("!actionbar!&7[percent]% &eDrop chance"),
    info_Elevator_created("&eCreated elevator sign"),
    info_CantPlaceSpawner("&eCan't place spawner so close to another spawner (&6[range]&e)"),
    info_ChunksLoading("&eWorld chunk data is still being loaded. Please wait a bit and try again."),
    info_ShulkerBox("Shulker Box"),
    info_CantuseShulkerBox("&cCan't use shulker box while you are in combat with player. Wait: [time]"),
    info_CantUseNonEncrypted("!actionbar!&cCommands on this item are not encrypted. Can't use them!"),
    info_CantDecode("!actionbar!&cCan't decode message/command. Key file contains wrong key for this task. Inform server administration about this"),
    info_Show("&eShow"),
    info_Remove("&cRemove"),
    info_Back("&eBack"),
    info_Forward("&eForward"),
    info_Update("&eUpdate"),
    info_Save("&eSave"),
    info_Delete("&cDelete"),
    info_Click("&eClick"),
    info_Preview("&ePreview"),
    info_PasteOld("&ePaste old"),
    info_ClickToPaste("&eClick to paste into chat"),
    info_CantTeleportWorld("&eYou can't teleport to this world"),
    info_CantTeleportNoWorld("&cTarget world doesn't exist. Teleportation canceled"),
    info_CantTeleport("&eYou can't teleport because you have too many limited items. Scroll over this line to see the maximum amount of items allowed."),
    info_teleported("&eYou have been teleported."),
    info_BlackList("&e[material] [amount] &6Max: [max]"),
    info_PlayerSpliter("&e----- &6[playerDisplayName] &e-----"),
    info_Spliter("&e--------------------------------------------------"),
    info_ListSpliter(", "),
    info_ProgressBarFill("&2\u258F"),
    info_ProgressBarEmpty("&e\u258F"),
//    info_helpPagePrefix2("&e* [description]"),
//    info_explanationPagePrefix2("&e * [description]"),
    info_nothingInHand("!actionbar!&eYou need to hold item in hand"),
    info_nothingInHandLeather("&eYou need to hold leather item in hand"),
    info_nothingToShow("&eNothing to show"),
    info_noItem("&cCan't find item"),
    info_dontHaveItem("&cYou don't have &6[amount]x [itemName] &cin your inventory"),
    info_wrongWorld("&cCan't do this in this world"),
    info_wrongPortal("&cYou are in incorrect area of effect"),
    info_differentWorld("&cDifferent worlds"),
    info_HaveItem("&cYou have &6[amount]x [itemName] &cin your inventory"),
    info_ItemWillBreak("!actionbar!&eYour item (&6[itemName]&e) will break soon! &e[current]&6/&e[max]"),
    info_ArmorWillBreak("!actionbar!&eYour [itemName] will break soon! &e[current]&6/&e[max]"),
    info_cantDoInGamemode("&eYou can't do this in this game mode"),
    info_cantDoForPlayer("&eYou can't do this to &6[playerDisplayName]"),
    info_cantDoForYourSelf("&eYou can't do this to yourself"),
    info_cantDetermineMobType("&cCan't determine mob type from &e[type] &cvariable"),
    info_cantRename("!actionbar!&eYou can't use this name"),
    info_wrongName("&cWrong name"),
    info_unknown("unknown"),
    info_invalidName("&cInvalid name"),
    info_alreadyexist("&4This name is taken"),
    info_dontexist("&4Nothing found by this name"),
    info_worldDontExist("&cTarget world can't be accessed anymore. Can't teleport you there!"),
    info_flyingToHigh("&cYou can't fly so high, max height is &6[max]&c!"),
    info_specializedItemFail("&cCan't determine specialized item requirement by value: &7[value]"),
    info_sunSpeeding("Sleeping [count] of [total] [hour] hour [speed]X speed"),
    info_sleepersRequired("!actionbar!&f[sleeping] &7of &f[required] &7sleeping from required for night time speedup"),
    info_sunSpeedingTitle("&7[hour]"), 
    info_skippingNight("!title!&7Skipping entire night"), 
    info_sunSpeedingSubTitle("&f[count]&7/&f[total] &7(&f[speed]X&7)"),
    info_repairConfirm("&eClick to confirm &7[items] &eitem repair for &7[cost]"),
    
    info_bookDate("&7Written at &f[date]"),

    info_maintenance("&7Maintenance mode"),

    info_notSet("not set"),
    info_mapLimit("&cCant go beyond 30 000 000 blocks"),

    info_startedEditingPainting("&eYou started editing painting. Click any other block to cancel."),
    info_canceledEditingPainting("&eYou canceled painting editing mode"),
    info_changedPainting("!actionbar!&eChanged painting to &6[name] &ewith id of &6[id]"),

    info_noSpam("!title!&cNo spamming!"),
    info_noCmdSpam("!title!&cNo command spamming!"),
    info_spamConsoleInform("&cPlayer (&7[playerName]&c) triggered (&7[rules]&c) chat filter with:&r [message]"),
    info_lookAtSign("&eLook at sign"),
    info_lookAtBlock("&eLook at block"),
    info_lookAtEntity("&eLook at entity"),
    info_notOnGround("&eYou can't perform this while flying"),
    info_FirstJoin("&eWelcome &6[playerDisplayName] &eto our server!", "This line can have extra variables: [totalUsers] [onlinePlayers]"),
    info_LogoutCustom(" &6[playerDisplayName] &eleft the game"),
    info_LoginCustom(" &6[playerDisplayName] &ejoined the game"),
    info_deathlocation("&eYou died at x:&6[x]&e, y:&6[y]&e, z:&6[z]&e in &6[world]"),

    info_bungee_Online("&6Online"),
    info_bungee_Offline("&cOffline"),
    info_bungee_not("&cServer doesn't belong to bungee network"),
    info_bungee_noserver("&cCan't find server by this name!"),
    info_bungee_server("&eServer: &7[name]"),

    info_variables_Online("&6Online"),
    info_variables_Offline("&cOffline"),
    info_variables_TrueColor("&2"),
    info_variables_FalseColor("&4"),
    info_variables_True("&6True"),
    info_variables_False("&cFalse"),
    info_variables_Enabled("&6Enabled"),
    info_variables_Disabled("&cDisabled"),
    info_variables_survival("&6Survival"),
    info_variables_creative("&6Creative"),
    info_variables_adventure("&6Adventure"),
    info_variables_spectator("&6Spectator"),
    info_variables_flying("&6Flying"),
    info_variables_notflying("&6Not flying"),

    info_noSchedule("&cSchedule by this name is not found"),

    info_totem_cooldown("&eTotem cooldown: [time]"),
    info_totem_warmup("&eTotem effect: [time]"),
    info_totem_cantConsume("&eTotem usage was denied due to its cooldown time"),

    info_Inventory_FullDrop("&5Not all items fit in your inventory. They have been dropped on ground"),
    
    info_InventorySave_info("&8Info: &8[playerDisplayName]"),
    info_InventorySave_saved("&e[time] &eInventory saved with id: &e[id]"),
    info_InventorySave_NoSavedInv("&eThis player doesn't have any saved inventories"),
    info_InventorySave_NoEntries("&4File exists, but no inventories were found!"),
    info_InventorySave_CantFind("&eCan't find inventory with this id"),
    info_InventorySave_TopLine("&e----------- &6[playerDisplayName] saved inventory &e-----------"),
    info_InventorySave_List("&eid: &6[id]&e. &6[time]"),
    info_InventorySave_KillerSymbol("&c \u2620"),
    info_InventorySave_Click("&eClick to check ([id]) saved inventory"),
    info_InventorySave_IdDontExist("&4This save Id doesn't exist!"),
    info_InventorySave_Deleted("&eSaved inventory was successfully deleted!"),
    info_InventorySave_Restored("&eYou have restored &e[sourcename] &einventory for &e[targetname] &euser."),
    info_InventorySave_GotRestored("&eYour inventory was restored from &e[sourcename] &esaved inventory on &e[time]"),
    info_InventorySave_LoadForSelf("&eLoad this inventory for your self"),
    info_InventorySave_LoadForOwner("&eLoad this inventory for owner"),
    info_InventorySave_NextInventory("&eNext inventory"),
    info_InventorySave_PreviousInventory("&ePrevious inventory"),
    info_InventorySave_Editable("&eEdit mode enabled"),
    info_InventorySave_NonEditable("&eEdit mode disabled"),
    info_TimeNotRecorded("&e-No record-"),
    info_years("&e[years] &6years "),
    info_oneYear("&e[years] &6year "),
    info_day("&e[days] &6days "),
    info_oneDay("&e[days] &6day "),
    info_hour("&e[hours] &6hours "),
    info_oneHour("&e[hours] &6hour "),
    info_min("&e[mins] &6min "),
    info_sec("&e[secs] &6sec "),
//    info_yearsDark("&8[years] &6years "),
//    info_dayDark("&8[days] &6days "),
//    info_hourDark("&8[hours] &6hours "),
//    info_minDark("&8[mins] &6min "),
//    info_secDark("&8[secs] &6sec "),
    info_vanishSymbolOn("&8[&7H&8]&r"),
    info_vanishSymbolOff(""),
    info_afkSymbolOn("&8[&7Afk&8]&r"),
    info_afkSymbolOff(""),
//    info_fliperSimbols("&e----------"),
    info_nextPageConsole("&fFor next page perform &5[command]"),
    info_prevPage("&2----<< &6Prev "),
    info_prevPageGui("&6Previous page "),
    info_prevPageClean("&6Prev "),
    info_prevPageOff("&2----<< &7Prev "),
    info_prevPageHover("&7<<<"),
    info_firstPageHover("&7|<"),
    info_nextPage("&6 Next &2>>----"),
    info_nextPageGui("&6Next Page"),
    info_nextPageClean("&6 Next"),
    info_nextPageOff("&7 Next &2>>----"),
    info_nextPageHover("&7>>>"),
    info_lastPageHover("&7>|"),
    info_pageCount("&2[current]&7/&2[total]"),
    info_pageCountHover("&e[totalEntries] entries"),

    info_skullOwner("!actionbar!&7Owner:&r [playerName]"),
    info_beeinfo("!actionbar!&7Honey level: &e[level]&7/&e[maxlevel] &7Bees inside: &e[count]&7/&e[maxcount]"),
    
    info_circle("&3Circle"),
    info_square("&5Square"),

    info_protectedArea("&cProtected area. Can't do this here."),

    info_valueToLong("&eValue is too high. Max: [max]"),
    info_valueToShort("&eValue is too low. Min: [min]"),

    info_pvp_noGodDamage("!actionbar!&cYou can't damage players while being immortal"),
    
    info_InvEmpty_armor("&eYour armor slots should be empty!"),
    info_InvEmpty_hand("&eYour hand should be empty!"),
    info_InvEmpty_maininv("&eYour main inventory should be empty!"),
    info_InvEmpty_maininvslots("&eYour main inventory should have atleast &6[count] &eempty slots!"),
    info_InvEmpty_inv("&eYour inventory should be empty!"),
    info_InvEmpty_offhand("&eYour offhand should be empty!"),
    info_InvEmpty_quickbar("&eYour quick bar should be empty!"),
    info_InvEmpty_quickbarslots("&eYour quick bar should have atleast &6[count] &eempty slots!"),
    info_InvEmpty_subinv("&eYour sub inventory should be empty!"),
    info_InvEmpty_subinvslots("&eYour  sub inventory should have atleast &6[count] &eempty slots!"),
    
    info_pickIcon("&8Pick icon"),

    direction_n("North"),
    direction_ne("North East"),
    direction_e("East"),
    direction_se("South East"),
    direction_s("South"),
    direction_sw("South West"),
    direction_w("West"),
    direction_nw("North West"),

    modify_middlemouse("&2Middle mouse click to edit"),
    modify_newItem("&7Place new item here"),
    modify_newLine("&2<NewLine>"),
    modify_newLineHover("&2Add new line"),
    modify_newPage("&2<NewPage>"),
    modify_newPageHover("&2Create new page"),
    modify_removePage("&c<RemovePage>"),
    modify_removePageHover("&cRemove page"),
    modify_deleteSymbol(" &c[X]"),
    modify_deleteSymbolHover("&cDelete &e[text]"),
    modify_extraEditSymbol(" &6!"),
    modify_addSymbol("&2[+]"),
    modify_addSymbolHover("&2Add new"),
    modify_cancelSymbol(" &7&l[X]"),
    modify_cancelSymbolHover("&aCancel"),
    modify_acceptSymbol(" &2&l[✔]"),
    modify_acceptSymbolHover("&aAccept"),
    modify_denySymbol(" &4&l[X]"),
    modify_denySymbolHover("&cDeny"),
    modify_enabledSymbol("&2[+]"),
    modify_disabledSymbol("&c[-]"),
    modify_enabled("&2Enabled"),
    modify_disabled("&cDisabled"),
    modify_running("&2Running"),
    modify_paused("&cPaused"),
    modify_editSymbol("&e\u270E"),
    modify_editSymbolHover("&eEdit &6[text]"),
    modify_editLineColor("&f"),
    modify_listUpSymbol("&6\u21D1"),
    modify_listUpSymbolHover("&eUp"),
    modify_listDownSymbol("&6\u21D3"),
    modify_listDownSymbolHover("&eDown"),
    modify_listNumber("&e[number]."),
    modify_ChangeHover("&eClick to change"),

    modify_commandTitle(" &e--- &6[name] &e---"),
    modify_commandList(" &e[command]  "),
    modify_emptyLine("&7[Empty line]"),
    modify_commandEdit("&eEdit list"),

    modify_lineAddInfo("&eEnter new line. Type &6cancel &eto cancel"),
    modify_commandAddInfo("&eEnter new command. Type &6cancel &eto cancel"),
    modify_commandAddInformationHover("&e[playerName] can be used to get player name \n"
	+ "&eTo include delay in commands: \n"
	+ "&edelay! 5 \n"
	+ "&eSpecialized commands are supported. More info at \n"
	+ "&ehttps://www.zrips.net/cmi/commands/specialized/"),
    modify_commandEditInfo("&eClick to paste old text. Type &6cancel &eto cancel action"),
    modify_commandEditInfoHover("&eClick to paste old text"),

    warp_list("&e[pos]. &6[warpName] &f- &7[worldName] ([x]:[y]:[z])"),

    teleportation_relocation("!actionbar!&4Your teleport location was obstructed. You have been teleported to a safe location."),

    afk_on("&6AFK"),
    afk_off("&7Playing"),
    afk_left("&6[playerDisplayName] &eis no longer AFK"), 
    afk_MayNotRespond("&ePlayer is AFK and may not respond"),
    afk_MayNotRespondStaff("&eStaff member is AFK and may not respond. Try contacting us through discord"),

    BossBar_hpBar("&f[victim] &e[current]&f/&e[max] &f(&c-[damage]&f)"),

    Potion_Effects("&8Potion effects"),
    Potion_List("&e[PotionName] [PotionAmplifier] &eDuration: &e[LeftDuration] &esec"),
    Potion_NoPotions("&eNone"),

    Information_Title("&8Players information"),
    Information_Health("&eHealth: &6[Health]/[maxHealth]"),
    Information_Hunger("&eHunger: &6[Hunger]"),
    Information_Saturation("&eSaturation: &6[Saturation]"),
    Information_Exp("&eExp: &6[Exp]"),
    Information_NotEnoughExp("&eNot enough exp: &6[Exp]"),
    Information_NotEnoughExpNeed("&eNot enough exp: &6[Exp]/[need]"),
    Information_tooMuchExp("&eToo much exp: &6[Exp]/[need]"),
    Information_NotEnoughVotes("&eNot enough votes: &6[votes]"),
    Information_TooMuchVotes("&eToo many votes: &6[votes]"),
    Information_BadGameMode("&cYou can't do this in your current game mode"),
    Information_BadArea("&cYou can't perform this action in this area"),
    Information_GameMode("&eGameMode: &6[GameMode]"),
    Information_GodMode("&eGodMode: &6[GodMode]"),
    Information_Flying("&eFlying: &6[Flying]"),
    Information_CanFly("&eCan Fly: &6[CanFly]"),

    Information_Uuid("&6[uuid]"),
    Information_ip("&eIp address: &6[address]"),
    Information_FirstConnection("&eFirst connection: &6[time]"),
    Information_Lastseen("&eLast seen: &6[time]"),
    Information_Onlinesince("&eOnline since: &6[time]"),
//    Information_Alivefor("&eAlive for: &6[time]"),
    Information_Money("&eBalance: &6[money]"),
    Information_Group("&eGroup: &6[group]"),

    econ_disabled("&cCan't use this command while economy support is disabled"),
//    econ_currencyFormat("%,.2f"),
//    econ_currencyPlacing("[money][symbol]"),
    econ_noMoney("&cYou have no money"),
    econ_charged("!actionbar!&fCharged: &6[amount]"),
    econ_notEnoughMoney("&cYou dont have enough money. Required (&6[amount]&c)"),
    econ_tooMuchMoney("&cYou have too much money"),
    econ_commandCost("&7This command cost is &6[cost] &7repeat it or click here to confirm"),

    Elytra_Speed("&eSpeed: &6[speed]&ekm/h"),
    Elytra_SpeedBoost(" &a+ "),
    Elytra_SpeedSuperBoost(" &2+ "),
    Elytra_CanUse("&cCan't equip elytra without permission!"),
    Elytra_Charging("&eCharging &f[percentage]&e%"),

    Selection_SelectPoints("&cSelect 2 points with selection tool! AKA: &6[tool]"),
    Selection_PrimaryPoint("&ePlaced &6Primary &eSelection Point [point]"),
    Selection_SecondaryPoint("&ePlaced &6Secondary &eSelection Point [point]"),
    Selection_CoordsTop("&eX:&6[x] &eY:&6[y] &eZ:&6[z]"),
    Selection_CoordsBottom("&eX:&6[x] &eY:&6[y] &eZ:&6[z]"),

    NetherPortal_ToHigh("&cPortal is to big, max height is &6[max]&c!"),
    NetherPortal_ToWide("&cPortal is to wide, max width is &6[max]&c!"),
    NetherPortal_Creation("!actionbar!&7Created [height]x[width] nether portal!"),
    NetherPortal_Disabled("&cPortal creation disabled!"),

    Location_Title("&8Players location"),
    Location_Killer("&eKiller: &6[killer]"),
    Location_OneLiner("&eLocation: &6[location]"),
    Location_DeathReason("&eDeath Reason: &6[reason]"),
    Location_Full("&7[world] &f[x]&7:&f[y]&7:&f[z]"),
    Location_World("&eWorld: &6[world]"),
    Location_X("&eX: &6[x]"),
    Location_Y("&eY: &6[y]"),
    Location_Z("&eZ: &6[z]"),
    Location_Pitch("&ePitch: &6[pitch]"),
    Location_Yaw("&eYaw: &6[yaw]"),

    Ender_Title("&7Open ender chest"),

    Chat_localPrefix(Arrays.asList("")),
    Chat_shoutPrefix(Arrays.asList("&c[S]&r")),
    Chat_shoutDeduction(Arrays.asList("!actionbar!&cDeducted &e[amount] &cfor shout")),
    Chat_publicHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%"), "Use \\n to add new line"),
    Chat_privateHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_staffHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_helpopHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_link("&l&4[&7LINK&4]"),
    Chat_item("&7[%cmi_iteminhand_displayname%[amount]&7]"),
    Chat_itemAmount(" x[amount]"),
    Chat_itemEmpty("&7[Mighty fist]");

    private String text;
    private List<String> comments = new ArrayList<String>();

    private LC(String text) {
	this(text, "");
    }

//    private LC(String text, String comment) {
//	this.text = text;
//	if (comment != null)
//	    comments.add(comment);
//    }

    private LC(String text, String... comment) {
	this.text = text;
	if (comment != null && comment.length > 0)
	    for (String one : comment) {
		if (one.isEmpty())
		    continue;
		comments.add(one);
	    }
    }

    private LC(List<String> ls) {
	this(ls, "");
    }

    private LC(List<String> ls, String... comment) {
	if (this.text == null)
	    this.text = "";
	for (String one : ls) {
	    if (!this.text.isEmpty())
		this.text += " /n";
	    this.text += one;
	}

	if (comment != null && comment.length > 0)
	    for (String one : comment) {
		if (one.isEmpty())
		    continue;
		comments.add(one);
	    }
    }

    public String getText() {
	return text;
    }

    public String getPt() {
	return this.name().replace("_", ".");
    }

    public List<String> getComments() {
	return comments;
    }
}
