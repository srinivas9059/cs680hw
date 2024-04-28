package umbcs680.hw8;
public class Link extends FSElement {
    private FSElement target;

    public Link(String name, FSElement target) {
        super(name);
        this.target = target;
    }

    public FSElement getTarget() {
        return target;
    }

    @Override
    public boolean isDirectory() {
        // Assuming a link can point to either a File or a Directory
        return target.isDirectory();
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visit(this);
    }
}
