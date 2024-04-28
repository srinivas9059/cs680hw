package umbcs680.hw9;
import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
