package ru.geekbrains.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWheels {

    @Test
    public void testWheelsCar(){
        Car car = new Car("BMW", "550", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testWheelsMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZ450F", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

}
