
public final class RacingGameResultView {
    public static void printExecutionMessage() {
        System.out.println();
        System.out.println("실행결과");
        System.out.println();
    }

    public static void printRacingProgress(Cars cars) {
        System.out.println(cars);
    }

    public static void printResultMessage(Cars winner) {
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
