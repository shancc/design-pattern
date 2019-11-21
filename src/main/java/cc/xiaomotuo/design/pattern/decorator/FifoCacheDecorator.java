package cc.xiaomotuo.design.pattern.decorator;

import cc.xiaomotuo.design.pattern.decorator.impl.PerpetualCache;

import java.util.LinkedList;

/**
 * First In First Out
 * @author Cc
 * @date 2019/11/21
 */
public class FifoCacheDecorator extends AbstractCacheDecorator {

    private LinkedList<Object> keyList;

    private int size;

    FifoCacheDecorator(PerpetualCache perpetualCache) {
        super(perpetualCache);
        size = 1024;
        keyList = new LinkedList();
    }

    /**
     * 放入缓存
     *
     * @param key
     * @param value
     */
    @Override
    public void putObject(Object key, Object value) {
        cycleKeyList(key);
        super.putObject(key, value);
    }

    /**
     * 删除缓存
     *
     * @param key
     * @return
     */
    @Override
    public Object removeObject(Object key) {
        removeKeyList(key);
        return super.removeObject(key);
    }

    private void cycleKeyList(Object key) {
        keyList.addLast(key);
        if (keyList.size() > size) {
            Object oldestKey = keyList.removeFirst();
            super.removeObject(oldestKey);
        }
    }

    private void removeKeyList(Object key){
        keyList.remove(key);
    }
}
