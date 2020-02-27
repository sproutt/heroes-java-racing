package util;

import javax.naming.InvalidNameException;

public class CarNamesSpliter {
    public static String[] splitCarNames(String inputCarNames) throws InvalidNameException {
        String[] carNames = spliteString(inputCarNames);

        for (int i = 0; i < carNames.length; i++) {
            int nameLength = carNames[i].length();
            if (nameLength > 5) {
                throw new InvalidNameException("이름은 5자 이하만 가능합니다.");
            }
        }
        return carNames;
    }

    private static String[] spliteString(String inputCarNames) {
        String[] carNames = inputCarNames.split(",");
        return carNames;
    }
}
