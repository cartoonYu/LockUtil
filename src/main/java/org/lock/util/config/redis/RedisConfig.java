package org.lock.util.config.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * @author cartoon
 * @description
 * @date 2020/4/25 17:53
 */
public class RedisConfig {

    private static final Logger log = LoggerFactory.getLogger(RedisConfig.class);

    public static final RedisConfig REDIS_CONFIG_INSTANCE = new RedisConfig();

    private final Jedis JEDIS_INSTANCE;

    public Jedis getInstance(){
        return JEDIS_INSTANCE;
    }

    private RedisConfig() {
        JEDIS_INSTANCE = new Jedis("http://127.0.0.1:6379");
        //JEDIS_INSTANCE.auth("");
        log.info("jedis is running");
    }
}
