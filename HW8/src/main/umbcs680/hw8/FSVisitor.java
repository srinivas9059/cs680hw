package umbcs680.hw8;
public interface FSVisitor {
    void visit(Directory dir);
    void visit(File file);
    void visit(Link link);
}
