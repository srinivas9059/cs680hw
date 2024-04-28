package umbcs680.hw13;
import java.util.Comparator;

public class ParetoComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        // Check if car1 dominates car2 based on price and mileage
        if (car1.getPrice() < car2.getPrice() && car1.getMileage() < car2.getMileage()) {
            return -1; // car1 dominates car2
        } else if (car2.getPrice() < car1.getPrice() && car2.getMileage() < car1.getMileage()) {
            return 1; // car2 dominates car1
        } else {
            return 0; // neither dominates the other
        }
    }
}
