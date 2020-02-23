import controller.RacingGameController;
import exception.OutOfCarNameLengthException;

public class Application {
    public static void main(String[] args) throws OutOfCarNameLengthException {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.set();
        racingGameController.start();
    }
}
