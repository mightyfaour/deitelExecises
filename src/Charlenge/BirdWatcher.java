package Charlenge;
import java.util.Arrays;

public class BirdWatcher {
    private int[] birdsPerDay = new int[7];
    private int[] lastWeeksCount = new int[7];
    private int todayCount = birdsPerDay[birdsPerDay.length -1];
    private boolean dayWithoutBirds;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }


    public String getLastWeekCount() {
        return Arrays.toString(lastWeeksCount);

    }

    public int[] setLastWeeksCount(int... lastWeeksCount) {
        this.lastWeeksCount = lastWeeksCount;
        return lastWeeksCount;
    }

    public int getToday(){
        return todayCount;
    }

    public void setTodayCount(int todayCount){
        this.todayCount = todayCount;
    }
    public void incrementTodaysCount(int incrementBy) {
        todayCount += incrementBy;

    }

    public boolean hasDayWithoutBirds(int... birdsPerDay) {
//        for (int i = 0; i < birdsPerDay.length; i++) {
//            int bird = birdsPerDay[i];
//            if (bird == 0){
//                return true;
//            }
//        }
//        return false;
        this.birdsPerDay = birdsPerDay;
        for (int j : birdsPerDay) {
            if (j == 0) {
                return true;
            }
        }
            return  false;
    }

    public boolean getDayWithoutBird() {
        return dayWithoutBirds;
    }
}
