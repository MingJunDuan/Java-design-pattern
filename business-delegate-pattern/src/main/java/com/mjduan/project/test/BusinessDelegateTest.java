package com.mjduan.project.test;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.mjduan.project.src.BusinessDelegate;
import com.mjduan.project.src.BusinessLookup;
import com.mjduan.project.src.Client;
import com.mjduan.project.src.ServiceType;
import com.mjduan.project.src.services.EjbService;
import com.mjduan.project.src.services.JmsService;

/**
 * Hans 2017-07-02 17:43
 */
public class BusinessDelegateTest {
    private EjbService ejbService;
    private JmsService jmsService;
    private BusinessLookup businessLookup;
    private BusinessDelegate businessDelegate;

    @Before
    public void before(){
        ejbService = spy(new EjbService());
        jmsService = spy(new JmsService());

        businessLookup = spy(new BusinessLookup());
        businessLookup.setJmsService(jmsService);
        businessLookup.setEjbService(ejbService);

        businessDelegate = spy(new BusinessDelegate());
        businessDelegate.setLookupService(businessLookup);
    }

    @Test
    public void test_businessDelegate(){
        Client client = new Client(businessDelegate);
        businessDelegate.setServiceType(ServiceType.EJB);
        client.doTask();

        verify(businessDelegate).doTask();
        verify(ejbService).doProcessing();

        businessDelegate.setServiceType(ServiceType.JMS);
        client.doTask();
        verify(businessDelegate).doTask();
        verify(jmsService).doProcessing();

        verify(businessDelegate,times(2)).doTask();
    }

}
