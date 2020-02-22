package racingcar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {
    private String carName;
    @Test
    public void TestOne() {
        Car car = new Car("Ahntoday");
        assertEquals(car.getCarName(),"Ahnto");
    }

    private String getName() {
        return carName;
    }

}
