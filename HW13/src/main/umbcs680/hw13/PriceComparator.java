package umbcs680.hw13;
import java.util.Comparator;

public class PriceComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        int priceComparison = Integer.compare(car1.getPrice(), car2.getPrice());
        if (priceComparison == 0) {
            // If prices are equal, compare based on year of manufacture
            return Integer.compare(car1.getYear(), car2.getYear());
        }
        return priceComparison;
    }
}
