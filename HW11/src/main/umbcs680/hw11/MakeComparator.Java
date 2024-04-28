package umbcs680.hw11;
import java.util.Comparator;

public class MakeComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        return car1.getMake().compareTo(car2.getMake());
    }
}
