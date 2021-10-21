package com.guang.mediatorpattern.colleague;

import com.guang.mediatorpattern.mediator.Mediator;

/**
 * 具体同事类 - 显卡
 */
public class VideoCardColleague extends Colleague {

    // 构造函数
    public VideoCardColleague(Mediator mediator) {
        super(mediator);
    }

    // 显示视频数据
    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }

}
