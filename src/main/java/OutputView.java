public class OutputView {
    public static void announceWinner(int firstPrizeScore, Car[] car) {
        for (int i = 0; i < car.length; i++) {
            if (firstPrizeScore == car[i].carCount()) {
                System.out.println(car[i].carName() + "가 최종 우승 했습니다.");
            }
        }
    }
}