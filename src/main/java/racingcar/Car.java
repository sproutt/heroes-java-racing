package racingcar;

public class Car{
    private int position;
    private String carName;

    public Car(String carName) {
        setCarName(carName);
        this.position = 0;
    }

    public Car(String carName, int position) {
        setCarName(carName);
        this.position = position;
    }

    public void setCarName(String carName) {
        if (carName.length() > 5) { //예외처리하기.
            setNameException();
        }
        this.carName = carName;
    }
    public void setNameException(){
        try {
            throw new Exception("자동차 이름이 5글자 이상입니다.");
        } catch (Exception e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
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
