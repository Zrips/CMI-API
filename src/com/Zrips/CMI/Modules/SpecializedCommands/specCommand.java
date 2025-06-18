package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.List;

import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager.specCommandAction;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager.specialisedCommand;

public class specCommand {
    private String cmd;
    private specialisedCommand action;
    private List<specCommandAction> subactions;
    private List<specCommandAction> list;
    private List<specCommandAction> statements;

    public String getCmd() {
        return null;
    }

    public void setCmd(String cmd) {
    }

    public List<specCommandAction> getConditionList() {
        return null;
    }

    public void add(specCommandAction l) {
    }

    public specialisedCommand getAction() {
        return null;
    }

    public List<specCommandAction> getSubactions() {
        return null;
    }

    public List<specCommandAction> getStatements() {
        return null;
    }

    public boolean containsSubaction(specialisedCommand cmd) {
        return false;
    }
}
