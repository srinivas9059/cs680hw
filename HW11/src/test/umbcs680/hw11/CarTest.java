package umbcs680.hw11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testPriceComparatorWithDifferentPrices() {
        Car car1 = new Car("Toyota", 20000, 2018, 50000);
        Car car2 = new Car("Honda", 18000, 2019, 48000);

        PriceComparator<Car> priceComparator = new PriceComparator<>();
        int result = priceComparator.compare(car1, car2);

        if (result < 0) {
            System.out.println("Car1 is cheaper than Car2.");
        } else if (result > 0) {
            System.out.println("Car1 is more expensive than Car2.");
        } else {
            System.out.println("Prices are equal. Comparing based on year of manufacture...");
            // If prices are equal, compare based on year of manufacture
            result = Integer.compare(car1.getYear(), car2.getYear());
        }

        assertTrue(result > 0, "Car1 should be more expensive than Car2");
        System.out.println("PriceComparator result (different prices): " + result);
    }

    @Test
    public void testYearComparator() {
        Car car1 = new Car("Toyota", 20000, 2018, 50000);
        Car car2 = new Car("Honda", 18000, 2017, 55000);

        YearComparator<Car> yearComparator = new YearComparator<>();
        int result = yearComparator.compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearComparator result: " + result);
    }

    @Test
    public void testMileageComparator() {
        Car car1 = new Car("Toyota", 20000, 2018, 50000);
        Car car2 = new Car("Honda", 18000, 2017, 55000);

        MileageComparator<Car> mileageComparator = new MileageComparator<>();
        int result = mileageComparator.compare(car1, car2);

        assertTrue(result < 0, "Car1 should have lower mileage than Car2");
        System.out.println("MileageComparator result: " + result);
    }

      @Test
    public void testYearComparatorWithDifferentYears() {
        Car car1 = new Car("Toyota", 20000, 2018, 50000);
        Car car2 = new Car("Honda", 18000, 2017, 55000);

        YearComparator<Car> yearComparator = new YearComparator<>();
        int result = yearComparator.compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearComparator result (different years): " + result);
    }
}
