package cc.xiaomotuo.design.pattern.factory.simple;

import cc.xiaomotuo.design.pattern.factory.message.MessageTypeEnum;
import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.message.Message;
import org.junit.Test;

import java.util.UUID;

public class SimpleFactoryTest {

    @Test
    public void getHandler() {
        Message message = new Message();
        message.setType(MessageTypeEnum.SUBMIT_RESULT.getType());
        message.setId(UUID.randomUUID().toString());
        message.setContent("message content");
        MessageHandlerSimpleFactory messageHandlerFactory = new MessageHandlerSimpleFactory();
        MessageHandler messageHandler = messageHandlerFactory.createHandler(MessageTypeEnum.SUBMIT_RESULT);
        messageHandler.handle(message);
    }
}