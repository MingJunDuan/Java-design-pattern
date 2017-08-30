package com.mjduan.project.example2.src;

import java.util.HashMap;

import lombok.Data;

/**
 * Hans 2017-08-30 22:41
 */
@Data
public abstract class AbstractMediator {
    private HashMap<String, AbstractColleague> colleages = new HashMap<>();


    public void addColleague(String name, AbstractColleague colleage) {
        colleage.setMediator(this);
        this.colleages.put(name, colleage);
    }

    public void deleteColleage(String name) {
        this.colleages.remove(name);
    }

    public abstract void execute(String name, String method);

}
