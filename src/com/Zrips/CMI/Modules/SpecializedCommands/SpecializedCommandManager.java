package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SpecializedCommandManager {
    private CMI plugin;
    HashMap<UUID, HashMap<String, runAway>> runaway;
    HashMap<String, runAway> globalRunaway;
    Pattern patern;
    private static boolean informed;
    private static final Pattern PATTERN_ON_SPACE = null;
    private int maxRepeats;
    private static int MAX_ENTRIES;
    public static LinkedHashMap<UUID, overflowCommands> repeatingCommands;
    Pattern checkPattern;
    Pattern containsPattern;

    public SpecializedCommandManager(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public void processAliasCmdsAsPlayer(String initializer, List<String> cmds, Player player) {
    }

    private void process(String initializer, List<String> cmds, Player player, CheckStatements conditions) {
    }

    public void processCmds(List<String> cmds) {
    }

    public void processCmds(List<String> cmds, CommandSender sender) {
    }

    public void processCmds(List<String> cmds, Player player) {
    }

    public void processCmds(List<String> cmds, Player player, CMIInteractType clickType) {
    }

    public void processCmds(String initializer, List<String> cmds, Player player) {
    }

    public void processCmds(String initializer, List<String> cmds, Player player, CMIInteractType clickType) {
    }

    public void processCmds(String initializer, List<String> cmds, Player player, CMIInteractType clickType, CommandSender sender) {
    }

    private void process(String initializer, List<String> cmds, Player player, CMIInteractType clickType, CommandSender sender) {
    }

    public specCommand processSpecializedCommand(String cmd) {
        return null;
    }

    public boolean isSpecializedCommand(String cmd) {
        return false;
    }

    public boolean executeCmd(String cmd, Player senderPlayer) {
        return false;
    }

    public boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType) {
        return false;
    }

    public boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender) {
        return false;
    }

    public boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender) {
        return false;
    }

    public boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender, CheckStatements groupedStatements) {
        return false;
    }

    private static void processCondition(failType feedback, CheckStatements groupedConditions) {
    }

    private UUID getUUID(CommandSender sender) {
        return null;
    }

    public synchronized boolean dispatch(CommandSender sender, String commandLine) throws CommandException {
        return false;
    }

    private static boolean isOpCmd(String cmd) {
        return false;
    }

    private failType deductForCommand(Player player, List<specCommandAction> conditions) {
        return null;
    }

    private failType canPerformCommand(String initializer, Player player, List<specCommandAction> conditions, boolean deduct, CMIInteractType clickType, CheckStatements groupedStatements,
        boolean translate) {
        return null;
    }

    private static boolean checkForMatch(List<String> values, String checkedValue) {
        return false;
    }

    private static boolean checkForContains(List<String> values, String checkedValue) {
        return false;
    }

    class runAway {
        private Long time;
        private CMITask schedId;

        public runAway(Long time) {
        }

        public Long getTime() {
            return null;
        }

        public void setTime(Long time) {
        }

        public CMITask getSchedTask() {
            return null;
        }

        public void stopSchedTask() {
        }

        public void setSchedTask(CMITask schedId) {
        }
    }

    private class CheckStatements {
        HashMap<String, Boolean> statements;
        private String temp;

        private CheckStatements() {
        }

        public void setStatement(String statement, boolean value) {
        }

        public Boolean getStatementValue(String statement) {
            return null;
        }

        public String getTemp() {
            return null;
        }

        public void setTemp(String temp) {
        }
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
            return null;
        }
    }

    public enum specialisedCommand {
        permission("perm:[value][@][?][#]!", specialisedCommandType.condition), group("group:[value][@][?][#]!", specialisedCommandType.condition), bpermission("bperm:[value][@][?][#]!",
            specialisedCommandType.condition), money("moneycost:[value][?][#]!", specialisedCommandType.condition), exp("expcost:[value][?][#]!", specialisedCommandType.condition), hasMoney(
                "hasmoney:[value][@][?][#]!", specialisedCommandType.condition), hasItem("hasitem:[value][@][?][#]!", specialisedCommandType.condition), hasExactItem("hasexactitem:[value][@][?][#]!",
                    specialisedCommandType.condition), item("item:[value][?][#]!", specialisedCommandType.condition), exactItem("exactitem:[value][?][#]!", specialisedCommandType.condition), hasExp(
                        "hasexp:[value][@][?][#]!", specialisedCommandType.condition), votes("votes:[value][@][?][#]!", specialisedCommandType.condition), cooldown("cooldown:[value][?][#]!",
                            specialisedCommandType.condition), ucooldown("ucooldown:[value][?][#]!", specialisedCommandType.condition), gcooldown("gcooldown:[value][?][#]!",
                                specialisedCommandType.condition), ifonline("ifonline:[value][?][#]!", specialisedCommandType.condition), ifoffline("ifoffline:[value][?][#]!",
                                    specialisedCommandType.condition), ifempty("ifempty:[value][?][#]!", specialisedCommandType.condition), stopdelay("stopdelay:[value]!",
                                        specialisedCommandType.condition), check("check:[value1][==|>|>=|<|<=|!=][value2][?][#]!", specialisedCommandType.condition), contains(
                                            "contains:[value1][=>][value2][@][#]!", specialisedCommandType.condition), statement("statement:[value]!", specialisedCommandType.statement), if_(
                                                "if:[value][@][#]!", specialisedCommandType.statement), ifhasair("ifhasair:[value][@][#]!", specialisedCommandType.condition), ifhashunger(
                                                    "ifhashunger:[value][@][#]!", specialisedCommandType.condition), ifhashealth("ifhashealth:[value][@][#]!", specialisedCommandType.condition),
        ifingamemode("ifingamemode:[value][@][#]!", specialisedCommandType.condition), ifinworld("ifinworld:[value][@][?][#]!", specialisedCommandType.condition), ifinportal("ifinportal:[value][@][?][#]!",
            specialisedCommandType.condition), click("click:[value][#]!", specialisedCommandType.condition), ptarget("ptarget:[value]!", specialisedCommandType.condition), closeinv("closeinv!",
                specialisedCommandType.subaction), ph("ph!", specialisedCommandType.subaction), ch("ch!", specialisedCommandType.subaction), msg("msg!", specialisedCommandType.action), broadcast(
                    "broadcast!", specialisedCommandType.action), actionbar("actionbar!", specialisedCommandType.action), title("title!", specialisedCommandType.action), subtitle("subtitle!",
                        specialisedCommandType.action), kickall("kickall!", specialisedCommandType.action), fromConsole("fromConsole!", specialisedCommandType.action), asConsole("asConsole!",
                            specialisedCommandType.action), asFakeOp("asFakeOp!", specialisedCommandType.action), likePlayer("likePlayer!", specialisedCommandType.action), asPlayer("asPlayer!",
                                specialisedCommandType.action), allPlayers("allPlayers!", specialisedCommandType.action);

        private String format;
        private specialisedCommandType type;

        specialisedCommand(String format, specialisedCommandType type) {
        }

        public String getFormat() {
            return null;
        }

        public String getFormatForCheck() {
            return null;
        }

        public void setFormat(String format) {
        }

        public specialisedCommandType getType() {
            return null;
        }

        public void setType(specialisedCommandType type) {
        }

        public static specCommandAction get(String arg) {
            return null;
        }
    }

    public class specCommandAction {
        private specialisedCommand cmd;
        private boolean needToBreak;
        private boolean needToInform;
        private boolean stopAfter;
        private boolean opposite;
        private Object value;
        private Object value2;
        private String initializer;

        public specCommandAction(specialisedCommand cmd) {
        }

        public specialisedCommand getCmd() {
            return null;
        }

        public void setCmd(specialisedCommand cmd) {
        }

        public boolean isNeedToBreak() {
            return false;
        }

        public void setNeedToBreak(boolean needToBreak) {
        }

        public boolean isNeedToInform() {
            return false;
        }

        public void setNeedToInform(boolean needToInform) {
        }

        public Object getValue() {
            return null;
        }

        public void setValue(Object value) {
        }

        public Object getValue2() {
            return null;
        }

        public void setValue2(Object value2) {
        }

        public boolean isOpposite() {
            return false;
        }

        public void setOpposite(boolean opposite) {
        }

        public String getInitializer() {
            return null;
        }

        public void setInitializer(String initializer) {
        }

        public boolean isStopAfter() {
            return false;
        }

        public void setStopAfter(boolean stopAfter) {
        }
    }
}
