public class RacingGame {


    public static String[] splitNames(String inputCarNames){
        return inputCarNames.split(",");
    };

    public Car[] arrayRacingCar(String[] carNames) {
        Car car[] = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            car[i] = new Car(carNames[i]);
        }
        return car;
    }

    public static String addRace(Car raceCar){
        String Race = "-";
        for(int i = 0; i < raceCar.carCount(); i++){
            Race += "-";
        }
        return Race;
    }

    public static void printOutRaceCar(Car[] car){
        for(int i = 0; i < car.length; i++){
            Car raceCar = car[i];
            int randomValue = raceCar.generateRandomValue();
            raceCar.carMove(randomValue);

            String statusOfRace = addRace(raceCar);
            System.out.println(car[i].carName() + ":" + statusOfRace);
        }
    }

    public static void repeatRepeatNumber(int repeatNumber, Car[] car){
        for(int i = 0; i < repeatNumber; i++){
            printOutRaceCar(car);
            System.out.println();
        }
    }

    public static int firstPrizeScore(Car[] car){
        int firstPrizeScore = 0;
        for(int i = 0; i < car.length; i++){
            if(car[i].carCount() >= firstPrizeScore){
                firstPrizeScore = car[i].carCount();
            }
        }
        return firstPrizeScore;
    }
}