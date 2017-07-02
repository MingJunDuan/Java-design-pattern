package com.mjduan.project.src;

import com.mjduan.project.src.services.IBusinessService;

/**
 * Hans 2017-07-02 17:27
 */
public class BusinessDelegate {
    private BusinessLookup lookupService;
    private IBusinessService businessService;
    private ServiceType serviceType;

    public void setLookupService(BusinessLookup lookupService) {
        this.lookupService = lookupService;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

}
