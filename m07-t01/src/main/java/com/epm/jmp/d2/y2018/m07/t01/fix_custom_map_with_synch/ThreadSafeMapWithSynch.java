package com.epm.jmp.d2.y2018.m07.t01.fix_custom_map_with_synch;

import java.util.HashMap;

/**
 *
 * My custom ThreadSafeMap with synchronization.
 *
 * @author Igar_Kanavalau
 *
 * @param <K>
 * @param <V>
 */
public class ThreadSafeMapWithSynch<K, V> extends HashMap<K, V> {

    private static final long serialVersionUID = 8724177277440538141L;
    final Object mutex; // Object on which to synchronize

    public ThreadSafeMapWithSynch() {
        super();
        this.mutex = this;
    }

    @Override
    public V put(K key, V value) {
        synchronized (mutex) {
            return super.put(key, value);
        }
    }

}
