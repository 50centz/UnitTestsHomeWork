package ru.geekbrains.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVehicle {

    @Test
    public void testVehicle(){
        Car car = new Car("BMW", "550", 2023);
        assertTrue(car instanceof Vehicle);
    }

}
