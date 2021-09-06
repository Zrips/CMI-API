package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.Portals.CMIPortal;
import com.Zrips.CMI.commands.CMICommand;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.events.CMIPlayerKickEvent;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.ActionBar.CMIActionBar;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.RawMessages.RawMessage;
import net.Zrips.CMILib.Time.CMITimeManager;
import net.Zrips.CMILib.TitleMessages.CMITitleMessage;
import net.Zrips.CMILib.Version.Version;

public class SpecializedCommandManager {

    private CMI plugin;

    public SpecializedCommandManager(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<UUID, HashMap<String, Long>> runaway = new HashMap<UUID, HashMap<String, Long>>();

    public void clearCache(UUID uuid) {
    }

    public void processAliasCmdsAsPlayer(String initializer, List<String> cmds, final Player player) {

    }

    private void process(String initializer, List<String> cmds, final Player player) {

    }

    public void processCmds(List<String> cmds) {
	processCmds(null, cmds, null, null, null);
    }

    public void processCmds(List<String> cmds, CommandSender sender) {
	processCmds(null, cmds, null, null, sender);
    }

    public void processCmds(List<String> cmds, final Player player) {
	processCmds(null, cmds, player, null, null);
    }

    public void processCmds(List<String> cmds, final Player player, CMIInteractType clickType) {
	processCmds(null, cmds, player, clickType, null);
    }

    public void processCmds(String initializer, List<String> cmds, final Player player) {
	processCmds(initializer, cmds, player, null, null);
    }

    public void processCmds(String initializer, List<String> cmds, final Player player, CMIInteractType clickType) {
	processCmds(initializer, cmds, player, clickType, null);
    }

    public void processCmds(String initializer, List<String> cmds, final Player player, CMIInteractType clickType, CommandSender sender) {

    }

    private class CheckStatements {
	HashMap<String, Boolean> statements = new HashMap<String, Boolean>();

	private String temp = null;

	private CheckStatements() {

	}

	public void setStatement(String statement, boolean value) {
	    statements.put(statement.toLowerCase(), value);
	}

	public Boolean getStatementValue(String statement) {
	    return statements.get(statement.toLowerCase());
	}

	public String getTemp() {
	    return temp;
	}

	public void setTemp(String temp) {
	    this.temp = temp;
	}

    }

    private void process(String initializer, List<String> cmds, final Player player, CMIInteractType clickType, CommandSender sender) {

    }

    private enum failType {
	proceed, cancel, none;
    }

    public enum specialisedCommandType {
	action, subaction, condition, statement;
    }

    private enum invEmptyType {
	hand, offhand, quickbar, armor, inv, subinv, maininv;

	public static invEmptyType getByName(String name) {
	    for (invEmptyType one : invEmptyType.values()) {
		if (one.toString().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}
    }

    public enum specialisedCommand {
	permission("perm:[value][@][?][#]!", specialisedCommandType.condition),
	group("group:[value][@][?][#]!", specialisedCommandType.condition),
	bpermission("bperm:[value][@][?][#]!", specialisedCommandType.condition),
	money("moneycost:[value][?][#]!", specialisedCommandType.condition),
	exp("expcost:[value][?][#]!", specialisedCommandType.condition),
	hasMoney("hasmoney:[value][@][?][#]!", specialisedCommandType.condition),
	hasItem("hasitem:[value][@][?][#]!", specialisedCommandType.condition),
	item("item:[value][?][#]!", specialisedCommandType.condition),
	hasExp("hasexp:[value][@][?][#]!", specialisedCommandType.condition),
	votes("votes:[value][@][?][#]!", specialisedCommandType.condition),
	cooldown("cooldown:[value][?][#]!", specialisedCommandType.condition),
	ucooldown("ucooldown:[value][?][#]!", specialisedCommandType.condition),
	gcooldown("gcooldown:[value][?][#]!", specialisedCommandType.condition),
	ifonline("ifonline:[value][?][#]!", specialisedCommandType.condition),
	ifoffline("ifoffline:[value][?][#]!", specialisedCommandType.condition),
	ifempty("ifempty:[value][?][#]!", specialisedCommandType.condition),

	check("check:[value1][==|>|>=|<|<=|!=][value2][?][#]!", specialisedCommandType.condition),

	statement("statement:[value]!", specialisedCommandType.statement),
	if_("if:[value][@][#]!", specialisedCommandType.statement),

	ifhasair("ifhasair:[value][@][#]!", specialisedCommandType.condition),
	ifhashunger("ifhashunger:[value][@][#]!", specialisedCommandType.condition),
	ifhashealth("ifhashealth:[value][@][#]!", specialisedCommandType.condition),
	ifingamemode("ifingamemode:[value][@][#]!", specialisedCommandType.condition),

	ifinworld("ifinworld:[value][@][?][#]!", specialisedCommandType.condition),
	ifinportal("ifinportal:[value][@][?][#]!", specialisedCommandType.condition),

	click("click:[value][#]!", specialisedCommandType.condition),

	ptarget("ptarget:[value]!", specialisedCommandType.condition),

	msg("msg!", specialisedCommandType.action),
	broadcast("broadcast!", specialisedCommandType.action),
	actionbar("actionbar!", specialisedCommandType.action),
	title("title!", specialisedCommandType.action),
	subtitle("subtitle!", specialisedCommandType.action),
	kickall("kickall!", specialisedCommandType.action),

	fromConsole("fromConsole!", specialisedCommandType.action),
	asConsole("asConsole!", specialisedCommandType.action),
	asFakeOp("asFakeOp!", specialisedCommandType.action),
	likePlayer("likePlayer!", specialisedCommandType.action),
	asPlayer("asPlayer!", specialisedCommandType.action),
	allPlayers("allPlayers!", specialisedCommandType.action);

	private String format;
	private specialisedCommandType type;

	specialisedCommand(String format, specialisedCommandType type) {
	    this.format = format;
	    this.type = type;
	}

	public String getFormat() {
	    return format;
	}

	public String getFormatForCheck() {
	    if (getType().equals(specialisedCommandType.action))
		return this.getFormat().toLowerCase();
	    return format.split(":")[0].toLowerCase() + ":";
	}

	public void setFormat(String format) {
	    this.format = format;
	}

	public specialisedCommandType getType() {
	    return type;
	}

	public void setType(specialisedCommandType type) {
	    this.type = type;
	}

	public static specCommandAction get(String arg) {
	    return null;
	}
    }

    private class specCommand {
	private String cmd;
	private specialisedCommand action = null;
	private List<specCommandAction> subactions = new ArrayList<specCommandAction>();
	private List<specCommandAction> list = new ArrayList<specCommandAction>();
	private List<specCommandAction> statements = new ArrayList<specCommandAction>();

	public String getCmd() {
	    return cmd;
	}

	public void setCmd(String cmd) {
	    this.cmd = cmd;
	}

	public List<specCommandAction> getConditionList() {
	    return list;
	}

//	public void setList(List<specCommandAction> list) {
//	    this.list = list;
//	}

	public void add(specCommandAction l) {
	    if (l.getCmd().getType().equals(specialisedCommandType.action)) {
		action = l.getCmd();
		return;
	    }
	    if (l.getCmd().getType().equals(specialisedCommandType.subaction)) {
		subactions.add(l);
		return;
	    }
	    if (l.getCmd().getType().equals(specialisedCommandType.statement)) {
		statements.add(l);
		return;
	    }
	    this.list.add(l);
	}

	public specialisedCommand getAction() {
	    return action;
	}

	public List<specCommandAction> getSubactions() {
	    return subactions;
	}

	public List<specCommandAction> getStatements() {
	    return statements;
	}

//	public void setAction(specialisedCommand action) {
//	    this.action = action;
//	}
    }

    public class specCommandAction {
	private specialisedCommand cmd;
	private boolean needToBreak = false;
	private boolean needToInform = false;
	private boolean opposite = false;
	private Object value = null;
	private Object value2 = null;

	private String initializer = null;

	public specCommandAction(specialisedCommand cmd) {
	    this.cmd = cmd;
	}

	public specialisedCommand getCmd() {
	    return cmd;
	}

	public void setCmd(specialisedCommand cmd) {
	    this.cmd = cmd;
	}

	public boolean isNeedToBreak() {
	    return needToBreak;
	}

	public void setNeedToBreak(boolean needToBreak) {
	    this.needToBreak = needToBreak;
	}

	public boolean isNeedToInform() {
	    return needToInform;
	}

	public void setNeedToInform(boolean needToInform) {
	    this.needToInform = needToInform;
	}

	public Object getValue() {
	    return value;
	}

	public void setValue(Object value) {
	    this.value = value;
	}

	public Object getValue2() {
	    return value2;
	}

	public void setValue2(Object value2) {
	    this.value2 = value2;
	}

	public boolean isOpposite() {
	    return opposite;
	}

	public void setOpposite(boolean opposite) {
	    this.opposite = opposite;
	}

	public String getInitializer() {
	    return initializer;
	}

	public void setInitializer(String initializer) {
	    this.initializer = initializer;
	}
    }

    public specCommand processSpecializedCommand(String cmd) {
	
	return null;
    }

    public boolean isSpecializedCommand(String cmd) {
	specCommand processed = processSpecializedCommand(cmd);
	if (processed.getConditionList().isEmpty() && processed.getAction() == null) {
	    return false;
	}
	return true;
    }

//    Pattern patern = Pattern.compile("^ptarget:(\\S+)!");
    Pattern patern = Pattern.compile("^ptarget:(\\S+)!|^asPlayer! ptarget:(\\S+)!");

    public boolean executeCmd(String cmd, Player senderPlayer) {
	return executeCmd(cmd, senderPlayer, null);
    }

    public boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType) {
	return executeCmd(cmd, senderPlayer, clickType, null);
    }

    public boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender) {
	return executeCmd(null, cmd, senderPlayer, clickType, sender);
    }

    public boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender) {
	return executeCmd(initializer, cmd, senderPlayer, clickType, sender, null);
    }

    public boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender, CheckStatements groupedStatements) {
	
	return true;
    }

    private static void processCondition(failType feedback, CheckStatements groupedConditions) {
	if (groupedConditions == null || groupedConditions.getTemp() == null)
	    return;

	groupedConditions.setStatement(groupedConditions.getTemp(), feedback == failType.none);
	groupedConditions.setTemp(null);
    }

    private static final Pattern PATTERN_ON_SPACE = Pattern.compile(" ", Pattern.LITERAL);

    public synchronized boolean dispatch(CommandSender sender, String commandLine) throws CommandException {
	    return false;
    }

    private static boolean isOpCmd(String cmd) {
	return cmd.toLowerCase().startsWith("op") || cmd.toLowerCase().startsWith("minecraft:op") || cmd.toLowerCase().startsWith("deop") || cmd.toLowerCase().startsWith("minecraft:deop");
    }

    private failType deductForCommand(Player player, List<specCommandAction> conditions) {
	
	return null;
    }

    Pattern checkPattern = Pattern.compile("(.+)?(==|>=|>|<=|<|!=)(.+)");

    private failType canPerformCommand(Player player, List<specCommandAction> conditions, boolean deduct, CMIInteractType clickType, CheckStatements groupedStatements) {

	return null;
    }

}
