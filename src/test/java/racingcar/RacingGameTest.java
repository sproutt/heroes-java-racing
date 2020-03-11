package racingcar;

import org.junit.Test;

import static org.junit.Assert.*;

public class RacingGameTest {

    @Test
    public void CheckCarPosition() { // 움직이면, position 증가.
        Car car = new Car("ahnto");
        car.move();
        assertEquals(1, car.getPosition());
    }
}
