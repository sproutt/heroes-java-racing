import java.util.Scanner;

public class InputView {
    private final String CAR_NUMBER_INPUT_MESSAGE = "자동차 대수는 몇 대 인가요?";
    private final String GAME_TRIAL_INPUT_MESSAGE = "시도할 횟수는 몇 회 인가요?";

    private static Scanner scanner = new Scanner(System.in);

    public int inputCarCount() {
        System.out.println(CAR_NUMBER_INPUT_MESSAGE);
        return scanner.nextInt();
    }

    public int inputTrialCount() {
        System.out.println(GAME_TRIAL_INPUT_MESSAGE);
        return scanner.nextInt();
    }
}
