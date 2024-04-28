package umbcs680.hw10;
public class SizeVisitor implements FSVisitor {
    @Override
    public void visitFile(File file) {
        System.out.println("Size of " + file.getName() + ": " + file.getSize() + " bytes");
    }

    @Override
    public void visitDirectory(Directory directory) {
        
    }

    @Override
    public void visitLink(Link link) {
        
    }
}
