package com.Zrips.CMI.Modules.NickName;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class NickNameManager {
    private CMI plugin;
    private HashMap<String, UUID> NickMap;
    private String NickNameFormat;
    private boolean DisplayNameChange;
    private String ValidNickNameRegex;
    private List<String> NickNameBlackList;
    private int NickNameLengthMax;
    private int NickNameLengthMin;
    private String NickNamePrefix;
    private Boolean PrefixWhenDifferent;
    private Boolean IncludeInTabComplete;
    private Boolean IncludeRealName;

    public NickNameManager(CMI plugin) {
    }

    public void removeNickName(String nick) {
    }

    public void addNewNickName(String nick, UUID uuid) {
    }

    public UUID whoUsesName(String nick) {
        return null;
    }

    public List<String> getNickNamesStartingWith(Player player, String nick) {
        return null;
    }

    public void load() {
    }

    public String getNickNameFormat() {
        return null;
    }

    public List<String> getNickNameBlackList() {
        return null;
    }

    public int getNickNameLengthMax() {
        return 0;
    }

    public int getNickNameLengthMin() {
        return 0;
    }

    @Deprecated
    public Boolean isColorsNickName() {
        return null;
    }

    public String getNickNamePrefix() {
        return null;
    }

    public void setNickNamePrefix(String nickNamePrefix) {
    }

    public Boolean isPrefixWhenDifferent() {
        return null;
    }

    public void setPrefixWhenDifferent(Boolean prefixWhenDifferent) {
    }

    public String getValidNickNameRegex() {
        return null;
    }

    public boolean isDisplayNameChange() {
        return false;
    }

    public boolean isIncludeNickNameInTabComplete() {
        return false;
    }

    public Boolean isIncludeRealNameInTabComplete() {
        return null;
    }
}
