package com.mjduan.project.example1.src;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hans 2017-08-30 22:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private BigDecimal productValue;

    public BigDecimal calculateDiscount(){
        return new DiscountCalculatorMediator(productValue).calculate();
    }
}
