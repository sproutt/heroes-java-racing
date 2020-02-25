import org.assertj.core.api.ThrowableAssert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @Before
    public void setup() {
        car = new Car("crong");
    }

    @Test
    public void moveRandomlyTest() {
        car.move(6);
        assertThat(car.getLocation()).isEqualTo(1);
        car.move(9);
        assertThat(car.getLocation()).isEqualTo(2);
        car.move(3);
        assertThat(car.getLocation()).isEqualTo(2);
    }

    @Test
    public void convertLocationToBars(){
        assertThat(car.convertLocationToBars()).isEqualTo("");
        car.move(6);
        assertThat(car.convertLocationToBars()).isEqualTo("-");
    }
}
