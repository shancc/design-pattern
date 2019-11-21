package cc.xiaomotuo.design.pattern.proxy;

import cc.xiaomotuo.design.pattern.proxy.impl.CashLoanSeller;

/**
 * @author Cc
 * @date 2019/11/21
 */
public class SellerProxy implements Seller{

    private Seller seller;

    SellerProxy(){
        this.seller = new CashLoanSeller();
        //如果想做医美分期，只需替换内部销售实现，无需更改业务逻辑
    }

    /**
     * 卖东西
     */
    public void sale() {
        seller.sale();
    }
}
