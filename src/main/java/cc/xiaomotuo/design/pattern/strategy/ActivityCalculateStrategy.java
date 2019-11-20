package cc.xiaomotuo.design.pattern.strategy;

/**
 * 活动计算策略
 * @author Cc
 * @date 2019/11/20
 */
public interface ActivityCalculateStrategy {

    /**
     * 活动计算策略
     * @param amount 订单金额
     * @param activityId 活动Id
     * @return 优惠后金额
     */
    Integer calculate(Integer amount,Integer activityId);
}
