package chaptioneleven;

import org.junit.jupiter.api.Test;

import static chaptioneleven.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

    public class TurtleTest {
        @Test
        public void TurtleExistTest(){
        Turtle ijapa = new Turtle();

        assertNotNull(ijapa);
        }

        @Test
        public void isPenUpByDefault(){
        Turtle ijapa = new Turtle();
        boolean isPenDown = ijapa.isPenDown();
        assertFalse(isPenDown);
        }

        @Test
        public void isTurtlePenDownTest(){
        Turtle ijapa = new Turtle();
        boolean isPenDown = ijapa.isPenDown();
        assertFalse(isPenDown);
       }

       @Test
       public void isTurtlePenUpTest(){
       Turtle ijapa = new Turtle();
       boolean isPenUp = ijapa.isPenUp();
       assertEquals(true, isPenUp);
       }

       @Test
       public void turtleFacesEastByDefault(){
       Turtle ijapa = new Turtle();
       assertEquals(EAST, ijapa.getCurrentDIrection());
       }


       @Test
       public void turtleFacesSouth(){
       Turtle ijapa = new Turtle();
       ijapa.turnRight();
       assertEquals(SOUTH, ijapa.getCurrentDIrection());
       }

       @Test
       public void turtleFacesWest() {
           Turtle ijapa = new Turtle();
           ijapa.turnRight();
           ijapa.turnRight();
           assertEquals(WEST, ijapa.getCurrentDIrection());
       }

        @Test
        public void turtleFacesNorth() {
            Turtle ijapa = new Turtle();
            ijapa.turnRight();
            ijapa.turnRight();
            ijapa.turnRight();
            assertEquals(NORTH, ijapa.getCurrentDIrection());
        }









    }
