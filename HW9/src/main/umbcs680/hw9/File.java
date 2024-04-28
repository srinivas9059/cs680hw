package umbcs680.hw9;
public class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("File: " + name + " Size: " + getSize() + "kb");
    }

    @Override
    public int getSize() {
        return size;
    }
}
