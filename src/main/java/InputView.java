import java.util.Scanner;

public class InputView {

    Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(',') 기준으로 구분)");
        return scanner.nextLine();
    }

    public int inputAttemptNumber() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return scanner.nextInt();
    }

}
