package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("차를 전진시키면 postion이 하나 올라간다.")
    void testWhenCarMovePositionUp() {
        Car car = new Car();
        car.move();

        assertThat(car.getPosition()).isEqualTo(1);
    }
}