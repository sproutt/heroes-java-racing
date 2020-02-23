package controller;

import exception.OutOfNameLengthException;

public class Inspector {
    public void inspectCarNameLength(String carName) throws OutOfNameLengthException {
        if(carName.length() > 5) {
            throw new OutOfNameLengthException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
