package controller;

import exception.OutOfCarNameLengthException;

public class Inspector {
    public void inspectCarNameLength(String carName) throws OutOfCarNameLengthException {
        if(carName.length() > 5) {
            throw new OutOfCarNameLengthException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
