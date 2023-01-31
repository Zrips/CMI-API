package com.Zrips.CMI.Locale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Messages.CMIMessages;

public enum CMILC {

    info_Same("&cCan't open your own inventory for editing!"),
    info_cantLoginWithDifCap("&cCan't login with different name capitalization! Old name: &e[oldName]&c. Current: &e[currentName]"),
    info_Searching("&eSearching for player data, please wait, this can take some time to finish!"),
    info_NoCommandWhileSleeping("&cCan't perform commands while sleeping!"),
    info_PurgeNotEnabled("&cPurge function is not enabled in config file!"),
    info_TeamManagementDisabled("&7This feature will have limited functionalaty while DisableTeamManagement is set to true!"),
    info_NoGameMode("&cPlease use 0/1/2/3 or Survival/Creative/Adventure/Spectator or s/c/a/sp!"),
    info_NameChange("&6[playerDisplayName] &elogged in, also known as: &6[namelist]"),
    info_Cooldowns("&eThis command is on cooldown for another &6[time]"),
    info_specializedCooldowns("&eCooldown in motion for this command, please wait &6[time]"),
    info_specializedRunning("&eCommand still running, please wait &6[time]"),
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
    info_CantUseNonEncrypted("!actionbar!&cCommands on this item are not encrypted. Can't use them!"),
    info_CantDecode("!actionbar!&cCan't decode message/command. Key file contains wrong key for this task. Inform server administration about this"),
    info_CantTeleport("&eYou can't teleport because you have too many limited items. Scroll over this line to see the maximum amount of items allowed."),
    info_BlackList("&e[material] [amount] &6Max: [max]"),
    info_wrongPortal("&cYou are in incorrect area of effect"),
    info_ItemWillBreak("!actionbar!&eYour item (&6[itemName]&e) will break soon! &e[current]&6/&e[max]"),
    info_ArmorWillBreak("!actionbar!&eYour [itemName] will break soon! &e[current]&6/&e[max]"),
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
    info_mapLimit("&cCant go beyond 30 000 000 blocks"),
    info_startedEditingPainting("&eYou started editing painting. Click any other block to cancel."),
    info_canceledEditingPainting("&eYou canceled painting editing mode"),
    info_changedPainting("!actionbar!&eChanged painting to &6[name] &ewith id of &6[id]"),
    info_noSpam("!title!&cNo spamming!"),
    info_noCmdSpam("!title!&cNo command spamming!"),
    info_spamConsoleInform("&cPlayer (&7[playerName]&c) triggered (&7[rules]&c) chat filter with:&r [message]"),
    info_FirstJoin("&eWelcome &6[playerDisplayName] &eto our server!", "This line can have extra variables: [totalUsers] [onlinePlayers]"),
    info_LogoutCustom(" &6[playerDisplayName] &eleft the game"),
    info_LoginCustom(" &6[playerDisplayName] &ejoined the game"),
    info_deathlocation("&eYou died at x:&6[x]&e, y:&6[y]&e, z:&6[z]&e in &6[world]"),
    info_book_exploit("&cYou cant create book with more than [amount] pages"),
    info_combat_CantUseShulkerBox("&cCan't use shulker box while you are in combat with player. Wait: [time]"),
    info_combat_CantUseCommand("!actionbar!&cCan't use command while in combat mode. Wait: [time]"),
    info_combat_bossBarPvp("&cCombat mode [autoTimeLeft]"),
    info_combat_bossBarPve("&2Combat mode [autoTimeLeft]"),
    info_noSchedule("&cSchedule by this name is not found"),
    info_totem_cooldown("&eTotem cooldown: [time]"),
    info_totem_warmup("&eTotem effect: [time]"),
    info_totem_cantConsume("&eTotem usage was denied due to its cooldown time"), 
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
    info_vanishSymbolOn("&8[&7H&8]&r"),
    info_vanishSymbolOff(""),
    info_afkSymbolOn("&8[&7Afk&8]&r"),
    info_afkSymbolOff(""),
    info_beeinfo("!actionbar!&7Honey level: &e[level]&7/&e[maxlevel] &7Bees inside: &e[count]&7/&e[maxcount]"),
    info_pvp_noGodDamage("!actionbar!&cYou can't damage players while being immortal"),
    info_pve_noGodDamage("!actionbar!&cYou can't damage mobs while being immortal"),
    info_InvEmpty_armor("&eYour armor slots should be empty!"),
    info_InvEmpty_hand("&eYour hand should be empty!"),
    info_InvEmpty_maininv("&eYour main inventory should be empty!"),
    info_InvEmpty_maininvslots("&eYour main inventory should have atleast &6[count] &eempty slots!"),
    info_InvEmpty_inv("&eYour inventory should be empty!"),
    info_InvEmpty_offhand("&eYour offhand should be empty!"),
    info_InvEmpty_quickbar("&eYour quick bar should be empty!"),
    info_InvEmpty_quickbarslots("&eYour quick bar should have atleast &6[count] &eempty slots!"),
    info_InvEmpty_subinv("&eYour sub inventory should be empty!"),
    info_InvEmpty_subinvslots("&eYour sub inventory should have atleast &6[count] &eempty slots!"),
    info_Relog("&eRelog might be needed for change to take effect"),

    info_time_days("&2[d]&7d:", "Mainly for placeholder playtime output", "Use + sign at the start of line to force include it even if specific and previous time values are 0",
        "Use - sign at the start of line if you want to include it only if its value isn't 0. If entire output results into empty line, then we will output seconds value"),
    info_time_hours("&2[h]&7h "),
    info_time_minutes("&2[m]&7m "),
    info_time_seconds("&2[s]&7s"),

    warp_list("&e[pos]. &6[warpName] &f- &7[worldName] ([x]:[y]:[z])"),
    afk_off("&7Playing"),
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
    Information_Flying("&eFlying: &6[Flying]"),
    Information_Uuid("&6[uuid]"),
    Information_FirstConnection("&eFirst connection: &6[time]"),
    Information_Lastseen("&eLast seen: &6[time]"),
    Information_Onlinesince("&eOnline since: &6[time]"),
    Information_Money("&eBalance: &6[money]"),
    Information_Group("&eGroup: &6[group]"),
    econ_commandCost("&7This command cost is &6[cost] &7repeat it or click here to confirm"),
    econ_disabled("&cCan't use this command while economy support is disabled"),
    Elytra_Speed("&eSpeed: &6[speed]&ekm/h"),
    Elytra_SpeedBoost(" &a+ "),
    Elytra_SpeedSuperBoost(" &2+ "),
    Elytra_CanUse("&cCan't equip elytra without permission!"),
    Elytra_CantGlide("&cCan't use elytra here!"),
    Elytra_Charging("&eCharging &f[percentage]&e%"),
    NetherPortal_ToHigh("&cPortal is to big, max height is &6[max]&c!"),
    NetherPortal_ToWide("&cPortal is to wide, max width is &6[max]&c!"),
    NetherPortal_Creation("!actionbar!&7Created [height]x[width] nether portal!"),
    NetherPortal_Disabled("&cPortal creation disabled!"),
    Ender_Title("&7Open ender chest"),
    Chat_localPrefix(""),
    Chat_shoutPrefix("&c[S]&r"),
    Chat_LocalNoOne("!actionbar!&cNobody hear you, write ! before message for global chat"),
    Chat_shoutDeduction("!actionbar!&cDeducted &e[amount] &cfor shout"),
    Chat_publicHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%"), "Use \\n to add new line"),
    Chat_privateHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_staffHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_helpopHover(Arrays.asList("&eSent time: &6%server_time_hh:mm:ss%")),
    Chat_link("&l&4[&7LINK&4]"),
    Chat_item("&7[%cmi_iteminhand_realname%[amount]&7]"),
    Chat_itemAmount(" x[amount]"),
    Chat_itemEmpty("&7[Mighty fist]"),

    Spy_Chat_msg("&2Spy&7[&8[senderDisplayName] &7-> &8[playerDisplayName]&7]&f [message]"),
    Spy_Chat_custom("&2Spy&8[senderDisplayName] &7-> &4|&8[place]&4|&f [message]"),
    Spy_Command_msg("&5C&2Spy&7[&8[senderDisplayName]&7]&7: &f[command]"),
    Spy_Sign_msg("&5Sign&2Spy&7[&8[senderDisplayName]&7]&7: &f[text]"),

    info_CommandFormat("&cIncorrect command format"),
    info_ServerSwitchOut(" &6[playerDisplayName] &eswitched server to &6[serverName]"),
    info_ServerSwitchIn(" &6[playerDisplayName] &ecame from &6[serverName] &eserver"),

    info_months("&e[months] &6months "),
    info_oneMonth("&e[months] &6month "),
    info_weeks("&e[weeks] &6weeks "),
    info_oneWeek("&e[weeks] &6week "),

    ;

    private String text;
    private List<String> comments = new ArrayList<String>();

    private CMILC(String text) {
        this(text, "");
    }

    private CMILC(String text, String... comment) {
        this.text = text;
        if (comment != null && comment.length > 0)
            for (String one : comment) {
                if (one.isEmpty())
                    continue;
                comments.add(one);
            }
    }

    private CMILC(List<String> ls) {
        this(ls, "");
    }

    private CMILC(List<String> ls, String... comment) {
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

    public String getLocale(Object... values) {
        return getMsg(this, values);
    }

    public void sendMessage(Object sender, Object... values) {

        if (sender instanceof CMIUser) {
            CMIUser user = (CMIUser) sender;
            if (!user.isOnline())
                return;
            sender = user.getPlayer();
        }

        CMIMessages.sendMessage(sender, getLocale(values));
    }

    private static String getMsg(CMILC lc, Object... variables) {
        return CMI.getInstance().getPlaceholderAPIManager().updatePlaceHolders("");
    }
}
