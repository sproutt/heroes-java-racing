package model;

public class Car{
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPosition(){
        return position;
    }

    public void incrementPosition(){
        this.position++;
    }
}