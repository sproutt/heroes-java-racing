import java.util.Random;

public class Car implements Comparable<Car> {
    static int countUnnamed = 0;
    private String name;
    private int position;

    public Car(String name) {
        setName(name);
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void setName(String name) {
        if (name.length() > 5) {
            this.name = "Unnamed Car " + (++countUnnamed);
            return;
        }

        this.name = name;
    }

    public void move() {
        if (new Random().nextInt(10) >= 4) {
            position++;
        }
    }

    @Override
    public int compareTo(Car car) {
        return position - car.position;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(name + " : ");

        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }
}