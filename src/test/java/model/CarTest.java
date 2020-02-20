package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CarTest {

    private ArrayList<Car> carArrayList;

    @Before
    public void setup(){
        Car car1 = new Car("one");
        Car car2 = new Car("two");
        Car car3 = new Car("three");
        Car car4 = new Car("four");
        Car car5 = new Car("five");
        Car car6 = new Car("six");

        carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);
        carArrayList.add(car6);
    }

    @Test
    public void generateCars() throws Exception {
        ArrayList<Car> carArrayListTest = Car.generateCars(new String[]{"one","two","three","four","five","six"});
        assertEquals(carArrayList.get(0).getName(), carArrayListTest.get(0).getName());
        assertEquals(carArrayList.get(2).getName(), carArrayListTest.get(2).getName());
        assertEquals(carArrayList.get(5).getName(), carArrayListTest.get(5).getName());
        assertEquals(0, carArrayListTest.get(1).getPosition());
    }
}