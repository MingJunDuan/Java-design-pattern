package com.mjduan.project.src;

import com.mjduan.project.src.impl.BattleFishingBoat;
import com.mjduan.project.src.impl.Captain;

/**
 * Hans 2017-06-29 22:13
 */
public class App {

    public static void main(String[] args){
        Captain captain = new Captain(new BattleFishingBoat());
        captain.move();
        captain.fire();
    }

}
