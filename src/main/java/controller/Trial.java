package controller;

import java.util.Random;
import model.Car;

public class Trial {

    private Random random = new Random();

    public void move(Car car){
        if (random.nextInt(10) >= 4){
            car.increasePosition();
        }
    }
}
