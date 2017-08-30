package com.mjduan.project.src;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Hans 2017-08-30 23:25
 */
public class CareTaker {
    private Deque<CustomerMemento> customerHistory = new ArrayDeque<>();

    public void save(Customer customer) {
        customerHistory.push(customer.save());
    }

    public void revert(Customer customer) {
        customer.revert(customerHistory.pop());
    }

}
