package controller;

import model.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {
    @Test
    @DisplayName("입력한 수만큼 자동차가 등록된다.")
    void testGenerateCarByInputNumber() {
        Race race = new Race();
        List<Car> cars = new ArrayList<>();

        race.registerCars(cars, 3);

        assertThat(cars.size()).isEqualTo(3);
    }
}