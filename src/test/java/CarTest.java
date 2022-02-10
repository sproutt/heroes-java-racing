
import static org.assertj.core.api.Assertions.assertThat;
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
}