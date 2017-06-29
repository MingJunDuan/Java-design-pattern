package com.mjduan.project.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.Test;

import com.mjduan.project.src.domain.Car;
import com.mjduan.project.src.domain.IHasModel;
import com.mjduan.project.src.domain.IHasParts;
import com.mjduan.project.src.domain.IHasPrice;
import com.mjduan.project.src.domain.IHasType;

/**
 * Hans 2017-06-29 19:34
 */
public class Test_abstract_document_pattern {
    private Logger LOG = Logger.getLogger(this.getClass().getName());

    @Test
    public void test() {
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(IHasModel.PROPERTY, "300SL");
        carProperties.put(IHasPrice.PROPERTY, 10000L);

        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(IHasType.PROPERTY, "wheel");
        wheelProperties.put(IHasModel.PROPERTY, "15C");
        wheelProperties.put(IHasPrice.PROPERTY, 100L);

        Map<String, Object> doorProperties = new HashMap<>();
        doorProperties.put(IHasType.PROPERTY, "door");
        doorProperties.put(IHasModel.PROPERTY, "Lambo");
        doorProperties.put(IHasPrice.PROPERTY, 300L);

        carProperties.put(IHasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));
        Car car = new Car(carProperties);

        LOG.info("model:" + car.getModel().get());
        LOG.info("price:" + car.getPrice().get());
        LOG.info("parts:");
        car.getParts().forEach(p -> {
            String tmp = "type:" + p.getType().get() + "\tmodel:" + p.getModel().get() + "\tprice:" + p.getPrice().get();
            LOG.info(tmp);
        });
    }


}
