package controller;

public class StringOutOfBoundsException extends RuntimeException {
    public StringOutOfBoundsException(){
        super("입력가능범위를 초과하였습니다. (Max Length = 5)");
    }
}
