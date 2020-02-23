package controller;

import exception.OutOfCarNameLengthException;
import model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ConverterTest {

    Converter converter;
    List<CarController> carControllerList;
    List<CarController> carControllerListRightTest;
    List<CarController> carControllerListWrongTest;

    @Before
    public void setup() throws OutOfCarNameLengthException {
        converter = new Converter();
        carControllerListRightTest = new ArrayList<>();
        carControllerListWrongTest = new ArrayList<>();
        carControllerList = converter.convertCarNameStringToCarControllerList("pobi,crong,honux");
        carControllerList.forEach(carController -> {
            carControllerListRightTest.add(carController);
            carControllerListWrongTest.add(carController);
        });
        carControllerListWrongTest.add(new CarController(new Car("Kakao")));
    }

    @Test
    public void convertCarNameStringToCarArrayListTest() throws OutOfCarNameLengthException {
        assertThat(carControllerList)
                .isEqualTo(carControllerListRightTest)
                .isNotEqualTo(carControllerListWrongTest);
    }

    @Test
    public void converterCarNameStringToCarArrayListThrowsExceptionTest()
            throws OutOfCarNameLengthException {
        assertThatThrownBy(() -> {
            converter.convertCarNameStringToCarControllerList("pobi,crong,honux,keroro");
        }).isInstanceOf(OutOfCarNameLengthException.class);
    }
}
