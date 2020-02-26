package model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class RacingGameTest {
    RacingGame racingGame = new RacingGame();

    @Test
    public void 자동차객체가_알맞게_생성됐는지_확인한다() {
        assertThat(racingGame.createCars("car1").size(), equalTo(1));
        assertThat(racingGame.createCars("a,b,c").size(), equalTo(3));
        assertThat(racingGame.createCars("a,b,c,car4").size(), equalTo(4));
    }
    @Test
    public void 자동차경주_시작한다() {
        List<Car> cars = racingGame.createCars("car1,car2,car3");
        List<Integer> randomNumbers = new ArrayList<Integer>(Arrays.asList(1, 4, 9));
        racingGame.startRacing(cars, randomNumbers);

        assertEquals(cars.get(0).getCarPosition(), 0);
        assertEquals(cars.get(1).getCarPosition(), 1);
        assertEquals(cars.get(2).getCarPosition(), 1);
    }
}