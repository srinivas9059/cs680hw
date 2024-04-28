package umbcs680.hw10;
public interface FSVisitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
    void visitLink(Link link);
}
