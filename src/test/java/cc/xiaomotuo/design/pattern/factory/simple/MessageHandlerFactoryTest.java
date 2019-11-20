package cc.xiaomotuo.design.pattern.factory.simple;

import cc.xiaomotuo.design.pattern.factory.simple.message.MessageTypeEnum;
import cc.xiaomotuo.design.pattern.factory.simple.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.simple.message.Message;
import org.junit.Test;

import java.util.UUID;

public class MessageHandlerFactoryTest {

    @Test
    public void getHandler() {
        Message message = new Message();
        message.setType(MessageTypeEnum.SUBMIT_RESULT.getType());
        message.setId(UUID.randomUUID().toString());
        message.setContent("message content");
        MessageHandlerFactory messageHandlerFactory = new MessageHandlerFactory();
        MessageHandler messageHandler = messageHandlerFactory.createHandler(MessageTypeEnum.SUBMIT_RESULT);
        messageHandler.handle(message);
    }
}