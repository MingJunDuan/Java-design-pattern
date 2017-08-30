package com.mjduan.project.example2.src;

/**
 * Hans 2017-08-30 22:50
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String name, String method) {
        if ("self".equalsIgnoreCase(method)) {
            if ("A".equalsIgnoreCase(name)) {
                ColleagueA colleagueA = (ColleagueA) super.getColleages().get("A");
                colleagueA.self();
            } else {
                ColleagueB colleagueB = (ColleagueB) super.getColleages().get("B");
                colleagueB.self();
            }
        } else {
            if ("A".equalsIgnoreCase(name)) {
                ColleagueA colleagueA = (ColleagueA) super.getColleages().get("A");
                colleagueA.out();
            } else {
                ColleagueB colleagueB = (ColleagueB) super.getColleages().get("B");
                colleagueB.out();
            }
        }
    }

}
