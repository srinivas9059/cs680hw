package umbcs680.hw7;
import java.time.LocalDateTime;

public class File extends FSElement {

    public File(Directory parent, String name, int size) {
        super(parent, name, size, LocalDateTime.now());
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
