package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIItemStack;

public class PlayerOptionsManager {
    private CMI plugin;
    private Boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;
    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;
    public static String defaultString;

    public PlayerOptionsManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void openOptionGUI(CMIUser user) {
    }

    public void openOptionGUI(Player sender, CMIUser user) {
    }
}
