package org.lock.util;

import org.lock.util.config.redis.RedisConfig;
import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        Jedis jedis = RedisConfig.REDIS_CONFIG_INSTANCE.getInstance();
        System.out.println("Hello world!");
    }
}