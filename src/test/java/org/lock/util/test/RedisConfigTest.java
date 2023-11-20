package org.lock.util.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lock.util.config.redis.RedisConfig;
import org.lock.util.test.base.BaseTest;

/**
 * @author cartoon
 * @since 2023/11/20 23:55
 */
@DisplayName("redis config test")
public class RedisConfigTest extends BaseTest {

    @DisplayName("example")
    @Test
    void testExample(){
        RedisConfig redisConfig = RedisConfig.REDIS_CONFIG_INSTANCE;
        redisConfig.getInstance();
    }
}
