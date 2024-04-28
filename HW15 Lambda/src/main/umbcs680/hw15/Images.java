package umbcs680.hw15;
import java.util.function.Function;

public class Images {
    public static Image transform(Image image, Function<Color, Color> adjuster) {
        int height = image.getHeight();
        int width = image.getWidth();
        Image adjusted = new Image(height, width);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                adjusted.setColor(x, y, adjuster.apply(image.getColor(x, y)));
            }
        }

        return adjusted;    
    }
}
