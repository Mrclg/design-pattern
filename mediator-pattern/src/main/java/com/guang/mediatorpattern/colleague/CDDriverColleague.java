package com.guang.mediatorpattern.colleague;

import com.guang.mediatorpattern.mediator.Mediator;

/**
 * 具体同事类 - 光驱
 */
public class CDDriverColleague extends Colleague {

    // 光驱读取出来的数据
    private String data = "";

    // 构造函数
    public CDDriverColleague(Mediator mediator) {
        super(mediator);
    }

    // 获取光盘读取出来的数据
    public String getData() {
        return data;
    }

    // 读取光盘
    public void readCD() {
        // 逗号前是视频显示的数据，逗号后是声音
        this.data = "One Piece,海贼王我当定了";
        // 通知主板，自己的状态发生了改变
        getMediator().changed(this);
    }

}
