package cc.xiaomotuo.design.pattern.simple.factory.handler;

import cc.xiaomotuo.design.pattern.simple.factory.message.Message;

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
