package cc.xiaomotuo.design.pattern.decorator;

import cc.xiaomotuo.design.pattern.decorator.impl.PerpetualCache;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifoCacheDecoratorTest {

    @Test
    public void putObject() {
        PerpetualCache perpetualCache = new PerpetualCache();
        FifoCacheDecorator fifoCacheDecorator = new FifoCacheDecorator(perpetualCache);
        fifoCacheDecorator.putObject("123","123");
        fifoCacheDecorator.removeObject("123");
    }
}