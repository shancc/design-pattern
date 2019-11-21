package cc.xiaomotuo.design.pattern.factory.method;

import cc.xiaomotuo.design.pattern.factory.handler.MessageHandler;

public interface MessageHandlerFactory {

    MessageHandler createHandler();
}
