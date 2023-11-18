package org.lock.util;

/**
 * @author cartoon
 * @since 2023/11/13 20:06
 */
public interface LockService {

    /**
     * determine lock key exist
     * @param lockKey key name
     * @return whether exist
     */
    boolean alreadyLock(String lockKey);


}
