package umbcs680.hw17;
import java.util.Comparator;

public class ReverseAlphabeticalSorting implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        // Reversed comparison for alphabetical sorting
        return b.getName().compareToIgnoreCase(a.getName());
    }
}
