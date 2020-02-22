package racingcar;

public class Car{
    private int position;
    private String carName;

    public Car(){}

    public Car(String carName) {
        setCarName(carName);
        this.position = 0;
    }

    public Car(String carName, int position) {
        setCarName(carName);
        this.position = position;
    }

    public void setCarName(String carName) {
        if (carName.length() > 5) {
            this.carName = carName.substring(0,5);
            return;
        }
        this.carName = carName;
    }

    public String getCarName(){
        return this.carName;
    }

    public int getPosition() {
        return this.position;
    }

    public void move() {
        position++;
    }
}
