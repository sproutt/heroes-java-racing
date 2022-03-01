package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("차 번호가 식별자이다")
    public void identification() throws Exception{
        //given
        Car car1 = new Car(1L);
        Car car2 = new Car(2L);

        //when
        long carNum1 = car1.getCarNum();
        long carNum2 = car2.getCarNum();

        //then
        assertThat(carNum1).isEqualTo(1L);
        assertThat(carNum2).isEqualTo(2L);
    }

    @Test
    @DisplayName("차를 한 번 움직이면 length가 1 늘어나야 한다")
    public void addLength() throws Exception{
        //given
        Car car1 = new Car(1L);
        Car car2 = new Car(2L);

        //when
        car1.moveForward();
        car1.moveForward();
        car2.moveForward();

        //then
        assertThat(car1.moveCount()).isEqualTo(2);
        assertThat(car2.moveCount()).isEqualTo(1);
    }
}
