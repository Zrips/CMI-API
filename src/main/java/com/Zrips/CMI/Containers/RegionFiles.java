package com.Zrips.CMI.Containers;

import java.io.*;

public class RegionFiles {
    private static final int SECTOR_BYTES = 4096;
    private static final int SECTOR_INTS = SECTOR_BYTES / 4;

    private RandomAccessFile file;
    private final int offsets[];

    public RegionFiles(File path) {
	offsets = new int[SECTOR_INTS];
	try {
	    file = new RandomAccessFile(path, "r");
	    file.seek(0);
	    for (int i = 0; i < SECTOR_INTS; ++i) {
		int offset = file.readInt();
		offsets[i] = offset;
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private int getOffset(int x, int z) {
	return offsets[x + z * 32];
    }

    public boolean hasChunk(int x, int z) {
	return getOffset(x, z) != 0;
    }

    public void close() throws IOException {
	file.close();
    }
}