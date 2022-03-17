package tddClass;

public class AirConditioner {
    private String agbara;
    private int temp;

    public void turnOn() {
        agbara = "On";
    }

    public String getPower() {
        return agbara;
    }

    public void turnOff() {
    agbara = "Off";
    }

    public void increaseTemp() {
        temp = temp + 1;
        if (temp > 30) {
            temp = 30;
        }
    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;

    }

    public void decreaseTemp() {
        temp = temp - 1;
        if (temp < 16) {
            temp = 16;
        }
    }
}
