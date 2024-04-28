package umbcs680.hw13;
import java.util.Comparator;

public class MileageComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        return Integer.compare(car1.getMileage(), car2.getMileage());
    }
}
