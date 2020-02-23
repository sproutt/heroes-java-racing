import java.util.Random;

public class Car {

    public String name;
    public int count;

    public Car(String name){
        this.name = name;
        this.count = count;
    }

    public int carCount(){
        return this.count;
    }

    public String carName(){
        return this.name;
    }

    public void carMove(int randomValue){
        if (randomValue > 4){
            count++;
        }
    }

    public int generateRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
