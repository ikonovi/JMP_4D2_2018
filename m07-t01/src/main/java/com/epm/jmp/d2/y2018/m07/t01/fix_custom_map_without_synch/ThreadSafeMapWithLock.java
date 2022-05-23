package com.epm.jmp.d2.y2018.m07.t01.fix_custom_map_without_synch;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeMapWithLock<K, V> extends HashMap<K, V> {

    private static final long serialVersionUID = -1249255901598124277L;
    private final ReentrantLock lock = new ReentrantLock();

    public ThreadSafeMapWithLock() {
        super();
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        try {
            return super.put(key, value);
        } finally {
            lock.unlock();
        }
    }

    public ReentrantLock getMyLock() {
        return lock;
    }

}
