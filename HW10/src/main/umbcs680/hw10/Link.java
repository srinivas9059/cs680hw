package umbcs680.hw10;
public class Link implements FSElement {
    private String name;
    private String target;

    public Link(String name, String target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visitLink(this);
    }
}
