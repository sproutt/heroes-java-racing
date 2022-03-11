package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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
    @DisplayName("moveable 상태면 한 칸 전진")
    public void go() throws Exception{
        //given
        Car car1 = new Car(1L);
        car1.changeState(new Movable());

        //when
        car1.move();

        //then
        assertThat(car1.moveCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("unmovable 상태면 전진하지 않음")
    public void stop() throws Exception{
        //given
        Car car1 = new Car(1L);
        car1.changeState(new UnMovable());

        //when
        car1.move();

        //then
        assertThat(car1.moveCount()).isEqualTo(0);
    }
}
