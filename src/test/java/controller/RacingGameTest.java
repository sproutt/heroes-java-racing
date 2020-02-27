package controller;

import model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RacingGameTest {

    private RacingGame race;
    private List<Car> cars;
    private Car one;
    private Car two;
    private Car tre;

    @Before
    public void setup(){
        one = new Car("one");
        two = new Car("two");
        tre = new Car("three");

        cars.add(one); cars.add(two); cars.add(tre);
    }

    @Test
    public void searchMaxPositionTest(){
        assertEquals(0, race.searchMaxPosition(cars));

        one.move(); one.move();
        assertEquals(2, race.searchMaxPosition(cars));

        two.move(); two.move(); two.move();
        assertEquals(3, race.searchMaxPosition(cars));

        one.move(); one.move();
        two.move(); two.move(); two.move();
        tre.move();
        assertEquals(6, race.searchMaxPosition(cars));
    }
}