package cc.xiaomotuo.design.pattern.simple.factory;

import cc.xiaomotuo.design.pattern.simple.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.simple.factory.handler.PayResultMessageHandler;
import cc.xiaomotuo.design.pattern.simple.factory.handler.RefundResultMessageHandler;
import cc.xiaomotuo.design.pattern.simple.factory.handler.SubmitOrderMessageHandler;
import cc.xiaomotuo.design.pattern.simple.factory.message.Message;
import cc.xiaomotuo.design.pattern.simple.factory.message.MessageTypeEnum;

import java.util.UUID;

/**
 * 简单工厂
 *
 * @author Cc
 * @date 2019/11/19
 */
public class MessageHandlerFactory {

    /**
     * 获取消息处理器
     * @param type
     * @return
     */
    MessageHandler getHandler(MessageTypeEnum type) {
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

    public static void main(String[] args) {
        Message message = new Message();
        message.setType(MessageTypeEnum.SUBMIT_RESULT.getType());
        message.setId(UUID.randomUUID().toString());
        message.setContent("message content");
        MessageHandlerFactory messageHandlerFactory = new MessageHandlerFactory();
        MessageHandler messageHandler = messageHandlerFactory.getHandler(MessageTypeEnum.SUBMIT_RESULT);
        messageHandler.handle(message);
    }
}
