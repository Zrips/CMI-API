package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.UUID;

public class CMINPC {

    private UUID uuid = null;
    private Integer id = null;
    private UUID secondaryUuid = null;

    public CMINPC(int id) {
        this.id = id;
    }

    public CMINPC(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public CMINPC setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CMINPC setId(Integer id) {
        this.id = id;
        return this;
    }

    public UUID getSecondaryUUID() {
        return secondaryUuid;
    }

    public CMINPC setSecondaryUUID(UUID secondaryUuid) {
        this.secondaryUuid = secondaryUuid;
        return this;
    }

}
