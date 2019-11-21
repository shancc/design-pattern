package cc.xiaomotuo.design.pattern.proxy.impl;

import cc.xiaomotuo.design.pattern.proxy.Seller;

/**
 * 医美销售
 * @author Cc
 * @date 2019/11/21
 */
public class MedicalBeautySeller implements Seller {

    /**
     * 卖东西
     */
    public void sale() {
        System.out.println("医美分期了解一下");
    }
}
