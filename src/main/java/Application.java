import controller.RacingGameController;
import model.RacingGame;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.init();
        racingGameController.start();
    }
}
