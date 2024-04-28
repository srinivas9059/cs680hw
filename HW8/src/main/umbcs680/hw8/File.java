package umbcs680.hw8;
public class File extends FSElement {

    public File(String name) {
        super(name);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visit(this);
    }
}
