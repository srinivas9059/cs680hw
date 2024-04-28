package umbcs680.hw7;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class FSElementTest {

    // Existing tests...

    @Test
    public void testFileCreationTimeNotNull() {
        File file = new File(null, "testFile", 10);
        assertNotNull(file.getCreationTime(), "Creation time should not be null");
    }

    @Test
    public void testDirectoryCreationTimeNotNull() {
        Directory directory = new Directory(null, "testDirectory");
        assertNotNull(directory.getCreationTime(), "Creation time should not be null");
    }

    @Test
    public void testFileParentIsNull() {
        File file = new File(null, "testFile", 10);
        assertNull(file.getParent(), "Parent of a file without a parent should be null");
    }

    @Test
    public void testDirectoryParentIsNull() {
        Directory directory = new Directory(null, "testDirectory");
        assertNull(directory.getParent(), "Parent of a directory without a parent should be null");
    }

   
}
