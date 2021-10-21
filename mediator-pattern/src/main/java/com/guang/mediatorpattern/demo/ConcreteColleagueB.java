package com.guang.mediatorpattern.demo;

/**
 * 具体同事类 B
 */
public class ConcreteColleagueB extends Colleague {

    /**
     * 构造函数
     */
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法，执行某些操作
     */
    public void operation(){
        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }

}
