package umbcs680.hw12;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class ReverseAlphabeticalSortingTest {

    @Test
    public void testReverseAlphabeticalSorting() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new File(null, "apple.txt", 10));
        elements.add(new File(null, "Banana.txt", 20));
        elements.add(new File(null, "cherry.txt", 15));

        elements.sort(new ReverseAlphabeticalSorting());

        assertEquals("cherry.txt", elements.get(0).getName(), "Expected cherry.txt to be first");
        assertEquals("Banana.txt", elements.get(1).getName(), "Expected Banana.txt to be second");
        assertEquals("apple.txt", elements.get(2).getName(), "Expected apple.txt to be third");
    }
}
