import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private static final int CRITERIA_NUMBER = 4;

    RacingGame racingGame;

    @Before
    public void setup() throws OutOfCarNameLengthException {
        racingGame = new RacingGame(5, "pobi,crong,honux");
    }

    @Test
    public void 컴마로구분된_자동차이름문자열을_자동차리스트로_바꾸어주는메소드_테스트()
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method method = RacingGame.class.getDeclaredMethod("convertCarNamesToCarList", String.class);
        method.setAccessible(true);

        List<Car> arrayList = (List) method.invoke(racingGame, "pobi,crong,honux");

        for (int index = 0; index < arrayList.size(); index++) {
            assertEquals(racingGame.getCars().get(index).getName(), arrayList.get(index).getName());
            assertEquals(racingGame.getCars().get(index).getLocation(), arrayList.get(index).getLocation());
        }
    }
}
