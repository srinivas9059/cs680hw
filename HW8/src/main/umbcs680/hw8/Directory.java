package umbcs680.hw8;
import java.util.ArrayList;
import java.util.List;

public class Directory extends FSElement {
    private List<FSElement> children;

    public Directory(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public void appendChild(FSElement child) {
        children.add(child);
    }

    public List<FSElement> getChildren() {
        return children;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visit(this);
    }
}
