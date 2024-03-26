package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SpecializedCommandManager {

    private CMI plugin;

    public SpecializedCommandManager(CMI plugin) {
        this.plugin = plugin;
    }

    HashMap<UUID, HashMap<String, runAway>> runaway = new HashMap<UUID, HashMap<String, runAway>>();
    HashMap<String, runAway> globalRunaway = new HashMap<String, runAway>();

    class runAway {

        private Long time = null;
        private CMITask schedId = null;

        public runAway(Long time) {
            this.time = time;
        }

        public Long getTime() {
            return time;
        }

        public void setTime(Long time) {
            this.time = time;
        }

        public CMITask getSchedTask() {
            return schedId;
        }

        public void stopSchedTask() {
            if (schedId != null) {
                schedId.cancel();
                schedId = null;
            }
        }

        public void setSchedTask(CMITask schedId) {
            this.schedId = schedId;
        }
    }

    public void clearCache(UUID uuid) {

    }

    public void processAliasCmdsAsPlayer(String initializer, List<String> cmds, final Player player) {

    }

    private void process(String initializer, List<String> cmds, final Player player) {
        process(initializer, cmds, player, null);
    }

    private void process(String initializer, List<String> cmds, final Player player, CheckStatements conditions) {

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
        hand, offhand, quickbar, armor, inv, subinv, maininv, ender;

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
        stopdelay("stopdelay:[value]!", specialisedCommandType.condition),

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

        closeinv("closeinv!", specialisedCommandType.subaction),

        ph("ph!", specialisedCommandType.subaction),

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
            if (getType().equals(specialisedCommandType.action) || getType().equals(specialisedCommandType.subaction))
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

    public class specCommandAction {
        private specialisedCommand cmd;
        private boolean needToBreak = false;
        private boolean needToInform = false;
        private boolean stopAfter = false;
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

        public boolean isStopAfter() {
            return stopAfter;
        }

        public void setStopAfter(boolean stopAfter) {
            this.stopAfter = stopAfter;
        }
    }

    public specCommand processSpecializedCommand(String cmd) {

        return null;
    }

    public boolean isSpecializedCommand(String cmd) {

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

    private static boolean informed = false;

    public boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender, CheckStatements groupedStatements) {

        return true;
    }

    private static void processCondition(failType feedback, CheckStatements groupedConditions) {

    }

    private static final Pattern PATTERN_ON_SPACE = Pattern.compile(" ", Pattern.LITERAL);

    private int maxRepeats = 40;

    private static int MAX_ENTRIES = Bukkit.getMaxPlayers();
    public static LinkedHashMap<UUID, overflowCommands> repeatingCommands = new LinkedHashMap<UUID, overflowCommands>(MAX_ENTRIES + 1, .75F, false) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<UUID, overflowCommands> eldest) {
            return size() > MAX_ENTRIES;
        }
    };

    private UUID getUUID(CommandSender sender) {
        if (sender instanceof Player)
            return ((Player) sender).getUniqueId();
        return plugin.getServerUUID();
    }

    public synchronized boolean dispatch(CommandSender sender, String commandLine) throws CommandException {

        return true;
    }

    private static boolean isOpCmd(String cmd) {
        return cmd.toLowerCase().startsWith("op") || cmd.toLowerCase().startsWith("minecraft:op") || cmd.toLowerCase().startsWith("deop") || cmd.toLowerCase().startsWith("minecraft:deop");
    }

    private failType deductForCommand(Player player, List<specCommandAction> conditions) {

        return null;
    }

    Pattern checkPattern = Pattern.compile("(.+)?(==|>=|>|<=|<|!=)(.+)");

    private failType canPerformCommand(String initializer, Player player, List<specCommandAction> conditions, boolean deduct, CMIInteractType clickType, CheckStatements groupedStatements,
        boolean translate) {

        return null;
    }

    private boolean checkForMatch(List<String> values, String checkedValue) {

        return false;
    }
}
