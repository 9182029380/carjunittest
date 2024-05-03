package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void testFindCarByIdWhereCarIsFound() {
        List<Car> list = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "bmw", "xcw"));
        cars.add(new Car(2, "bmw", "xcw"));
        cars.add(new Car(3, "bmw", "xcw"));
        cars.add(new Car(4, "bmw", "xcw"));
        int serachId=4;
        Car foundcar = Car.findCarById(cars, serachId);
        assertNotNull(foundcar);
        assertEquals(serachId, foundcar.getId());
        assertEquals("bmw", foundcar.getBrand());
        assertEquals("xcw", foundcar.getModel());


    }

}
