package com.Zrips.CMI.Modules.Portals;

import java.util.concurrent.CompletableFuture;

import org.bukkit.util.Vector;

public class CMIPlaneIntersection {
    private CMIVector3D globalLoc;
    private CMIVector2D localLoc;
    private final static double _HPI = 0.0;

    public static CompletableFuture<CMIPlaneIntersection> get(Vector rayVector, Vector rayPoint, Vector planeNormal, CMIPlane plane) {
        return null;
    }

    private static CMIPlaneIntersection get(CMIVector3D lookDirection, CMIVector3D fromLocation, CMIVector3D planeDirection, CMIPlane cmiPlane) {
        return null;
    }

    private static CMIVector3D intersectPoint(CMIVector3D rayVector, CMIVector3D rayPoint, CMIVector3D planeNormal, CMIVector3D planePoint) {
        return null;
    }

    public static CMIVector3D rotateAroundCenter(double lx, double ly, double yaw, double pitch) {
        return null;
    }

    public static double xPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public static double yPosYaw(double time, double radius) {
        return 0.0;
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    private static CMIVector3D rotateX(CMIVector3D v, double a) {
        return null;
    }

    private static CMIVector3D rotateY(CMIVector3D v, double a) {
        return null;
    }

    private static CMIVector3D intersectPoint(CMIVector3D rayVector, CMIVector3D rayPoint, CMIVector3D planeNormal, CMIPlane plane) {
        return null;
    }

    public CMIVector3D getGlobalLoc() {
        return null;
    }

    public void setGlobalLoc(CMIVector3D globalLoc) {
    }

    public CMIVector2D getLocalLoc() {
        return null;
    }

    public void setLocalLoc(CMIVector2D localLoc) {
    }
}
