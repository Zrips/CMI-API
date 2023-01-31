package com.Zrips.CMI.Modules.Anvil;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Version;

public class CMIAnvilGUI {

    private boolean colorrename = false;
    private Player player;
    private String title = "Repair & Name";
    private String defaulttext = "";
    private Inventory inventory;
    private HashMap<AnvilSlot, ItemStack> items = new HashMap<AnvilSlot, ItemStack>();
    private Listener listener;
    private AnvilClickEventHandler handler;

    private Class<?> BlockPosition;
    private Class<?> PacketPlayOutOpenWindow;
    private Class<?> ContainerAnvil;
    private Class<?> ChatMessage;
    private Class<?> EntityHuman;
    private Class<?> ContainerAccess;
    private Class<?> Containers;
    private Class<?> Container;

    private boolean useNewVersion = true;

    private void loadClasses() {

    }

    public enum AnvilSlot {

        INPUT_LEFT(0), INPUT_RIGHT(1), OUTPUT(2);

        private int slot;

        private AnvilSlot(int Slot) {
            slot = Slot;
        }

        public int getSlot() {
            return slot;
        }

        public static AnvilSlot bySlot(int Slot) {

            for (AnvilSlot AS : values())
                if (AS.getSlot() == Slot)
                    return AS;

            return null;

        }

    }

    public interface AnvilClickEventHandler {
        public void onAnvilClick(AnvilClickEvent event);

        public void onAnvilClose(InventoryCloseEvent event);
    }

    public class AnvilClickEvent {

        private AnvilSlot slot;
        private ItemStack item;
        private String text;

        public AnvilClickEvent(AnvilSlot Slot, ItemStack Item, String Text) {
            slot = Slot;
            item = Item;
            text = Text;
        }

        public AnvilSlot getSlot() {
            return slot;
        }

        public ItemStack getItemStack() {
            return item;
        }

        public void setItemStack(ItemStack Item) {
            item = Item;
            inventory.setItem(slot.getSlot(), item);
        }

        public boolean hasText() {
            return text != null;
        }

        public String getText() {
            return text != null ? text : defaulttext;
        }
    }

    public boolean getColorRename() {
        return colorrename;
    }

    public void setColorRename(boolean ColorRename) {
        colorrename = ColorRename;
    }

    public Player getPlayer() {
        return player;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        title = Title;
    }

    public String getDefaultText() {
        return defaulttext;
    }

    public void setDefaultText(String DefaultText) {
        defaulttext = DefaultText;
    }

    public ItemStack getSlot(AnvilSlot Slot) {
        return items.get(Slot);
    }

    public void setSlot(AnvilSlot Slot, ItemStack Item) {
        items.put(Slot, Item);
    }

    public String getSlotName(AnvilSlot Slot) {

        return "";
    }

    public void setSlotName(AnvilSlot Slot, String Name) {

    }

    public CMIAnvilGUI(Player Player, final AnvilClickEventHandler Handler) {

        loadClasses();

        player = Player;
        handler = Handler;

        listener = null;

        // PrepareAnvilEvent doesn't exist in older server versions
        if (Version.isCurrentEqualOrLower(Version.v1_8_R3)) {

            listener = new Listener() {

                @EventHandler
                public void ICE(InventoryClickEvent e) {

                }

                @EventHandler
                public void ICE(InventoryCloseEvent e) {

                }

                @EventHandler
                public void PQE(PlayerQuitEvent e) {
                }
            };

        } else {

            listener = new Listener() {

                @EventHandler
                public void ICE(InventoryClickEvent e) {

                }

                @EventHandler
                public void PAE(PrepareAnvilEvent e) {

                }

                @EventHandler
                public void ICE(InventoryCloseEvent e) {

                }

                @EventHandler
                public void PQE(PlayerQuitEvent e) {

                }
            };
        }

        Bukkit.getPluginManager().registerEvents(listener, CMI.getInstance());

    }

    public void open() {
        open(title);
    }

    public Field getField(Class<?> clazz, String fieldName) throws Exception {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    public void open(String Title) {

    }
}
