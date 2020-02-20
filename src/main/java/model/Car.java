package model;

import java.util.ArrayList;

public class Car{
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void increasePosition(){
        this.position++;
    }

    public static ArrayList<Car> generateCars(String[] carNames) throws Exception{
        ArrayList<Car> cars = new ArrayList<>();
        for (String carName : carNames){
            if (carName.length() > 6) {
                throw new Exception();
            }
            cars.add(new Car(carName));
        }
        return cars;
    }
}