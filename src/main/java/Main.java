import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("자동차의 이름들을 입력해주세요 쉼표(,)기준으로 구분됩니다. 5byte 이하만 가");
        Scanner scannerInput = new Scanner(System.in);
        String carInputNames = InputView.inputCarName(scannerInput);

        String[] carNames = RacingGame.splitNames(carInputNames);


        RacingGame RacingGame = new RacingGame();
        Car[] car = RacingGame.arrayRacingCar(carNames);

        System.out.println("반복할 횟수를 적어주세요 : ");
        int repeatNumber = scannerInput.nextInt();

        RacingGame.repeatRepeatNumber(repeatNumber, car);

        int firstPrizeScore = RacingGame.firstPrizeScore(car);
        OutputView.announceWinner(firstPrizeScore, car);
    }
}
