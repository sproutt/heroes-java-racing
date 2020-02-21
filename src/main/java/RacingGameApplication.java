import controller.CarController;
import model.Car;
import view.InputView;
import view.ResultView;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGameApplication {

//    public static List<Car> convertStringToCarList(String string) {
//        String[] stringArray = string.split(",");
//        List<Car> carList = new ArrayList<>();
//        for (String element : stringArray) {
//            carList.add(new Car(element));
//        }
//        return carList;
//    }

    private int numberOfIterations;
    private List<CarController> carControllerList;

    public void start() {
        InputView inputView = new InputView();
        Scanner scanner = new Scanner(System.in);
        inputView.printCarNameStringRequestSentence();
//        carControllerList = convertCarNameStringToCarArrayList(scanner.nextLine());
        inputView.printNumberOfIterationsRequestSentence();
        numberOfIterations = scanner.nextInt();
    }

    public static void convertCarNameStringToCarArrayList(String carNameString) {
        String[] stringNameArray = carNameString.split(",");

        int[] numbers = {1,2,3,4};
        Car[] carArray = stringNameArray.stream()
    }

    public static void main(String[] args) {
        convertCarNameStringToCarArrayList("hello,java");
//        RacingGameApplication racingGameApplication = new RacingGameApplication();
//        racingGameApplication.start();


    }


}
