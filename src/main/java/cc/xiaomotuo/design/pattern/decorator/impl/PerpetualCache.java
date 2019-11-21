package cc.xiaomotuo.design.pattern.decorator.impl;

import cc.xiaomotuo.design.pattern.decorator.Cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 持久化缓存
 * @author Cc
 * @date 2019/11/21
 */
public class PerpetualCache implements Cache {

    private Map<Object, Object> cache = new ConcurrentHashMap<Object, Object>();

    /**
     * 放入缓存
     *
     * @param key
     * @param value
     */
    public void putObject(Object key, Object value) {
        cache.put(key, value);
    }

    /**
     * 删除缓存
     *
     * @param key
     * @return
     */
    public Object removeObject(Object key) {
        return cache.remove(key);
    }
}
