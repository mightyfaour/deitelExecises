package chapterSix;

public class Divisible {
    private int num;

    public void setNumber(int num) {
        this.num = num;

    }

    public boolean getNumber() {
        if (num % 5 == 0) {
         return  true;
        }
        else
            return false;
    }


}
