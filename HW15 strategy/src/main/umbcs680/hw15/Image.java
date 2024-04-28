package umbcs680.hw15;
import java.util.ArrayList;

public class Image {
    private int width;
    private int height;
    private ArrayList<ArrayList<Color>> pixels;

    public Image(int height, int width) {
        this.width = width;
        this.height = height;
        this.pixels = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            ArrayList<Color> row = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                row.add(null); // Initialize with null color
            }
            pixels.add(row);
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor(int x, int y) {
        return pixels.get(y).get(x);
    }
    

    public void setColor(int x, int y, Color color) {
        pixels.get(y).set(x, color);
    }
}