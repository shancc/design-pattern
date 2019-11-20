package cc.xiaomotuo.design.pattern.simple.factory;

import cc.xiaomotuo.design.pattern.simple.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.simple.factory.message.Message;
import cc.xiaomotuo.design.pattern.simple.factory.message.MessageTypeEnum;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class MessageHandlerFactoryTest {

    @Test
    public void getHandler() {
        Message message = new Message();
        message.setType(MessageTypeEnum.SUBMIT_RESULT.getType());
        message.setId(UUID.randomUUID().toString());
        message.setContent("message content");
        MessageHandlerFactory messageHandlerFactory = new MessageHandlerFactory();
        MessageHandler messageHandler = messageHandlerFactory.getHandler(MessageTypeEnum.SUBMIT_RESULT);
        messageHandler.handle(message);
    }
}