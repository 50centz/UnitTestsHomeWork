package ru.geekbrains.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPark {


    @Test
    public void testSpeedCar(){
        Car car = new Car("Toyota", "Camry", 2010);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testSpeedMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZ450F", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
