package umbcs680.hw11;
// YearComparator.java
import java.util.Comparator;

public class YearComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        return Integer.compare(car1.getYear(), car2.getYear());
    }
}