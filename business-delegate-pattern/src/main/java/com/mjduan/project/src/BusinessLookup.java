package com.mjduan.project.src;

import com.mjduan.project.src.services.EjbService;
import com.mjduan.project.src.services.IBusinessService;
import com.mjduan.project.src.services.JmsService;

/**
 * Hans 2017-07-02 17:24
 */
public class BusinessLookup {
    private EjbService ejbService;
    private JmsService jmsService;

    public IBusinessService getBusinessService(ServiceType serviceType) {
        return serviceType.equals(ServiceType.EJB)?ejbService:jmsService;
    }

    public void setEjbService(EjbService ejbService) {
        this.ejbService = ejbService;
    }

    public void setJmsService(JmsService jmsService) {
        this.jmsService = jmsService;
    }
}
