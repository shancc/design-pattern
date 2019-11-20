package cc.xiaomotuo.design.pattern.factory.simple.handler;

import cc.xiaomotuo.design.pattern.factory.simple.message.Message;

/**
 * 消息处理器
 * @author Cc
 * @date 2019/11/19
 */
public interface MessageHandler {

    /**
     * 处理消息
     * @param message
     * @return
     */
    boolean handle(Message message);
}
