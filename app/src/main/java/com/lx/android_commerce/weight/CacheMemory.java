package com.lx.android_commerce.weight;

import android.util.LruCache;

public
/**
 *@author : 阿森
 *@date : 2020-10-24 10:52
 *@params : 
 *@description: 缓存类
 */
class CacheMemory {

    private static CacheMemory instance;

    public static CacheMemory getInstance() {
        if(instance == null) {
            instance = new CacheMemory();
        }
        return instance;
    }

    private static final int MAX_CACHE_SIZE = 3*1024;
    private MemoryLruCache memoryLruCache;

    public void saveCache(String key,String value) {
        if(memoryLruCache == null) {
            memoryLruCache = new MemoryLruCache();
        }
        memoryLruCache.put(key,value);
    }

    public String getCache(String key) {
        if(memoryLruCache == null) {
            return "";
        }
        return memoryLruCache.get(key);
    }

    static class MemoryLruCache extends LruCache<String,String> {
        public MemoryLruCache() {
            super(MAX_CACHE_SIZE);
        }

        @Override
        protected int sizeOf(String key, String value) {
            return value.getBytes().length;
        }
    }

}
