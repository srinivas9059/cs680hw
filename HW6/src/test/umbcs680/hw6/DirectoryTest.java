package umbcs680.hw6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class DirectoryTest {

    @Test
    public void testGetTotalSize() {
        Directory root = new Directory(null, "root", 0);
        File file1 = new File(root, "file1", 10);
        File file2 = new File(root, "file2", 20);
        assertEquals(30, root.getTotalSize(), "Expected total size to be 30");
    }
}
