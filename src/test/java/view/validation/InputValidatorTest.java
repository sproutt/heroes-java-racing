package view.validation;

import exception.InputViewException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputValidatorTest {
    @Test
    @DisplayName("숫자가 아닌 것이 들어올 때 예외 처리한다.")
    void testIfInputNonNumber() {
        String carsNumber = "j";
        InputValidator inputValidator = new InputValidator();

        InputMismatchException inputMismatchException = assertThrows(InputMismatchException.class, () -> inputValidator.validateNumber(carsNumber));
        String message = inputMismatchException.getMessage();
        assertThat("입력 값은 0이 아닌 양수를 입력해주세요.").isEqualTo(message);
    }

    @Test
    @DisplayName("0이 들어올 때 예외 처리한다.")
    void testIfZeroNumber() {
        int carsNumber = 0;
        InputValidator inputValidator = new InputValidator();

        InputViewException inputViewException = assertThrows(InputViewException.class, () -> inputValidator.validatePositiveAndNotZeroNumber(carsNumber));
        String message = inputViewException.getMessage();
        assertThat("입력 값은 0이 아닌 양수를 입력해주세요.").isEqualTo(message);
    }

    @Test
    @DisplayName("음수가 들어올 때 예외 처리한다.")
    void testIfNegativeNumber(){
        int carsNumber = -1;
        InputValidator inputValidator = new InputValidator();

        InputViewException inputViewException = assertThrows(InputViewException.class, () -> inputValidator.validatePositiveAndNotZeroNumber(carsNumber));
        String message = inputViewException.getMessage();
        assertThat("입력 값은 0이 아닌 양수를 입력해주세요.").isEqualTo(message);
    }
}