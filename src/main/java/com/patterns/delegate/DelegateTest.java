package com.patterns.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 委派模式测试
 */
public class DelegateTest {

    public static void main(String[] args) {

        Map<String, IWorker> map = new HashMap<>();

        map.put("workerA", new WorkerA());
        map.put("workerB", new WorkerB());

        Leader leader = new Leader(map);

        Boss boss = new Boss(leader);
        boss.doWork();
    }

}
