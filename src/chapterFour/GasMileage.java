package chapterFour;

public class GasMileage {

    private double milesPerGallon;
    private static double combinedMilesPerGallon;
    private int milesDriven;
    private int gallonUsed;

    public GasMileage(int milesDriven, int gallonUsed) {
        this.milesDriven = milesDriven;
        this.gallonUsed = gallonUsed;
    }

    public void setMilesPerGallon() {
        milesPerGallon = (double)milesDriven / (double)gallonUsed;
    }
    public double getMilesPerGallon() {
        return milesPerGallon;
    }


    public static double getCombinedMilesPerGallon() {
        return combinedMilesPerGallon;
    }
}
