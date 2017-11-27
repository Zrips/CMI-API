package com.Zrips.CMI;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.configuration.file.YamlConfiguration;


public class CommentedYamlConfiguration extends YamlConfiguration {
    private HashMap<String, String> comments;

    public CommentedYamlConfiguration() {
	super();
	comments = new HashMap<String, String>();
    }

    @Override
    public void save(String file) throws IOException {
    }

    @Override
    public void save(File file) throws IOException {	
    }

    private String insertComments(String yaml) {
	return "";
    }

    public void addComment(String path, String... commentLines) {	
    }
}
