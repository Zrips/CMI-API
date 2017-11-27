package com.Zrips.CMI.utils;

import java.util.List;

public class ListEditor {

    public ListEditor() {
    }
    
    public enum listMoveDirection{
	Up(-1), Down(1);
	private int dir;

	listMoveDirection(int dir){
	    this.dir = dir;	    
	}

	public int getDir() {
	    return dir;
	}

	public void setDir(int dir) {
	    this.dir = dir;
	}
    }

    public static List<String> move(List<String> list, int place, listMoveDirection direction) {
	return list;
    }
    
    
}
