package com.mjduan.project.src;

import com.mjduan.project.src.services.EjbService;
import com.mjduan.project.src.services.JmsService;

/**
 * Hans 2017-07-02 17:29
 */
public class App {

    public static void main(String[] args){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        BusinessLookup businessLookup = new BusinessLookup();
        businessLookup.setEjbService(new EjbService());
        businessLookup.setJmsService(new JmsService());

        businessDelegate.setLookupService(businessLookup);

        businessDelegate.setServiceType(ServiceType.EJB);
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(ServiceType.JMS);
        client.doTask();
    }

}
