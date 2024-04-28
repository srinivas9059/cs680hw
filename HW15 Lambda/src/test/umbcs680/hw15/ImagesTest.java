package umbcs680.hw15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImagesTest {

    @Test
    public void testTransformWithGrayScaleAdjuster() {
        // Create a Test image with known colors
        Image originalImage = new Image(2, 2);
        originalImage.setColor(0, 0, new Color(255, 0, 0)); // Red
        originalImage.setColor(1, 0, new Color(0, 255, 0)); // Green
        originalImage.setColor(0, 1, new Color(0, 0, 255)); // Blue
        originalImage.setColor(1, 1, new Color(128, 128, 128)); // Gray

        // Apply grayscale transformation
        Image transformedImage = Images.transform(originalImage, GrayScaleAdjuster::adjust);

        // Verify transformed colors
        assertEquals(new Color(85, 85, 85), transformedImage.getColor(0, 0)); // Red to Gray
        assertEquals(new Color(85, 85, 85), transformedImage.getColor(1, 0)); // Green to Gray
        assertEquals(new Color(85, 85, 85), transformedImage.getColor(0, 1)); // Blue to Gray
        assertEquals(new Color(128, 128, 128), transformedImage.getColor(1, 1)); // Gray remains Gray
    }

}
