package cc.xiaomotuo.design.pattern.factory.method;


import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;
import cc.xiaomotuo.design.pattern.factory.handler.RefundResultMessageHandler;

public class RefundResultMessageHandlerFactory implements MessageHandlerFactory {

    public MessageHandler createHandler() {
        return new RefundResultMessageHandler();
    }
}
