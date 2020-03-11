package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Before
    public void setup() {
        car = new Car("pobi");
    }

    @Test
    public void carMoveTest() {
        car.move(5, 4);
        assertEquals(car.getLocation(), 1);
        car.move(4, 4);
        assertEquals(car.getLocation(), 2);
        car.move(3, 4);
        assertEquals(car.getLocation(), 2);
    }
}
