package com.Zrips.CMI.Modules.DataBase;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import com.Zrips.CMI.CMI;

public class DBClassLoader extends URLClassLoader {
    
    public DBClassLoader(CMI core) {
        super(new URL[0], core.getClass().getClassLoader());
    }

    public void addFile(File f) throws IOException {
        addURL(f.toURI().toURL());
    }
    
    @Override
    public void addURL(URL url) {
    }
}
