package com.Zrips.CMI.utils;

import java.util.List;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Chat.listMoveDirection;

public class ListEditor {
    public ListEditor() {
    }

    public static List<String> move(List<String> list, int place, listMoveDirection direction) {
        return null;
    }

    public static boolean showListForEditing(Player player, String cmd, String name, List<String> list, boolean ShowAdd) {
        return false;
    }

    public static boolean showListForEditing(Player player, String cmd, String name, List<String> list, boolean ShowAdd, boolean fillEmpty) {
        return false;
    }

    public static boolean processEditListClean(String[] args, Player player, String cmd, String name, List<String> list, boolean add, String subCommand) {
        return false;
    }

    public enum listEditorType {
        text, commands;
    }
}
