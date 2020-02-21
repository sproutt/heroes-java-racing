import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    public void testCarsNameValid() {
        Cars cars = new Cars("ionX, plasmaXPT, solidX, KLX");
        assertThat(cars.getCarNames()).isEqualTo("ionX, Unnamed Car 1, Unnamed Car 2, KLX");
    }
}