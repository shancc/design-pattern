package cc.xiaomotuo.design.pattern.factory.message;

public enum MessageTypeEnum {

    SUBMIT_RESULT("SUBMIT_RESULT"),
    PAY_RESULT("PAY_RESULT"),
    REFUND_RESULT("REFUND_RESULT");

    private String type;

    MessageTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
