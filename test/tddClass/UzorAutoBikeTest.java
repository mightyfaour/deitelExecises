package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UzorAutoBikeTest {

        @Test
        public void UzorAutoBikeTest() {
            //Given
            tddClass.UzorAutoBike poweredOn = new UzorAutoBike();
            //When
            poweredOn.turnOn("On");
            //Assert
            assertEquals("On", poweredOn.getPower());
        }
    }

