package cc.xiaomotuo.design.pattern.strategy;

/**
 * 满减活动策略
 * @author Cc
 * @date 2019/11/20
 */
public class FullReductionStrategy implements ActivityCalculateStrategy {

    /**
     * 活动计算策略
     *
     * @param amount     订单金额
     * @param activityId 活动Id
     * @return 优惠后金额
     */
    public Integer calculate(Integer amount, Integer activityId) {
        //根据活动Id查询活动规则，此处hardcode,满50-10
        return amount-amount/5;
    }
}
