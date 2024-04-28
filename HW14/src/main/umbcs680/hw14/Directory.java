package umbcs680.hw14;
import java.util.Comparator;
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
        int totalSize = getSize(); // Include the size of the directory itself
        for (FSElement element : children) {
            totalSize += element.getSize();
        }
        return totalSize;
    }

    // Lambda expressions for sorting
    public Comparator<FSElement> alphabeticalComparator = (a, b) -> a.getName().compareTo(b.getName());
    public Comparator<FSElement> reverseAlphabeticalComparator = (a, b) -> b.getName().compareTo(a.getName());
    public Comparator<FSElement> sizeComparator = Comparator.comparingInt(FSElement::getSize);
}
