package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("랜덤값이 4 이상일 때 차의 postion이 하나 올라간다.")
    void testWhenCarMovePositionUp() {
        int randomNumber = 4;
        Car car = new Car();
        car.move(randomNumber);

        assertThat(car.getPosition()).isEqualTo(1);
    }
}