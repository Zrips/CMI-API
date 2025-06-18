package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CMIPortal;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class portals implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eSet portals", args = "(new/nearest/forceupdate/setlocation/enabled) (portalName) (world:x:y:z:yaw:pitch)", multiTab = { "new,nearest",
        "forceupdate,setlocation,edit,commands [portals]", "enabled [allportals] true,false" }, explanation = {}, regVar = { -666 }, consoleVar = { 2, 3, 4 }, modules = "portals", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private Boolean openUI(Player player, CMIPortal portal) {
        return null;
    }

    private enum Action {
        edit, showbungeemsg, bungeeloc, createnew, commands, list, nearest, moveup, movedown, add, remove, forceupdate, setlocation, enabled;

        public static Action getByName(String name) {
            return null;
        }
    }
}
