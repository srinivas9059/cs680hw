package umbcs680.hw8;
public class FileSearchVisitor implements FSVisitor {
    private String fileNameToSearch;
    private File foundFile;

    public FileSearchVisitor(String fileNameToSearch) {
        this.fileNameToSearch = fileNameToSearch;
    }

    public File getFoundFile() {
        return foundFile;
    }

    @Override
    public void visit(Directory dir) {
        for (FSElement element : dir.getChildren()) {
            element.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        if (file.getName().equals(fileNameToSearch)) {
            foundFile = file;
        }
    }

    @Override
    public void visit(Link link) {
        // Assuming Link has a method getTarget() to get the referenced FSElement
        link.getTarget().accept(this);
    }
}
