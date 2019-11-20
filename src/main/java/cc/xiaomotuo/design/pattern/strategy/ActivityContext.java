package cc.xiaomotuo.design.pattern.strategy;

/**
 * 活动
 *
 * @author Cc
 * @date 2019/11/20
 */
public class ActivityContext {

    private ActivityCalculateStrategy strategy;

    ActivityContext(ActivityTypeEnum type) {
        switch (type) {
            case DISCOUNT:
                strategy = new DiscountStrategy();
                break;
            case FULL_REDUCTION:
                strategy = new FullReductionStrategy();
                break;
            case IMMEDIATE_REDUCTION:
                strategy = new ImmediateReductionStrategy();
                break;
            default:
                strategy = null;
                break;
        }
    }

    /**
     * 执行策略
     * @param amount
     * @param activityId
     * @return
     */
    public Integer executeStrategy(Integer amount, Integer activityId) {
        return strategy.calculate(amount, activityId);
    }
}
