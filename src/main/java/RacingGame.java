import controller.Trial;
import model.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;

public class RacingGame {

    ArrayList<Car> cars = new ArrayList<Car>();
    Trial trial = new Trial();
    int time;

    public void generateCars(String[] carNames){
        for (String carName : carNames){
            cars.add(new Car(carName));
        }
    }

    public void oneTrial(){
        for (Car car : cars){
            trial.move(car);
        }
    }

    public void printTrialResult(){
        for (Car car : cars){
            System.out.print(car.getName() + " : ");
            for (int j = 0; j < car.getPosition(); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingGame racingGame = new RacingGame();

        racingGame.generateCars(inputView.inputCarName());
        int time = inputView.inputNumberOfTrials();
        for (int i = 0; i < time; i++) {
            racingGame.oneTrial();
            racingGame.printTrialResult();
        }
    }
}
