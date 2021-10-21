package com.guang.mediatorpattern;

import com.guang.mediatorpattern.colleague.CDDriverColleague;
import com.guang.mediatorpattern.colleague.CPUColleague;
import com.guang.mediatorpattern.colleague.SoundCardColleague;
import com.guang.mediatorpattern.colleague.VideoCardColleague;
import com.guang.mediatorpattern.mediator.MainBoardMediator;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Client {

    public static void main(String[] args) {

        // 创建调停者——主板
        MainBoardMediator mediator = new MainBoardMediator();

        // 创建同事类
        CDDriverColleague cd = new CDDriverColleague(mediator);
        CPUColleague cpu = new CPUColleague(mediator);
        VideoCardColleague vc = new VideoCardColleague(mediator);
        SoundCardColleague sc = new SoundCardColleague(mediator);

        // 让调停者知道所有同事
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);

        // 开始看电影，把光盘放入光驱，光驱开始读盘
        cd.readCD();
    }

}
