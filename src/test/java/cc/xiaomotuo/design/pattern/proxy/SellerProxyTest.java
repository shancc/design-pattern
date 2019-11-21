package cc.xiaomotuo.design.pattern.proxy;

import org.junit.Test;

public class SellerProxyTest {

    @Test
    public void sale() {
        SellerProxy sellerProxy = new SellerProxy();
        sellerProxy.sale();
    }
}