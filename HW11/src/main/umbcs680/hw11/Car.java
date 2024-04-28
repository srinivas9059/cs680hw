package umbcs680.hw11;
public class Car {
    public String make;
    private int price;
    private int year;
    private int mileage;
    private int dominationCount;

    public Car(String make, int price, int year, int mileage) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
        this.dominationCount = 0;
    }

    public int getDominationCount() {
        return dominationCount;
    }

    public void setDominationCount(int count) {
        this.dominationCount = count;
    }

    // Additional methods (if needed):
    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    // Optional method (if applicable):
    public int getYear() {
        return year;
    }
}
