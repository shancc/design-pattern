/*
 * -------------------------------------------------------------------------------------
 *    Mi-Me Confidential
 *
 *    Copyright (C) 2015 Shanghai Mi-Me Financial Information Service Co., Ltd.
 *    All rights reserved.
 *
 *   No part of this file may be reproduced or transmitted in any form or by any means,
 *    electronic, mechanical, photocopying, recording, or otherwise, without prior
 *    written permission of Shanghai Mi-Me Financial Information Service Co., Ltd.
 * -------------------------------------------------------------------------------------
 */

package cc.xiaomotuo.design.pattern.template;


/**
 * 工作模板类
 * @author Cc
 * @date 2019/11/12
 */
public class WorkTemplate {

    /**
     *
     * @param action
     * @return
     */
    public void execute(Action action){
        signIn();
        openComputer();
        standingMeeting();
        updateJira();
        action.doAction();
        updateJira();
        closeComputer();
        signOut();
    }

    private void signIn(){
        System.out.println("上班打卡");
    }

    private void openComputer(){
        System.out.println("打开电脑");
    }

    private void closeComputer(){
        System.out.println("关闭电脑");
    }

    private void signOut(){
        System.out.println("下班打卡");
    }

    private void standingMeeting(){
        System.out.println("每日站会");
    }

    private void updateJira(){
        System.out.println("更新Jira");
    }
}
