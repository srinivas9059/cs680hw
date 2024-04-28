package umbcs680.hw6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDateTime;

public class FileSystemTest {

    @Test
    public void testFSElement() {
        LocalDateTime testTime = LocalDateTime.now();
        Directory parentDir = new Directory(null, "parent", 0);
        FSElement fsElement = new File(parentDir, "testFile", 10) {
            // FSElement is abstract; providing concrete implementation for testing.
        };

    }

    

    @Test
    public void testFile() {
        Directory root = new Directory(null, "root", 0);
        File file = new File(root, "file", 10);

        assertEquals("file", file.getName());
        assertEquals(10, file.getSize());
        assertEquals(root, file.getParent());
    }

    @Test
    public void testFileSystemSingleton() {
        FileSystem fs1 = FileSystem.getFilesystem();
        FileSystem fs2 = FileSystem.getFilesystem();

        assertEquals(fs1, fs2);
    }
}
