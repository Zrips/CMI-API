package com.Zrips.CMI.Modules.ChatFormat;

import java.util.Set;
import java.util.UUID;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIChatRoom {
    private Set<CMIUser> users;
    private Set<CMIUser> watchers;
    private String chatName;
    private UUID owner;
    private boolean priv;
    private boolean locked;
    private boolean persistent;
    private Set<UUID> invitations;
    private long keepAliveUntil;

    public CMIChatRoom(String chatName) {
    }

    public String getChatName() {
        return null;
    }

    public void setChatName(String chatName) {
    }

    public Set<CMIUser> getUsers() {
        return null;
    }

    public Set<CMIUser> getWatchers() {
        return null;
    }

    public Set<UUID> getWatchersUUID() {
        return null;
    }

    public void addUser(CMIUser user) {
    }

    public boolean removeUser(CMIUser user) {
        return false;
    }

    public void addWatcher(CMIUser user) {
    }

    public boolean removeWatcher(CMIUser user) {
        return false;
    }

    public void broadcastMessage(CMIUser sender, String msg) {
    }

    public void cleanOldUsers() {
    }

    public void informLeave(CMIUser left) {
    }

    public void informJoin(CMIUser joined) {
    }

    public UUID getOwner() {
        return null;
    }

    public void setOwner(UUID owner) {
    }

    public boolean isOwner(UUID check) {
        return false;
    }

    public boolean isPrivate() {
        return false;
    }

    public void setPrivate(boolean priv) {
    }

    public boolean kick(CMIUser user) {
        return false;
    }

    public Set<UUID> getInvitations() {
        return null;
    }

    public boolean isInvited(UUID uuid) {
        return false;
    }

    public void addInvitation(UUID uuid) {
    }

    public void removeInvitation(UUID uuid) {
    }

    public long getKeepAliveUntil() {
        return 0;
    }

    public void setKeepAliveUntil(long keepAliveUntil) {
    }

    public boolean isLocked() {
        return false;
    }

    public void setLocked(boolean locked) {
    }

    public boolean isPersistent() {
        return false;
    }

    public void setPersistent(boolean persistent) {
    }
}
