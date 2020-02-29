import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CarsTest {

    @Test
    public void 차이름들_모두_다섯글자_이하_테스트() {
        assertEquals(new Cars("ionX, KLX").getCarNames(), Arrays.asList("ionX, KLX".split(", | ")));
    }

    @Test
    public void 차이름들_중_하나라도_다섯글자_초과_테스트() {
        Cars cars = new Cars("ionX, plasmaXPT, solidX, KLX");
        assertEquals(cars.getCarNames(), Arrays.asList("ionX, KLX".split(", | ")));
    }
}