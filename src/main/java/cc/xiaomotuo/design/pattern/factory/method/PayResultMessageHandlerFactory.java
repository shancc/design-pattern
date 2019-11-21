package cc.xiaomotuo.design.pattern.factory.method;

import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.PayResultMessageHandler;

public class PayResultMessageHandlerFactory implements MessageHandlerFactory {

    public MessageHandler createHandler() {
        return new PayResultMessageHandler();
    }
}
