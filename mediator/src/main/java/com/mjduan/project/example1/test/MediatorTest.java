package com.mjduan.project.example1.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.mjduan.project.example1.src.Product;

/**
 * Hans 2017-08-30 22:22
 */
public class MediatorTest {

    @Test
    public void test1() {
        BigDecimal result = new Product(new BigDecimal("50")).calculateDiscount();
        Assert.assertEquals(new BigDecimal("45.00"), result);
    }

}
