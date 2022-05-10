package chapterThree;

public class PetrolPurchase1 {
    private double PurchasedAmount;
    public double getPurchasedAmount;
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double price;
    private double percentageDiscount;
    private double amount;


    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public PetrolPurchase1(String stationLocation, String petrolType, int quantity, double price, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
        this.PurchasedAmount = PurchasedAmount;

    }

    public String getLocation(String stationLocation) {
        return stationLocation;
    }

    public String getPetrolType(String petrolType) {
        return petrolType;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPurchasedAmount(double purchaseAmount, double percentageDiscount) {
        amount = purchaseAmount - ( (percentageDiscount / 100) * purchaseAmount);

    }

    public double getPurchasedAmount() {
        return amount;
    }
}
