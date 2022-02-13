import static org.assertj.core.api.Assertions.assertThat;

import car.Car;
import car.CarFactory;
import org.junit.Test;

import java.util.List;

public class CarFactoryTest {

    @Test
    public void 차_리스트_생성() {
        //given
        int numberOfCar = 5;

        //when
        List<Car> carList = CarFactory.createCarList(numberOfCar);

        //then
        assertThat(carList.size()).isEqualTo(numberOfCar);
    }
}