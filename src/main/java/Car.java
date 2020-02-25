public class Car {

    private String name;
    private int location;

    public Car(String name) {
        try {
            if (name.length() > 5) {
                throw new OutOfCarNameLengthException("자동차 이름은 5글자 이하여야 합니다.");
            }
        } catch (OutOfCarNameLengthException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4)
            location++;
    }

    public String convertLocationToBars() {
        String bars = "";
        for (int iterationCount = 0; iterationCount < location; iterationCount++) {
            bars += "-";
        }
        return bars;
    }

}