package umbcs680.hw8;
public abstract class FSElement {
    private String name;

    public FSElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isDirectory();

    public abstract void accept(FSVisitor visitor);
}
