
public class OutOfLengthException extends Exception {
    OutOfLengthException(String message, int length) {
        super(message + " Length : " + length);
    }
}