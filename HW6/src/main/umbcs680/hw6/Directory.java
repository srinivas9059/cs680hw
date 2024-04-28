package umbcs680.hw6;

import java.util.LinkedList;
import java.time.LocalDateTime;

class Directory extends FSElement {
    private LinkedList<FSElement> children;

    public Directory(Directory parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        this.children = new LinkedList<>();
        if (parent != null) {
            parent.appendChild(this);
        }
    }

    public void appendChild(FSElement child) {
        children.add(child);
        child.setParent(this);
    }

    public LinkedList<FSElement> getChildren() {
        return children;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for (FSElement element : children) {
            totalSize += element.getSize();
        }
        return totalSize;
    }
}
