package com.mjduan.project.example2.test;

import org.junit.Test;

import com.mjduan.project.example2.src.AbstractMediator;
import com.mjduan.project.example2.src.ColleagueA;
import com.mjduan.project.example2.src.ColleagueB;
import com.mjduan.project.example2.src.Mediator;

/**
 * Hans 2017-08-30 23:03
 */
public class MediatorTest {

    @Test
    public void test(){
        AbstractMediator mediator = new Mediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.addColleague("A",colleagueA);
        mediator.addColleague("B",colleagueB);

        colleagueA.self();
        colleagueA.out();
        System.out.println("---->A Done!");

        colleagueB.self();
        colleagueB.out();
        System.out.println("---->B Done!");
    }

}
