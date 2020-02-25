import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {
    List<Car> cars;

    @Before
    public void setup() {
        cars = Arrays.asList(new Car[]{
                new Car("pobi"),
                new Car("crong"),
                new Car("honux")
        });
    }

    @Test
    public void 쉼표로구분된_자동차이름문자열에서_자동차리스트로변환_테스트() {
        List<Car> testCars = Application.convertCarNameStringToCarList("pobi,crong,honux");
        for (int iterationCount = 0; iterationCount < testCars.size(); iterationCount++) {
            assertThat(testCars.get(iterationCount).getName())
                    .isEqualTo(cars.get(iterationCount).getName());
            assertThat(testCars.get(iterationCount).getLocation())
                    .isEqualTo(cars.get(iterationCount).getLocation());
        }
    }
}

