package model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RacingGameResultTest {
    @Test
    public void winner_1명을_추출한다() {
        List<Car> cars = new ArrayList<Car>(Arrays.asList(new Car("car1"), new Car("car2"), new Car("car3")));
        cars.get(0).moveCar();
        RacingGameResult result = new RacingGameResult(cars);

        assertEquals(result.getWinners(), new ArrayList<String>(Arrays.asList("car1")));
    }

    @Test
    public void winner_2명을_추출한다() {
        List<Car> cars = new ArrayList<Car>(Arrays.asList(new Car("car1"), new Car("car2"), new Car("car3")));
        cars.get(0).moveCar();
        cars.get(1).moveCar();
        RacingGameResult result = new RacingGameResult(cars);

        assertEquals(result.getWinners(), new ArrayList<String>(Arrays.asList("car1", "car2")));
    }

    @Test
    public void 아무런시도를하지않고_winner추출한다() {
        RacingGame racingGame = new RacingGame();
        List<Car> cars = racingGame.createCars("1,2,3");
        RacingGameResult result = new RacingGameResult(cars);

        assertEquals(result.getWinners(), new ArrayList<String>(Arrays.asList("1", "2", "3")));
    }
}