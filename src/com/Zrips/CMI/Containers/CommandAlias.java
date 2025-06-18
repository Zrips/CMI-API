package com.Zrips.CMI.Containers;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;

public class CommandAlias {
    private boolean state;
    private String cmiCommandName;
    private List<String> commands;
    private String alias;
    private boolean requiresPerm;
    private boolean tabComplete;
    private CommandAliasType type;
    private boolean exact;
    private boolean overrideTab;
    private boolean addTabs;
    private boolean disableBase;
    private List<String> customTabList;
    private CMITabComplete customTab;
    private Boolean containsDynamic;
    private String fileName;
    private Set<String> alternatives;
    private boolean alternative;
    Pattern patern;

    @Deprecated
    public CommandAlias(String alias, List<String> commands, boolean state) {
    }

    @Deprecated
    public CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type) {
    }

    @Deprecated
    public CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type, String cmiCommandName) {
    }

    public CommandAlias(String alias, String fileName, List<String> commands, boolean state) {
    }

    public CommandAlias(String alias, String fileName, List<String> commands, boolean state, CommandAliasType type) {
    }

    public CommandAlias(String alias, String fileName, List<String> commands, boolean state, CommandAliasType type, String cmiCommandName) {
    }

    public boolean getState() {
        return false;
    }

    public void setState(boolean state) {
    }

    public String getCommand() {
        return null;
    }

    public String getCleanCommand() {
        return null;
    }

    public String getCommand(CommandSender sender, List<String> args) {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public String getCommandsForLore() {
        return null;
    }

    public String getAlias() {
        return null;
    }

    public boolean containsDynamicVariables() {
        return false;
    }

    public void recalculateDynamicVariables() {
    }

    public String getAliasBaseCommand() {
        return null;
    }

    public String getAliasAsOneWord() {
        return null;
    }

    public String getAliasAsOneWordNS() {
        return null;
    }

    public void setAlias(String alias) {
    }

    public void setCommands(List<String> commands) {
    }

    public boolean isRequiresPerm() {
        return false;
    }

    public void setRequiresPerm(boolean requiresPerm) {
    }

    public CommandAliasType getType() {
        return null;
    }

    public String getCmiCommandName() {
        return null;
    }

    public boolean isTabComplete() {
        return false;
    }

    public void setTabComplete(boolean tabComplete) {
    }

    public List<String> getCustomTabRawList() {
        return null;
    }

    public CMITabComplete getCustomTab() {
        return null;
    }

    public List<Object> getTabCompleteList(String[] args) {
        return null;
    }

    public void recheckTabCompletes() {
    }

    public void setCustomTab(List<String> customTab) {
    }

    public boolean isDisableBase() {
        return false;
    }

    public void setDisableBase(boolean disableBase) {
    }

    public boolean isOverrideTab() {
        return false;
    }

    public void setOverrideTab(boolean overrideTab) {
    }

    public boolean isAddTabs() {
        return false;
    }

    public void setAddTabs(boolean addTabs) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String fileName) {
    }

    public Set<String> getAlternatives() {
        return null;
    }

    public void setAlternatives(Set<String> alternatives) {
    }

    public void addAlternative(String alternative) {
    }

    public boolean isAlternative() {
        return false;
    }

    public void setAlternative(boolean alternative) {
    }

    public boolean isExact() {
        return false;
    }

    public void setExact(boolean exact) {
    }
}
