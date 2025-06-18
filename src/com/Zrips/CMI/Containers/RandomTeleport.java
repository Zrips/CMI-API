package com.Zrips.CMI.Containers;

import java.util.Random;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Container.CMIVectorInt3D;
import net.Zrips.CMILib.Items.CMIMaterial;

public class RandomTeleport {
    private boolean enabled;
    private int MaxDistance;
    private int MinDistance;
    private CMILocation loc;
    private boolean circle;
    private boolean ignoreWater;
    private boolean ignoreLava;
    private boolean ignorePowderSnow;
    private boolean ignoreLeaves;
    private boolean surfaceOnly;
    private boolean IgnoreCrawl;
    private boolean fromAnotherWorld;
    private boolean requireWorldPermission;
    private Set<CMIMaterial> ignoredMaterials;
    private Set<String> ignoredBiomes;
    private Set<String> preferredBiomes;
    private int maxTries;
    private int MaxY;
    private int MinY;
    static Random random;
    private int cooldown;

    public RandomTeleport(boolean enabled, int MaxDistance, int MinDistance, CMILocation center) {
    }

    public RandomTeleport(World world, int MaxDistance, int MinDistance, int centerX, int centerZ) {
    }

    public RandomTeleport(World world) {
    }

    public Location getCenter() {
        return null;
    }

    @Deprecated
    public int getMaxCord() {
        return 0;
    }

    public int getMaxDistance() {
        return 0;
    }

    @Deprecated
    public int getMinCord() {
        return 0;
    }

    public int getMinDistance() {
        return 0;
    }

    public boolean isCircle() {
        return false;
    }

    public RandomTeleport setCircle(boolean circle) {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public RandomTeleport setEnabled(boolean enabled) {
        return null;
    }

    public RandomTeleport setMinDistance(int minDistance) {
        return null;
    }

    public RandomTeleport setMaxDistance(int maxDistance) {
        return null;
    }

    public RandomTeleport setCenter(CMILocation loc) {
        return null;
    }

    public boolean isIgnoreWater() {
        return false;
    }

    public RandomTeleport setIgnoreWater(boolean ignoreWater) {
        return null;
    }

    public boolean isIgnoreLava() {
        return false;
    }

    public RandomTeleport setIgnoreLava(boolean ignoreLava) {
        return null;
    }

    public int getMaxY() {
        return 0;
    }

    public RandomTeleport setMaxY(int maxY) {
        return null;
    }

    public int getMinY() {
        return 0;
    }

    public RandomTeleport setMinY(int minY) {
        return null;
    }

    public boolean isIgnorePowderedSnow() {
        return false;
    }

    public RandomTeleport setIgnorePowderSnow(boolean ignorePowderSnow) {
        return null;
    }

    public boolean isSurfaceOnly() {
        return false;
    }

    public RandomTeleport setSurfaceOnly(boolean surfaceOnly) {
        return null;
    }

    public CMIVectorInt3D getRandomLocation() {
        return null;
    }

    public boolean isIgnoreLeaves() {
        return false;
    }

    public RandomTeleport setIgnoreLeaves(boolean ignoreLeaves) {
        return null;
    }

    public boolean isIgnoreMaterials() {
        return false;
    }

    public boolean isIgnoredMaterial(CMIMaterial material) {
        return false;
    }

    public RandomTeleport setIgnoredMaterials(Set<CMIMaterial> ignoredMaterials) {
        return null;
    }

    public boolean isAllowFromAnotherWorld() {
        return false;
    }

    public RandomTeleport setFromAnotherWorld(boolean fromAnotherWorld) {
        return null;
    }

    public boolean isRequireWorldPermission() {
        return false;
    }

    public RandomTeleport setRequireWorldPermission(boolean requireWorldPermission) {
        return null;
    }

    public Set<String> getIgnoredBiomes() {
        return null;
    }

    public RandomTeleport setIgnoredBiomes(Set<String> ignoredBiomes) {
        return null;
    }

    public boolean isIgnoredBiome(String biome) {
        return false;
    }

    public Set<String> getPreferredBiomes() {
        return null;
    }

    public RandomTeleport setPreferredBiomes(Set<String> preferredBiomes) {
        return null;
    }

    public boolean isPreferredBiome(String biome) {
        return false;
    }

    public int getMaxTries() {
        return 0;
    }

    public RandomTeleport setMaxTries(int maxTries) {
        return null;
    }

    public int getCooldownWithDefault() {
        return 0;
    }

    public int getCooldown() {
        return 0;
    }

    public RandomTeleport setCooldown(int cooldown) {
        return null;
    }

    public boolean isIgnoreCrawl() {
        return false;
    }

    public RandomTeleport setIgnoreCrawl(boolean IgnoreCrawl) {
        return null;
    }
}
