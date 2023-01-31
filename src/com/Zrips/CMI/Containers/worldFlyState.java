package com.Zrips.CMI.Containers;

public class worldFlyState {

    private boolean state = false;
    private boolean temp = true;

    public worldFlyState(
        boolean state, boolean temp) {
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

}
