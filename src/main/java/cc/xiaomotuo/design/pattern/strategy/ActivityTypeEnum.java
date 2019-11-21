package cc.xiaomotuo.design.pattern.strategy;

/**
 * @author Cc
 * @date 2019/11/21
 */
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
