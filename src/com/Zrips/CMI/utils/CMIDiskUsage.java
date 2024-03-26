package com.Zrips.CMI.utils;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CMIDiskUsage {

    private static FileStore FileSystem;

    static {
        update();
    }

    public static long getUsed() {
        if (FileSystem == null)
            return 0L;
        try {
            return FileSystem.getTotalSpace() - FileSystem.getUsableSpace();
        } catch (Throwable e) {
        }
        return 0L;
    }

    public static long getUsable() {
        if (FileSystem == null)
            return 0L;
        try {
            return FileSystem.getUsableSpace();
        } catch (Throwable e) {
        }
        return 0L;
    }

    public static void update() {
        try {
            FileSystem = Files.getFileStore(Paths.get("."));
        } catch (IOException iOException) {
        }
    }

    public static long getTotal() {
        if (FileSystem == null)
            return 0L;
        try {
            return FileSystem.getTotalSpace();
        } catch (Throwable e) {  
        }
        return 0L;
    }
}