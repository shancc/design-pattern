package cc.xiaomotuo.design.pattern.strategy;

public enum ActivityTypeEnum {

    DISCOUNT("DISCOUNT"),
    FULL_REDUCTION("FULL_REDUCTION"),
    IMMEDIATE_REDUCTION("IMMEDIATE_REDUCTION");

    private String type;

    ActivityTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
