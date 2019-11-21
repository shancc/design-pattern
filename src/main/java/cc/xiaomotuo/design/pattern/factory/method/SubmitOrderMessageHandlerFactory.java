package cc.xiaomotuo.design.pattern.factory.method;

import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.SubmitOrderMessageHandler;

public class SubmitOrderMessageHandlerFactory implements MessageHandlerFactory {

    public MessageHandler createHandler() {
        return new SubmitOrderMessageHandler();
    }
}
