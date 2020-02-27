import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final int CRITERIA_NUMBER = 4;

    Car car;

    @Before
    public void setup() {
        car = new Car("pobi");
    }

    @Test
    public void move_Test() {
        car.move(3, CRITERIA_NUMBER);
        assertThat(car.getMovingStatuses())
                .isEqualTo(Arrays.asList(new Integer(0)));
        assertThat(car.getLocation())
                .isEqualTo(0);
        car.move(4, CRITERIA_NUMBER);
        assertThat(car.getMovingStatuses())
                .isEqualTo(Arrays.asList(new Integer(0), new Integer(1)));
        assertThat(car.getLocation())
                .isEqualTo(1);
    }

}
