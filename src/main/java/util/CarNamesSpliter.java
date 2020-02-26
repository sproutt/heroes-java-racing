package util;

public class CarNamesSpliter {
    public static String[] splitCarNames(String inputCarNames) {
        String[] carNames = spliteString(inputCarNames);

        for (int i = 0; i < carNames.length; i++) {
            int nameLength = carNames[i].length();
            if (nameLength > 5) {
                throw new ArrayIndexOutOfBoundsException("이름이 5글자 이상입니다.");
            }
        }
        return carNames;
    }

    private static String[] spliteString(String inputCarNames) {
        String[] carNames = inputCarNames.split(",");
        return carNames;
    }
}
