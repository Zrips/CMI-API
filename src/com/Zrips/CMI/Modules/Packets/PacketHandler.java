package com.Zrips.CMI.Modules.Packets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

public class PacketHandler extends ChannelDuplexHandler {
    private Player p;
    private ToolBarLoad toolBarAction = new ToolBarLoad();

    public PacketHandler(final Player p) {
        this.p = p;
    }

    static ConcurrentHashMap<UUID, HashMap<packetNames, Long>> map = new ConcurrentHashMap<UUID, HashMap<packetNames, Long>>();
    public static ConcurrentHashMap<Integer, FakeInfo> fakeEntities = new ConcurrentHashMap<Integer, FakeInfo>();
    public static ConcurrentHashMap<UUID, HashSet<Integer>> fakeEntitiesByPlayer = new ConcurrentHashMap<UUID, HashSet<Integer>>();

    public static void addFakeEntity(FakeInfo fake) {
    }

    public static void clearFakeEntities() {

    }

    public static void removeFakeEntity(FakeInfo fake) {

    }

    public static void clearCache(UUID uuid) {

    }

    private enum packetNames {
        PacketPlayInSetCreativeSlot, PacketPlayInUseEntity, PacketPlayOutPlayerInfo, PacketPlayOutEntityVelocity, PacketPlayOutEntityTeleport, PacketPlayOutLookAt, PacketPlayOutCamera,
        PacketPlayOutEntityHeadRotation, PacketStatusOutServerInfo, PacketPlayOutScoreboardTeam, PacketPlayOutChat, PacketHandshakingInSetProtocol;

        static Class<?> packet = null;

        public static packetNames get(String name) {
            for (packetNames one : packetNames.values()) {
                if (one.toString().startsWith(name))
                    return one;
            }
            return null;
        }

        public Class<?> getPacket() {
            return null;
        }
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object m, ChannelPromise promise) throws Exception {
        super.write(ctx, m, promise);
        return;
    }

    @Override
    public void channelRead(ChannelHandlerContext c, Object m) throws Exception {

        super.channelRead(c, m);
    }
}