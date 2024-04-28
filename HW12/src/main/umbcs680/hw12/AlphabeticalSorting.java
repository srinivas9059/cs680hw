package umbcs680.hw12;
import java.util.Comparator;

public class AlphabeticalSorting implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        return a.getName().compareTo(b.getName()); 
    }
}
