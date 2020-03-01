package model;

import exception.OutOfCarNameLengthException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private final List<Integer> FIRST_RANDOM_INTEGERS = Arrays.asList(9,9,8);
    private final List<Integer> SECOND_RANDOM_INTEGERS = Arrays.asList(4,4,2);
    private final List<Integer> THIRD_RANDOM_INTEGERS = Arrays.asList(1,3,5);

    private RacingGame racingGame;

    @Before
    public void setup() throws OutOfCarNameLengthException {
        racingGame = new RacingGame();
        racingGame.set(3, "pobi,crong,honux");
    }

    @Test
    public void 레이싱게임_진행_테스트() {
        racingGame.proceedOnce(FIRST_RANDOM_INTEGERS);
        racingGame.proceedOnce(SECOND_RANDOM_INTEGERS);
        racingGame.proceedOnce(THIRD_RANDOM_INTEGERS);
        List<Integer> carsLocationTest = Arrays.asList(2,2,2);
        for (int index = 0; index < racingGame.getCars().size(); index++) {
            assertEquals(racingGame.getCars().get(index).getLocation(),carsLocationTest.get(index).intValue());
        }
    }

    @Test
    public void 레이싱게임_우승자_테스트() {
        racingGame.proceedOnce(FIRST_RANDOM_INTEGERS);
        racingGame.proceedOnce(SECOND_RANDOM_INTEGERS);
        racingGame.proceedOnce(THIRD_RANDOM_INTEGERS);
        List<Car> winnerCars = racingGame.getWinnerCars();
        List<String> winnerCarNamesTest = Arrays.asList("pobi","crong","honux");
        for (int index = 0; index < winnerCars.size(); index++) {
            assertEquals(winnerCars.get(index).getName(),winnerCarNamesTest.get(index));
        }
    }

}
