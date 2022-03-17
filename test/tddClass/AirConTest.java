package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConTest {
    @Test
    public void createAirConTest(){
        AirCon godds = new AirCon();
        assertNotNull(godds);
    }
    @Test
    public void turnOnTest(){
        AirCon godds = new AirCon();
        godds.turnOn();
        assertTrue(godds.isOn());
    }

    @Test
    public void turnOffTest(){
        AirCon godds = new AirCon();
        godds.turnOn();
        godds.turnOn();
        assertFalse(godds.isOn());
    }
    @Test
    public void increaseTempTest() {
        AirCon godds = new AirCon();
        godds.turnOn();
        godds.increaseTemp();
        godds.increaseTemp();
        assertEquals(2,godds.getTemp());
    }
    @Test
    public void decreaseTempTest(){
        AirCon godds = new AirCon();
        godds.turnOn();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.decreaseTemp();
        godds.decreaseTemp();
        assertEquals(3,godds.getTemp());
    }
    @Test
    public void incresTempBeyond30Test(){
        AirCon godds = new AirCon();
        godds.turnOn();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        godds.increaseTemp();
        assertEquals(30, godds.getTemp());

    }





}
