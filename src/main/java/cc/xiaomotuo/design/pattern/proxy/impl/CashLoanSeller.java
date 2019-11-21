package cc.xiaomotuo.design.pattern.proxy.impl;

import cc.xiaomotuo.design.pattern.proxy.Seller;

/**
 * 现金贷销售
 * @author Cc
 * @date 2019/11/21
 */
public class CashLoanSeller implements Seller {

    /**
     * 卖东西
     */
    public void sale() {
        System.out.println("现金借款了解一下");
    }
}
