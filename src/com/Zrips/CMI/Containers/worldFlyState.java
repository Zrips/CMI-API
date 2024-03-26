package com.Zrips.CMI.Containers;

import org.bukkit.GameMode;

public class worldFlyState {

    private boolean state = false;
    private boolean temp = true;
    private GameMode mode = GameMode.SURVIVAL;

    public worldFlyState(
        GameMode mode, boolean state, boolean temp) {

        this.mode = mode;
        this.state = state;
        this.temp = temp;
    }

    public boolean isFlyEnabled() {
        return state;
    }

    public void setFlyEnabled(boolean state) {
        this.state = state;
    }

    public boolean isTemp() {
        return temp;
    }

    public void setTemp(boolean temp) {
        this.temp = temp;
    }

    public GameMode getGameMode() {
        return mode;
    }

    public void setMode(GameMode mode) {
        this.mode = mode;
    }

}
