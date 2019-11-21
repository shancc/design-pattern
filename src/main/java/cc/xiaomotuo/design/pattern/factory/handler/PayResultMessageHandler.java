package cc.xiaomotuo.design.pattern.factory.handler;

import cc.xiaomotuo.design.pattern.factory.message.Message;

/**
 * 订单支付结果处理器
 * @date 2019/11/19
 * @author Cc
 */
public class PayResultMessageHandler implements MessageHandler {

    /**
     * 处理消息
     *
     * @param message
     * @return
     */
    public boolean handle(Message message) {
        System.out.println("handle pay result message.");
        return true;
    }
}
