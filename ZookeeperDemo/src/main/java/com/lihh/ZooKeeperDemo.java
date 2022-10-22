package com.lihh;

import org.apache.zookeeper.*;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ZooKeeperDemo {

    @Test
    public void testSet() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("43.140.193.197:2181", 10000, (WatchedEvent watchedEvent) -> {
            System.out.println("zookeeper 连接成功");
        });

        String content = zooKeeper.create("/demo/nn", "content".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        System.out.println(content);
    }

    @Test
    public void testGet() throws IOException, InterruptedException, KeeperException {
        ZooKeeper zooKeeper = new ZooKeeper("43.140.193.197:2181", 10000, (WatchedEvent watchedEvent) -> {
            System.out.println("zookeeper 连接成功");
        });

        List<String> list = zooKeeper.getChildren("/demo", false);
        for (String name: list) {
            byte[] content = zooKeeper.getData("/demo/" + name, false, null);
            System.out.println(new String(content));
        }
    }
}
