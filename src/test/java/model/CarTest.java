package model;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @Before
    public void setup() {
        car = new Car("crong");
    }

    @Test
    public void moveTest() {
        car.move();
        assertThat(car.getLocation()).isEqualTo(1);
        car.move();
        assertThat(car.getLocation()).isEqualTo(2);
    }
}
