package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIChatRoom {

    private Set<CMIUser> users = new HashSet<CMIUser>();
    private Set<CMIUser> watchers = new HashSet<CMIUser>();
    private String chatName;
    private UUID owner;
    private boolean priv = false;
    private boolean locked = false;
    private boolean persistent = false;
    private Set<UUID> invitations;
    private long keepAliveUntil = 0L;

    public CMIChatRoom(String chatName) {
        this.chatName = chatName;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Set<CMIUser> getUsers() {
        return users;
    }

    public Set<CMIUser> getWatchers() {
        return watchers;
    }

    public Set<UUID> getWatchersUUID() {
        Set<UUID> uuids = new HashSet<UUID>();
        for (CMIUser one : getWatchers()) {
            uuids.add(one.getUniqueId());
        }
        return uuids;
    }

    public void addUser(CMIUser user) {
        if (user == null)
            return;
        this.users.add(user);
        user.setChatRoom(this);
        keepAliveUntil = 0L;
    }

    public boolean removeUser(CMIUser user) {
        if (user == null)
            return false;
        user.setChatRoom(null);
        boolean feed = users.remove(user);
        if (users.isEmpty() && !persistent)
            keepAliveUntil = System.currentTimeMillis() + (ChatFormatManager.ChatRoomLife * 1000L);
        else
            keepAliveUntil = System.currentTimeMillis() + (60 * 60 * 24 * 7 * 1000L);
        return feed;
    }

    public void addWatcher(CMIUser user) {
        this.watchers.add(user);
    }

    public boolean removeWatcher(CMIUser user) {
        return watchers.remove(user);
    }

    public void broadcastMessage(CMIUser sender, String msg) {
     
    }

    public void cleanOldUsers() {
        for (CMIUser user : new HashSet<CMIUser>(users)) {
            if (user.isOnline())
                continue;
            if (user.getLastLogoff() + (1000L * 60) > System.currentTimeMillis())
                continue;
            removeUser(user);
        }
    }

    public void informLeave(CMIUser left) {

    }

    public void informJoin(CMIUser joined) {

    }

    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public boolean isOwner(UUID check) {
        return owner.equals(check);
    }

    public boolean isPrivate() {
        return priv;
    }

    public void setPrivate(boolean priv) {
        this.priv = priv;
    }

    public boolean kick(CMIUser user) {
      
        return true;
    }

    public Set<UUID> getInvitations() {
        return invitations;
    }

    public boolean isInvited(UUID uuid) {
        if (this.invitations == null)
            return false;
        return invitations.contains(uuid);
    }

    public void addInvitation(UUID uuid) {
        if (this.invitations == null)
            this.invitations = new HashSet<UUID>();
        this.invitations.add(uuid);
    }

    public void removeInvitation(UUID uuid) {
        if (this.invitations == null)
            return;
        this.invitations.remove(uuid);
    }

    public long getKeepAliveUntil() {
        return keepAliveUntil;
    }

    public void setKeepAliveUntil(long keepAliveUntil) {
        this.keepAliveUntil = keepAliveUntil;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isPersistent() {
        return persistent;
    }

    public void setPersistent(boolean persistent) {
        this.persistent = persistent;
    }
}
