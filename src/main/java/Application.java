import controller.RacingGameController;
import exception.OutOfNameLengthException;

public class Application {
    public static void main(String[] args) throws OutOfNameLengthException {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.set();
        racingGameController.start();
    }
}
