package umbcs680.hw9;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FileSystemComponentTest {

    @Test
    public void testFileSize() {
        File file = new File("test.txt", 10);
        assertEquals(10, file.getSize(), "File size should be 10kb");
    }

    @Test
    public void testFolderSize() {
        Folder folder = new Folder("testFolder");
        folder.addComponent(new File("test1.txt", 10));
        folder.addComponent(new File("test2.txt", 20));

        assertEquals(30, folder.getSize(), "Folder size should be 30kb");
    }

    @Test
    public void testNestedFolderSize() {
        Folder root = new Folder("root");
        Folder subFolder = new Folder("subFolder");
        root.addComponent(subFolder);
        subFolder.addComponent(new File("test.txt", 10));

        assertEquals(10, root.getSize(), "Nested folder size should be 10kb");
    }
}
