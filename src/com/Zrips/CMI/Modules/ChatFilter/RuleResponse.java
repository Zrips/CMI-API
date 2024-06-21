package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.CMILC;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class RuleResponse {

    private String message;
    private String updatedMessage;
    private HashMap<String, ChatFilterRule> rules = new HashMap<String, ChatFilterRule>();
    private List<String> bypass = new ArrayList<String>();

    public RuleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, ChatFilterRule> getRules() {
        return rules;
    }

    public String getRulesNamesAsString() {
        String n = "";
        for (Entry<String, ChatFilterRule> one : rules.entrySet()) {
            if (!n.isEmpty())
                n += ", ";
            n += one.getKey();
        }
        return n;
    }

    public void addRule(ChatFilterRule rule) {
        if (rule != null && !this.rules.containsKey(rule.getRuleName()))
            this.rules.put(rule.getRuleName(), rule);
    }

    public ChatFilterBlockType getMaxFilterBlockType() {
        ChatFilterBlockType type = ChatFilterBlockType.None;
        for (Entry<String, ChatFilterRule> one : rules.entrySet()) {
            if (isBypass(one.getValue().getGroup()))
                continue;
            if (one.getValue().getBlockType().getId() < type.getId())
                type = one.getValue().getBlockType();
        }
        return type;
    }

    public boolean isInformConsole() {
        boolean inform = false;
        for (Entry<String, ChatFilterRule> one : rules.entrySet()) {
            if (isBypass(one.getValue().getGroup()))
                continue;
            if (one.getValue().isInformConsole())
                inform = true;
        }
        return inform;
    }

    public boolean isBypass(String bypass) {
        return this.bypass.contains(bypass.toLowerCase());
    }

    public void addBypass(String bypass) {
        if (!this.bypass.contains(bypass.toLowerCase()))
            this.bypass.add(bypass.toLowerCase());
    }

    public String getUpdatedMessage() {
        if (updatedMessage == null)
            return message;
        return updatedMessage;
    }

    public void setUpdatedMessage(String updatedMessage) {
        this.updatedMessage = updatedMessage;
    }

    public void informStaff(Player player) {
        for (Player oPlayer : Bukkit.getOnlinePlayers()) {
            if (!CMIPerm.chatfilter_inform.hasPermission(oPlayer, 10000L))
                continue;
            for (Entry<String, ChatFilterRule> oneC : getRules().entrySet()) {
                if (isBypass(oneC.getValue().getGroup()))
                    continue;
                ChatFilterRule one = oneC.getValue();
                if (one.getMessageToStaff() != null && !one.getMessageToStaff().isEmpty()) {
                    oPlayer.sendMessage(CMIChatColor.translate(CMI.getInstance().getLM().updateSnd(new Snd().setSender(oPlayer).setTarget(player), one.getMessageToStaff())).replace(
                        "[message]", getMessage()));
                }
            }
        }

        if (isInformConsole())
            CMI.getInstance().consoleMessage(CMILC.info_spamConsoleInform.getLocale("[playerName]", (player).getName(), "[rules]", getRulesNamesAsString(), "[message]", getMessage()));
    }

    public void performCommands(Player player) {
        CMIScheduler.runTaskLater(() -> {
            Snd snd = new Snd().setSender(player).setTarget(player);
            for (Entry<String, ChatFilterRule> oneRule : getRules().entrySet()) {
                for (String oneCmd : oneRule.getValue().getCommands()) {
                    if (isBypass(oneRule.getValue().getGroup()))
                        continue;
                    String cmd = CMI.getInstance().getLM().updateSnd(snd, oneCmd);
                    cmd = cmd.replace("[message]", getMessage());
                    cmd = cmd.replace("[updatedmessage]", getUpdatedMessage());
                    CMI.getInstance().getSpecializedCommandManager().executeCmd(cmd, null);
                }
            }
        }, 1);
    }
}
