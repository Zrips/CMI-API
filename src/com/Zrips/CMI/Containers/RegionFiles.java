package com.Zrips.CMI.Containers;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RegionFiles {
    private static final int SECTOR_BYTES = 0;
    private static final int SECTOR_INTS = 0;
    private RandomAccessFile file;
    private final int offsets = 0;

    public RegionFiles(File path) {
    }

    private int getOffset(int x, int z) {
        return 0;
    }

    public boolean hasChunk(int x, int z) {
        return false;
    }

    public void close() throws IOException {
    }
}
