package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void switchTestOn(){
        //Given
        AirConditioner switche = new AirConditioner();

        //When
        switche.turnOn();
        String godds = switche.getPower();
        //Ascert
        assertEquals("On", godds);
    }

    @Test
    public void switchOff(){
        //Gven
        AirConditioner switche = new AirConditioner();
        //When
        switche.turnOff();
        String godds = switche.getPower();
        //Assert
        assertEquals("Off", godds);
    }

    @Test
    public void increaseTemp() {
        //Given
        AirConditioner switche = new AirConditioner();
        //when
        switche.setTemp(21);
        switche.increaseTemp();
        //Assert
        assertEquals(22, switche.getTemp());
    }

    @Test
    public void decreaseTemp() {
        //Given
        AirConditioner switche = new AirConditioner();
        //when
        switche.setTemp(16);
        switche.decreaseTemp();
         //Assert
        assertEquals(16, switche.getTemp());
    }
    @Test
            public void increaseTempBeyond30() {
            //Given
            AirConditioner switche = new AirConditioner();
            //When
            switche.setTemp(35);
            switche.increaseTemp();
            //Assert
            assertEquals(30, switche.getTemp());

    }

    @Test
    public void decreaseTempBelow16() {
        //Given
        AirConditioner switche = new AirConditioner();
        //When
        switche.setTemp(16);
        switche.decreaseTemp();
        //Assert
        assertEquals(16, switche.getTemp());

    }


}

