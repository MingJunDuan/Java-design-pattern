package com.mjduan.project.src;

import java.util.logging.Logger;

/**
 * Hans 2017-06-29 22:07
 */
public class FishingBoat {
    private Logger LOG = Logger.getLogger(this.getClass().getName());

    public void sail(){
        LOG.info("the boat is moving to that place");
    }

    public void fish(){
        LOG.info("fishing...");
    }

}
