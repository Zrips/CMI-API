package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public enum CMITeleportType {
    Unknown(TeleportCause.UNKNOWN), Elevator(TeleportCause.UNKNOWN), SafeLogin(TeleportCause.PLUGIN), Spawn(TeleportCause.COMMAND), NetherRoof(TeleportCause.PLUGIN), BelowBedrock(TeleportCause.PLUGIN),
    Back(TeleportCause.COMMAND), DBack(TeleportCause.COMMAND), Home(TeleportCause.COMMAND), Jump(TeleportCause.COMMAND), Patrol(TeleportCause.COMMAND), Portal(TeleportCause.PLUGIN), WarmUp(
        TeleportCause.COMMAND), Biome(TeleportCause.COMMAND), FlightCharge(TeleportCause.PLUGIN), InvEdit(TeleportCause.COMMAND), TimedCommand(TeleportCause.PLUGIN), TpaAll(TeleportCause.COMMAND), Tp(
            TeleportCause.COMMAND), Bungee(TeleportCause.PLUGIN), Top(TeleportCause.COMMAND), Down(TeleportCause.COMMAND), TpAll(TeleportCause.COMMAND), TpHere(TeleportCause.COMMAND), TpPos(
                TeleportCause.COMMAND), TpoPos(TeleportCause.COMMAND), Warp(TeleportCause.COMMAND), JoinSpawn(TeleportCause.PLUGIN), Totem(TeleportCause.PLUGIN), randomTp(TeleportCause.COMMAND), World(
                    TeleportCause.COMMAND), HoloEdit(TeleportCause.PLUGIN);

    private CMIPresetAnimations from = null;
    private CMIPresetAnimations to = null;
    private TeleportCause cause;

    CMITeleportType(TeleportCause cause) {
    }

    public CMIPresetAnimations getFrom() {
        return null;
    }

    public void setFrom(CMIPresetAnimations from) {
    }

    public CMIPresetAnimations getTo() {
        return null;
    }

    public void setTo(CMIPresetAnimations to) {
    }

    public TeleportCause getCause() {
        return null;
    }
}
