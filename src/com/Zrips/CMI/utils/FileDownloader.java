package com.Zrips.CMI.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;

import com.Zrips.CMI.CMI;

public class FileDownloader {

    public FileDownloader() {
    }

    static List<String> validTypes = new ArrayList<String>(Arrays.asList("dat", "yml", "txt", "jar"));

    public void downloadUsingStream(final String urlStr, final String file) {
    }

    public void afterDownload() {

    }

    public void failedDownload() {

    }

}
