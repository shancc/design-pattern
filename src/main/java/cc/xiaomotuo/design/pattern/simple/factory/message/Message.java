package cc.xiaomotuo.design.pattern.simple.factory.message;

/**
 * 消息体
 */
public class Message {

    /**
     * 消息Id
     */
    private String id;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息类型
     */
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
