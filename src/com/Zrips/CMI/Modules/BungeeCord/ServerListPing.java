package com.Zrips.CMI.Modules.BungeeCord;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ServerListPing {

    private InetSocketAddress host;
    private int timeout = 7000;
    private Gson gson = new Gson();

    public ServerListPing(String ip, int port) {
        this.host = new InetSocketAddress(ip, port);
    }

    public ServerListPing(InetSocketAddress host) {
        this.host = host;
    }

    public InetSocketAddress getAddress() {
        return this.host;
    }

    void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    int getTimeout() {
        return this.timeout;
    }

    public int readVarInt(DataInputStream in) throws IOException {
        int i = 0;
        int j = 0;
        while (true) {
            int k = in.readByte();
            i |= (k & 0x7F) << j++ * 7;
            if (j > 5)
                throw new RuntimeException("VarInt too big");
            if ((k & 0x80) != 128)
                break;
        }
        return i;
    }

    public void writeVarInt(DataOutputStream out, int paramInt) throws IOException {
        while (true) {
            if ((paramInt & 0xFFFFFF80) == 0) {
                out.writeByte(paramInt);
                return;
            }

            out.writeByte(paramInt & 0x7F | 0x80);
            paramInt >>>= 7;
        }
    }

    public StatusResponse fetchData() throws IOException {

        return null;
    }

    public class Description {
        private String text;

        public String getText() {
            return text;
        }
    }

    public class Description116 {
        private Gson text;

        public Gson getText() {
            return text;
        }
    }

    public class StatusResponse {
        private String description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public String getDescription() {
            return description;
        }

        public Players getPlayers() {
            return players;
        }

        public Version getVersion() {
            return version;
        }

        public String getFavicon() {
            return favicon;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPlayers(Players players) {
            this.players = players;
        }

        public void setVersion(Version version) {
            this.version = version;
        }

        public void setFavicon(String favicon) {
            this.favicon = favicon;
        }
    }

    public class StatusResponse19 {
        private Description description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public Description getDescription() {
            return description;
        }

        public Players getPlayers() {
            return players;
        }

        public Version getVersion() {
            return version;
        }

        public String getFavicon() {
            return favicon;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    public class StatusResponse116 {
        private Description116 description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public Description116 getDescription() {
            return description;
        }

        public Players getPlayers() {
            return players;
        }

        public Version getVersion() {
            return version;
        }

        public String getFavicon() {
            return favicon;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    public class Players {
        private int max = 0;
        private int online = 0;
        private List<Player> sample = null;

        public int getMax() {
            return max;
        }

        public int getOnline() {
            return online;
        }

        public List<Player> getSample() {
            return sample == null ? new ArrayList<Player>() : sample;
        }
    }

    public class Player {
        private String name;
        private String id;

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

    }

    public class Version {
        private String name;
        private String protocol;

        public String getName() {
            return name;
        }

        public String getProtocol() {
            return protocol;
        }
    }
}
