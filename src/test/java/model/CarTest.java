package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

    private Car tesla;
    private Car kia;
    private Car hyundai;

    @Before
    public void setup(){
        tesla = new Car("tesla");
        kia = new Car("kia");
        hyundai = new Car("hyundai");
    }

    @Test
    public void getNameTest() {
        assertEquals("tesla", tesla.getName());
        assertEquals("kia", kia.getName());
        assertEquals("hyundai", hyundai.getName());
    }

    @Test
    public void getPositionTest(){
        assertEquals(0, tesla.getPosition());
        assertEquals(0, kia.getPosition());
        assertEquals(0, hyundai.getPosition());
    }

    @Test
    public void moveTest(){
        tesla.move(); tesla.move(); tesla.move();
        assertEquals(3, tesla.getPosition());

        kia.move(); kia.move();
        assertEquals(2, kia.getPosition());

        hyundai.move();
        assertEquals(1, hyundai.getPosition());
    }

}