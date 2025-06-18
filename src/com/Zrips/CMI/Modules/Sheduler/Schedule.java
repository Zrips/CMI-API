package com.Zrips.CMI.Modules.Sheduler;

import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

public class Schedule {
    private boolean enabled;
    private String name;
    private long performOn;
    private boolean performed;
    private List<String> commands;
    private List<String> tempCommands;
    private List<String> minPlayerCommands;
    private boolean repeatable;
    private boolean randomize;
    private boolean duplicateRandomize;
    private boolean singleLinear;
    private long delay;
    private long lastPerformedOn;
    private List<SchedTime> time;
    private int MinPlayer;
    private int MaxPlayer;
    private boolean playerAmountFeedback;
    private double commandDelay;
    private boolean dontTranslatePlaceholders;
    private boolean randomPlayer;
    Pattern placeholderKeepPatern;

    public Schedule(String name) {
    }

    public void reset() {
    }

    public String getDuplicatedRandomCommand() {
        return null;
    }

    public String getRandomCommand() {
        return null;
    }

    public String getSingleLinearCommand() {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public boolean isPerformed() {
        return false;
    }

    public void setPerformed(boolean performed) {
    }

    public boolean isPlayerAmountOk() {
        return false;
    }

    public boolean isPlayerMinOk() {
        return false;
    }

    public boolean isPlayerMaxOk() {
        return false;
    }

    public boolean itsTimeToPerform() {
        return false;
    }

    public void recalculateNext() {
    }

    public Long getPerformOn() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean isRepeatable() {
        return false;
    }

    public void setRepeatable(boolean repeatable) {
    }

    public long getDelay() {
        return 0;
    }

    public void setDelay(long delay) {
    }

    public Long getLastPerformedOn() {
        return null;
    }

    public void setLastPerformedOn() {
    }

    public void setLastPerformedOn(Long lastPerformedOn) {
    }

    private void updateNextPerform() {
    }

    public List<SchedTime> getTime() {
        return null;
    }

    public void setTime(List<SchedTime> time) {
    }

    public Integer getMinPlayer() {
        return null;
    }

    public void setMinPlayer(Integer minPlayer) {
    }

    public Integer getMaxPlayer() {
        return null;
    }

    public void setMaxPlayer(Integer maxPlayer) {
    }

    public boolean isRandomize() {
        return false;
    }

    public void setRandomize(boolean randomize) {
    }

    public void safePerform() {
    }

    public void perform() {
    }

    private void processCmd(String cmd, Player player) {
    }

    private void performCmd(List<String> cmds, Player player) {
    }

    public List<String> updateSchedCmds(List<String> cmds, Player player) {
        return null;
    }

    public Player getRandomPlayer() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public Boolean isPlayerAmountFeedback() {
        return null;
    }

    public void setPlayerAmountFeedback(Boolean playerAmountFeedback) {
    }

    public Double getTotalCommandDelay() {
        return null;
    }

    public boolean isSingleLinear() {
        return false;
    }

    public void setSingleLinear(boolean singleLinear) {
    }

    public boolean isDuplicateRandomize() {
        return false;
    }

    public void setDuplicateRandomize(boolean duplicateRandomize) {
    }

    public List<String> getMinPlayerCommands() {
        return null;
    }

    public void setMinPlayerCommands(List<String> minPlayerCommands) {
    }

    public boolean isDontTranslatePlaceholders() {
        return false;
    }

    public void setDontTranslatePlaceholders(boolean dontTranslatePlaceholders) {
    }
}
