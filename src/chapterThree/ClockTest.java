package chapterThree;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(0, 0, 0);
        String show = clock.displayTime();
        System.out.println(show);

        clock.setHour(12);
       int result = clock.getHour();
        System.out.println(result);
        clock.setMinute(35);

        int resultt = clock.getMinute();
        System.out.println(resultt);
        clock.setSecond(58);
       int second = clock.getSecond();
        System.out.println(second);
        String display = clock.displayTime();
        System.out.println(display);

    }
}
