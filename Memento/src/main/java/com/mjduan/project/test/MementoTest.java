package com.mjduan.project.test;

import org.junit.Assert;
import org.junit.Test;

import com.mjduan.project.src.CareTaker;
import com.mjduan.project.src.Customer;
import com.mjduan.project.src.CustomerMemento;

/**
 * Hans 2017-08-30 23:32
 */
public class MementoTest {

    @Test
    public void test1(){
        String iniName = "mjduan";
        String iniPhone = "0897-89067";
        Customer customer = new Customer(iniName, "xxxx", iniPhone);
        CareTaker careTaker = new CareTaker();
        careTaker.save(customer);
        customer.setPhone("00000-10086");
        careTaker.save(customer);
        customer.setPhone("99999-10080");

        customer.setPhone("00000000000");
        careTaker.revert(customer);
        careTaker.revert(customer);

        Assert.assertEquals(new CustomerMemento(iniName,iniPhone),customer.save());
    }

}
