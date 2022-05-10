package chapterThree;

public class CarClass {
        private String model;
        private String year;
        public double price;

    public CarClass(String model, String year, double price) {
        this.model = model;
        this.year = year;

        if (price < 0.0) this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void purchase(double purchase_Amount) {
        double pricePerCar = 150 * 1;
        double quantity = 0;
        price = quantity * pricePerCar ;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
