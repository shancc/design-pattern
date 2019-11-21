package cc.xiaomotuo.design.pattern.factory.simple;

import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.PayResultMessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.RefundResultMessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.SubmitOrderMessageHandler;
import cc.xiaomotuo.design.pattern.factory.message.MessageTypeEnum;

/**
 * 简单工厂
 *
 * @author Cc
 * @date 2019/11/19
 */
public class MessageHandlerSimpleFactory {

    /**
     * 获取消息处理器
     * @param type
     * @return
     */
    MessageHandler createHandler(MessageTypeEnum type) {
        MessageHandler messageHandler = null;
        switch (type) {
            case PAY_RESULT:
                messageHandler = new PayResultMessageHandler();
                break;
            case REFUND_RESULT:
                messageHandler = new RefundResultMessageHandler();
                break;
            case SUBMIT_RESULT:
                messageHandler = new SubmitOrderMessageHandler();
            default:
                break;
        }
        return messageHandler;
    }

}
