package umbcs680.hw10;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FSElement {
    private String name;
    private List<FSElement> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void addChild(FSElement child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visitDirectory(this);
        for (FSElement child : children) {
            child.accept(visitor);
        }
    }
}
