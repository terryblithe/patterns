package com.patterns.delegate;

public class WorkerB implements IWorker {
    @Override
    public void doWork() {
        System.out.println("WorkerB do work");
    }
}
