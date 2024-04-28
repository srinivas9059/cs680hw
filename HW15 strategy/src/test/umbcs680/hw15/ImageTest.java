package umbcs680.hw15;
// ImageTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImageTest {
    
    @Test
    void testGetHeightAndWidth() {
        Image image = new Image(17, 17);
        assertEquals(17, image.getHeight());
        assertEquals(17, image.getWidth());
    }

    @Test
    void testSetColorAndGetColor() {
        Image image = new Image(17, 17);
        Color color = new Color(255, 255, 255);
        image.setColor(4, 7, color);
        assertEquals(color, image.getColor(4, 7));
    }
}
