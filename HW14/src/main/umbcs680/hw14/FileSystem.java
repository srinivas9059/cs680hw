package umbcs680.hw14;
import java.util.LinkedList;


class FileSystem {
    private static FileSystem instance;
    private LinkedList<Directory> rootDirs;

    private FileSystem() {
        rootDirs = new LinkedList<>();
    }

    public static FileSystem getFilesystem() {
        if (instance == null) {
            instance = new FileSystem();
        }
        return instance;
    }

    public LinkedList<Directory> getRootDirs() {
        return rootDirs;
    }

    public void appendRootDir(Directory rootDir) {
        rootDirs.add(rootDir);
    }
}
