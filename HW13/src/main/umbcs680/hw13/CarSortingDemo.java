package umbcs680.hw13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car {
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

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }
}

public class CarSortingDemo {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 25000, 2020, 15000));
        carList.add(new Car("Honda", 22000, 2019, 18000));
        carList.add(new Car("Ford", 28000, 2021, 12000));
        carList.add(new Car("Chevrolet", 24000, 2018, 20000));

        // Sort by make (ascending order)
        Collections.sort(carList, (car1, car2) -> car1.getMake().compareTo(car2.getMake()));
        System.out.println("Sorted by make:");
        carList.forEach(car -> System.out.println(car.getMake() + " - Price: $" + car.getPrice()));

        // Sort by price (ascending order)
        Collections.sort(carList, Comparator.comparing(Car::getPrice));
        System.out.println("\nSorted by price:");
        carList.forEach(car -> System.out.println(car.getMake() + " - Price: $" + car.getPrice()));

        // Sort by year (ascending order)
        Collections.sort(carList, Comparator.comparing(Car::getYear));
        System.out.println("\nSorted by year:");
        carList.forEach(car -> System.out.println(car.getMake() + " - Year: " + car.getYear()));

        // Sort by mileage (ascending order)
        Collections.sort(carList, Comparator.comparing(Car::getMileage));
        System.out.println("\nSorted by mileage:");
        carList.forEach(car -> System.out.println(car.getMake() + " - Mileage: " + car.getMileage()));
    }
}
