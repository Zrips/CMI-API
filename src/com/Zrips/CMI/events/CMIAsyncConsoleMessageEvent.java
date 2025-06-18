package com.Zrips.CMI.events;

public final class CMIAsyncConsoleMessageEvent extends CMIEvent {
    private String message;
    private long time;

    public CMIAsyncConsoleMessageEvent(String message, long time) {
        super(true);
    }

    public String getMessage() {
        return null;
    }

    public long getTime() {
        return 0;
    }
}
