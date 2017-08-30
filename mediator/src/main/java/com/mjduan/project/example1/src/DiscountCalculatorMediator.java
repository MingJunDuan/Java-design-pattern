package com.mjduan.project.example1.src;

import java.math.BigDecimal;

/**
 * Hans 2017-08-30 22:20
 */
class DiscountCalculatorMediator {
    private BigDecimal productValue;
    private BigDecimal DISCOUNT_RATE=new BigDecimal("0.10");

    DiscountCalculatorMediator(BigDecimal productValue) {
        this.productValue = productValue;
    }

    //productValue*(1-0.10)
    BigDecimal calculate(){
        return productValue.subtract(productValue.multiply(DISCOUNT_RATE));
    }
}
