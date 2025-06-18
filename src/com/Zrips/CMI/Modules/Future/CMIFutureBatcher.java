package com.Zrips.CMI.Modules.Future;

import java.util.Queue;
import java.util.concurrent.CompletableFuture;

public class CMIFutureBatcher {
    private Queue<CompletableFuture<?>> queue;
    private boolean running;
    private int delayBetweenBatches;
    private CompletableFuture<Void> queueFuture;

    public CMIFutureBatcher() {
    }

    public CMIFutureBatcher(int delayBetweenBatches) {
    }

    public synchronized CompletableFuture<?> addBatch(CompletableFuture<?> future) {
        return null;
    }

    public synchronized void processQueue() {
    }

    public int getDelayBetweenBatches() {
        return 0;
    }

    public void setDelayBetweenBatches(int delayBetweenBatches) {
    }

    public synchronized void cancel() {
    }

    public synchronized int getQueueSize() {
        return 0;
    }

    public boolean isRunning() {
        return false;
    }
}
