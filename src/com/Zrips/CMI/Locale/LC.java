package com.Zrips.CMI.Locale;

import java.util.Arrays;
import java.util.List;

public enum LC {
    info_prefix("&e[&aCMI&e] "),
    info_NoPermission("&cYou don't have permission!"),
    info_Ingame("&cYou can use this only in game!"),
    info_NoInformation("&cCant find any information!"),
    info_Console("&6Server"),
    info_FromConsole("&cYou can use this only from console!"),
    info_NotOnline("&cThe player is not online!"),
    info_Same("&cCan't open your own inventory for editing!"),
    info_cantLoginWithDifCap("&cCan't login with different name capitalization! Old name: &e[oldName]&c. Current: &e[currentName]"),
    info_Searching("&eSearching for player data, please wait as this can take some time to finish!"),
//    info_PlayerDataLoading("&cCan't find player with this name. &eBut player data is still beying loaded in background, check it again later!"),
    info_NoPlayer("&cCan't find player with this name!"),
    info_NoCommand("&cThere is no command by this name!"),
    info_PurgeNotEnabled("&cPurge function is not enabled in config file!"),
    info_FeatureNotEnabled("&cThis feature is not enabled!"),
    info_UseInteger("&4Please use numbers!"),
    info_UseBoolean("&4Please use True or False!"),
    info_NoLessThan("&4Number can't be less than [amount]!"),
    info_NoMoreThan("&4Value can't be more than [amount]"),
    info_NoGameMode("&4Please use 0/1/2/3 or Survival/Creative/Adventure/Spectator!"),
    info_NoWorld("&4Can't find world with this name!"),
    info_IncorrectLocation("&4Location defined incorrectly!"),
    info_NameChange("&6[playerDisplayName] &elogged in, also known as: &6[namelist]"),
    info_Cooldowns("&eCooldown in motion for &6[cmd] &ewait &6[time]"),
    info_WarmUp_canceled("&eCommand was cancelled due to your movement"),
    info_WarmUp_counter("!actionbar!&6--> &e[time] &6<--"),
    info_WarmUp_DontMove("!title!!subtitle!&6Don't move!"),
    info_Spawner("&r[type] Spawner"),
    info_CantPlaceSpawner("&eCan't place spawner so close to another spawner (&6[range]&e)"),
    info_ChunksLoading("&eWorld chunk data is still being loaded. Please wait a bit and try again."),
    info_ShulkerBox("Shulker Box"),
    info_Remove("&cRemove"),
    info_Back("&eBack"),
    info_Forward("&eForward"),
    info_Update("&eUpdate"),
    info_Save("&eSave"),
    info_Delete("&cDelate"),
    info_Click("&eClick"),
    info_ClickToPaste("&eClick to paste into chat"),
    info_CantTeleport("&eYou can't teleport because you wear to many limited items. Scroll over this line to see the maximum allowed items."),
    info_BlackList("&e[material] [amount] &6Max: [max]"),
    info_Spliter("&e--------------------------------------------------"),
    info_helpPagePrefix("&e* "),
    info_explanationPagePrefix("&e * "),
    info_nothingInHand("&eYou need to hold item in hand"),
    info_ItemWillBreak("!actionbar!&eYour item (&6[itemName]&e) will break soon! &e[current]&6/&e[max]"),
    info_cantDoForPlayer("&eYou can't do this to &6[playerDisplayName]"),
    info_cantRename("!actionbar!&eYou can't rename item to this name"),
    
    info_startedEditingPainting("&eYou started painting editing. Click any other block to cancel."),
    info_canceledEditingPainting("&eYou canceled painting editing mode"),
    info_changedPainting("!actionbar!&eChanged painting to &6[name] &ewith id of &6[id]"),

    info_noSpam("!title!&cNo spamming!"),
    info_noCmdSpam("!title!&cNo command spamming!"),
    info_lookAtSign("&eLook at sign"),
    info_lookAtBlock("&eLook at block"),
    info_lookAtEntity("&eLook at entity"),
    info_notOnGround("&eYou can't perform this while flying"),
    info_FirstJoin("&eWelcome &6[playerDisplayName] &eto our server!"),
    info_LogoutCustom(" &6[playerDisplayName] &eleft the game"),
    info_LoginCustom(" &6[playerDisplayName] &ejoined the game"),
    info_deathlocation("&eYou died at x:&6[x]&e, y:&6[y]&e, z:&6[z]&e in &6[world]"),
    info_variables_Online("&6Online"),
    info_variables_Offline("&cOffline"),
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

    info_totem_cooldown("&eTotem cooldown: [time]"),
    info_totem_warmup("&eTotem effect: [time]"),
    info_totem_cantConsume("&eTotem usage was denied due to its cooldown time"),

    info_InventorySave_saved("&e[time] &eInventory saved with id: &e[id]"),
    info_InventorySave_NoSavedInv("&eThis player doesn't have any saved inventories"),
    info_InventorySave_NoEntries("&4File exists, but no inventories were found!"),
    info_InventorySave_CantFind("&eCan't find inventory with this id"),
    info_InventorySave_TopLine("&e*************** [playerDisplayName] saved inventory ***************"),
    info_InventorySave_BottomLine("&e************************************************************"),
    info_InventorySave_List("&eid: &6[id]&e. &6[time]"),
    info_InventorySave_KillerSymbol("&c \u2620"),
    info_InventorySave_Click("&eClick to check ([id]) saved inventory"),
    info_InventorySave_IdDontExist("&4This saves Id doesn't exist!"),
    info_InventorySave_Deleted("&eSaved inventory was successfully deleted!"),
    info_InventorySave_Restored("&eYou have restored &e[sourcename] &einventory for &e[targetname] &euser."),
    info_InventorySave_GotRestored("&eYour inventory was restored from &e[sourcename] &esaved inventory on &e[time]"),
    info_InventorySave_LoadForSelf("&eLoad this inventory for your self"),
    info_InventorySave_LoadForOwner("&eLoad this inventory for owner"),
    info_InventorySave_NextInventory("&eNext inventory"),
    info_InventorySave_PreviousInventory("&ePrevious inventory"),
    info_InventorySave_Editable("&eEdit mode enabled"),
    info_InventorySave_NonEditable("&eEdit mode disabled"),
    info_years("&e[years] &6years "),
    info_day("&e[days] &6days "),
    info_hour("&e[hours] &6hours "),
    info_min("&e[mins] &6min "),
    info_sec("&e[secs] &6sec "),
    info_vanishSymbolOn("&8[&7H&8]&r"),
    info_vanishSymbolOff(""),
    info_fliperSimbols("&e----------"),
    info_prev("&e<<<< Prev page &e|"),
    info_prevOut("&7<<<< Prev page &e|"),
    info_next("&e|&e Next Page >>>>"),
    info_nextOut("&e|&7 Next Page >>>>"),

    modify_newLine("&2<NewLine>"),
    modify_newLineHover("&2Add new line"),
    modify_newPage("&2<NewPage>"),
    modify_newPageHover("&2Create new page"),
    modify_removePage("&c<RemovePage>"),
    modify_removePageHover("&cRemove page"),
    modify_deleteSymbol("&cX"),
    modify_deleteSymbolHover("&cDelete &e[text]"),
    modify_addSymbol(" &2+"),
    modify_addSymbolHover("&2Add new"),
    modify_enabledSymbol("&2[+]"),
    modify_disabledSymbol("&c[-]"),
    modify_editSymbol("&e\u270E"),
    modify_editSymbolHover("&eEdit &6[text]"),
    modify_listUpSymbol("&6\u21D1"),
    modify_listUpSymbolHover("&eUp"),
    modify_listDownSymbol("&6\u21D3"),
    modify_listDownSymbolHover("&eDown"),

    afk_left("&6[playerDisplayName] &eis no longer AFK"),
    afk_MayNotRespond("&ePlayer may not respond, he is AFK"),

    Potion_Effects("&8Potion effects"),
    Potion_List("&e[PotionName] [PotionAmplifier] &eDuration: &e[LeftDuration] &esec"),
    Potion_NoPotions("&eNone"),

    Information_Title("&8Players information"),
    Information_Health("&eHealth: &6[Health]/[maxHealth]"),
    Information_Hunger("&eHunger: &6[Hunger]"),
    Information_Saturation("&eSaturation: &6[Saturation]"),
    Information_Exp("&eExp: &6[Exp]"),
    Information_NotEnoughExp("&eNot enough exp: &6[Exp]"),
    Information_GameMode("&eGameMode: &6[GameMode]"),
    Information_GodMode("&eGodMode: &6[GodMode]"),
    Information_Flying("&eFlying: &6[Flying]"),
    Information_CanFly("&eCanFly: &6[CanFly]"),

    Information_Uuid("&6[uuid]"),
    Information_ip("&eIp address: &6[address]"),
    Information_FirstConnect("&eFirst connection: &6[y]-[m]-[d]"),
    Information_Lastseen("&eLast seen: &6[time]"),
    Information_Onlinesince("&eOnline since: &6[time]"),
//    Information_Alivefor("&eAlive for: &6[time]"),
    Information_Money("&eMoney: &6[money]"),
    Information_Group("&eGroup: &6[group]"),

    econ_disabled("&cCan't use this command while economy support is disabled"),
//    econ_currencyFormat("%,.2f"),
    econ_currencyPlacing("[money][symbol]"),
    econ_noMoney("&cNot enough money in balance"),
    
    Elytra_Speed("&eSpeed: &6[speed]&ekm/h"),
    Elytra_SpeedBoost(" &2+ "),
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
    NetherPortal_Disabled("&cPortal creation disabled!"),

    Location_Title("&8Players location"),
    Location_Killer("&eKiller: &6[killer]"),
    Location_DeathReason("&eDeath Reason: &6[reason]"),
    Location_World("&eWorld: &6[world]"),
    Location_X("&eX: &6[x]"),
    Location_Y("&eY: &6[y]"),
    Location_Z("&eZ: &6[z]"),
    Location_Pitch("&ePitch: &6[pitch]"),
    Location_Yaw("&eYaw: &6[yaw]"),

    Chat_publicHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_privateHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%"));

    private String text;

    private LC(String text) {
	this.text = text;
    }

    private LC(List<String> ls) {
	if (this.text == null)
	    this.text = "";
	for (String one : ls) {
	    if (!this.text.isEmpty())
		this.text += " /n";
	    this.text += one;
	}
    }

    public String getText() {
	return text;
    }

    public String getPt() {
	return this.name().replace("_", ".");
    }
}
