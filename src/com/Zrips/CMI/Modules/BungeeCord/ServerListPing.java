package com.Zrips.CMI.Modules.BungeeCord;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

import com.google.gson.Gson;

public class ServerListPing {
    private InetSocketAddress host;
    private int timeout;
    private Gson gson;

    public ServerListPing(String ip, int port) {
    }

    public ServerListPing(InetSocketAddress host) {
    }

    public InetSocketAddress getAddress() {
        return null;
    }

    void setTimeout(int timeout) {
    }

    int getTimeout() {
        return 0;
    }

    public int readVarInt(DataInputStream in) throws IOException {
        return 0;
    }

    public void writeVarInt(DataOutputStream out, int paramInt) throws IOException {
    }

    public StatusResponse fetchData() throws IOException {
        return null;
    }

    public class Description {
        private String text;

        public String getText() {
            return null;
        }
    }

    public class Description116 {
        private Gson text;

        public Gson getText() {
            return null;
        }
    }

    public class StatusResponse {
        private String description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public String getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }

        public void setDescription(String description) {
        }

        public void setPlayers(Players players) {
        }

        public void setVersion(Version version) {
        }

        public void setFavicon(String favicon) {
        }
    }

    public class StatusResponse19 {
        private Description description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public Description getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }
    }

    public class StatusResponse116 {
        private Description116 description;
        private Players players;
        private Version version;
        private String favicon;
        private int time;

        public Description116 getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }
    }

    public class Players {
        private int max;
        private int online;
        private List<Player> sample;

        public int getMax() {
            return 0;
        }

        public int getOnline() {
            return 0;
        }

        public List<Player> getSample() {
            return null;
        }
    }

    public class Player {
        private String name;
        private String id;

        public String getName() {
            return null;
        }

        public String getId() {
            return null;
        }
    }

    public class Version {
        private String name;
        private String protocol;

        public String getName() {
            return null;
        }

        public String getProtocol() {
            return null;
        }
    }
}
