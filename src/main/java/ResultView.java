
public final class ResultView {
    public final static String POSITION_SYMBOL = "-";

    public static void printExecutionMessage() {
        System.out.println();
        System.out.println("실행결과");
        System.out.println();
    }

    public static void printResult(RacingGame racingGame) {
        if (racingGame.getRacingCars().getCars().size() <= 1) {
            System.out.println("경주할 상대가 없습니다.");
            System.out.println();
            return;
        }

        for (int ordinalNumber = 0; ordinalNumber < racingGame.getTrialTime(); ordinalNumber++) {
            printRacingProgress(racingGame.getRacingCars(), ordinalNumber);
        }
    }

    public static void printRacingProgress(Car car, int ordinalNumber) {
        System.out.print(car.getName() + " : ");

        for (int i = 0; i < car.getAllPositions().get(ordinalNumber); i++) {
            System.out.print(POSITION_SYMBOL);
        }

        System.out.println();
    }

    public static void printRacingProgress(Cars cars, int ordinalNumber) {
        for (Car car : cars.getCars()) {
            printRacingProgress(car, ordinalNumber);
        }
        System.out.println();
    }

    public static void printWinner(Cars winner) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Car car : winner.getCars()) {
            stringBuilder.append(car.getName());
            stringBuilder.append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("가 최종 우승했습니다.");

        System.out.println(stringBuilder.toString());
    }
}