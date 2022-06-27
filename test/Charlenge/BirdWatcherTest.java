package Charlenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdWatcherTest {

    @Test void birdWatcherIsPossible() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        assertNotNull(birdWatcher);
    }
    @Test void canGetLastWeekCountTest(){
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        int[] lastWeekCount = {0,2,5,3,7,8,4};
        assertArrayEquals(lastWeekCount, birdWatcher.setLastWeeksCount(0,2,5,3,7,8,4));
    }

    @Test void howManyBirdVisitedTodayTest() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.setTodayCount(1);
        assertEquals(1, birdCount.getToday());

    }

    @Test void increamentDaysCountTest() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.setTodayCount(1);
        birdCount.incrementTodaysCount(1);
        assertEquals(2,birdCount.getToday());
    }

    @Test void ifThereWasADay_withNoVisitor() {
        int[] birdsPerDay = { 2, 5, 7,0, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        assertTrue( birdCount.hasDayWithoutBirds(birdsPerDay));
    }




}
