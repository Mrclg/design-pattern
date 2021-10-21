package com.guang.mediatorpattern.colleague;

import com.guang.mediatorpattern.mediator.Mediator;

/**
 * 具体同事类 - 声卡
 */
public class SoundCardColleague extends Colleague {

    // 构造函数
    public SoundCardColleague(Mediator mediator) {
        super(mediator);
    }

    // 按照声频数据发出声音
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }

}
