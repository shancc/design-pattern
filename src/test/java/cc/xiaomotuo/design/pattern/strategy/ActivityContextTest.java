package cc.xiaomotuo.design.pattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActivityContextTest {

    @Test
    public void executeStrategy() {
        ActivityContext activityContext = new ActivityContext(ActivityTypeEnum.FULL_REDUCTION);
        Integer orderAmount = 20000;
        Integer activityId = 100;
        Integer discountAmount = activityContext.executeStrategy(orderAmount, activityId);
        System.out.println("优惠后金额：" + discountAmount);
    }
}