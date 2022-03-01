package controller;

import model.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarControllerTest {

    CarController carController = new CarController();
    List<Car> cars = new ArrayList<>();

    @Test
    @DisplayName("차가 제대로 등록됐는지 확인")
    public void countCar() throws Exception{
        //given
        int size = 5;

        //when
        carController.registerCars(cars, size);

        //then
        assertThat(cars.size()).isEqualTo(5);

    }
}