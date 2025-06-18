package com.Zrips.CMI.Modules.Packets;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIInteractType;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

public class PacketHandler extends ChannelDuplexHandler {
    private Player p;
    static ConcurrentHashMap<UUID, HashMap<packetNames, Long>> map;
    public static ConcurrentHashMap<Integer, FakeInfo> fakeEntities;
    public static ConcurrentHashMap<UUID, HashSet<Integer>> fakeEntitiesByPlayer;
    static Field entityIdField;
    static Field actionField;

    public PacketHandler(Player p) {
    }

    public static synchronized void addFakeEntity(FakeInfo fake) {
    }

    public static synchronized void clearFakeEntities() {
    }

    public static synchronized void removeFakeEntity(FakeInfo fake) {
    }

    public static synchronized void clearCache(UUID uuid) {
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object m, ChannelPromise promise) throws Exception {
    }

    @Override
    public void channelRead(ChannelHandlerContext c, Object m) throws Exception {
    }

    private void processEntityInteractEvent(packetNames type, Object m) {
    }

    private void registerClickEvent(packetNames type, int id, CMIInteractType clickType) {
    }

    private enum packetNames {
        PacketPlayInSetCreativeSlot, PacketPlayInUseEntity, ServerboundInteractPacket, PacketPlayOutPlayerInfo, PacketPlayOutEntityVelocity, PacketPlayOutEntityTeleport, PacketPlayOutLookAt,
        PacketPlayOutCamera, PacketPlayOutEntityHeadRotation, PacketStatusOutServerInfo, PacketPlayOutScoreboardTeam, PacketPlayOutChat, PacketHandshakingInSetProtocol;

        static Class<?> packet = null;

        public static packetNames get(String name) {
            return null;
        }

        public Class<?> getPacket() {
            return null;
        }
    }
}
