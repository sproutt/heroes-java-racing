import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class CarTest {

    @Test
    public void 차_전진_O() {
        //given
        Car car = new Car();
        int randomValue = 5;

        //when
        car.move(randomValue);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 차_전진_X() {
        //given
        Car car = new Car();
        int randomValue = 4;

        //when
        car.move(randomValue);

        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    public void 차_포지션_UI_변환() {
        //given
        Car car = new Car();
        String expected = "---";

        //when
        for (int i = 0; i < 3; i++) {
            car.move(9);
        }

        //then
        assertThat(car.toString()).isEqualTo(expected);
    }
}