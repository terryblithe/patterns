package com.patterns.delegate;

public class WorkerA implements IWorker {
    @Override
    public void doWork() {
        System.out.println("WorkerA do work");
    }
}
