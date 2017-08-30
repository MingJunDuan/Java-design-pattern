package com.mjduan.project.src;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hans 2017-08-30 23:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private static final long serialVersionUID = 574314732983681621L;
    private String name;
    private String address;
    private String phone;

    public CustomerMemento save(){
        return new CustomerMemento(name,phone);
    }

    public void revert(CustomerMemento customerMemento){
        this.name = customerMemento.getName();
        this.phone = customerMemento.getPhone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!name.equals(customer.name)) return false;
        if (!address.equals(customer.address)) return false;
        return phone.equals(customer.phone);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }
}
