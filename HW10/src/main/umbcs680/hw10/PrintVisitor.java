package umbcs680.hw10;
public class PrintVisitor implements FSVisitor {
    @Override
    public void visitFile(File file) {
        System.out.println("File: " + file.getName());
    }

    @Override
    public void visitDirectory(Directory directory) {
        System.out.println("Directory: " + directory.getName());
    }

    @Override
    public void visitLink(Link link) {
        System.out.println("Link: " + link.getName());
    }
}
