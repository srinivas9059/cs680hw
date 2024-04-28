package umbcs680.hw10;
public class LinkVisitor implements FSVisitor {
    @Override
    public void visitFile(File file) {
        
    }

    @Override
    public void visitDirectory(Directory directory) {
    
    }

    @Override
    public void visitLink(Link link) {
        System.out.println("Link " + link.getName() + " points to: " + link.getTarget());
    }
}
