package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void Car을_생성한다() {
        Car car = new Car("a");
        assertEquals("a", car.getCarName());
        assertEquals(0, car.getCarPosition());
    }

    @Test
    public void 움직였을경우_Car의_Position이_1씩증가한다() {
        Car car = new Car("a");
        car.move();
        assertEquals(1, car.getCarPosition());
    }

    @Test
    public void Car의_Position에따라서_visualizePosition이_만들어진다() {
        Car car = new Car("a");
        car.move();
        car.move();
        assertEquals(2, car.getCarPosition());
        assertEquals(car.visualizePosition(), car.getCarName() + ": " + "--");

    }
}