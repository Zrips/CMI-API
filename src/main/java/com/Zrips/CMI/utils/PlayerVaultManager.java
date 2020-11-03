package com.Zrips.CMI.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;

public class PlayerVaultManager {

    public PlayerVaultManager() {
    }

    static Method vaultExistsMeth = null;
    static Method loadOtherVaultMeth = null;
    static Class<?> c = null;

    private static void setVaultExistsMeth() {
    }

    private static void setLoadOtherVaultMeth() {
    }

    private static void setClass() {
    }

    public static boolean vaultExists(UUID uuid, int id) {

	return true;
    }

    public static Inventory loadOtherVault(UUID uuid, int i, int y) {

	return null;
    }

}
