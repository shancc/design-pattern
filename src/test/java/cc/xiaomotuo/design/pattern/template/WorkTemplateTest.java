package cc.xiaomotuo.design.pattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTemplateTest {

    @Test
    public void execute() {
        WorkTemplate workTemplate = new WorkTemplate();
        workTemplate.execute(new Action() {
            public void doAction() {
                System.out.println("开开心心写代码");
            }
        });
    }
}