package tddClass;

public class AirCon {
    private boolean isOn;
    private int Temp;

    public void turnOn() {

        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseTemp() {
        Temp++;
    }


    public void decreaseTemp() {
        Temp--;
    }

    public int getTemp() {
        return Temp;
    }


}
