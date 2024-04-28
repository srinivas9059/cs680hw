package umbcs680.hw14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FileSystemTest {

    @Test
    public void testFSElement() {

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
