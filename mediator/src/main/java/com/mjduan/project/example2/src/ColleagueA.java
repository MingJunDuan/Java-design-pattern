package com.mjduan.project.example2.src;

/**
 * Hans 2017-08-30 22:47
 */
public class ColleagueA extends AbstractColleague {

    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){
        System.out.println("A 做好自己的事情");
    }

    public void out(){
        System.out.println("A 请求B做好它的事情");
        super.getMediator().execute("B","self");
    }
}
