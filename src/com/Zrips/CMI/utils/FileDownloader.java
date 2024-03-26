package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDownloader {

    public FileDownloader() {
    }

    static final List<String> VALID_TYPES = new ArrayList<String>(Arrays.asList("dat", "yml", "txt", "jar"));
    static final List<String> VALID_SOURCES = new ArrayList<>(Arrays.asList(
        "https://raw.githubusercontent.com/Zrips/CMI/master/Settings/DeathMessages/",
        "https://raw.githubusercontent.com/Zrips/CMI/master/Translations/",
        "https://www.zrips.net/wp-content/uploads/2019/02/",
        "https://www.zrips.net/CMILib/"));

    public void downloadUsingStream(final String urlStr, final String file) {

    }

    public void afterDownload() {

    }

    public void failedDownload() {

    }

}
