package com.Zrips.CMI.Modules.CustomNBT;

import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CustomNBT.CustomNBTManager.CustomNBTType;
import com.Zrips.CMI.utils.Util.CommandType;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class CustomNBTListener implements Listener {
    private CMI plugin;

    public CustomNBTListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerInteractCommand(PlayerInteractEvent event) {
    }

    private String handleCmd(Player player, String cmd) {
	return null;
    }


    @EventHandler(priority = EventPriority.MONITOR)
    public void playerInteractOneTime(PlayerInteractEvent event) {
	
    }
}
