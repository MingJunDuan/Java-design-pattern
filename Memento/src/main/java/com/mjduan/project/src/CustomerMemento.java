package com.mjduan.project.src;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hans 2017-08-30 23:23
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerMemento {
    private String name;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerMemento that = (CustomerMemento) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return phone != null ? phone.equals(that.phone) : that.phone == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
