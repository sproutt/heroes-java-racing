import static org.assertj.core.api.Assertions.assertThat;

import car.Car;
import org.junit.Test;


public class CarTest {

    @Test
    public void 값이_4초과일때_차를_한칸_이동시킨다() {
        //given
        Car car = new Car();
        int randomValue = 5;

        //when
        car.move(randomValue);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 값이_4이하일때_차를_이동시키지_않는다() {
        //given
        Car car = new Car();
        int randomValue = 4;

        //when
        car.move(randomValue);

        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    public void 값이_4이상_기회가_3번_주어질때_차를_3칸_이동시킨다() {
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