package com.mjduan.project.example2.src;

/**
 * Hans 2017-08-30 22:49
 */
public class ColleagueB extends AbstractColleague {

    public ColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){
        System.out.println("B 做好自己的事情");
    }

    public void out(){
        System.out.println("B 请求A做好它的事情");
        super.getMediator().execute("A","self");
    }
}
