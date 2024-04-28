package umbcs680.hw12;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class AlphabeticalSortingTest {

    @Test
    public void testAlphabeticalSorting() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new File(null, "apple.txt", 10));
        elements.add(new File(null, "Banana.txt", 20));
        elements.add(new File(null, "cherry.txt", 15));

        elements.sort(new AlphabeticalSorting());

        assertEquals("Banana.txt", elements.get(0).getName());
        assertEquals("apple.txt", elements.get(1).getName());
        assertEquals("cherry.txt", elements.get(2).getName());
    }
}
