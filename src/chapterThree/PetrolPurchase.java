package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double petrolPrice;
    private double percentageDiscount;
    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double petrolPrice, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolPrice = petrolPrice;
        this.quantity = quantity;
        this.percentageDiscount = percentageDiscount;



    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public void setPetrolPrice(double petrolPrice, int discount) {
        this.petrolPrice = petrolPrice - discount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount(){
        double discount = (percentageDiscount/100);
        double netAmount = (quantity * petrolPrice) - (discount * quantity);
                return netAmount;
    }


}
