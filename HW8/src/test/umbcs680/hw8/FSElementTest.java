package umbcs680.hw8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FSElementTest {

    // Existing tests...

    @Test
    public void testDirectoryIsNotEmptyAfterAddingFile() {
        Directory root = new Directory("root");
        File file = new File("example.txt");
        root.appendChild(file);

        assertFalse(root.getChildren().isEmpty(), "Directory should not be empty after adding a file");
    }

    @Test
    public void testFileHasCorrectName() {
        File file = new File("example.txt");

        assertEquals("example.txt", file.getName(), "File name should match the name provided");
    }

    @Test
    public void testLinkPointsToCorrectTarget() {
        Directory root = new Directory("root");
        File targetFile = new File("target.txt");
        root.appendChild(targetFile);
        Link link = new Link("shortcut", targetFile);

        assertEquals(targetFile, link.getTarget(), "Link should point to the correct target file");
    }

    @Test
    public void testLinkIsNotADirectory() {
        File targetFile = new File("target.txt");
        Link link = new Link("shortcut", targetFile);

        assertFalse(link.isDirectory(), "Link should not be considered a directory");
    }

    @Test
    public void testDirectoryAcceptsVisitor() {
        Directory root = new Directory("root");
        FSVisitor visitor = new FileSearchVisitor("example.txt");
        root.accept(visitor);

        assertTrue(visitor instanceof FileSearchVisitor, "Directory should accept a visitor");
    }
}
