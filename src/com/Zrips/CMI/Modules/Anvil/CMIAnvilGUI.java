package com.Zrips.CMI.Modules.Anvil;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilGUI {
    private boolean colorrename;
    private Player player;
    private String title;
    private String defaulttext;
    private Inventory inventory;
    private HashMap<AnvilSlot, ItemStack> items;
    private Listener listener;
    private AnvilClickEventHandler handler;
    private static Class<?> BlockPosition;
    private static Class<?> PacketPlayOutOpenWindow;
    private static Class<?> ContainerAnvil;
    private static Class<?> ChatMessage;
    private static Class<?> EntityHuman;
    private static Class<?> ContainerAccess;
    private static Class<?> Containers;
    private static Class<?> Container;
    private static boolean useNewVersion;

    private static void loadClasses() {
    }

    public boolean getColorRename() {
        return false;
    }

    public void setColorRename(boolean ColorRename) {
    }

    public Player getPlayer() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public void setTitle(String Title) {
    }

    public String getDefaultText() {
        return null;
    }

    public void setDefaultText(String DefaultText) {
    }

    public ItemStack getSlot(AnvilSlot Slot) {
        return null;
    }

    public void setSlot(AnvilSlot Slot, ItemStack Item) {
    }

    public String getSlotName(AnvilSlot Slot) {
        return null;
    }

    public void setSlotName(AnvilSlot Slot, String Name) {
    }

    public CMIAnvilGUI(Player Player, AnvilClickEventHandler Handler) {
    }

    public void open() {
    }

    public Field getField(Class<?> clazz, String fieldName) throws Exception {
        return null;
    }

    public void open(String Title) {
    }

    public enum AnvilSlot {
        INPUT_LEFT(0), INPUT_RIGHT(1), OUTPUT(2);

        private int slot;

        private AnvilSlot(int Slot) {
        }

        public int getSlot() {
            return 0;
        }

        public static AnvilSlot bySlot(int Slot) {
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
        }

        public AnvilSlot getSlot() {
            return null;
        }

        public ItemStack getItemStack() {
            return null;
        }

        public void setItemStack(ItemStack Item) {
        }

        public boolean hasText() {
            return false;
        }

        public String getText() {
            return null;
        }
    }
}
