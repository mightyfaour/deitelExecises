package tddClass;

public class AirCon {
    private boolean isOn;
    private int Temp;

    public AirCon(){
        Temp = 16;

    }

    public void turnOn() {

        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseTemp() {
        if(Temp < 30)
        Temp++;
    }


    public void decreaseTemp() {
        if (Temp > 16)
        Temp--;
    }

    public int getTemp() {
        return Temp;
    }


}
