import org.junit.Test;

import static org.junit.Assert.*;

public class RacingGameTest {
    Car car;
    @Test
    void 자동차_생성(){
        car = new Car("samuel");
    }

    @Test
    public void carMove(){
        car.carMove(9);
        assertEquals(1, car.carCount());
    }

    @Test
    public void carStop(){
        car.carMove(1);
        assertEquals(0, car.carCount());
    }
}