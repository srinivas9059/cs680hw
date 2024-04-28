package umbcs680.hw7;

import java.util.LinkedList;
import java.time.LocalDateTime;

public class Directory extends FSElement {
    private LinkedList<FSElement> children;

    public Directory(Directory parent, String name) {
        super(parent, name, 0, LocalDateTime.now());
        children = new LinkedList<>();
    }

    public void appendChild(FSElement child) {
        children.add(child);
    }

    public LinkedList<FSElement> getChildren() {
        return children;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
}
