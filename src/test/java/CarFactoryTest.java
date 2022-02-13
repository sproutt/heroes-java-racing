import static org.assertj.core.api.Assertions.assertThat;

import car.Car;
import car.CarFactory;
import org.junit.Test;

import java.util.List;

public class CarFactoryTest {

    @Test
    public void 자동차수가_5일때_리스트의_크기도_5인지_테스트한다() {
        //given
        int numberOfCar = 5;

        //when
        List<Car> carList = CarFactory.createCarList(numberOfCar);

        //then
        assertThat(carList.size()).isEqualTo(numberOfCar);
    }
}