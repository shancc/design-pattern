package cc.xiaomotuo.design.pattern.factory.simple.handler;

import cc.xiaomotuo.design.pattern.factory.simple.message.Message;

/**
 * 订单提交消息处理器
 * @date 2019/11/19
 * @author Cc
 */
public class SubmitOrderMessageHandler implements MessageHandler{

    /**
     * 处理消息
     *
     * @param message
     * @return
     */
    public boolean handle(Message message) {
        System.out.println("handle submit order message.");
        return true;
    }
}
