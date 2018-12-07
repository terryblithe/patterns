package com.patterns.delegate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leader {

    private Map<String, IWorker> workers = new HashMap<>();

    public Leader(Map<String, IWorker> workers) {
        this.workers.putAll(workers);
    }

    public void doWorkA() {
        IWorker workerA = workers.get("workerA");
        workerA.doWork();
    }

    public void doWorkB() {
        IWorker workerB = workers.get("workerB");
        workerB.doWork();
    }

}
