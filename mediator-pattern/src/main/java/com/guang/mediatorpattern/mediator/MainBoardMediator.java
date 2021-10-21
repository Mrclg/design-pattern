package com.guang.mediatorpattern.mediator;

import com.guang.mediatorpattern.colleague.*;

/**
 * 具体调停者类  - 主板
 */
public class MainBoardMediator implements Mediator {

    // 需要知道要交互的同事类——光驱类
    private CDDriverColleague cdDriver = null;
    // 需要知道要交互的同事类——CPU类
    private CPUColleague cpu = null;
    // 需要知道要交互的同事类——显卡类
    private VideoCardColleague videoCard = null;
    // 需要知道要交互的同事类——声卡类
    private SoundCardColleague soundCard = null;

    public void setCdDriver(CDDriverColleague cdDriver) {
        this.cdDriver = cdDriver;
    }
    public void setCpu(CPUColleague cpu) {
        this.cpu = cpu;
    }
    public void setVideoCard(VideoCardColleague videoCard) {
        this.videoCard = videoCard;
    }
    public void setSoundCard(SoundCardColleague soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague c) {
        if (c instanceof CDDriverColleague) {
            // 表示光驱读取数据了
            this.opeCDDriverReadData((CDDriverColleague) c);
        } else if (c instanceof CPUColleague) {
            this.opeCPU((CPUColleague) c);
        }
    }

    // 处理光驱读取数据以后与其他对象的交互
    private void opeCDDriverReadData(CDDriverColleague cd) {
        //先获取光驱读取的数据
        String data = cd.getData();

        // 把这些数据传递给CPU进行处理
        cpu.executeData(data);
    }

    // 处理CPU处理完数据后与其他对象的交互
    private void opeCPU(CPUColleague cpu) {
        // 先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();

        // 把这些数据传递给显卡和声卡展示出来
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }
}
