package cc.xiaomotuo.design.pattern.decorator;

/**
 * 自定义缓存接口
 * @author Cc
 * @date 20109/11/21
 */
public interface Cache {

    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);

    /**
     * 删除缓存
     * @param key
     * @return
     */
    Object removeObject(Object key);
}
