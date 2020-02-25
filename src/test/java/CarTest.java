import org.assertj.core.api.ThrowableAssert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    Car car;

    @Before
    public void setup() {
        car = new Car("crong");
    }

}
