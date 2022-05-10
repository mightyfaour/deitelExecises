package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {
    @Test
    public void clockCanBeCreatedTest(){
        Clock ago = new Clock(0, 0, 0);
        assertNotNull(ago);
    }
    @Test
    public void setHourTest(){
        //given
        Clock ago = new Clock(0, 0,0);
        assertEquals(0, ago.getHour());
        //when
        ago.setHour(6);
        //assert
        assertEquals(6, ago.getHour());

    }
    @Test
    public void setMinuteTest(){
        //given
        Clock clock = new Clock(0,0,0);
        //when
        clock.setMinute(23);
        //assert
        assertEquals(23, clock.getMinute());
    }
    @Test
    public void setSecondTest(){
        //Given
        Clock clock = new Clock(0, 0, 0);
        //when
        clock.setSecond(59);
        //assert
        assertEquals(59, clock.getSecond());
    }
    @Test
    public void displayTimeTest(){
        //given
        Clock ago = new Clock(0, 0, 0);

        //when
        ago.setHour(12);
        ago.setMinute(34);
        ago.setSecond(55);
        String answer = ago.displayTime();
        //assert
        assertEquals("12:34:55", answer);
    }
    @Test
    public void setWhatTimeTest(){
        //given
        Clock ago = new Clock(0, 0, 0);
        //when
        String result = ago.setWhatTime("am");
        //assert
        assertEquals("am", result);
    }
}
