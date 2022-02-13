package view.validation;

import exception.InputViewException;

import java.util.InputMismatchException;

public class InputValidator {
    private static final int ZERO = 0;
    private static final String INPUT_RULE_MESSAGE = "입력 값은 0이 아닌 양수를 입력해주세요.";

    public void validatePositiveAndNotZeroNumber(int carsNumber) throws InputViewException {
        if(carsNumber <= ZERO) {
            throw new InputViewException(INPUT_RULE_MESSAGE);
        }
    }

    public void validateNumber(String carsNumber) throws InputMismatchException {
        boolean flag = true;
        for (int i = 0; i < carsNumber.length(); i++) {
            char tmp = carsNumber.charAt(i);
            if(Character.isDigit(tmp) == false){
                flag = false;
                break;
            }
        }
        if(!flag) {
            throw new InputMismatchException(INPUT_RULE_MESSAGE);
        }
    }
}
