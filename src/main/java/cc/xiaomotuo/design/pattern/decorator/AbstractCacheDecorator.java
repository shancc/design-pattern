package cc.xiaomotuo.design.pattern.decorator;

import cc.xiaomotuo.design.pattern.decorator.impl.PerpetualCache;

/**
 * @author Cc
 * @date 2019/11/21
 */
public abstract class AbstractCacheDecorator implements Cache {

    private PerpetualCache perpetualCache;

    AbstractCacheDecorator(PerpetualCache perpetualCache) {
        this.perpetualCache = perpetualCache;
    }

    /**
     * 放入缓存
     *
     * @param key
     * @param value
     */
    public void putObject(Object key, Object value) {
        perpetualCache.putObject(key, value);
    }

    /**
     * 删除缓存
     *
     * @param key
     * @return
     */
    public Object removeObject(Object key) {
        return perpetualCache.removeObject(key);
    }
}
