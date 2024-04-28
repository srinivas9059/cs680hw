package umbcs680.hw12;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DirectoryTest {

    @Test
    public void testGetTotalSize() {
        Directory root = new Directory(null, "root", 0);
        new Directory(root, "dir1", 10);
        new Directory(root, "dir2", 20);
        assertEquals(30, root.getTotalSize(), "Expected total size to be 30");
    }
}