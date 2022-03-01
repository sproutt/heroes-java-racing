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

    @Test
    @DisplayName("모든 자동차들이 random 값 4이상일 때 전진한다.")
    void testWhenRandomValueIsOverThreeAllTheCarMove(){
        Race race = new Race();
        List<Car> cars = new ArrayList<>();
        int randomNumber = 4;
        for (int i = 0; i < 3; i++) {
            cars.add(new Car());
        }

        race.playOneRound(cars, randomNumber);

        for (int i = 0; i < cars.size(); i++) {
            assertThat(cars.get(i).getPosition()).isEqualTo(1);
        }
    }
}