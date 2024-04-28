package umbcs680.hw14;
import java.util.Comparator;

public class SizeSorting implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        return a.getSize() - b.getSize();
    }
}
