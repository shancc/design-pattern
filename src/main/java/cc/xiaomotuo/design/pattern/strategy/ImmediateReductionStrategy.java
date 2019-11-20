package cc.xiaomotuo.design.pattern.strategy;

/**
 * 立减活动策略
 */
public class ImmediateReductionStrategy implements ActivityCalculateStrategy {

    /**
     * 活动计算策略
     *
     * @param amount     订单金额
     * @param activityId 活动Id
     * @return 优惠后金额
     */
    public Integer calculate(Integer amount, Integer activityId) {
        //根据活动Id查询活动规则，此处hardcode,立减10元
        return amount-10;
    }
}
