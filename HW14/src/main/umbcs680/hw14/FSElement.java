package umbcs680.hw14;
import java.time.LocalDateTime;

abstract class FSElement {
    private String name;
    private int size;
    private LocalDateTime creationTime;
    private Directory parent;

    public FSElement(String name, int size, LocalDateTime creationTime) {
        this.name = name;
        this.size = size;
        this.creationTime = creationTime;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getSize() { return size; }
    public LocalDateTime getCreationTime() { return creationTime; }
    public Directory getParent() { return parent; }
    public void setParent(Directory parent) { this.parent = parent; }
}
