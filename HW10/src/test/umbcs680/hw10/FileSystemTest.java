package umbcs680.hw10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FileSystemTest {
    private Directory root;

    @BeforeEach
    public void setUp() {
        // Constructing file system structure
        root = new Directory("/");
        Directory etc = new Directory("/etc");
        Directory home = new Directory("/home");
        Directory var = new Directory("/var");
        etc.addChild(new File("hosts", 1024));
        etc.addChild(new File("passwd", 2048));
        home.addChild(new File("user1.txt", 512));
        home.addChild(new File("user2.txt", 768));
        var.addChild(new Link("log", "/var/log"));
        root.addChild(etc);
        root.addChild(home);
        root.addChild(var);
    }

    @Test
    public void testPrintVisitor() {
        PrintVisitor printVisitor = new PrintVisitor();
        root.accept(printVisitor);
        // Assuming the printout is checked manually
    }

    @Test
    public void testSizeVisitor() {
        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);
        // Assuming the output is checked manually
    }

    @Test
    public void testLinkVisitor() {
        LinkVisitor linkVisitor = new LinkVisitor();
        root.accept(linkVisitor);
        // Assuming the output is checked manually
    }

        @Test
    public void testDirectoryGetName() {
        Directory directory = new Directory("/test");
        assertEquals("/test", directory.getName(), "Directory name should match");
    }

    @Test
    public void testFileGetName() {
        File file = new File("test.txt", 10);
        assertEquals("test.txt", file.getName(), "File name should match");
    }

    @Test
    public void testFileGetSize() {
        File file = new File("test.txt", 10);
        assertEquals(10, file.getSize(), "File size should match");
    }

    @Test
    public void testLinkGetName() {
        Link link = new Link("testLink", "/path/to/target");
        assertEquals("testLink", link.getName(), "Link name should match");
    }

    @Test
    public void testLinkGetTarget() {
        Link link = new Link("testLink", "/path/to/target");
        assertEquals("/path/to/target", link.getTarget(), "Link target should match");
    }
}
