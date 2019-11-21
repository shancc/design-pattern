package cc.xiaomotuo.design.pattern.factory.method;

import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.message.Message;
import cc.xiaomotuo.design.pattern.factory.message.MessageTypeEnum;
import org.junit.Test;

import java.util.UUID;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod(){
        Message message = new Message();
        message.setType(MessageTypeEnum.SUBMIT_RESULT.getType());
        message.setId(UUID.randomUUID().toString());
        message.setContent("message content");
        MessageHandlerFactory messageHandlerFactory = new SubmitOrderMessageHandlerFactory();
        MessageHandler messageHandler = messageHandlerFactory.createHandler();
        messageHandler.handle(message);
    }
}
