package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.ArrayList;
import java.util.List;

import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager.specCommandAction;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager.specialisedCommand;

public class specCommand {
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

    public void add(specCommandAction l) {
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
}
