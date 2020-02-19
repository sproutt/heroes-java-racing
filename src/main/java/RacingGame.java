import controller.Trial;
import model.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.Collections;

public class RacingGame {

    private ArrayList<Car> cars = new ArrayList<>();
    private Trial trial = new Trial();

    public void generateCars(String[] carNames) throws Exception{
        for (String carName : carNames){
            if (carName.length() > 6) {
                throw new Exception();
            }
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
            System.out.print(car.getName() + " : " + String.join("", Collections.nCopies(car.getPosition(), "*")) + "\n");
        }
        System.out.println();
    }

    public ArrayList<String> finalResult(){
        ArrayList<Integer> carPosition = new ArrayList<>();
        ArrayList<String> winner = new ArrayList<>();
        for (Car car : cars){
            carPosition.add(car.getPosition());
        }
        int winnerPosition = Collections.max(carPosition);
        for (Car car : cars){
            if (car.getPosition() == winnerPosition){
                winner.add(car.getName());
            }
        }
        return winner;
    }

    public void printFinalWinner(){
        System.out.print(String.join(",",  finalResult()));
        System.out.println("가 최종 우승했습니다.");
    }

    public static void main(String[] args) throws Exception{
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingGame racingGame = new RacingGame();

        racingGame.generateCars(inputView.inputCarName());
        int trialCount = inputView.inputNumberOfTrials();
        for (int i = 0; i < trialCount; i++) {
            racingGame.oneTrial();
            racingGame.printTrialResult();
        }
        racingGame.printFinalWinner();
    }
}
